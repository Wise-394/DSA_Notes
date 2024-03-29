import 'dart:io';

void main() {
  var inventoryManagement = InventoryMangement();
  while (true) {
    switch (inventoryManagement.methods()) {
      case 1:
        print("Enter product name");
        String name = stdin.readLineSync()!;
        print("Enter product price");
        double price = double.parse(stdin.readLineSync()!);
        inventoryManagement.addProduct(name, price);
        break;
      case 2:
        print("Enter product name");
        String name = stdin.readLineSync()!;
        print("Enter product price");
        double price = double.parse(stdin.readLineSync()!);
        inventoryManagement.addProduct(name, price);
        break;
      case 3:
        print("Enter product name");
        String name = stdin.readLineSync()!;
        inventoryManagement.removeProduct(name);
        break;
      case 4:
        inventoryManagement.displayProduct();
        break;
      case 5:
        exit(0);
      default:
        exit(0);
    }
  }
}

class InventoryMangement {
  int methods() {
    print("1.ADD PRODUCT");
    print("2.UPDATE PRODUCT");
    print("3.REMOVE PRODUCT");
    print("4.DISPLAY PRODUCT");
    print("5.EXIT");
    print("==========");
    print("enter operations: ");
    var op = int.parse(stdin.readLineSync()!);
    return op;
  }

  Map<String, double> inventory = Map();
  void addProduct(String name, double price) {
    inventory[name] = price;
  }

  void updateProduct(String name, double price) {
    inventory[name] = price;
  }

  void removeProduct(String name) {
    inventory.remove(name);
  }

  void displayProduct() {
    inventory.forEach((key, value) {
      print("$key: $value");
    });
  }
}
