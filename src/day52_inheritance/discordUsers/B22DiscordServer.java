package day52_inheritance.discordUsers;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1= new User() ;
        user1.setId(1234) ;
        user1.setName("madinur") ;
        user1.setRole("student");
        Admin  admin1= new Admin() ;
        admin1.setId(43134) ;
        admin1 .setName("Elshat") ;
        admin1.setRole("admin") ;
        System.out.println(user1);
        System.out.println(admin1);
        Admin admin2 = new Admin ("madinur",3456);
        System.out.println(admin2);
    }
}
