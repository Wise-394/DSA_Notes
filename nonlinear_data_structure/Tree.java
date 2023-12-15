package nonlinear_data_structure;

public class Tree {
    public static void main(String[] var0) {
        Node var1 = new Node("Y");
        TreeOperations var2 = new TreeOperations();
        var1.leftNode = new Node("O");
        var1.rightNode = new Node("U");
        var1.leftNode.leftNode = new Node("L");
        var1.leftNode.rightNode = new Node("I");
        var1.rightNode.leftNode = new Node("K");
        var1.rightNode.rightNode = new Node("E");
        var1.rightNode.leftNode.rightNode = new Node("C");
        var1.rightNode.rightNode.leftNode = new Node("S");
        System.out.println("tree in preorder:");
        var2.preOrder(var1);
        System.out.println("\ntree in inorder:");
        var2.inOrder(var1);
        System.out.println("\ntree in postorder:");
        var2.postOrder(var1);
     }
}

class Node{
    String value;
    Node rightNode;
    Node leftNode;

    Node(String value){
        this.value = value;
        this.rightNode = null;
        this.leftNode = null;
    }
}

class TreeOperations {

   public void preOrder(Node var1) {
      if (var1 != null) {
         System.out.print(var1.value + " ");
         this.preOrder(var1.leftNode);
         this.preOrder(var1.rightNode);
      }

   }

   public void inOrder(Node var1) {
      if (var1 != null) {
         this.inOrder(var1.leftNode);
         System.out.print(var1.value + " ");
         this.inOrder(var1.rightNode);
      }

   }

   public void postOrder(Node var1) {
      if (var1 != null) {
         this.postOrder(var1.leftNode);
         this.postOrder(var1.rightNode);
         System.out.print(var1.value + " ");
      }

   }
}

//notes for future reference <3
// Preorder Traversal: parent then Left then Right
// Inorder Traversal: Left then parent then Right
// Postorder Traversal: Left then Right then parent

//TreeOperations methood uses recurssion
//recurssion = a method that will call itself to start another method (works like a loop)

//example
//preorder example
/* 1.print the current node
 * 2.Go to left node  
 * 3.Go back to step 1 until left nodes are null, if left nodes are null go to step 4(recurssion)
 * 4.Go to right node
 * 5.print the current node
 * 6.GO back to step 4 until right nodes are null, if right nodes are null go to step 5
 * 7. i love evangelabs (exit method)
 */