package OfficeHours.practice_5_19_2021;

public class Birds {
    //encapsulation
    private String species;
    private boolean canFly;
    private double breakLength;
    private String planet = "Earth";

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }




    public double getBreakLength() {
        return breakLength;
    }

    public void setBreakLength(double breakLength) {
        if(breakLength <0) {
            return;
        }
        this.breakLength = breakLength;
    }
}
