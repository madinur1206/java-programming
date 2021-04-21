package day19_class_vs_0bject_string;

public class StringEndsWith {
    public static void main(String[] args) {
        String url = "https://myfit4less.gymmanager.com";
        if(url.endsWith(".com") ){
            System.out.println("Commercial Website");
        }else if(url.endsWith(".uk")){
            System.out.println("Uk Website");
        }else if(url.endsWith(".edu")){
            System.out.println("Educational website");
        }else if(url.endsWith(".gov")){
            System.out.println("Government website");
        }else if(url.endsWith(".org")){
            System.out.println("Organisational website");
        }else{
            System.out.println("Other Websites");
        }
    }
}
