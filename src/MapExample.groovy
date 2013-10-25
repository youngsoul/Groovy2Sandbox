/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 10/25/13
 * Time: 10:40 AM
 */

/*

Sorting maps is as easy as sorting lists.

Map has 3 sort methods:

sort() <- no params and performs a natural sort of the keys and returns a new map

sort(Comparator) <- uses the comparator implementation to sort the keys

sort(Closure) <- passes elements (key,value) into the closure for sorting.

Below is an example of those calls.  Notice the one with Comparator since it is using the 'as' operator to dynamically create an instance of the Comparator interface from the closure.  It does not get any groovier than that to get an implementation of an interface.

Also notice in the sort that uses a closure there are no parens for the function call because if a Closure is the last (or only in this case ) parameter to a function the function parens can be dropped.

<=> is the Spaceship operator
Spaceship <=> Useful in comparisons, returns -1 if left is smaller 0 if == to right or 1 if greater than the right

*. is the Spread operator
Used to invoke an action on all items of an aggregate object


*/


Map personMap = [name: 'bob', age: 30, employed: true, salary: 50000.01 ]

def expectedKeyOrder = ['age','employed','name','salary']

assert expectedKeyOrder == personMap.sort()*.key

// notice the 'as' operator to dynamically create a Comparator instance
assert expectedKeyOrder == personMap.sort({k1,k2 -> k1 <=> k2} as Comparator)*.key

// use the sort method that takes a closure of elements
assert expectedKeyOrder == personMap.sort { e1,e2 -> e1.key <=> e2.key}*.key
