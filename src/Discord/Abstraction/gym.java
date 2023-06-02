package Discord.Abstraction;

public class gym {
    public static void main(String[] args) {

        Running running=new Running();
        System.out.println(running.getCaloriesBurned(15));
        running.perform();
    }
}
