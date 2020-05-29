class Solution {
    public ListNode oddEvenList(ListNode head) {
    if (head == null)  
    return null;  
        
    ListNode odd = head;  
    ListNode even = head.next;    
    ListNode evenFirst = even;  
  
    while (1 == 1)  
    {    
        if (odd == null || even == null || 
                        (even.next) == null)  
        {  
            odd.next = evenFirst;  
            break;  
        }  
  
        // Connecting odd nodes  
        odd.next = even.next;  
        odd = even.next;  
  
        if (odd.next == null)  
        {  
            even.next = null;  
            odd.next = evenFirst;  
            break;  
        }  
  
        // Connecting even nodes  
        even.next = odd.next;  
        even = odd.next;  
    }  
    return head;
    }
}
