package day55_abstraction;

public class Running extends Exercise  {


    @Override
    public void perform() {
        System.out.println(" Performing running exercise");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*13;
    }
}
