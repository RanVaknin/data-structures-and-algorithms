Linked List:

**Insert Head:**
- create a new node and assign its value as the input value.
- if the head is non existant assign the value to insert to head.
- else - asisign then new node's next to reference head. and assign head to be the new node.

**includes:**
- creates a new node and assign the head's value to it.
- loop through the list comparing the value to check against the current node's value
- return true or false based on what it finds.

**toString:**
- initalized the string to return with an empty string so we can build upon
- create a Node and set it's value to head.
- iterate over the list adding the values of each node.
-return the final string.

**append:**
- This method appends a node to the end of the linked list.
- Create a new node with given value
- Checks if the LL is empty. if so set head to new node.
- if not iterate over the list until finds the last node and append to it.

**insertAfter:**
- initalize a new node and set its value to head.
- If head's value equals the value to insert create a temp node, and set its value to input value.
- set temp's node next value to the head's next value.
- set the head's next value to temp.

- Else iterate though the list and and compare value of current to value to insert.
- same as if block.

![](https://github.com/RanVaknin/data-structures-and-algorithms/blob/master/Data-Structures/assets/IMG_20200114_095016.jpg?raw=true)

![](https://raw.githubusercontent.com/RanVaknin/data-structures-and-algorithms/master/Data-Structures/assets/IMG_20200114_093156.jpg)

**kthFromEnd**
- create a temporary node and set it's value to head.
- find the size of the linked list with helper function ^
- initialize a counter variable and set it's value to 1.
- find the delta  linkedlist size - k = where we want to ge tthe value from.

![](https://raw.githubusercontent.com/RanVaknin/data-structures-and-algorithms/master/Data-Structures/assets/82618106_1015954898768379_172280213508456448_n.jpg)

- Iterate through the list, comparing the counter to the detla.  incrementing counter as we go until we find the value.

- If doesn't find the value throw exception.
