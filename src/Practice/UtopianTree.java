package Practice;

public class UtopianTree {
    public static void main(String[] args) {
        int treeSize= 0;
        for(int year =1;year<=3;year++){
            System.out.println("year "+year+" - growth 1 cm");
            treeSize +=1;
            System.out.println("tree size: "+treeSize +" cm");


        }
        for(int year=4;year<=10;year++){
            System.out.println("year "+year+" - growth 2 cm");
            treeSize+=2;
            System.out.println("tree size: "+treeSize +" cm");

        }
    }
}
