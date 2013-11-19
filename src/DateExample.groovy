
/**
 * Created by IntelliJ IDEA.
 * User: youngsoul
 * Date: 11/19/13
 * Time: 1:08 PM
 */


// create a date object from a date
Date birthdate = new Date().parse("yyyy/MM/dd", "1964/04/28")

assert "Tue Apr 28 00:00:00 CDT 1964" == birthdate.toString()

println birthdate

assert 1964 == birthdate[Calendar.YEAR]
assert (4-1) == birthdate[Calendar.MONTH]  // actual month is always one less than actual date month
assert 28 == birthdate[Calendar.DATE]

// how old am i?
Date now = new Date()

def ageInDays = now - birthdate
def ageInYears = Math.floor( (now-birthdate)/365 )

println "ageInDays: $ageInDays   ageInYears: $ageInYears"
assert ageInYears == 49.0

Date dateOfExam = new Date().parse("yyyy/MM/dd", "2013/10/05")
def daysSinceExam = now - dateOfExam

if( daysSinceExam > 30 ) {
  println "It has been 30 days or more since the last exam"
}

