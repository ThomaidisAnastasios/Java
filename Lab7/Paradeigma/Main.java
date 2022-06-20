
package askhsh_1;

public class Main {

    public static void main(String[] args) {
        Laptop lap = new Laptop(2, 2.5, 500, 2.5, 4);
        DesktopPC desk = new DesktopPC(4, 3.2, 350, "mini");
        lap.print();
        desk.print();
    }

}
