package askhsh_1;

/**
 * Den einai aparaithto mia abstact klasi na exei
 * opsdhpote abstract methodo
 * @author George
 */
public abstract class Computer {
    private int memory;
    private double cpu;
    private int hd;

    public Computer(int memory, double cpu, int hd) {
        this.memory = memory;
        this.cpu = cpu;
        this.hd = hd;
    }

    public double getCpu() {
        return cpu;
    }

    public int getHd() {
        return hd;
    }

    public int getMemory() {
        return memory;
    }

}
