# University of Minnesota Morris Algorithms 3501 Lab 4

- [Explanation of the Algorithm](#explanation-of-the-algorithm)
- [Testing Data](#testing-data)
----

## Explanation of the Algorithm
Our lab implements a best-fit approach for bin packing. I found this video to give a clear and concise visual 
explanation of how the concept works, https://www.youtube.com/watch?v=vUxhAmfXs2o.
    
The best-fit approach works by taking an unsorted group of numeric values then iterates over the values placing them
in the first bin that has enough remaining room. This means that occasionally there will be a remaining value that 
could not be packed into a bin even though it may have worked if substituted for another bins value. Overall this 
logic works pretty well and leaves few to no remainders but this can be dependent on how large the majority 
of provided values are. The more values provided that are close to the size of the bin will mean there are more 
values that will not be able to be packed into the bins. This problem could potentially be relieved by a brute-force
approach but the best-fit approach seems like the best choice to satisfy the requirements of the lab.
    
## Testing Data
Below you will find some of testing data used for our algorithm all values were provided by the user using the 
Scanner class in java.
>Test case one using numbers randomly chosen and inputted by the user.
```
    Input desired bin size:
    10
    Input number of integers to sort: 
    12
    Enter the first integer to be sorted
    
    6
    Please enter 11 more integers.
    3
    Please enter 10 more integers.
    4
    Please enter 9 more integers.
    7
    Please enter 8 more integers.
    8
    Please enter 7 more integers.
    1
    Please enter 6 more integers.
    2
    Please enter 5 more integers.
    4
    Please enter 4 more integers.
    9
    Please enter 3 more integers.
    10
    Please enter 2 more integers.
    2
    Please enter 1 more integer.
    1
    
    Bin one of size 10 contains integers:
    [6, 3, 1]
    
    Bin two of size 10 contains integers:
    [4, 2, 4]
    
    Bin three of size 10 contains integers:
    [7, 2, 1]
    
    Integers that could not fit into available bins:
    [8, 9, 10]
```    
>Test case two using user provided input of all integers equal to one.
```
    Input desired bin size:
    10
    Input number of integers to sort: 
    21
    Enter the first integer to be sorted
    1
    Please enter 20 more integers.
    1
    Please enter 19 more integers.
    1
    Please enter 18 more integers.
    1
    Please enter 17 more integers.
    1
    Please enter 16 more integers.
    1
    Please enter 15 more integers.
    1
    Please enter 14 more integers.
    1
    Please enter 13 more integers.
    1
    Please enter 12 more integers.
    1
    Please enter 11 more integers.
    1
    Please enter 10 more integers.
    1
    Please enter 9 more integers.
    1
    Please enter 8 more integers.
    1
    Please enter 7 more integers.
    1
    Please enter 6 more integers.
    1
    Please enter 5 more integers.
    1
    Please enter 4 more integers.
    1
    Please enter 3 more integers.
    1
    Please enter 2 more integers.
    1
    Please enter 1 more integer.
    1


    Bin one of size 10 contains integers:
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    Bin two of size 10 contains integers:
    [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

    Bin three of size 10 contains integers:
    [1]

    Integers that could not fit into available bins:
    []
``` 
>Test case three using user inputted values of all integers equal to the bin size.
```
    Input desired bin size:
    10
    Input number of integers to sort: 
    5
    Enter the first integer to be sorted
    10
    Please enter 4 more integers.
    10
    Please enter 3 more integers.
    10
    Please enter 2 more integers.
    10
    Please enter 1 more integer.
    10
    Please enter 1 more integer.


    Bin one of size 10 contains integers:
    [10]

    Bin two of size 10 contains integers:
    [10]

    Bin three of size 10 contains integers:
    [10]

    Integers that could not fit into available bins:
    [10, 10]
```
>Test case four using an integer equal to one followed by an integer equal to the size of the bin.
```
    Input desired bin size:
    10
    Input number of integers to sort: 
    15
    Enter the first integer to be sorted
    1
    Please enter 14 more integers.
    10
    Please enter 13 more integers.
    1
    Please enter 12 more integers.
    10
    Please enter 11 more integers.
    1
    Please enter 10 more integers.
    10
    Please enter 9 more integers.
    1
    Please enter 8 more integers.
    10
    Please enter 7 more integers.
    1
    Please enter 6 more integers.
    10
    Please enter 5 more integers.
    1
    Please enter 4 more integers.
    10
    Please enter 3 more integers.
    1
    Please enter 2 more integers.
    10
    Please enter 1 more integer.
    1
    Please enter 1 more integer.


    Bin one of size 10 contains integers:
    [1, 1, 1, 1, 1, 1, 1, 1]

    Bin two of size 10 contains integers:
    [10]

    Bin three of size 10 contains integers:
    [10]

    Integers that could not fit into available bins:
    [10, 10, 10, 10, 10]
```