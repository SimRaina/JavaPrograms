package numbers;

public class BinaryToDecimal {

    public static int binaryToDecimal(int binaryNumber) {

        int decimal = 0;
        int position = 0;

        while (binaryNumber != 0) {

            int digit = binaryNumber % 10;

            decimal += digit * Math.pow(2, position);  // decimal += digit * (1 << position);

            binaryNumber /= 10;
            position++;
        }

        return decimal;
    }

    public static void main(String[] args) {

        System.out.println("110 --> " + binaryToDecimal(110));
        System.out.println("1101 --> " + binaryToDecimal(1101));
        System.out.println("100 --> " + binaryToDecimal(100));
        System.out.println("110111 --> " + binaryToDecimal(110111));
    }
}
