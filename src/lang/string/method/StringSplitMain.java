package lang.string.method;

public class StringSplitMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] strs = str.split(",");
        for (String s : strs){
            System.out.println(s);
        }

        String str2 = String.join("-", "a", "b", "c");
        System.out.println(str2);

        String result = String.join("-", strs);
        System.out.println(result);
    }
}
