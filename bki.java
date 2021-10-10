import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kilonuz Nedir ? : ");
        int kilo = scanner.nextInt();
        System.out.print("Boyunuz Nedir ? :");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);

        if (bki < 18.5) {
            System.out.println("Zayıf");
        } else if (bki >= 18.5 && bki < 25) {
            System.out.println("Normal");
        } else if (bki >= 25 && bki < 30){
            System.out.println("Fazla Kilolu");
        }else {
            System.out.println("Obez");

        }

    }

}









