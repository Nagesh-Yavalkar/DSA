class sumsubarray{
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                cursum = 0;
                for(int k = i;k<=j;k++){
                   System.out.print(arr[k]+" ");
                   cursum = cursum +arr[k];
                   
                }if(maxsum<cursum){
                    maxsum = cursum;
                }
                System.out.println();
                System.out.println("The sum of current subarray is : "+cursum);
                System.out.println();

            }
        }
        System.out.println("Maximum subarray is : "+maxsum);
    }
}