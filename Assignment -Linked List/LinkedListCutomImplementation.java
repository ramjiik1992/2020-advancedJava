package selfunderstanding;

public class LinkedListCutomImplementation {
public static void main(String[] args) {
  
  LinkedList list=  new LinkedList();
  
  list.add(1);
  list.add(2);
  list.add(3);
  
  list.set(4, 1);
  
  list.remove(1);
 
  System.out.println("size of linked list.."+list.size());
  
 for (int i = 0; i < list.size(); i++) {
 
  System.out.println("elements "+list.get(i));
}
  
}
}
