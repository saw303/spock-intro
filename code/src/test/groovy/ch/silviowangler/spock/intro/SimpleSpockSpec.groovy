package ch.silviowangler.spock.intro

import spock.lang.Specification

/**
 * @author Silvio Wangler
 */
class SimpleSpockSpec extends Specification {

    // tag::contains[]
    void "A list is initially empty"() {
        expect:
        new ArrayList<>().isEmpty() == true
    }
    // end::contains[]
}
