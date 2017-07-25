package blog

class BootStrap {

    def init = { servletContext ->
        ["Projects","TV","Games","Movies","Internet","Tech","Programming","Music","Random"].each {
        	new Tag(name: it).save()
        }
    }
    def destroy = {
    }
}
