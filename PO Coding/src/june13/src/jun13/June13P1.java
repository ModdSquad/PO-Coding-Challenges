package june13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class June13P1 {
	public ListNode mergeKLists(ListNode[] lists) {
	       
	       List<Integer> temp = new ArrayList<Integer>();
	        
	        for (ListNode l: lists){
	            while (l!= null) {
	                temp.add(l.val);
	                l=l.next;
	            }
	        }
	        
	        Collections.sort(temp);
	        System.out.println(temp);
	        // return lists[0];
	        
	        ListNode answer = new ListNode(0);
	        ListNode a = answer;
	        for (int i:temp){
	            ListNode t = new ListNode(i);
	            a.next = t;
	            a=a.next;
	        }
	        a.next = null;
	        return answer.next;
	        
	}

}
