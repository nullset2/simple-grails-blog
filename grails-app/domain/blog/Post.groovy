package blog

class Post {

	String title
	String content
	Date dateCreated
	Date lastUpdated

	static mapping = {
		content type: "text"
	}

	static hasMany = [tags: Tag]

    static constraints = {
    	title maxSize: 255, blank: false
    	content blank: false
    }
}
