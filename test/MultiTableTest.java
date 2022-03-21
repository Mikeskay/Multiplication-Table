package multiplication.test;

import  multiplication.base.MultiTable;

public class MultiTableTest {


    public static void main(String[] args) {
        MultiTable test = new MultiTable();

        int num = Integer.parseInt(args[0]);
        test.printMultiTable(num);


    }


}
