# webclient-microservice-server - PART 3
> Day 3 - Spring Boot - Web Client Micro Service (main view for user) - PART 3

### Description
These project is the front view of the application. From which we can access data of accounts-microservice-server.


### Release Steps

* Setup Discovery Server - https://github.com/rutvikrpatel/discovery-microservice-server
* Register Service of Data Provider Accounts Server - https://github.com/rutvikrpatel/accounts-microservice-server
* Register Service of Accounts Web View- https://github.com/rutvikrpatel/webclient-microservice-server


## Screenshot
#### 1. Home Page View - http://localhost:8080/
![](webclient-microservice-server-master3.1.JPG)

#### 2.Account List View - http://localhost:8080/accountList
![](webclient-microservice-server-master3.2.JPG)

#### 3.Account View - http://localhost:8080/accountDetails?number=3
![](webclient-microservice-server-master3.3.JPG)


## To Create JAR

```sh
mvn clean package
```


## To Run JAR

```sh
java -jar target/com.rutvikpatel.ms.webclient-microservice-server-0.0.1-SNAPSHOT.jar
```


## Meta

Rutvik Patel - rrpatel003@gmail.com

Distributed under the GPL V3.0 license. See ``LICENSE`` for more information.
