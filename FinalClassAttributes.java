// If you don't want the ability to override existing values, declare the attributes as "final"

class FinalClassAttributes {
  // The final keyword is useful when you want a variable to always store the same values, like PI(3.14159..)
  // The final keyword is called a "modifier"
   int x = 40; // final int x = 40; results error
   int y = 50; //  final int y = 50; results error
  
  public static void main(String[] args) {
    FinalClassAttributes myObj1 = new FinalClassAttributes();
    FinalClassAttributes myObj2 = new FinalClassAttributes();
    
    myObj1.x = 25; // will generate an error: cannot assign a value to a final variable 
    myObj2.y = 40; // will generate an error: cannot assign a value to a final variable
    
    System.out.println(myObj1.x);
    System.out.println(myObj2.y);
  }
}
