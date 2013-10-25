
/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 10/24/13
 * Time: 9:40 AM
 */

def list1 = []

List list2 = []

List<String> list3 = []

List<String> list4 = new ArrayList<String>()

// setup list1

list1 << "String1"
list1 << "String2"
list1 << 1234L

println "\ndef list1 = []"
list1.each { println it.class }
list1.each { println it }

list2 << "String1"
list2 << "String2"
list2 << 1234L

println "\nList list2 = []"
list2.each { println it.class }
list2.each { println it }

list3 << "String1"
list3 << "String2"
list3 << 1234L

println "\nList<String> list3 = []"
list3.each { println it.class }
list3.each { println it }

list4 << "String1"
list4 << "String2"
list4 << 1234L

println "\nList<String> list4 = new ArrayList<String>()"
list4.each { println it.class }
list4.each { println it }