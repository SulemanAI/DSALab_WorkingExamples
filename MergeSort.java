
public class MergeSort {
    int [] a = {22,58,47,96,45,32,12};
    int [] b = new int[a.length];
    
    void merging (int low , int mid , int high){
        int l1,l2,i;
        l1 = low; 
        l2 = mid + 1;
        i = low;
        while(l1 <=mid && l2 <= high){
            if(a[l1] <= a[l2] ){
                b[i] = a[l1];
                l1++;
            }
            else{
                b[i] = a[l2];
                l2++;
            }
            i++;
        }
        while(l1<=mid)
            b[i++] = a[l1++];
        while(l2 <= high)
            b[i++] = a[l2++];
        for (i=low; i<=high; i++){
            a[i] = b[i];
        }        
    }
   void sort(int low , int high){
        int mid;
        if(low < high ){
        mid = (low + high)/2 ;
        
        sort(low , mid);
        sort(mid + 1 , high);
        merging(low,mid,high);
        }
   
   }

    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int i ;
        int max = obj.a.length;
        
        System.out.println("Array before Sorting\n");
    
    
    for(i=0 ; i < max ; i++)
        System.out.println(obj.a[i]);
    obj.sort(0 , max-1);
    
        System.out.println("\nArray After Sorting \n");
        
        for(i=0 ; i < max ; i++)
           System.out.println(obj.a[i]);    
    }  
}

