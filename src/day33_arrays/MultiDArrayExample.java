package day33_arrays;
import java.util.*;
public class MultiDArrayExample {
    public static void main(String[] args) {
        String [][] users=new String[3][2];
        users[0][0]= "Madinur Mahmud";
        users[0][1]= "Madi1206Qr!";
        users[1][0]= "Elshat Omar";
        users[1][1]= "Elshat0707!";
        users[2][0]= "Ayjamal abdureh";
        users[2][1]= "Ayjamal0401!";

        String [][] userData = {{"Madinur Mahmud","Madi1206Qr!"},{"Elshat Omar","Elshat0707!"},{"Ayjamal abdureh","Ayjamal0401!"}};
        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);
        System.out.println(userData[0][1]);
        System.out.println(userData[1][1]);
        System.out.println(userData[2][1]);
    }
}
