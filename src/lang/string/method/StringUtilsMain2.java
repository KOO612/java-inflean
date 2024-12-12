package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String format1 = String.format("num : %d , bool : %b, str : %s", num, bool, str);

        System.out.println(format1);

        // 특정 자리수 소수점 까지만 값 저장하는 방법
        String format2 = String.format("숫자 : %.2f", 10.1234);
        System.out.println(format2);

        System.out.printf("숫자 : %.2f", 10.1234);

        System.out.println();

        // matches 문자열이 주어진 정규 표현식과 일치하는지 확인
        String regex = "Hello, (Java!|World!)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
    }
}
