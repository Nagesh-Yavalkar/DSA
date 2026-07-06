import java.util.Scanner;

class Linear{
    public static int search(int key,int arr[]){
        for(int i = 0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
          
        }
        return -1;

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Key : ");
        int  a = sc.nextInt();
        System.out.println("Enter your Five Numbers : ");
        int arr[] = new int[5];
        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int index = search(a,arr);
        if(index ==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Found at index "+index);
        }
    }
}