import java.util.Scanner;

class DectoBin {
    public static void dtob(int num){
        int bin = 0;
        int pow = 0;
        while(num>0){
            int rem = num %2;
            bin = bin+rem*(int)Math.pow(10,pow);
            pow++;
            num = num/2;

        }
        System.out.println("The binary number of "+num+ "is "+bin);


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Decimal Number : ");
        int num = sc.nextInt();
        dtob(num);

    }
    
}
