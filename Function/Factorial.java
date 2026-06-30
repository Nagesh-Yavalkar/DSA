import java.util.Scanner;

public class Factorial{
    public static int facto(int n){
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f * i;
        }
        return f;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();
        int fact = facto(num);
        System.out.println("Factorial of given number is : "+fact);
        sc.close();
    }
}