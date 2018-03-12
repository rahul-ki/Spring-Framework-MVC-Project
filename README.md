# Spring-Framework-MVC-Project

Spring-Intellij was my first "big" project on Spring MVC. I built it after learning Spring MVC, maven, JPA etc. in about a week, whilst being in Year 1 of my university, at a time when I was working on 5 different computer projects.

The main idea of the project is that I have a hello controller that prints "HI" when the URL has "/hello" at the end (SO: localhost:8080/hello - or whichever port you are working on). 
(Just to play around a bit more, I customized SpringBoot by deploying this in PORT: 1234)

You can also add in many topics by extending the URL to "/topics". 
If you use a plugin like POSTMAN, then hit the GET OPTION to see all topics already defined.
POST option to add topics and PUT option to update stuff!
Everything is in JSON structure by default.

Each topic is associated by its id, and has two other attributes -> name and description
Each topic has several courses, each course is associated by the course id, and has attributes like name etc.

For each URL Extension, I have a package that has 3 files - the class, its Service class and its Controller class
(eg: Topic, TopicService, TopicController)
Since, I use JPA and APACHE-DERBY Dependency, I can simply extend from CRUD-REPOSITORY to do CRUD operations and I added two custom operations of my own as well!




