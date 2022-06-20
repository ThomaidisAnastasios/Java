package projecttest;

public class ProjectTest {

    public static void main(String[] args) {
      DVD d1=new DVD("Starwars","S. King",120); 
      CD c1=new CD("Beat it","M. Jackson",10,130); 
      Database d= new Database();
      d.addItem(d1);
      d.addItem(c1);
      d.list();
    }
    
}
