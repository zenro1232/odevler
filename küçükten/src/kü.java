import java.util.Scanner;
public class kü {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Lütfen a sayıyı giriniz");
        a = input.nextInt();

        System.out.print("Lütfen b sayıyı giriniz");
        b = input.nextInt();


        System.out.print("Lütfen c sayıyı giriniz");
        c = input.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.print("a < b < c");
            } else {
                System.out.print("a < c < b");
            }
        }else  if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.print("b < a < c");
            } else {
                System.out.print("b < c < a");
            }
        } else if ((c < b) && (c < a)) {
             if (b < a) {
                System.out.print("c < b < a");
            } else {
                System.out.print("c < a < b");
            }
        }
    }
}