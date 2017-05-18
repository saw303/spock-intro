package ch.silviowangler.spock.intro

import spock.lang.Specification

/**
 * @author Silvio Wangler
 */
class SimpleSpockSpec extends Specification {

    // tag::contains[]
    void "Eine Liste ist initial leer"() {
        expect:
        new ArrayList<>().isEmpty() == true
    }
    // end::contains[]
}
