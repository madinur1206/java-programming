package Practice;
/*
[Author] - Look at CappuccinoBuyer from class for an idea

You are an author. You are writing a book and want to figure out some information related to the genre of book you are writing. Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in.

Make variables for all of that information. Given empty defaults for all except the neighborhood name. Print the information once at the end.

    Data based on genre:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40

=======================================================
 */
public class Author {
    public static void main(String[] args) {
        String genre = "Detective";
        int pageLength=0;
        int profit= 0;
        int sequels= 0;
        int countries= 0;
        switch(genre){
            case "Fantasy":
                pageLength = 500;
                profit = 1000000;
                sequels =5;
                countries =50;
                break;
            case "Detective":
                pageLength =350;
                profit =700000;
                sequels =3;
                countries =45;
                break;
            case "Science Fiction":
                pageLength=720;
                profit =900500;
                sequels =4;
                countries =40;
                break;
            case "Short Story":
                pageLength =150;
                profit =300000;
                sequels =1;
                countries =40;
                break;

        }
        System.out.println("Genre: "+ genre +"\nPage Length: "+pageLength +"\nProfit; " +profit );
        System.out.println("Sequels: " +sequels +"\nCountries: "+countries );
    }
}
