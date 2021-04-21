package day22_String_manipulation_methods;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies= "java,html,css,selenium,testing,maven,cucumber";
        System.out.println(technologies .indexOf(",") );
        System.out.println(technologies .lastIndexOf(",") );
        int  idxOfCucumber = technologies .indexOf("cucumber");
        System.out.println("cucumber is at index " +idxOfCucumber );
        int indexOfSql = technologies .indexOf("SQL") ;
        System.out.println(" sql is at index " + indexOfSql );
        //if(technologies .contains("maven") ){
            //System.out.println("maven is present");
        //}else{
           // System.out.println("maven is not present");
            if(technologies .indexOf("maven")>-1 ){
                System.out.println("maven is present");
            }else{
                System.out.println("maven is not found");
            }
        }
    }

