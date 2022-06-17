package june13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class June12P2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> combined = new ArrayList<>();
        for (int i: nums1){
            combined.add(i);
        }
        for (int i: nums2){
            combined.add(i);
        }
        int size = combined.size();
        Collections.sort(combined);
        if (size%2==0){
            double left = combined.get(size/2-1);
            double right = combined.get(size/2);
            double answer = (left + right)/2;
            return answer;
        }
        double answer = combined.get((combined.size()/2));
        System.out.println(combined);
        return answer;
        
        
        
    }

}
