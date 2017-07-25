package blog

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Post)
class PostSpec extends Specification {

	def "Posts can be created with proper data"() {
		when:
			def post = new Post(title: "Nice post!", content: "This is a well structured post! This will totally save.")
        then:
        	post.validate()
    }

    def "Posts can't be created with titles over 255 characters in length"() {
        when:
            def post = new Post(title: "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111",
            		 			content: "This shouldn't save!")
        then:
        	post.validate() == false
    }

    def "Posts can't be created with blank title"() {
        when:
            def post = new Post(title: "", content: "this is a post without title! this shouldn't save!")
        then:
        	post.validate() == false
    }
}
