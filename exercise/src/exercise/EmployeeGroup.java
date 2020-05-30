package exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeGroup {
public static void main(String[] args) {
  
  Employee e1=new Employee(1, "ram", "vpm");
  
  Employee e2=new Employee(1, "ramji", "vpcm");
  
  Employee e3=new Employee(2, "ramk", "vpm");
  
  
  List<Employee> empList= new ArrayList<Employee>();
  
  empList.add(e1);
  empList.add(e2);
  empList.add(e3);
  
  Map<Integer, Long> map= empList.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.counting()));
  
  Set<Entry<Integer, Long>> ss= map.entrySet();
  
  for (Iterator iterator = ss.iterator(); iterator.hasNext();) {
    Entry<Integer, Long> entry = (Entry<Integer, Long>) iterator.next();
    
    System.out.println(entry.getKey()+""+entry.getValue());
  }
  
}
}
