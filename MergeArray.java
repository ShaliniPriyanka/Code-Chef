class MergeArray {
    public static void main(String[] args) {
        int[] first=new int[50];
        first[0]=0;
        first[1]=1;
        first[2]=2;
        first[3]=3;
        first[4]=4;
        int firstsize=5;
        
        int[] second= new int[50];
        second[0]=5;
        second[1]=6;
        second[2]=7;
        second[3]=8;
        int secondsize=4;
        
        int size= firstsize+secondsize;
        int[] arr=new int[size];
        
        for(int i=0;i<firstsize;i++){
            arr[i]=first[i];
        }
        
        for(int i=0;i<secondsize;i++){
            arr[firstsize+i]=second[i];
        }
        
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+ " ");
        }
    }
}