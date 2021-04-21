package Practice;

public class QualificationForArmy {
    public static void main(String[] args) {
        String citizenShip = "USA";
        boolean isResident = true;
        boolean hasDiploma = true;
        int age =39;
        if(citizenShip .equalsIgnoreCase("USA") &&isResident &&hasDiploma &&age>=18&&age<=35){
            System.out.println("You are qualified for the US Army");
        }else{
            if(!citizenShip .equalsIgnoreCase("USA")||isResident !=true ){
                System.out.println("You must be a U.S. citizen or a resident");

            } else if(age<18||age>35){
                System.out.println("Your age must be between 18 to 35 years old");
            }else if(!hasDiploma ){
                System.out.println("You must have a high school diploma");
            }
        }

    }
}
