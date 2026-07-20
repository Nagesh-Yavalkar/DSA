class Bubblesort{
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5};
        boolean flag = false;
        int count = 0;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                count++;
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                    
                }
                
            }
            if(!flag){
                break;
            }
        }
        System.out.println(count);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}