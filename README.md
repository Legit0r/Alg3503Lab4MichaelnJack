# Alg3503Lab4MichaelnJack
Explanation of the algorithm: <br/><br/>
    Our lab implements a best-fit approach for bin packing. I found this video to give a clear and concise visual explanation
    of how the concept works, https://www.youtube.com/watch?v=vUxhAmfXs2o. <br/><br/> 
    The best-fit approach works by taking an 
    unsorted group of numeric values then iterates over the values placing them in the first bin that has enough 
    remaining room. This means that occasionally there will be a remaining value that could not be packed into a 
    bin even though it may have worked if substituted for another bins value. Overall this logic works pretty well
    and leaves few to no remainders but this can be dependent on how large the majority of provided values are.
    The more values provided that are close to the size of the bin will mean there are more values that will not
    be able to be packed into the bins. This problem could potentially be relieved by a brute-force approach but the best-fit
    approach seems like the best choice to satisfy the requirements of the lab.
    