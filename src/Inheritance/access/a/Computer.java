package Inheritance.access.a;

public class Computer {
    public String OS;
    protected int memory;
    String brand;
    private boolean hasWifi;

    @Override
    public String toString() {
        return "Computer{" +
                "OS='" + OS + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifi=" + hasWifi +
                '}';
    }
}
