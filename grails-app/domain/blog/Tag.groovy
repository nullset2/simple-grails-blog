package blog

class Tag {

    String name
    Date dateCreated 
    Date lastUpdated

    static constraints = {
        name maxSize: 30, blank: false
    }
}
