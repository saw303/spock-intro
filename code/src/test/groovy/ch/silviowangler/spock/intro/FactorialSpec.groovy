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
    void "Die Fakultät von #number ist #result"()
    {
        expect: 'Die Fakultät wird korrekt berechntet'
        Factorial.of(number) == result

        where: 'Datentabelle'
        number || result
        0L     || 1L
        1L     || 1L
        2L     || 2L
        3L     || 6L
    }
    // end::contains[]
}
