package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        //자동 형변환(묵시적 형변환)
        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue  = 2000000000L; //long -> double
        System.out.println("doubleValue2 = " + doubleValue);


    }
}
