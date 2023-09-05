import java.util.Scanner;

public class if1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1<num2){
            System.out.println("This is minimum value: "+num1);
            }if (num1>num2){
            System.out.println("This is maximum value: "+num1);

        }


    }
}
