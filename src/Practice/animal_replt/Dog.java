package Practice.animal_replt;

public class Dog extends Animal {
    String breed;
    int humanYears;

    @Override
    public String toString() {
        return "Name: "+getName()+
                "\nBreed: "+breed +
                "\nAge in calendar years: "+getAge()+
                "\nAge in human years: "+getAgeInHumanYears() ;
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        breed="Bulldog";
    }

    @Override
    public int getAgeInHumanYears() {
        if (this.age <= 2) {
            return age*11;
        }else{
            return 22 + ((age-2) * 5);
        }
    }
}
