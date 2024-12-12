package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello World!";

        String numstr = String.valueOf(num);
        System.out.println("numstr " + numstr );

        String boolstr = String.valueOf(bool);
        System.out.println("boolstr " + boolstr );

        String objstr = String.valueOf(obj);
        System.out.println("objstr " + objstr );

        String numstr2 = "" + num;
        System.out.println("numstr2 " + numstr2 );

        char[] strchararr = str.toCharArray();
        System.out.println("strchararr " + strchararr );
        System.out.println(strchararr);

        for (char c : strchararr) {
            System.out.print(c);
        }
    }
}
