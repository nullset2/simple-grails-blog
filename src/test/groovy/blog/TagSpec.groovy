package blog

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Tag)
class TagSpec extends Specification {
	def "Tags can be created with proper data"() {
		when:
			def tag = new Tag(name: "Testing")
        then:
        	tag.validate()
    }

    def "Tags can't be created with names over 30 characters in length"() {
        when:
            def tag = new Tag(name: "111111111111111111111111111111111111")
        then:
        	!tag.validate()
    }

    def "Tags can't be created with blank name"() {
        when:
            def tag = new Tag(name: "")
        then:
        	!tag.validate()
    }
}
