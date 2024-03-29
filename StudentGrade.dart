import 'dart:io';

void main() {
  var studentGrades1 = StudentGrades();
  print("How many students?: ");
  var studentCount = int.parse(stdin.readLineSync()!);

  for (var i = 0; i < studentCount; i++) {
    print("Enter student name:");
    var studentName = stdin.readLineSync();
    print("Enter student grade:");
    var studentGrade = double.tryParse(stdin.readLineSync() ?? '');
    studentGrades1.insertNewStudent(studentName!, studentGrade!);
  }
  studentGrades1.calculateMap();
}

class StudentGrades {
  Map<String, double> studentGradesMap = {};

  void printAllMapList() {
    studentGradesMap.forEach((key, value) {
      print('$key: $value');
    });
  }

  void calculateMap() {
    var sum = 0.0;
    studentGradesMap.forEach((key, value) {
      sum += value;
    });
    var average = sum / studentGradesMap.length;
    print("Sum: $sum");
    print("Average: $average");
    printAllMapList();
  }

  void insertNewStudent(String name, double grade) {
    studentGradesMap[name] = grade;
  }
}
