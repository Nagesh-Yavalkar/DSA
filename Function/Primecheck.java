import java.util.Scanner;


class Client{
    public static int prime(int num){
        int count = 0;
        for(int i = 1;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }
        return count+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int num = sc.nextInt();
        int check = prime(num);
        if(check==2){
            System.out.println("Given number is prime Number ");
        }
        else{
            System.out.println("Given number is not prime number");
        }

    }
}