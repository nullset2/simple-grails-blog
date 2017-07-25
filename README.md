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
* do `grails test-app` to run the test suite

## Documentation

* `root` route is redirected directly to post index
* Post has many Tags (Join Table `Post_Tags`)
* Tags are fixed (see `bootstrap.groovy` to customize the list)

* E-R Diagram: 
* Postman Collection: 

@nullset2 (2017)