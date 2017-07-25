package blog

class BootStrap {

    def init = { servletContext ->
        ["Projects","TV","Games","Movies","Internet","Tech","Programming","Music","Random"].each {
        	def tag = new Tag(name: it)
        	tag.save()
        }
    }
    def destroy = {
    }
}
