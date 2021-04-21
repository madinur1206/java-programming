package Practice;
/*
[House Buyer ] - Look at CappuccinoBuyer from class for an idea

You are buying a new house and need to collect information about the houses in a specific area. You will give the neighborhood name and see the average house price, rating of school districts near by(out of 5), if it is a gated community or not, allow pets or not.

Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.

    Data based on neighborhood name:

        name - Hills
        average price - 89,000
        rating - 4.0
        gated - no
        allow pets - yes

        name - Oaks
        average price - 75,000
        rating - 3.5
        gated - no
        allow pets - yes

        name - Highland
        average price - 150,000
        rating - 4.5
        gated - yes
        allow pets - no

        name - Canyon
        average price - 201,000
        rating - 4.8
        gated - yes
        allow pets - yes
 */

public class HouseBuyer {
    public static void main(String[] args) {
        String neighborhoodName = "Canyon";
        int averagePrice = 0;
        double rating = 0.0;
        boolean isGated=false ;
        boolean allowPets=false ;
        switch(neighborhoodName ){
            case "Hills":
                averagePrice =89_000;
                rating =4.0;
                isGated = false ;
                allowPets =true;
                break;
            case "Oaks":
                averagePrice =75_000;
                rating =3.5;
                isGated =false ;
                allowPets =true;
                break;
            case "Highland":
                averagePrice =150_000;
                rating =4.5;
                isGated =true;
                allowPets =false ;
                break;
            case "Canyon":
                averagePrice =201_000;
                rating =4.8;
                isGated =true;
                allowPets = true;
                break;
        }
        System.out.println("Neighborhood Name: "+neighborhoodName +"\nAverage Price:"+averagePrice +"\nRating: "+rating );
        System.out.println("Is it gated: " +isGated +"\nAllow Pets: " +allowPets);
    }
}
