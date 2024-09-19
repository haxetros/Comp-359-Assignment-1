Assignment 1 and Midterm 1 Topics (from the discussion board)

For the first assignment and midterm, you will work in groups of three. Please let others know here if you need a team. Once you have a team, choose one of you to email me your names and I will set up a Blackboard group in the Groups section for you. You cannot see the submission unless you have such a group.


Please choose from among the following topics, or message me if you have an idea of your own you would like to work on. The topics are first-come, first served in order of reply to this discussion. Instructions are in the Assignments and Tests section for first assignment. Instructions for Midterm 1 presentations will be posted Sep 19.


1) Implement a program that orders keys based on user query frequency during execution. That is, upate the order over the use of the program so that sequential search operates faster.


2) Program in C++ with instrinsics to sort an input array of length n numbers using CPU parallelization. Note that intrinsics will depend heavily on which CPU architecture your computer has. If no such intrinsics will work on any of your CPUs, then write report on them and how to design such implementation of a sort.


3) Convert uniform random number generation into normal distribution (Gaussian). Use the normal distribution to select set of integers in range [0, 999] for 300 elements. Which of three different quadratic sorting algorithms perform best?


4) Create a program that visualizes three different sorting algorithms, one quadratic, one linearithmic, and one linear.


5) Compare the runtimes of the standard utility library sorting functions from C++, Java, and Python. How much of the code running on a VM (or not) accounts for the time? Be aware that compilers have different optimization options available.


6) Implement radix/bin sort for integers recursively by decimal digit in the range [0, 999].


7) Implement different "merge" function for Mergesort and compare the differences. At least in-place vs not (allowed extra array memory).


8) Plot the runtimes for sorting input arrays of different sizes, at least for a quadratic sort, and a linearithmic sort. Are the runtime plots shaped as we would expect from their analyses?


9) Compare runtimes for sorting as usual integer order, versus relaxed partial order. That is, implement a custom ordering via a compare function instead of the typical inequality comparisons. Start with the simplest being: ignore the rightmost digit of decimal numbers in the order / comparison.


10) Approximate how stable bubble sort is vs insertion sort. What percentage of pairs of elements starting with i < j do not change relative order in final positions i' < j' after sort is done? Just implement the measure considering arrays with 100 elements.


11) Compare quicksort against itself when implemented with different choices of pivot selection strategies.


12) Compare runtimes of two different custom ordered sortings of 2D points. For example, polar coordinate ordering: smaller radius listed first and break ties with angle measured from the positive x-axis. In that ordering, you would need to create input 2D points with possibly negative coordinate values.


13) Write a report on the journal Nature paper exploring the results for increased speedup of sorting and be ready to share in Midterm 1 with everyone.