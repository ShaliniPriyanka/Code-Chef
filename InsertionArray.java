class InsertionArray {
    public static void main(String[] args) {
        int[] arr=new int [100];
        arr[0]=1;
        arr[1]=2;
        arr[2]=4;
        arr[3]=5;
        arr[4]=6;
        int size=5;
        int pos=2;
        int element=3;
        for(int i=size-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=element;
        size++;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }
}