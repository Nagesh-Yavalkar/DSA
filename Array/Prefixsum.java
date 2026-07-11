import java.util.Scanner;

class Prefixsum{
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<arr.length;i++){         // Understand here array start from 1th index because if your index is 0 it will give you exception arrayoutofbound exception
            prefix[i] = prefix[i-1]+arr[i];
        }
        System.out.print("The prefix sum array is : ");
       for(int j=0;j<arr.length;j++){
        System.out.print(prefix[j]+" ");
       }
       // if you want to find sum of any subarray you only add start index and end index it will calculate the sum of given subarray
    Scanner sc = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter your start and end index bet (0 to 4) : ");
    int start = sc.nextInt();
    int end = sc.nextInt();
    int sum = 0;
    for(int k = start;k<end;k++){
        sum = start ==0 ? prefix[end] : prefix[end]-prefix[start-1];
    }
    System.out.println("The sum of given subarray is : "+sum);
    }
}