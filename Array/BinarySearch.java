class Binary{
    public static int Search(int key,int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end = mid-1;

            }else{
                start = mid+1;

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int key = 5;
        int result = Search(key,arr);
        if(result ==-1){
            System.out.println("Element is Not Found");

        }
        else{
            System.out.println("Element Found at Index : "+result);
        }


    }
}