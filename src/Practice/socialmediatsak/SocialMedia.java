package Practice.socialmediatsak;

public abstract class SocialMedia {
    String personalURI;
    int accountLength;
    static String platform;

    public abstract void directMessaging (String userName, String message);
    public abstract void post (String body );
    public abstract void notifications ();



}
