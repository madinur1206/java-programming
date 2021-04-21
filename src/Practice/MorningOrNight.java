package Practice;

public class MorningOrNight {
    public static void main(String[] args) {
        int timeValue= 13;
        String morningOrNight = (timeValue>=0 &&timeValue <12)? "Morning":"NIGHT";
        System.out.println("morningOrNight = " + morningOrNight);

    }
}
