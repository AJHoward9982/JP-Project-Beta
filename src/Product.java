import java.util.Date;

/**
 * Andrew Howard
 *
 * Product uses the interface Item and has a Product constructor containing SerialNumber ,
 * Manufacturer , ManufactureDate , and Name
 */
class Product implements Item, Comparable<Item> {

  int serialNumber;
  String manufacturer;
  Date manufacuredOn;
  String name;

  //Add an integer class variable called currentProductionNumber. This will store the next number to be
  //assigned to serialNumber.
  private static int currentProductionNumber = 1;


  //  A method setProductionNumber, one integer parameter
  public void setProductionNumber(int number) {
    currentProductionNumber = number;
  }

  ;

  //  A method setName, String parameter
  public void setName(String newName) {
    this.name = newName;
  }

  ;

  //  A method getName, return a String
  public String getName() {
    return this.name;
  }

  ;

  //  A method getManufactureDate, return a Date
  public Date getManufactureDate() {
    return this.manufacuredOn;
  }

  ;

  //  A method getSerialNumber, return an int
  public int getSerialNumber() {
    return this.serialNumber;
  }

  ;

  public Product(String newName) {
    manufacturer = Item.manufacturer;
    this.name = newName;
    serialNumber = currentProductionNumber++;
    manufacuredOn = new Date();
  }

  public String toString() {
    return "Manufacturer :" + this.manufacturer + "\n" + "Serial Number :" + this.serialNumber
        + "\n" + "Date :" + getManufactureDate() + "\n" + "Name :" + getName();
  }

  @Override
  public int compareTo(Item o) {
    return name.compareTo(o.getName());
  }

  /* Test Driver */
  /*public static void main(String[] args) {
    // Test default constructor and print instance attributes. S
    System.out.println("------------------------------------------------------------");

    Product thing = new Product("Product");
    System.out.println(thing);

    System.out.println("------------------------------------------------------------");

  }*/


}
