package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte a = 127; //-128 ~ 127, 2^8 (1byte), 파일 전송/복사 등에 주로 사용
        short b = 32767; //-32,768 ~ 32,767, 2^16 (2byte)
        int c = 2147483647; //-2,147,483,648 ~ 2,147,483,647 (약 20억), 2^32 (4byte)

        long l = 9223372036854775807L; //2^64 (8byte)

        //실수
        float f = 10.0f; //2^32 (4byte), 표현 길이와 정밀도가 낮음
        double d = 10.0; //2^64 (8byte)

        //자바는 기본적으로 4byte를 효율적으로 계산하도록 설계되어 있음
    }
}
