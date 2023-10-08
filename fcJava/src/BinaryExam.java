public class BinaryExam {
    public static void main(String[] args) {
        // 123를 10진수, 2진수, 8진수, 16진수로 출력하시오.
        int decimal = 123;
        System.out.println("decimal_123 = " + decimal);
        int binary = 0b1111011; // 2진수
        System.out.println("binary_123 = " + binary);
        int octal = 173; // 8진수
        System.out.println("octal = " + octal);
        int hexa = 0x7B; // 16진수
        System.out.println("hexa_123 = " + hexa);

        // 함수를 사용하여 출력하시오.
        int data = 123;
        String binary_data = java.lang.Integer.toBinaryString(data);
        System.out.println("binary1 = " + binary_data); // Ob111011
        String octal_data = Integer.toOctalString(data);
        System.out.println("octal_data = " + octal_data); // 0173
        String hexa_data = Integer.toHexString(data);
        System.out.println("hexa_data = " + hexa_data); // 0x7B

        

    }
}
