package blog

class Post {

	String title
	String content
	Date dateCreated
	Date lastUpdated

	static hasMany = [tags: Tag]

	static mapping = {
		content type: "text"
	}

    static constraints = {
    	title maxSize: 255, blank: false
    	content blank: false
    }
}
