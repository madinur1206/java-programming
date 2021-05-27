package Practice;

public class Earth {
    public static void main(String[] args) {
        AnimalSpecies animalSpecies = new AnimalSpecies() ;
        animalSpecies .setInfo("horse",20,2) ;
        System.out.println(animalSpecies .toString() );
        System.out.println(animalSpecies .getName() );
        System.out.println(animalSpecies .getPopulation() );
        System.out.println(animalSpecies .getGrowthRate() );

    }
}
