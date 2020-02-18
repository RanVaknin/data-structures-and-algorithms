# Reverse an Array
Reversing an array 

## Challenge
given an array of integers, our function needs to return the same array but reversed without using any built it methods.

## Approach & Efficiency
We created an additional array with the same length as the input array.

created a counter variable and set it to 0 to hold a value of the first index of our new array.

ran a loop to iterate backwards through the input array.

compared the last element in the input array to the first in the new array

and incremented counter by 1.

lastly we returned the new array.

lastly we returned the new array.
## Solution
https://github.com/RanVaknin/data-structures-and-algorithms/blob/master/code401challenges/ArrayReverse/WhiteBoard.jpg?raw=true


#  an Array
Reversing an array 

## Challenge
given an array of integers, insert integer in middle of the array.

## Approach & Efficiency
make a new array with length +1 of the original array

finding the midpoint of the array

assigning the value of the input number to midpoint
(this will give us a     [0,0,num,0,0]   or  [0,0,0,num,0,0]  depending on if even or odd array length)

looping through the array from index 0 to our midpoint (not including)
and copying the values from the input array.

looping through the array from the midpoint+1 to end of newArray and copying the values from the input array.

lastly we returned the new array.

## Solution
https://github.com/RanVaknin/data-structures-and-algorithms/blob/master/code401challenges/src/main/java/code401challenges/WhiteBoardShift.jpg?raw=true


 # Build a Queue with two stacks
 There are two methods in in this queue:
- enque: adds an element in the beginning of the queue.
- deque: removes an element from the beginning of the queue.
Both methods operate like a "slanky", creates a stack, populates it, upon insertion or removal of items it reverses the stack, adds or removes and reverses it again

![](https://github.com/RanVaknin/data-structures-and-algorithms/blob/master/code401challenges/assets/83318261_159357988729070_7077996865609793536_n.jpg?raw=true)

# AnimalShelter Class
This class has two methods.
- enque:  you can either enque a cat or a dog by passing in a Cat instance or a Dog instance as arguments and then passing in a string name of whichever animal you enque.

- deque: you need to pass in a string of whichever animal you want to deque from the shelter. "cat" or "dog". If you dont specify either it will return null.

![](https://scontent-sea1-1.xx.fbcdn.net/v/t1.15752-9/s2048x2048/82766750_524750721728550_4927164268400345088_n.jpg?_nc_cat=104&_nc_ohc=ngRqQN6IBqEAX8sQ0k9&_nc_ht=scontent-sea1-1.xx&_nc_tp=1002&oh=07b2d835f17bff70a4b7727b6c906a0e&oe=5E91E0F9)


# breadth first tree traversal.
this method takes a tree and returns an arrayList based on the tree structure.
It utilizes a while loop to iterate over the nodes of the tree and compares it to the array I'm pushing into to keep track of it's location within the tree.

![](https://scontent-sea1-1.xx.fbcdn.net/v/t1.15752-9/s2048x2048/83493246_151972636251463_6346282726412255232_n.jpg?_nc_cat=107&_nc_ohc=Xb5tV0IwDtAAX_STaze&_nc_ht=scontent-sea1-1.xx&oh=745ea2df5e1a277d9ee2c1cf67ad5877&oe=5EC99100)


# FizzBuzzTree
this function takes in a tree and returns fizzbuzz if node's values is divisible by 5 & 3, fizz if divisible by 5, buzz if divisible by 3, and calls toString() on the node's value if is not divisible by any of the two.

![](https://scontent-sea1-1.xx.fbcdn.net/v/t1.15752-9/80956613_124056878857991_2667592604018802688_n.jpg?_nc_cat=111&_nc_ohc=dqHmw0Uf3KgAX-lNn6T&_nc_ht=scontent-sea1-1.xx&oh=1fbddaf9080fce7ae065b9062084d9a8&oe=5E9653BB)

# findmax
this function recursively searches a binaryTree to find the max value;
![](https://scontent-sea1-1.xx.fbcdn.net/v/t1.15752-9/s1080x2048/83307280_192428818612683_8938770096319365120_n.jpg?_nc_cat=100&_nc_ohc=IJGes-6cZHoAX88ZlqH&_nc_ht=scontent-sea1-1.xx&oh=2e8ad12bafcd8fe10ac340c830e715a8&oe=5EC90722)


## Hashtable
I implemented add, get contains and hash methods to my hashtable class
https://github.com/RanVaknin/data-structures-and-algorithms/pull/47
