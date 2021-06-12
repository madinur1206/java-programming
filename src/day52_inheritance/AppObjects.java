package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp  mobileApp = new MobileApp() ;
        mobileApp .name = "Youtube";
        mobileApp.UseTheApp(10) ;

        Instagram instagram= new Instagram() ;
        instagram .name="Instagram";
        instagram .UseTheApp(20) ;

        Discord  discord= new Discord() ;
        discord.name= "Discord";
        discord.UseTheApp(35) ;
    }
}
