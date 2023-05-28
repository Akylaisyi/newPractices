package Discord;

public class Admin extends DiscordUser{

    public Admin(String role, String name, int id) {
        super(role, name, id);
    }

    @Override
    public void joinDiscord(String DiscordURL) {
        System.out.println("Sending announcement");
    }

    public static void main(String[] args) {
        Admin admin=new Admin("QA Engineer","Akylai", 148569);
        System.out.println(admin.createdDate);
        admin.senMessage();
        System.out.println(admin);
         System.out.println(admin);
         System.out.println(admin);

    }

}
