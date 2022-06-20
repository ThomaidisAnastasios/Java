package askhsh_1;

/**
 *
 * Afou h klash implements ena interface tha prepei na
 * ylopoiei oles tis methodous pou orizontai sto interface
 */
public class Laptop extends Computer implements Printable{

    private double weigth;
    private int battery;

    public Laptop(int memory, double cpu, int hd, double weigth, int battery) {
        super(memory, cpu, hd);
        this.weigth = weigth;
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    public double getWeigth() {
        return weigth;
    }

    /**
     * Ylopoihsh ths methodou print toy interface
     */
    public void print() {
        System.out.println("Laptop Characteristics");
        System.out.println("Memory: " + getMemory());
        System.out.println("CPU: " + getCpu());
        System.out.println("Hard Disk: " + getHd());
        System.out.println("Weight: " + weigth);
        System.out.println("Battery: " + battery);
    }

}
