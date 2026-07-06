class Large{
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,4,5,6,7};
        int large = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("Largest Number is : " + large);
    }
}