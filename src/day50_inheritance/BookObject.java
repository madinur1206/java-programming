package day50_inheritance;

public class BookObject {
    public static void main(String[] args) {
        Book book = new Book() ;
        book.title ="intro to java";
        book.author = "Savitch";
        book.type = "programming";
        book.price = 85.0;
        System.out.println(book.title);
        System.out.println(book.type);
        System.out.println(book.author);
        System.out.println(book.price );

        AudioBook audioBook = new AudioBook() ;
        audioBook .author ="Unmesh";
        audioBook .length= 60;
        audioBook .price =9.90;
        audioBook .narrator = "anna";
        audioBook .title= "selenium cookbook";
        audioBook .type= "programming";

        EBook eBook = new EBook();
        eBook .title ="java data structure";
        eBook .author = "Savitch";
        eBook .type = "programming";
        eBook .price = 70.0;
        eBook .pages = 1000;
        eBook .type ="programming";

    }
}
