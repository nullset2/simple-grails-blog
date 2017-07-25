package blog


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(TagInterceptor)
class TagInterceptorSpec extends Specification {

    def setup() {
    }

    def cleanup() {

    }

    void "Test tag interceptor matching"() {
        when:"A request matches the interceptor"
            withRequest(controller:"tag")

        then:"The interceptor does match"
            interceptor.doesMatch()
    }
}
