# emp_FrogHats

  * Team Turtle Hats
  * Jacob Ng Kevin Cheng Hamim Seam
  * APCS
  * L03 -- Get Empirical

# results
* On our array of 9,999,999 integers, Binary search took 0-1 milliseconds to run for each of the 20 tests. Linear search ranged from 0 to 21 milliseconds for each of the 20 tests.
* On our array of 10 integers, Binary search took 0 milliseconds to run for each of the 20 tests. Linear search took 0 milliseconds for each of the 20 tests.
* When testing the worst possible case for our array of 9,999,999 integers (we used the last int in the array) binary took 0 milliseconds and linear took 18-19 seconds.
* When testing the worst possible case for our array of 10 integers (we used the last int in the array) binary took 0 milliseconds and linear took 0 seconds.
* The times for linear search may vary on different machines.
* We don't know why in our worst case scenario for linear search on the big array, the result was 18-19 miliseconds while in our 20 test loop, linear search ranged from 0 - 21 milliseconds. While we didn't recieve these exact results on other machines, the difference from the worst case scenario test and the maximum of the range (so in this case 21 - 18) was the same give or take a millisecond. We also noticed in our loop, it's usually only the first trial that goes above our worst case scenario time. 

# conclusions
* Binary search is faster than linear search for really big sets of data (in our case 9,999,999 integers) but for small sets (in our case 10 ints), they run in about pretty much the same amount of time. 

# Tests Performed
* Test 1 was using a really big array int[9_999_999]. We created a loop for 20 iterations. Each iteration, a target int would randomly be created and then both linear search and binary search would be conducted to find the same target. We'd then store the time taken for binary search and linear search after each iteration in another array. After all 20 trials, we found the average time taken for both search alorithms.
* Test 2 was pretty much the same as test 1 but we used a small array int[10].
* Test 3 tested the worst case scenario for both linear and binary search for the int[9_999_999] (basically find the last integer).
* Test 4 was pretty much the same as test 3 but used the int[10] array.

# GALLERY TOUR
* Another test could be record the time taken after the 20 test loop and compare the linear and binary results instead of comparing the time taken after each individual tests.

## Other Teams' Observations
* When running the search algorithm, other teams also found the first or second or both searches to take longer than the rest of the searches and even in some cases to take longer than the worst case scenario. 
One notable case of this was in a group who ran 1 trial, where each sorting algorithm would have to find 200 randomly generated targets in the same sample array of 20 million without taking the average time of each search. They put the data into a table in their README, and in the data, their Binary Search with randomized targets took longer than Binary Search with the worst case scenario.
* One possible solution is to instead run multiple trials with a smaller array, so for example it's possible to run 10 trials of an array with a sample array size of 2 milion, and then taking the average, which would cause the nasty trial with a higher time to not skew the data as much. 
* Another team decided to get rid of randomness by having each search algorithm search for every element in the array exactly once, starting from the leftmost element being the target and working its way to the right until the rightmost target has been found, and lastly taking the average of all the search times. This is useful because it more closely reflects a true average runtime, but the scale of the search makes the difference in times negligible. 
