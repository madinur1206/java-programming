package day52_inheritance;

public class AppObjects {
    public static void main(String[] args) {
        MobileApp  mobileApp = new MobileApp() ;
        mobileApp .setName("Youtube") ;
        mobileApp .setVersion(1.1) ;
        mobileApp.UseTheApp(10) ;
        mobileApp .download() ;

        Instagram instagram= new Instagram() ;
        instagram .setName("Instagram") ;
        instagram.setVersion(5.5) ;
        instagram .UseTheApp(20) ;
        instagram .download();

        Discord  discord= new Discord() ;
        discord.setName("Discord") ;
        discord.setVersion(2.2) ;
        discord.UseTheApp(35) ;
        discord.download() ;
    }
}
