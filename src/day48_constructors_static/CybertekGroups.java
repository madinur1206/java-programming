package day48_constructors_static;


import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
       Group group1= new Group("Cyberbugs");// dependency injection.group depends on String name.
        //print size of members
        System.out.println(group1.getMembers() .size() );
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");
        group1.addMember("Ali");
        System.out.println(group1.getMembers() .size() );
        Group group2= new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen","Wakshum","Akram","Bulent","Andrei","Andreea")) ;
        System.out.println("group2 members: "+ group2.getMembers() );
        //use if statement to check if akram is in the list or not
        if(group2.getMembers().contains("Akrem") ) {
            System.out.println("Akrem is member of group 2");
        }else {
            System.out.println("Akrem is not member of group 2");
        }

    }
}
