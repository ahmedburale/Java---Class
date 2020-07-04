// Create a class called "ClassAttributes" with two attributes: x and y:
// Another term for class attributes is fields
// You can access attributes by creating an object of the class, and by using the dot syntax (.):
/* Create an object of the ClassAttributes class, with the name myObj. We use the x attribute on the 
object to print its value: 
*/
class ClassAttributes {
  //Create an object called "myObj1" and "myObj2" and print the value of x and y:
  int x = 5;
  int y = 3;
  public static void main(String[] args) {
    ClassAttributes myObj1 = new ClassAttributes();
    ClassAttributes myObj2 = new ClassAttributes();
    System.out.println(myObj1.x);
    System.out.println(myObj2.y);
    
  }
}
