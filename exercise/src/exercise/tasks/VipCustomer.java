package exercise.tasks;

public class VipCustomer {

  private String name;

  private String creditLimit;

  private String address;

  public VipCustomer(String name, String creditLimit, String address) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.address = address;
  }

  public VipCustomer() {
this("default name", "1000", "chennai");
  }

  public VipCustomer(String name, String creditLimit) {
    this(name, creditLimit, "default address");
  }


  public String getName() {
    return name;
  }

  public String getCreditLimit() {
    return creditLimit;
  }

  public String getAddress() {
    return address;
  }
  public static void main(String[] args) {

    VipCustomer customer = new VipCustomer();
    System.out.println(customer.getName());
    
    VipCustomer cutomer1 = new VipCustomer("john", "100");
    System.out.println(cutomer1.getName());
    
  }
}
