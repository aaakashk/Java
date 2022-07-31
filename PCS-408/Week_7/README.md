### Week - 7

#### [String Related Functions](WordExample.java)

Define a class **WordExample** having the following description:<br>
**Data Members/Instance Variables:**<br>
private String **strData**: to store a sentence.

**Parameterized Constructor - WordExample(String):** Accept a sentence which may be terminated by either '.', '?' or '!' only. The words may be separated by more than one blank space and are in UPPERCASE.

**Member Methods:**<br>
**void countWord():** Find the number of words beginning and ending with a vowel.<br>
**void placeWord():** Place the words which begin and end with a vowel at the beginning, followed by the remaining words as they occur in the sentence.

#### [Array Functions](ArrayDemo.java)

Write a Java program to create a class called **ArrayDemo** and overload arrayFunc() function.

**void arrayFunc(int[], int) &rarr;** To find all pairs of elements in an array whose sum is equal to a given number:

Array numbers = [4, 6, 5, -10, 8, 5, 20], target = 10

**Output:**

Pairs of elements whose sum is 10 are:<br>
4 + 6 = 10<br>
5 + 5 = 10<br>
-10 + 20 = 10

**void arrayFunction(int A[], int p, int B[], int q) &rarr;** Given two sorted arrays A and B of size p and q, Overload method arrayFunc() to merge elements of A with B by maintaining the sorted order, i.e. fill A with first p smallest elements and fill B with remaining elements.

**Example:**<br>
**Input:**<br>
int[] A = {1, 5, 6, 7, 8, 10}<br>
int[] B = {2, 4, 9}<br>
**Output:**<br>
Sorted Arrays:<br>
A: [1, 2, 4, 5, 6, 7]<br>
B: [8, 9, 10]

**(Use Compile time Polymorphism Method Overloading)**

---