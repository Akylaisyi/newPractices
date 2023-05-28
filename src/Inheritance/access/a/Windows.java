package Inheritance.access.a;

public class Windows extends Computer{
    public static void main(String[] args) {
        Windows obj=new Windows();
        System.out.println(obj.OS);
        System.out.println(obj.brand);
        System.out.println(obj.memory);
        System.out.println(obj);
    }
}
