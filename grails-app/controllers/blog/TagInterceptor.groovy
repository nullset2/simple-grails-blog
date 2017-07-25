package blog


class TagInterceptor {

    boolean before() { true }

    boolean after() { //demonstrating how to use filters/interceptors
    				  //whenever anyone tries to access any actions on the tag controller they will get redirected
    				  //I know we could just remove the route mappings and the scaffolds, but this is only for
    				  //demo purposes
    				  flash.message = "Tags are fixed and non user-editable."
    				  redirect(controller: "post", action: "index") }

    void afterView() {
        // no-op
    }
}
