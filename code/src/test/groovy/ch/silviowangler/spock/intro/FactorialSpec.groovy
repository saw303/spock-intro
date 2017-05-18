package ch.silviowangler.spock.intro

import ch.silviowangler.spock.math.Factorial
import spock.lang.Specification
import spock.lang.Unroll

/**
 * @author Silvio Wangler
 */
class FactorialSpec extends Specification {

    // tag::contains[]
    @Unroll
    void "Die Fakultät von #startNumber ist #expectedResult"()
    {
        when: 'eine Fakultät berechnet wird'
        long result = new Factorial().calc(startNumber)
        then: 'entspricht das Resultat der Erwartung'
        result == expectedResult
        where:
        startNumber || expectedResult
        0L          || 1L
        1L          || 1L
        2L          || 2L
        3L          || 6L
    }
    // end::contains[]
}
