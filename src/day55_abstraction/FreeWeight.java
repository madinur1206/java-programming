package day55_abstraction;

public class FreeWeight extends Lifting  {
    @Override
    public void perform() {
        System.out.println("lifting free weight dumbbells");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes*6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack dumbbells");

    }
}
