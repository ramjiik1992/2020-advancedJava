package selfunderstanding.binarytreeimpl;

public class BinaryTree {


  Node root;

  public void insert(int e) {

    if (root == null) {

      root = new Node(e);
    } else {

      Node temp = root;

      if (e < root.content) {

        while (temp.left != null) {
          temp = temp.left;
        }
        
        if(e<temp.content) {
          temp.left = new Node(e);  
        }else {
          temp.right = new Node(e);
        }
        
      } else {

        while (temp.right != null) {
          temp = temp.right;
        }
        
        if(e<temp.content) {
          temp.left = new Node(e);  
        }else {
          temp.right = new Node(e);
        }
        
      }
    }
  }
}
