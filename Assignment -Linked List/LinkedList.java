package selfunderstanding;

public class LinkedList {


  Node head;

  int counter;

  public void add(Object content) {

    Node current = new Node(content);
    if (head == null) { // check first element or not

      head = current;
    }else {
      Node temp =head;
      while (temp.getNext() != null) { // adding element to end of list
        temp = temp.getNext();
      }

      temp.setNext(current);

    }

    
    counter++;

  }


  public boolean remove(int index) {

    if (index < 0 || index > size()) {

      return false;
    }

    Node temp=head;
    for (int i = 0; i < index-1; i++) {
      temp = temp.getNext();

    }
    if(temp.getNext() ==null) { //if given element is last element
      temp.setNext(null);
    }else {
      temp.setNext(temp.getNext().getNext());  
    }
    
    
    counter--;
    return true;
  }


  public boolean set(Object content, int index) {

    if (index < 0 || index > size()) {

      return false;
    }

    Node temp=head;
    for (int i = 0; i < index; i++) { // iterate to given location

      temp = temp.getNext();

    }

    temp.setContent(content);

    return true;

  }


  public Object get(int index) {

    if (index < 0 || index > size()) {

      return false;
    }

    Node temp =head;
    for (int i = 0; i < index; i++) {
      temp = temp.getNext();

    }

    return temp.getContent();

  }


  public int size() {
    return counter;
  }

}