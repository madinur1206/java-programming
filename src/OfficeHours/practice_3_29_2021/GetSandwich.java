package OfficeHours.practice_3_29_2021;
/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
 */
public class GetSandwich {
    public static void main(String[] args) {
        String str= "breadjambread";
        if(str.contains("bread")){
            int firstBread = str.indexOf("bread") ;
            if(str.substring(firstBread +5).contains("bread")){
                int secondBread = str.lastIndexOf("bread") ;
                System.out.println(str.substring(firstBread +5,secondBread ) );

            } else{
                System.out.println("nothing");
            }
        }else{
            System.out.println("nothing");
        }
    }
}
