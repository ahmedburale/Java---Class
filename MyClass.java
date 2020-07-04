// An object is created from a class.
// To create an object of MyClass, specify the class name, followed by the object name, 
// and used the keyword new:

class MyClass {
  
  // Create and object caled "myObj" and print the value of x:
  int x = 5;
  
  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println(myObj.x);
    
  }
}
