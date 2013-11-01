
/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 11/1/13
 * Time: 9:58 AM
 */

println "-------------------  Starting Test with List Of Integers ------------------"

def testListOfIntegers = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15]

def matchingTestValue = 1
def foundValue = null

for( testValue in testListOfIntegers ) {
  println("matchingTestValue: $matchingTestValue | testValue: $testValue")
  if( testValue == matchingTestValue ) {
    foundValue = testValue
    break
  }
}

println "foundValue: $foundValue"

println "------ find value 10 --------"
matchingTestValue = 10
foundValue = null

for( testValue in testListOfIntegers ) {
  println("matchingTestValue: $matchingTestValue | testValue: $testValue")
  if( testValue == matchingTestValue ) {
    foundValue = testValue
    break
  }
}

println "foundValue: $foundValue"

println "-------------------  Using Find in List ------------------"
println "------ find value 8 --------"
matchingTestValue = 8
foundValue = null

foundValue = testListOfIntegers.find {
  println ".find Value: $it"
  it == matchingTestValue
}
println "foundValue: $foundValue"

println "-------------------  Using FindAll in List ------------------"
println "------ find all values > 4 and < 9 --------"
matchingTestValue = 8
foundValue = null

foundValues = testListOfIntegers.findAll {
  println ".find Value: $it"
  it > 4 && it < 9
}
println "foundValues: $foundValues"

println "-------------------  Using FindIndexOf in List ------------------"
println "------ find index of value 7 --------"
matchingTestValue = 7
foundValue = null

def foundIndex = testListOfIntegers.findIndexOf {
  println ".find Value: $it"
  it == matchingTestValue
}
println "foundIndex: $foundIndex"
assert foundIndex == 6

println "-------------------  Using any in List ------------------"
assert testListOfIntegers.any {
  println ".any Value: $it"
  it > 10
}

println "-------------------  Using every in List ------------------"
assert testListOfIntegers.every {
  println ".every Value: $it"
  it > 0
}
