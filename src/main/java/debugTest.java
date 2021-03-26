import java.util.LinkedList;

public class debugTest {
    public static void main(String[] args) {

        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[13 * size];
        byte[] myAlloc2 = new byte[size];
        myAlloc1 = null;
        byte[] myAlloc3 = new byte[15 * size];
        byte[] myAlloc4 = new byte[100 * 1024];
        myAlloc3 = null;
        myAlloc2 = null;
        byte[] myAlloc5 = new byte[15 * size];
        byte[] myAlloc6 = new byte[200 * 1024];
        myAlloc5 = null;
        byte[] myAlloc7 = new byte[15 * size];
//        byte[] myAlloc1 = new byte[1824 * 1024];
//        byte[] myAlloc6 = new byte[ 498 * 1024];
//
//        byte[] myAlloc1 = new byte[ size];
//        byte[] myAlloc2 = new byte[ size];
//        byte[] myAlloc3 = new byte[ size];
//        byte[] myAlloc4 = new byte[ size];

//        System.out.println("MyTest.main");

    }
}
