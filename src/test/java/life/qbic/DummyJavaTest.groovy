package life.qbic.utils

import spock.lang.Specification

class DummyJavaTest extends Specification {

    def "Parsing a String prints success"() {
        given:
        String dummyString = "Test"
        when:
        def testResult = DummyJava(dummyString)
        then:
        assert testResult instanceof String
    }

    def "Parsing anything except a String throws exception"() {
        given:
        int dummyInteger = 4
        when:
        def testResult = DummyJava(dummyInteger)
        then:
        thrown(IllegalArgumentException)
    }
}

