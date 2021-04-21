package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds=0;
        System.out.println("starting: World's smallest cat \uD83D\uDC08- BBC");
        while(seconds<=117){
            System.out.println("Watching YouTube video:" + seconds);
            seconds++;
            //Thread.sleep(500);
        }
        System.out.println("Finished watching Cat video, lets start another one");

        int count =5;
        while(count<=5){
            System.out.println("count =" + count);
            count--;
        }
    }
}
