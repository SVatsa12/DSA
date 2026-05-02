import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    //optimised
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>>res=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer>rows=new ArrayList<>();
            long val=1;
            for(int k=1;k<=i;k++){
                rows.add((int)val);
                val=val*(i-k)/k;
            }
            res.add(rows);
        }
        return res;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> res=generate(numRows);
        System.out.println(res);
    }
}
