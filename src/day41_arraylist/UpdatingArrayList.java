package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //car list
        List<String> myCars= new ArrayList<>() ;
        myCars .add("toyota");
        myCars .add("ford");
        myCars .add("tesla");
        myCars .add("mazda");
        myCars .add("BMW");
        myCars .add(0,"jeep");
        myCars .add(1,"yugo");
        myCars .add(2,"mercedes");
        System.out.println(myCars );
        System.out.println(myCars .toString() );
        String allCarsIn1St= myCars .toString() ;
        System.out.println(" all cars in 1st " + allCarsIn1St );
        myCars .set(0,"lamborghini");
        System.out.println("after set = " +myCars .toString() );
        myCars .set(4,"Honda") ;
        System.out.println("After set honda = "+myCars.toString() );
        //HOW WWOULD YOU DO THAT IF MY CARS WAS ARRAY
        //myCars [4]="Honda";
        int indexofYugo = myCars .indexOf("yugo") ;
        myCars .set(indexofYugo ,"nissan" );
        System.out.println(myCars );
        myCars.set(myCars .indexOf("Honda"),"ford" );
        System.out.println(myCars );

        /*if(myCars .contains("nissan") ){
            myCars .indexOf("honda")

        }else {
            System.out.println("nissan is not found");
        }
        System.out.println("New list = " + myCars );

        /**
         * lamborghini -- prius
         * bugatti __lexus
         * mercedes - audi
         *
         */

        for (int i = 0; i <myCars.size() ; i++) {
            if(myCars.get(i).equals("lamborghini") ){
                myCars .set(i,"prius");
            }else if (myCars.get(i).equals("nissan")){
                myCars .set(i,"lexus");
            }else if (myCars.get(i).equals("mercedes")){
                myCars .set(i,"audi");
            }
            System.out.println("After loop = " + myCars ) ;
        }



    }
}
