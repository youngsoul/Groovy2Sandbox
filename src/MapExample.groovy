
/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 10/25/13
 * Time: 10:40 AM
 */

Map personMap = [name: 'bob', age: 30, employed: true, salary: 50000.01 ]

def expectedKeyOrder = ['age','employed','name','salary']

assert expectedKeyOrder == personMap.sort()*.key

// notice the 'as' operator to dynamically create a Comparator instance
assert expectedKeyOrder == personMap.sort({k1,k2 -> k1 <=> k2} as Comparator)*.key

// use the sort method that takes a closure of elements
assert expectedKeyOrder == personMap.sort { e1,e2 -> e1.key <=> e2.key}*.key