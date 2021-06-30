package day58_polymorphism;

public class Casting {
    public static void main(String[] args) {
        //variable of worker and object of super man
        Worker worker  = new SuperMan() ;
        worker .work("QA manager") ;
        worker.getPaid() ;
        ((Father)worker).raiseKid() ;
        ((SuperMan)worker).playWithKid() ;
        SuperMan superMan = (SuperMan)worker;
    }
}
