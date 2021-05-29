package day47_constructors;

public class Address {
    private String street;
    private  String city;
    private String state;
    private String zipCode;
    private String country  = "USA";
    //constructor
    public Address () {
        System.out.println("ADDRESS CONSTRUCTOR ");
        street = "123 unknown street";
        city = "unknown";
        state = "unknown";
        zipCode ="00000";

    }
    //second constructor  overloaded constructor ,provides shortcut to intialize variables
   public Address (String street,String city,String state,String zipCode ) {
        setStreet(street) ;
        this .city= city;
        this.state= state;
        this.zipCode = zipCode ;

   }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (street.isEmpty() || street.length() > 50) {
            System.out.println("Error Invalid street ");
        } else {
            this.city = city;
        }
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return street+ ", "+city +", "+state +", "+zipCode +", "+country ;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
