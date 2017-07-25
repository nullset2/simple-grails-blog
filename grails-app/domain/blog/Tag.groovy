package blog

class Tag {

    String name
    Date dateCreated 
    Date lastUpdated

    static belongsTo = Post
    static hasMany = [posts: Post]

    static constraints = {
        name maxSize: 30, blank: false, unique: true
    }
}
