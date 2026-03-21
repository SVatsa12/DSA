public class SortanArray0or1or2 {
    public static void sortcolors(int nums[]){
        int count0=0,count1=0,count2=0;
        //step1:count
        for(int n:nums){
            if(n==0)count0++;
            else if(n==1)count1++;
            else count2++;
        }
        //step2:overwrite the array
        int i=0;
        while(count0-->0){
            nums[i++]=0;
        }
        while(count1-->0){
            nums[i++]=1;
        }
        while(count2-->0){
            nums[i++]=2;
        }
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        sortcolors(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
