package OfficeHours.practice_4_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {
        //reverse the number with some math to chek is reverse the same as the original
        //eg  1234321 %10= 1; 1234321 /10= 1234321

//        System.out.println(112%1);
//        System.out.println(112%10);
//        System.out.println(112%100);
        System.out.println(isPalindrome(121) );
    }
    public static boolean isPalindrome(int number){
        //System.out.println(number %10);
        int reverse= 0;
        int temp = number;
        while (temp!=0){
            int lastDigit = temp%10;//1
          reverse = (reverse*10 )+lastDigit ;
           temp/=10;
            System.out.println(reverse);
        }
return reverse==number;
    }
}
