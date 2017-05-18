package ch.silviowangler.spock.intro

import spock.lang.Specification

class SimpleSpockWithoutCommentsSpec extends Specification {

    void "Eine Liste ist initial leer"() {
        expect:
        new ArrayList<>().isEmpty() == true
    }
}
