/*
 - You can create an object of a class and access it in another class. This is often used for better organization
of classes (one class has all the attributes and methods, while the other class holds the main() method
(code to be executed))
 - Remember that the name of the java file should match the clas name. In this example, we have created
 two files in the same directory/folder: 1. MultipleClass.java 2. OtherClass.java
*/
//MultipleClass.java
class MultipleClass {
  int x = 5;
}

// OtherClass.java
class OtherClass{
  public static void main(String[] args) {
    MultipleClass myOjb = new MultipleClass();
    System.out.println(myOjb.x);
    
  }
}
