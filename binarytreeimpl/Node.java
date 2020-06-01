package selfunderstanding.binarytreeimpl;

public class Node {

   int content;
  
  Node left;

  Node right;
  
  public int getContent() {
    return content;
  }

  public void setContent(int content) {
    this.content = content;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public Node(int content, Node left, Node right) {
    super();
    this.content = content;
    this.left = left;
    this.right = right;
  }
  
  
  public Node(int content) {
    super();
    this.content = content;
  }
  
  
  
  
}
