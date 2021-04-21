package day32_arrays_split;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("-------------FIND THE INDEX OF 'Gloves' in items array----------");

        for (int i = 0; i < items.length  ; i++) {
            if(items[i].equals("Gloves") ){
                System.out.println(items[i]+" were found at index "+i );
                break;
            }


        }
        boolean ipadExists= false;
        for (int i = 0; i < items.length ; i++) {
            if(items[i].equals("iPad") ){
                ipadExists = true;
                break;
            }

        }
        System.out.println("ipad exists= "+ ipadExists );
    }
}
