package day52_inheritance.discordUsers;

public class User {
     private String name;
     private String role;
     private int id;
     public User () {
         System.out.println("User class constructor");
     }
     public User (String user, String role,int id) {
         System.out.println("three args constructor");
         this.role= role;
         this.name= name;
         this.id= id;
     }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
