package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] data = {32,532,12,5454,22,123,543,999,321,3};
        for (int i = 0; i < data.length ; i++) {
            System.out.println(data[i]);


        }
        for(int eachData:data){
            System.out.println(eachData );
        }
        for(int n: data){
            System.out.print(n+" ");
        }
        System.out.println("\nlast value: "+ data[data.length-1]);

        for (int i = data.length-1 ; i >=0 ; i--) {
            System.out.print(data[i]+" ");
        }

        }
    }

