class Small{
    public static void main(String[] args) {
        int arr[] = new int[]{10,2,3,4,5,6,1};
        int small = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<small){
                small = arr[i];
            }
        }
        System.out.println("Smallest Element is : "+small);
    }
}