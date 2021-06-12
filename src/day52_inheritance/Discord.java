package day52_inheritance;

public class Discord extends MobileApp  {
    public void chat( String  someone) {
        System.out.println("chatting with" +someone +" on Discord");
    }
    @Override
    public void UseTheApp (int minutes) {
      super.UseTheApp(minutes ) ;
      chat("Elshat") ;
    }
    @Override
     public boolean download () {
        System.out.println(" Downloaded Discord  0.0.23 from App store");
        super.download();
        return true;
    }
}
