package info.startupbuilder.programmingchallenges.core

import spock.lang.Specification
import spock.lang.Unroll

class CreativeAccountingSpecs extends Specification {

    CreativeAccounting creativeAccounting

    def setup() {
        creativeAccounting = new CreativeAccounting()
    }

    @Unroll
    def "when #condition expect #expectedOutput"() {
        given:
        def solution = creativeAccounting.solution(input)

        expect:
        solution == expectedOutput

        where:
        condition | input | expectedOutput
        "even digits" | 123456 | 162534
        "odd digits" | 130 | 103
        "max value of 100,000,000" | 100_000_000 | 100_000_000
        "min value of 1" | 1 | 1

    }

}