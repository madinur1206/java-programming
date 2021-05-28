package Practice;

public class AnimalSpecies {
    String name;
    int population;
    int growthRate;

    public void setInfo(String newName, int newPopulation, int newGrowthRate) {
        name=newName ;
        population =newPopulation ;
        growthRate = newGrowthRate ;

    }

    @Override
    public String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '}';
    }

    public String getName () {
        return name ;
    }
    public int getPopulation () {
        return population ;

    }
    public int getGrowthRate () {
        return growthRate ;
    }
}
