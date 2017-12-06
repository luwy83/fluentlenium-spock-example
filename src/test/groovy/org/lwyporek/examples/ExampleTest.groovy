package org.lwyporek.examples

import org.fluentlenium.adapter.spock.FluentSpecification

class ExampleTest extends FluentSpecification {

    def "Should have expected title"() {
        when:
            goTo("http://www.example.com")
        then:
            assert window().title() == "Example Domain"
    }
}
