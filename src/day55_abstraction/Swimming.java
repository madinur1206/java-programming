package day55_abstraction;

public class Swimming extends Exercise  {

    @Override
    public void perform() {
        System.out.println("Performing swimming in a pool or Ocean");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*11;
    }
}
