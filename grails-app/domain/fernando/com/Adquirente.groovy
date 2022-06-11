package fernando.com

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Adquirente {

    Long id
    String name
    Date dateExit

    static constraints = {
    }

    boolean equals(Object o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Adquirente that = (Adquirente) o

        if (dateExit != that.dateExit) return false
        if (id != that.id) return false

        return true
    }

    int hashCode() {
        Integer result // => not working
        //Integer result = null // => working
        result = (id != null ? id.hashCode() : 0)
        result = 31 * result + (dateExit != null ? dateExit.hashCode() : 0)
        return result
    }
}
