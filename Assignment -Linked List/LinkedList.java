package assignments;

public class LinkedList {

  private Node head;

  private int counter;

  public void add(Object data) {

    if (head == null) {
      head = new Node(data);
    }

    Node temp = new Node(data);

    Node current = head;


    while (current.getNext() != null) {
      current = current.getNext();
    }

    current.setNext(temp);


    counter++;

  }


  public void add(Object data, int index) {

    Node temp = new Node(data);

    Node current = head;

    if (current != null) {

      for (int i = 0; i < index && current.getNext() != null; i++) {
        current = current.getNext();

      }


      temp.setNext(current.getNext());

      current.setNext(temp);

      counter++;
    }
  }

  public Object get(int index) {

    if (index < 0) {
      return null;
    }

    if (head != null) {

      Node current = head.getNext();

      for (int i = 0; i < index; i++) {
        current = current.getNext();

      }

      return current.getContent();
    }

    return null;
  }


  public int getCounter() {
    return counter;
  }


  public boolean remove(int index) {


    if (head != null) {

      Node current = head.getNext();

      for (int i = 0; i < index; i++) {

        if (current.getNext() == null) {
          return false;
        }

        current = current.getNext();
      }

      current.getNext().setNext(current.getNext().getNext());

      counter--;

      return true;
    }

    return false;


  }

  public int getSize() {
    return counter;
  }

}
