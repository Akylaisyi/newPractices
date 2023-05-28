package Discord;

import java.time.LocalDate;

public class DiscordUser {
    String role;
    String name;
    int id;
    LocalDate createdDate;
    public DiscordUser(String role, String name,int id){
        this.role=role;
        this.name=name;
        this.id=id;
        createdDate=LocalDate.now();
    }
    public void senMessage(){
        System.out.println("Sending message to class chat");
    }
    public void joinDiscord(String DiscordURL){
        System.out.println("Joining "+DiscordURL);
    }
    @Override
    public String toString(){
        return name+"#"+id+"\nRoles: "+role+"\nAccount Created: "+createdDate;
    }
    // why did you use this format?
}
