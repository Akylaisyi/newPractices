package Inheritance.access.b;

import Inheritance.access.a.Computer;

public class Mac extends Computer {
    public static void main(String[] args) {
        Mac mac=new Mac();
        System.out.println(mac.memory);
        System.out.println(mac.OS);
        System.out.println(mac.toString());
    }
}
