package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        String [] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        int count = 0;
        for(double eachPrice: prices ){
            if(eachPrice >100){
                System.out.print(eachPrice+" " );


            }
        }
        System.out.println("");
        for(double eachPrice: prices ){
            if (eachPrice >=10&&eachPrice <=70){
                System.out.print(eachPrice +" ");
            }
        }
        for(double eachPrice: prices ){
            if(eachPrice >50){
                count=count+1;

            }
        }
        System.out.println("\ncount= "+count );

        for(String eachCountry:countries ){
            if(eachCountry.length() >=7){
                System.out.print(eachCountry +"-"+eachCountry .length()+"," );
            }
        }
    }
}
