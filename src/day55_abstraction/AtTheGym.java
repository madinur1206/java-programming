package day55_abstraction;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running ();//polymorphism benefit of abstraction
        Running running = new Running() ;
        Swimming swimming= new Swimming() ;
        FreeWeight freeWeight = new FreeWeight() ;

        exercise.start() ;
        exercise.perform() ;
        System.out.println("running 30 minutes- calories"+running.getCaloriesCount(30) );
        running .start() ;
        running .perform() ;
        System.out.println("running 30 minutes- calories"+running.getCaloriesCount(30) );
        swimming .start() ;
        swimming .perform() ;
        System.out.println("swimming 30 minutes- calories"+swimming .getCaloriesCount(30) );
        freeWeight .start() ;
        freeWeight .perform ();
        System.out.println("free wight 30 minutes- calories"+freeWeight .getCaloriesCount(30) );
    }
}
