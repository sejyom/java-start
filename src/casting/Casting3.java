package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int max값
        long maxIntOver = 2147483648L; //int max값 + 1(초과)

        int intValue = 0;
        intValue = (int) maxIntValue; //형변환
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) maxIntOver; //형변환, 오버플로 발생으로 처음 숫자부터 시작
        System.out.println("maxIntValue casting = " + intValue);
    }
}
