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
    void "Die Fakultät von #number ist #expResult"()
    {
        when: 'eine Fakultät berechnet wird'
        long result = Factorial.of(number)
        then: 'entspricht das Resultat der Erwartung'
        result == expResult
        where: 'data map'
        number || expResult
        0L     || 1L
        1L     || 1L
        2L     || 2L
        3L     || 6L
    }
    // end::contains[]
}
