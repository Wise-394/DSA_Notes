import 'dart:io';

void main() {
  var votingSystem = VotingSystem();
  while (true) {
    print("Enter candidate Name you like to vote | or type \"EXIT\" to exit");
    var name = stdin.readLineSync();
    if (name == "EXIT" || name == null || name.isEmpty) {
      votingSystem.displayResult();
      break;
    } else {
      votingSystem.addVote(name);
    }
  }
}

class VotingSystem {
  Map<String, int> candidates = {};

  void addVote(String name) {
    if (candidates.containsKey(name)) {
      candidates.update(name, (value) => value + 1);
    } else {
      candidates[name] = 1;
    }
  }

  void displayResult() {
    print("Voting Results:");
    candidates.forEach((key, value) {
      print("$key: $value");
    });
  }
}
