public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        int key =30;
        for(int i=0; i< arr.length ; i++){
            if(key == arr[i]){
                System.out.println("key found at index " + i);
                System.exit(0);
            }
        }
        System.out.println("key not found");
    }
}

