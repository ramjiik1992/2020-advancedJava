package selfunderstanding;

public class Node {

  Object content;

  Node next;

  public Node(Object content) {
    super();
    this.content = content;
  }


  public Node(Object content, Node next) {
    super();
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
