import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner vareable = new Scanner(System.in);

        int year;

        System.out.print("Yılı giriniz:");

        year = vareable.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " Artık Yıldır.");
                } else {
                    System.out.println(year + " Artık Yıl Değildir.");
                }
            } else {
                System.out.println(year + " Artık Yıldır.");
            }

        } else {
            System.out.println(year + " Artık Yıl Değildir.");
        }

    }
}