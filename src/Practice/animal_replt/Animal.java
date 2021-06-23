package Practice.animal_replt;

public abstract class Animal {
   String name ;
     int age;
      public abstract int getAgeInHumanYears();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    public Animal (String name, int age) {
        name="rudy";
        age= 2;

    }
}
