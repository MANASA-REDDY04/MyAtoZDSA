package Arrays;
import java.util.*;

public class mergeOverLappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        ans = merge(arr);
        System.out.println(ans);
    }
    static List< List< Integer > > merge(int [][]arr){
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                return a[0] - b[0];
            }
        });
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        int start = arr[0][0];
        int end = arr[0][1];
        for(int j = 1; j < n; j++){
            if(arr[j][0] <= end){
                end  = Math.max(end, arr[j][1]);
            }
            else{
                ans.add(Arrays.asList(start,end));
                start = arr[j][0];
                end = arr[j][1];
            }
        }
        return ans;
    }
}
