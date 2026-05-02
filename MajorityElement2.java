import java.util.*;
public class MajorityElement2 {
        //Brute
        public static List<Integer>MajorityElement(int nums[]){
            List<Integer>res=new ArrayList<>();
            int n=nums.length;
            for(int i=0;i<n;i++){
                if(res.contains(nums[i])) continue;
                int  count=0;
                for(int j=0;j<n;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count>n/3){
                    res.add(nums[i]);
                }
            }
            return res;
        }


        //better
        public static List<Integer>MajorityElementBetterApproach(int nums[]){
            Map<Integer,Integer>map=new HashMap<>();
            int n=nums.length;
            List<Integer> res=new ArrayList<>();
            for(int k:nums){
                map.put(k,map.getOrDefault(k,0)+1);
            }
            for(int key:map.keySet()){
                if(map.get(key)>n/3){
                    res.add(key);
                }
            }
            return res;
        }
        //optimal
        public static List<Integer>MajorityElementUsingMoore(int nums[]){
            int n=nums.length;
            int cnt1=0;
            int cnt2=0;
            int el1=Integer.MIN_VALUE;
            int el2=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(cnt1==0 && el2!=nums[i]){
                    cnt1=1;
                    el1=nums[i];
                }else if(cnt2==0 && el1!=nums[i]){
                    cnt2=1;
                    el2=nums[i];
                }else if(nums[i]==el2){
                    cnt2++;
                }else if(nums[i]==el1){
                    cnt1++;
                }else{
                    cnt1--;
                    cnt2--;
                }
            }
            cnt1=0;
            cnt2=0;
            for(int i=0;i<n;i++){
                if(nums[i]==el1)cnt1++;
                if(nums[i]==el2)cnt2++;
            }
            int mini=n/3+1;
            List<Integer>res=new ArrayList<>();
            if(cnt1>=mini)res.add(el1);
            if(cnt2>=mini)res.add(el2);
            if(cnt2>=mini && el1!=el2)res.add(el2);
            return res;
        }
    public static void main(String[] args) {
        int nums[]={1,2,1,1,3,2};
        List<Integer> al=MajorityElement(nums);
        System.out.println(al);
        List<Integer> al2=MajorityElement(nums);
        System.out.println(al2);
        List<Integer> al3=MajorityElementUsingMoore(nums);
        System.out.println(al3);
    }
}
