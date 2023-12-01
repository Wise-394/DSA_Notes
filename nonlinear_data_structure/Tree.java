package nonlinear_data_structure;

public class Tree {
    public static void main(String[] args) {
    Node tree = new Node(1);
    TreeOperations operations = new TreeOperations();

    tree.leftNode = new Node(2);
    tree.rightNode = new Node(3);
    tree.leftNode.leftNode = new Node(4);
    tree.leftNode.rightNode = new Node(5);

    System.out.println("tree in preorder:");
    operations.preOrder(tree);

    System.out.println("\ntree in inorder:");
    operations.inOrder(tree);

    System.out.println("\ntree in postorder:");
    operations.postOrder(tree);
    }
}

class Node{
    int value;
    Node rightNode;
    Node leftNode;

    Node(int value){
        this.value = value;
        this.rightNode = null;
        this.leftNode = null;
    }
}

class TreeOperations{
   
    public void preOrder(Node node){
        if (node != null){
            System.out.print(node.value + " ");
            preOrder(node.leftNode); 
            preOrder(node.rightNode); 
        }
    }
    public void inOrder(Node node){
        if(node != null){
            preOrder(node.leftNode); 
            System.out.print(node.value + " ");
            preOrder(node.rightNode); 
        }
    }
    public void postOrder(Node node){
        if(node != null){
            preOrder(node.leftNode);
            preOrder(node.rightNode); 
            System.out.print(node.value + " ");
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
