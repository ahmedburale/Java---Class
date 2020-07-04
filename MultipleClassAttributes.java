// You can specify as many attributes as you want. 

class MultipleClassAttributes {
  String fname = "John";
  String lname = "Doe";
  int age = 24;
  
  public static void main(String[] args) {
    MultipleClassAttributes myObj = new MultipleClassAttributes();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
    
  }
}
