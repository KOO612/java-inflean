package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String str = "      Java Programming ";

        System.out.println("소문자 : " + str.toLowerCase());
        System.out.println("대문자 : " + str.toUpperCase());

        System.out.println("공백 제거 : '" + str.trim() + "'");
        System.out.println("공백 제거 : '" + str.strip() + "'");

        System.out.println("앞 공백 제거 (strip) : '" + str.stripLeading() + "'");
        System.out.println("뒤 공백 제거 (strip) : '" + str.stripTrailing() + "'");

    }
}