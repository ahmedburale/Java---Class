// You can create multiple objects of one class
// Create two objects of MultipleObjects

class MultipleObjects {
  int x = 5;
  
  public static void main(String[] args) {
    MultipleObjects myObj1 = new MultipleObjects(); // Object 1
    MultipleObjects myObj2 = new MultipleObjects(); // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
    
  }
}
