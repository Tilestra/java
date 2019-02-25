package by.belstu.it.Matsuev.basejava;
import static java.lang.Math.*;

/** @author  Asus
 *  @version 2*/
public class Main {

    static  int sint;
    public  static  final int FIRST = 1;
    public  final int SECOND = 0;

    public static void main(String[] args) {

        char ch = 'q';
        int num = 123;
        short shNum = 12;
        byte eightByte = 42;
        long longNum = 24142;
        boolean bool = true;
        System.out.println("String" + num);
        System.out.println("String" + ch);
        System.out.println("String" + 12.5d);
        System.out.println(eightByte += num);
        System.out.println(num = (int)12.4d + (int) longNum);
        System.out.println(longNum = 23 + 2147483647);
        System.out.println(sint);
        System.out.println(bool = true && false);
        System.out.println(bool = bool ^ bool);
        //System.out.println(true + false);
        long qw = 9223372036854775807L;
        long w = 0x7fff_ffff_fffL;
        char a = 'a',
                //u = \u0061
                q = 97;
        System.out.println(3.45 % 2.4);
        System.out.println(1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        System.out.println(PI);
        System.out.println(E);
        System.out.println(round(PI));
        System.out.println(round(E));
        System.out.println(min(PI, E));
        System.out.println(random());
        Double newDouble = 3.44d;
        System.out.println(newDouble * newDouble);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        Integer int1 = 9;
        int int_1 = int1;
        Byte byte1 = 1;
        byte byte_1 = byte1;
        System.out.println(Integer.parseInt("323"));
        System.out.println(Integer.toHexString(124));
        System.out.println(Integer.compare(12, 3));
        System.out.println(Integer.toString(4));
        System.out.println(Integer.bitCount(4));
        System.out.println(Float.isNaN((float)(0.0 / 0.0)));
        int newInt = Integer.valueOf("124124");
        String newStr = "dlwdkakw";
        byte[] byteArr = newStr.getBytes();
        newStr = new String(byteArr);
        boolean newBool = Boolean.valueOf("true");
        newBool = Boolean.parseBoolean("false");
        String str1 = "qqqqq";
        String str2 = "qqqqq";
        if(str1 == str2){
            System.out.println("== is true");
        }
        if(str1.equals(str2)){
            System.out.println("'equals' is true");
        }
        if(str1.compareTo(str2) == 0){
            System.out.println("'compareTo' is true");
        }
        String testStr = "dqwdq qwd fef rrgrrr";
        for(String str : testStr.split(" ")) {
            System.out.println(str);
        }
        System.out.println(testStr.contains("dqw"));
        System.out.println(testStr.indexOf("qwd"));
        System.out.println(testStr.length());
        System.out.println(testStr.replace('q', 'o'));

        char[][] c1 = new char[3][];
        char[] c2[] = new char[][]{new char[]{'q', 'w'}, new char[]{'q', 'w'}};
        char c3[][] = new char[][]{new char[]{'q', 'w'}, new char[]{'q', 'w'}};

        c1[0] = new char[]{'q'};
        c1[1] = new char[]{'q', 'w'};
        c1[2] = new char[]{'q', 'w', 'e'};
        System.out.println(c1.length);
        System.out.println(c1[0].length);

        boolean comRez = c2 == c3;
        System.out.println(comRez);
        for (char cw[] : c2) {
            for (char c : cw) {
                System.out.println(c);
            }
        }

        var wrapper = new WrapperString("qwd");
        wrapper.Replace('q', 'w');


        Anonymous anon = new Anonymous(){
            void Replace(char q, char w){
                System.out.println("I'am an anon method!");
            }
        };
        ((Anonymous) anon).Replace('1', 'w');
    }
}
