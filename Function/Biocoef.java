import java.util.Scanner;

public class Biocoef {
    public static int factn(int n){
        int f = 1;
        for(int i =1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int factr(int n){
        int r = 1;
        for(int i = 1;i<=n;i++){
            r = r*i;
        }
        return r;
    }
    public static int factnr(int n){
        int nr = 1;
        for(int i = 1;i<=n;i++){
            nr = nr*i;
        }
        return nr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number n : ");
        int n = sc.nextInt();
        System.out.println("Enter your Number r : ");
        int r = sc.nextInt();
        int nf = factn(n);
        int rf = factr(r);
        int nrf = factnr(n-r);

        int bc = nf/(rf*nrf);
        System.out.println("Your Binomail Coefficient is : "+bc);



    }
}
