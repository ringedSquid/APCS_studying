public class sortingAlg {
	public static void main(String[] args) {
		/* 
		 * Sorting Algorithms
		 *
		 * Alot of times we have data,
		 * lets say in this case that all data
		 * are lists of numbers
		 *
		 * It stands to reason that many times it is
		 * helpful if we can organize that data in some 
		 * kind of systematic order
		 *
		 * Lets say we want to order numbers in an array from
		 * smallest to biggest.
		 *
		 * How would we do this?
		 * 	Sorting algorithms
		 *
		 * Bubble sort (The worst!)
		 *
		 * Lets say that we have an array n:
		 * 	[1, 5, 2, 3, 4]
		 *
		 * 	Bubble sort is basically looking at the elements
		 * 	of the array two at a time.
		 * 	If one element is greater than the other, and it has
		 * 	a lower index (or vice versa: one element is smaller than 
		 * 	the other and has a higher index), then you swap the elements.
		 *
		 * 	i = 0:
		 * 	[1, 5, 2, 3, 4]
		 * 	 ^  ^
		 * 	1 < 5 => This is ok
		 *
		 * 	i = 1:
		 * 	[1, 5, 2, 3, 4]
		 * 	    ^  ^
		 * 	5 > 2 => We must swap
		 *
		 * 	i = 2:
		 * 	[1, 2, 5, 3, 4]
		 * 	       ^  ^
		 *
		 * 	As this continues, you can see that the largest element will
		 * 	eventually be pushed to the end of the array.
		 *
		 * 	Bubble sort is a nested loop,
		 *
		 * 	outer loop, index k
		 * 	inner loop, index i
		 *
		 *
		 * 	
		 *
		 *
		 * 	As we complete a pass, we must decrement k (because the value at
		 * 	k-1 is in its correct place
		 *
		 * 	k = 5:
		 * 	[1, 5, 2, 3, 4]
		 * 	k = 4:
		 * 	[1, 2, 3, 4]
		 * 	k = 3:
		 * 	[1, 2, 3]
		 * 	...
		 * 	k = 0:
		 * 	[ ]
		 *
		 * 	When k = 0 then the sort ends (and the array is sorted!)
		 *
		 * 	But this is pretty unoptimized.
		 * 		If we had an array of all zeros, or if the array 
		 * 		was already sorted then we wouldn't need to make
		 * 		n passes. 
		 *
		 * 		So if we have a flag that is initialized every pass
		 *              that keeps track if we have swapped any elements
	         * 		If this flag is false, then we stop the sort early, 
	         *              because the array is already sorted!
		 *
	         *      Time complexity of bubble sort : O(n^2)
		 * 	
		 * 	Bubble sort is shit, and selection sort is also shit
		 *
		 * Selection sort:
		 *
		 * Same array n:
		 * 	[1, 5, 2, 3 ,4]
		 *
		 * 	What if we first find the biggest value in the array 
		 * 	then place it at the end? Then look for the 2nd biggest (then 3rd then 4th)
		 * 	then continue until our array is sorted?
		 *
		 * 	Selection sort needs to find the relative max
		 * 	between a given bound [0, k)
		 *
		 * 	At first the bound is [0, 5) or k = 5
		 *
		 * 	k = 5
		 * 	[1, 5, 2, 3, 4]
		 *     	    ^ 
		 * 	maximum found at index i=1
		 * 		lets now swap this with the last index, or k-1
		 *
		 * 	k = 4
		 * 	[1, 2, 3, 4]
		 * 	...
		 *
		 * 	k = 0
		 * 	[ ]
		 *
		 * 	Now our array is sorted!
		 *
		 * 	time complexity O(n^2)
		 * 	
		 * Insertion sort:
		 *
		 * Same array n:
		 * 	[1, 5, 2, 3, 4]
		 *
		 * 	What if now we iterate through the array
		 * 	And if we find an element out of place (smaller than the one previous)
		 * 	we shift it back until the element in front of it is smaller or equal to it?
		 * 	aka. we insert it into the correct place
		 *
		 * 	k = 1
		 * 	[1, 5, 2, 3, 4]
		 * 	    ^ 
		 * 	5 > 1 => no shift needed
		 *
		 * 	k = 2
		 * 	[1, 5, 2, 3, 4]
		 * 	       ^
		 * 	2 < 5 => shift 2 back in front of 1
		 * 	
		 * 	k = 3
		 * 	[1, 2, 5, 3, 4]
		 * 	          ^
		 * 	3 < 5 => shift 3 back in front of 2
		 * 	...
		 * 	k = 4
		 * 	[1, 2, 3, 4, 5]
		 * 		     ^
		 *      5 > 4 => no shift needed
		 *
		 *     	array is done!
		 *
		 *     	time complexity O(n^2)
		 * 	
		 *
		 */ 	
	}
}
