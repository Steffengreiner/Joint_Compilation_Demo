package life.qbic.utils

import spock.lang.Specification

class DummyGroovyTest extends Specification {

    def "Parsing a String prints success"() {
        given:
        String dummyString = "Test"
        when:
        def testResult = DummyGroovy(dummyString)
        then:
        assert experiment instanceof String
    }

    def "Parsing anything except a String throws exception"() {
        given:
        int dummyInteger = 4
        when:
        def testResult = DummyGroovy(dummyInteger)
        then:
        thrown(IllegalArgumentException)
    }
}

