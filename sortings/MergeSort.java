import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        msort(0,n-1,arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
    static void msort(int l,int r,int[] arr){
        if(l>=r)
            return;
        int mid = (l+r)/2;
        msort(l,mid,arr);
        msort(mid+1,r,arr);
        merge(l,r,mid,arr);

    }
    static void merge(int low,int high,int mid,int[] arr){
        int left = low;
        int right = mid+1;
        int[] b = new int[high-low+1];
        int k=0;
        while (left <= mid && right <= high){
            if(arr[left] < arr[right]){
                b[k] = arr[left];
                left++;
            }
            else{
                b[k] = arr[right];
                right++;
            }
            k++;
        }
        while (left<=mid){
            b[k] = arr[left];
            k++;
            left++;
        }
        while (right<=high){
            b[k] = arr[right];
            k++;
            right++;
        }
        for(int i=low;i<= high;i++)
            arr[i] = b[i-low];
    }
}
