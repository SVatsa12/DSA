import java.util.*;
public class Three3Sum {
    public static List<List<Integer>> threesum(int nums[]){
        int n = nums.length;
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        res.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threesum(nums));
    }
}
