class Kadanes{
    public static void main(String[] args) {
        int arr[] = new int[]{-1,-2,3,-4,5};
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            cs = cs+arr[i];
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("Our maximum sum of Subarray is : "+ms);
    }
}

// Approach of Kadanes algorithm is if you adding array indexwise then your sum is less than zero
//then your maximum sum is equal to zero and if your additon is greater than zero then it add it maximum variable