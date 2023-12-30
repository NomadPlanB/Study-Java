public class CharExam {
    public static void main(String[] args) {
        // 한글 '가'
        char hangul_ga = '가';
        int number_ga = '가';
        char unicode_ga = '\uAC00';
        System.out.println("hangul_ga = " + hangul_ga);
        System.out.println("number_ga = " + number_ga);
        System.out.println("unicode_ga = " + unicode_ga);

        // ASKII Code 값 출력
        int a = 'A'; // A
        int b = 'A' + 1; // B
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a = " + (char) a);
        System.out.println("b = " + (char) b);

        char upper = 'A';
        char lower = (char) (upper + 32);
        System.out.println("lower = " + lower);

        char lower_u = 'u';
        int upper_u = lower_u - 32;
        System.out.println("upper_u = " + upper_u);
        System.out.println("upper_u = " + (char) upper_u);

        System.out.println("-----------------------");
        // '1' + '2' = 3 이 나오도록 프로그래밍 하시오.
        char one = '1';
        char two = '2';

        int one_int = (int) one;
        int two_int = (int) two;
        System.out.println("one_int = " + one_int); // 49
        System.out.println("two_int = " + two_int); // 50

        int sum = one + two;
        System.out.println("sum = " + sum); // 99

        int three = (one_int - 48) + (two_int - 48);
        int three1 = (one_int - '0') + (two_int - '0');
        System.out.println("three = " + three);
        System.out.println("three1 = " + three1);

        System.out.println("-----------------------");
        // '1' + '2' + '3' + '4' + '5' = 15 가 나오도록 프로그래밍 하시오.
        int i = '1';
        int j = '2';
        int k = '3';
        int l = '4';
        int m = '5';
        System.out.println((i - 48) + (j - 48) + (k - 48) + (l - 48) + (m - 48)); // 15
        System.out.println((i - '0') + (j - '0') + (k - '0') + (l - '0') + (m - '0')); // 15

        // '1' + '2' + '3' + '4' + '5' = 15 가 나오도록 프로그래밍 하시오 - *** for문 사용! ***
        int sum1 = 0;
        sum1 += (i - '0');
        sum1 += (j - '0');
        sum1 += (k - '0');
        sum1 += (l - '0');
        sum1 += (m - '0');
        System.out.println("sum1 = " + sum1);
    }
}
