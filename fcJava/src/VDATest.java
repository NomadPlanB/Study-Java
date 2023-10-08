public class VDATest {
    public static void main(String[] args) {
        // 1
        int v = 10;
        System.out.println("v = " + v);

        // 2
        int a = 10;
        int b = a;
        int c = b * 10;
        System.out.println("c = " + c);

        // 3. 1~50 까지의 누적수(accumulate)
//        int sum = 0;
//        sum = sum + 1; // 0 + 1
//        sum = sum + 2; // 1 + 2
//        sum = sum + 3; // 3 + 3
//        sum = sum + 4; // 6 + 4
//        sum = sum + 5; // 10 + 5
//        System.out.println("sum = " + sum);

        int sum = 0;
        for(int i = 0; i <= 10; i++ ){
            sum = sum + i;
        }
        System.out.println("sum = " + sum);

        // 4. x=10, y=20, 서로 교환(swap) 시켜라
        int x = 10;
        int y = 20;
        int temp;
        System.out.println("x = " + x + ", y = " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x + ", y = " + y);


        /*
        * 변수, 자료형, 할당
        * 자료형(Data Type)
        * float f;
        * 1.boolean, 6.char, byte, shout, int, long, 16.double
        * 4byte 정수
        * Symbol table
        *
        *
        * */


    }
}
