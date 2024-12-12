package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,orange";

        String[] s = fruits.split(",");
        for (String str : s){
            System.out.println(str);
        }

        String result = String.join("->", s);
        System.out.println("joinString: " + result);
    }
}
