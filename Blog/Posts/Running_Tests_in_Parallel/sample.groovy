$ gradle clean test
...
BUILD SUCCESSFUL

Total time: 1 mins 33.942 secs

$ gradle clean test -PmaxParallelForks=10
...
BUILD SUCCESSFUL

Total time: 36.68 secs

$ gradle clean test -PmaxParallelForks=4 -PforkEvery=25
...
BUILD SUCCESSFUL

Total time: 56.066 secs
