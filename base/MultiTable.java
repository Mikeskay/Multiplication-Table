package multiplication.base;

public class MultiTable{

    public MultiTable(){

    }

    public static void printMultiTable (int num){

        for (int i = 1; i <= num; i++ ){
            for (int j = 1; j <= num; ++j ) {

                System.out.print(i*j + "\t");

            }

            System.out.println();
        }

    }

}
