package Practice;
/*
=======================================================
    Nested If statements
=======================================================

In Cybertek we have three batch types: US morning, US evening, EU.
Depending on a batch type (String) print information about the batch.

First figure out is is a US batch or EU batch

    - for US batches:

        > Figure out is it a morning batch or evening batch
            > morning - print: Class times are 10-5 EST. M, T, Th, F.
            > evening - print: Class times are 7-10 EST. M, T, W, Th, S, S

    - for EU batches:

        > print: Class times are  10-5 EST. M, T, W, Th, F.


=======================================================

 */

public class BatchType {
    public static void main(String[] args) {
        String batchType="EU Batch";
        String usBatchType="evening batch";
        if(batchType .equals("US Batch")){
            if(usBatchType .equals("evening batch")){
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }else{
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }
        }else{
            if(batchType .equals("EU Batch")){
                System.out.println(" Class times are  10-5 EST. M, T, W, Th, F.");
            }
        }

    }
}
