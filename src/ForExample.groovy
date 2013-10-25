
/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 10/24/13
 * Time: 10:41 AM
 */

def list = []

10.times { i ->
  list << i
}

//list.each { println "Each: ${it}" }

for( it in list ) { println "For: ${it}" }