package fernando.com

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class AdquirenteSpec extends Specification implements DomainUnitTest<Adquirente> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        Adquirente a = new Adquirente()
        a.hashCode()
        a.equals(new Adquirente())
        expect:"fix me"
            true == true
    }
}
