package selfunderstanding.binarytreeimpl;

public class BinaryTreeImplTest {
public static void main(String[] args) {
  
  int a[]= {20,18,10,12,17,33,24,40,51,20,8,31,5};
  
  BinaryTree tree=new BinaryTree();
  
  for (int i = 0; i < a.length; i++) {
    
    tree.insert(a[i]);
  }
  
  System.out.println(a);
}
}
