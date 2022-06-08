public class Tester{
  
  private String name;
  
  public tester(String name){
    this.name = name;
  }
  
  public String getName(){
    return name;
  }
  
  public static void main(String args[]){
    Tester test = new Tester("Harry");
    System.out.println(test.getName());
  }
}
