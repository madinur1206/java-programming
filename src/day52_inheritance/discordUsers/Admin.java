package day52_inheritance.discordUsers;

public class Admin extends User {
    public Admin () {
        super();
        System.out.println("Admin class constructor");

    }
    public Admin(String name,int id) {
        super ("Admin",name, id);
        System.out.println("admin class 2 args  args constructor");



    }
    @Override
    public String toString() {
        return "Admin{ " +"role ="+getRole() +"name = "+getName() +"id = "+getName() +
                "}";
    }
}
