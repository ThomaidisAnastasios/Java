
package employee_shop;


public class Shop {

    private String name;
    private String address;

    Shop() {
    }

    Shop(String n, String a) {
        name = n;
        address = a;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
