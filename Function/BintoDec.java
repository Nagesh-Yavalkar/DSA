import java.util.Scanner;

class BintoDec {
    public static void btod(int bnum){
        int myno = bnum;
        int dec = 0;
        int pow = 0;
        while(bnum>0){
            int ld = bnum%10;
            dec = dec + (ld*(int)Math.pow(2,pow));
            pow++;
            bnum = bnum/10;
        }
        System.out.println("The decimal number of "+myno+" binary number is "+dec);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Binary Number");
        int num = sc.nextInt();
        BintoDec.btod(num);
        
    }
    
}
