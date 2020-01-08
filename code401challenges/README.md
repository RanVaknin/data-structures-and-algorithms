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


 