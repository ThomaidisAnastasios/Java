package askhsh_1;

/**
 *
 * Afou h klash implements ena interface tha prepei na
 * ylopoiei oles tis methodous pou orizontai sto interface
 */
public class DesktopPC extends Computer implements Printable{

    private String tower;

    public DesktopPC(int memory, double cpu, int hd, String tower) {
        super(memory, cpu, hd);
        this.tower = tower;
    }

    public String getTower() {
        return tower;
    }

    /**
     * Ylopoihsh ths methodou print toy interface
     */
    public void print() {
        System.out.println("Desktop PC Characteristics");
        System.out.println("Memory: " + getMemory());
        System.out.println("CPU: " + getCpu());
        System.out.println("Hard Disk: " + getHd());
        System.out.println("Tower: " + tower);
    }

}
