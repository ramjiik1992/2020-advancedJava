package assignments;

public class Node {

  Object content;

  Node next;


  Node(Object content) {
    this.content = content;
  }


  Node(Object content, Node next) {

    this.content = content;
    this.next = next;
  }


  public Object getContent() {
    return content;
  }


  public void setContent(Object content) {
    this.content = content;
  }


  public Node getNext() {
    return next;
  }


  public void setNext(Node next) {
    this.next = next;
  }


}
