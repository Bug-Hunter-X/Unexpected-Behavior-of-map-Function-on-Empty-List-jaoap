# Kotlin map() Function on Empty List

This repository demonstrates an unexpected behavior of Kotlin's `map()` function when applied to an empty list. The function doesn't throw an exception or produce any error, but simply returns an empty list. This might be counter-intuitive for some programmers and can lead to silent failures in applications. 

The example code showcases how `map()` behaves with a non-empty list and then with an empty list.  The solution file provides alternative approaches to handle potential null or empty scenarios.