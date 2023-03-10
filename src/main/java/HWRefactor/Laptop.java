package HWRefactor;

public class Laptop {
    private Integer ID;
    private String name;
    private Integer ram;
    private Integer hdd;
    private String os;
    private String colour;
    private static Integer count;
    static{
        count = 1;
    }

    public Laptop( String name, int ram, int hdd, String os, String colour) {
        this.ID = count;
        count++;
        this.name = name;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colour = colour;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getHdd() {
        return hdd;
    }

    public void setHdd(Integer hdd) {
        this.hdd = hdd;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return String.format(" %s, %d, %d, %s, %s", name, ram, hdd, os, colour);
    }
}
