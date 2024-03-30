import 'dart:io';

void main() {
  var votingSystem = VotingSystem();
  while (true) {
    print("Enter candidate Name you like to vote | or type \"EXIT\" to exit");
    var name = stdin.readLineSync();
    if (name == "EXIT" || name == "EXIT") {
      votingSystem.displayResult();
    } else {
      votingSystem.addVote(name!);
    }
  }
}

class VotingSystem {
  Map<String, int> candidates = Map();

  void addVote(String name) {
    candidates.update(name, (value) => value + 1, ifAbsent: () => 1);
  }

  void displayResult() {
    candidates.forEach((key, value) {
      print("$key:$value");
    });
  }
}
