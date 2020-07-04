// Override existing values:
// Change the value of x to 25
// Change the value of y to 40

class OverrideClassAttributes {
  int x = 40;
  int y = 50;
  
  public static void main(String[] args) {
    OverrideClassAttributes myObj1 = new OverrideClassAttributes();
    OverrideClassAttributes myObj2 = new OverrideClassAttributes();
    
    myObj1.x = 36; // x is now 36
    myObj2.y = 38; // y is now 38
    
    System.out.println(myObj1.x);
    System.out.println(myObj2.y);   
  }
}
