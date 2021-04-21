package day31_Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters= {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};
        for(char eachLetter:letters ){
            System.out.print(eachLetter );
        }

        String sentence = new String(letters );
        System.out.println("\n sentence = " +sentence  );


        String item= "wooden spoon";
        char[] itemArray= item.toCharArray() ;
        System.out.println(itemArray );
        System.out.println("itemArry .length: "+ itemArray .length);
        System.out.println("item.length: "+ item.length() );

        String []fruits= {"bananas", "apples","kiwi"," mango","papaya","strawberry"};
        String fruitStr="";
        for(String eachFruit:fruits){
            System.out.print(eachFruit +"-");
            fruitStr +=eachFruit +"-";
            
        }

        System.out.println("\nfruitStr = " + fruitStr);


        String [] languages= {"java","python","c++","sql","ruby","javascript"};
         String joinedLanguages= String.join("<>",languages );
        System.out.println(String.join("|",languages ));
        System.out.println(joinedLanguages );
    }
}
