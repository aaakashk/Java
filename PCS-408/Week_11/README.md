### Week - 11

#### [Remove Even Length Strings](RemoveEvenLengthStrings.java)

Write a method *removeEvenLength()* that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.

**(Use ArrayList)**

#### [Swap Strings in Pairs](SwapPairs.java)

Write a method *swapPairs()* that switches the order of values in an ArrayList of Strings in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on.

**For Example:**<br>
If the list initially stores these values:<br>
> {"four", "score", "and", "seven", "years", "ago"}<br>

*swapPairs()* method should switch the first pair, "four" with "score", the second pair, "and" with "seven" and the third pair, "years" with "ago" to yield the list:<br>

> {"score", "four", "seven", "and", "ago", "years"}.

If there are an odd number of values in the list, the final element is not moved.

#### [Alternate](AlternateElementsList.java)

Write a method called *alternate()* that accepts two Lists of integers as its parameters and returns a new List containing alternating elements from the two lists, in the following order:
- First element from the first list
- First element from the second list
- Second element from the first list
- Second element from the second list
- and so son...

If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed consecutively at the end.

**For example:**<br>

Let the first list be:

> {1, 2, 3, 4, 5} 

and the second list:

> {6, 7, 8, 9, 10, 11, 12}

a call of *alternate(list1, list2)* should return a list containing

> {1, 6, 2, 7, 3, 8, 4, 9, 5, 10, 11, 12}

**Do not modify the parameter lists passed in the function.**

---