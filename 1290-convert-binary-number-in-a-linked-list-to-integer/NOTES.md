Finding size and keeping 2 size-1, 2 size-2, ......... , 2 2,2 1, 2 0 => needs two iterations
​Efficient approach:
needs only 1 iteration.

start traversing from the beg to end of linked list:
when u came to the particular node assume that it is the last node and keep as 2 power 0.
then all the prevnodes power must be increased by 1 bcuz all the prevnodes are not last nodes as assumed another node is added in the end.
