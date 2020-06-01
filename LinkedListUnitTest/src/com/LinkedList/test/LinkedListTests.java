package com.LinkedList.test;

// import all static methods from Assert class
// this way all static method of the calss can be invoked without using Class reference
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Ignore;
import org.junit.Test;
import com.LinkedList.LinkedList;

public class LinkedListTests {

  @Test
  public void new_listIsEmpty() {
    LinkedList<Integer> list = new LinkedList<>();
    assertEquals(0, list.size());
  }

  @Test
  public void toString_returnsListWithEmptyParenthesis() {
    LinkedList<Integer> list = new LinkedList<Integer>();

    assertEquals("LinkedList()", list.toString());
  }

  @Test
  public void add_canAddToAnEmptyList() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.add(5);

    assertTrue(list.size() > 0);
  }

  @Test
  public void add_addingToANonEmptyListAddsItemAtTheEnd() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.add(5);
    list.add(6);

    int value = list.get(list.size() - 1);

    assertEquals(6, value);
  }

  @Test
  public void add_addedItemsAreShownInToString() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.add(5);
    list.add(6);

    assertEquals("LinkedList( 5,6 )", list.toString());

  }

  @Test
  public void get_GetsTheFirstItem() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.add(5);

    assertTrue(list.get(0) == 5);

  }


  @Test
  public void get_PosReturnsItemsFromZeroBasedIndex() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.add(5);
    list.add(6);
    assertTrue(list.get(1) == 6);

  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void get_throwsIndexExceptionForInvalidIndex() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.add(5);
    list.add(6);

    list.get(3);
  }

  @Ignore
  @Test
  public void get_NegativeIndexIsACirclularIndex() {
    // -1 is last item
    // -2 is second last item
    // -3 is third last item
    // size() is first item

    // you will have to modify LinkedList to implement this feature
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void set_setDoesntAddNewItem() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.set(list.size()+1, 2);

  }

  @Test
  public void set_replacesCurrentItem() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.add(2);
    list.add(3);
    list.set(1, 4);

    assertTrue(list.get(1) == 4);
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void set_failsForInvalidIndex() {

    LinkedList<Integer> list = new LinkedList<Integer>();

    list.set(-1, 2);
    
  }

  @Test
  public void remove_removesTheItemFromValidIndex() {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(3);
    
    list.remove(0);
    
    assertTrue(list.size()==0);

  }

  @Ignore
  @Test
  public void remove_usesCircularIndex() {

  }

  @Ignore
  @Test
  public void get_removeReturnsTheRemovedItem() {

  }



}
