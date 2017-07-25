# Simple Grails Blog

Very simple blog, developed as a sample exercise. Grails/scaffolding, GSP, GORM and filtering are all applied.
A test suite is included to validate the sanity of the code

## Requisites

* JDK 1.8 or later.
* Grails 3.2.x (grails wrapper included)
* Gradle 3.5.x (gradle wrapper included)
* Postgres 1.9 database server with a `blog-development` database available on development and `blog` for production (see `application.yml` for details and be wary not to reveal your prod credentials on a public repo)

I recommend using [jabba](https://github.com/shyiko/jabba) to install JDKs and [sdkman](http://sdkman.io/) to install grails and gradle.

## Getting started

* `git clone` this repository
* `cd` into repo
* do `./gradlew` to fetch dependencies
* do `grails run-app` or `grails package` to get a tasty little war to deploy onto your application server
* hit `http://localhost:8080` on development or your prod server
* all resources may be also fetched as json or xml, for example: `curl http://localhost:8080/post.json`
* do `grails test-app` to run the test suite

## Documentation

* `root` route is redirected directly to post index
* Post has many Tags (Join Table `Post_Tags`)
* Tags are fixed (see `bootstrap.groovy` to customize the list)

E-R Diagram:
![](http://i.imgur.com/biDhC65.png)

## What to expect

If running correctly, you should see an application like this:

![](http://i.imgur.com/5z3F1Jh.png)

## TODO

* Ajax post deletion from index view
* Add attachments
* Add comments
* Add editor credentials and a user model with role
* Add a way to add and police user privileges by role so only admins can edit the Tags
* Make editor HTML5-rich
* Lots more unit tests (only domains are tested now)
* Integration tests

@nullset2 (2017)