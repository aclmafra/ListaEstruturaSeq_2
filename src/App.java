import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double n1;

        System.out.println("Digite um numero: ");
        n1 = sc.nextDouble();

        System.out.println("O numero informado foi " + n1);

        sc.close();
    }
}
