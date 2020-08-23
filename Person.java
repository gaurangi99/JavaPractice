public class Person {
  
  int id;
  int height;
  
  
  public static void main(String[] args) {
    Person p = new Person();
    p.id = 2;
    change(p);
    System.out.println("id "+ p.id);
  }
  
  /**
   * @param p
   */
  public static void change(Person p) {
//    p.id = 3;
    p = new Person();
    p.id = 4;
    System.out.println("id "+ p.id);
  }

}
