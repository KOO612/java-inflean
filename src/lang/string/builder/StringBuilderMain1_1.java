package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        System.out.println(sb.toString());

        sb.insert(4, "java");

        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println(sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        String str = sb.toString();
        System.out.println(str);

        String str2 = String.valueOf(sb);


    }
}