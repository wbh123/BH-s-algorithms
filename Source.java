import java.util.HashMap;
import java.util.Map;

/**
 * 1.两数之和
 */
public class Source {
    public int[] sumTwo(int[] nums,int target){
        Map a = new HashMap();
        for (int i = 0;i<nums.length;i++){
            a.put(nums[i],i);
        }
        for (int i = 0;i<nums.length;i++){
            int temp = target - nums[i];
            if (a.containsKey(temp) &&a.get(temp)!=(Integer)i)
                return new int[] {(Integer) a.get(temp),i};
        }
        return new int[] {0};
    }
}
