**Iterative Approach:**
Inorder to reverse a linkedlist:
we need 3 pointers => prev,current,nextnode
the logic is:
current.next = prev;
// move all the prev,current,next by one step right
prev = current;
current = nextnode;
nextnode = nextnode.next;
​
this thing must go on till current becomes null .
by the time current becomes null, nextnode will become null->null (which throws error)
so before making nextnode = nextnode.next you check if nextnode is null or else
it gives error.
​
​
​
​
​