//Modify attribute values: 
// Set the value of x to 40
// Set the value of y to 50

class ModifyClassAttributes {
  int x;
  int y;
  
  public static void main(String[] args) {
    
    ModifyClassAttributes myObj1 = new ModifyClassAttributes();
    ModifyClassAttributes myObj2 = new ModifyClassAttributes();
    
    myObj1.x = 40;
    myObj2.y = 50;
    
    System.out.println(myObj1.x);
    System.out.println(myObj2.y);
    
  }
}
