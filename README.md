# Kreditsystem-Backend

## Getting started

### Installing Tomcat (for local testing and so on)

* [Installing Apache Tomcat Server Eclipse](https://www.eclipse.org/webtools/jst/components/ws/M5/tutorials/InstallTomcat.html) 
* [Installing Apache Tomcat Server Intellij](https://vaadin.com/docs/v7/framework/installing/installing-idea.html)

### Connect to Tomcat server 
* ssh connection - ssh -i "connectAmazonE2.pem" ubuntu@ec2-18-222-19-131.us-east-2.compute.amazonaws.com
* You need a RSA key for the login, ask Magnus

* Deploying applications and manage overall manage the Tomcat server
  - ec2-18-222-19-131.us-east-2.compute.amazonaws.com:8080

### Mysql database connection
* Host - kreditsystem-database.czir2ycmcwhq.us-east-2.rds.amazonaws.com
* Port - 3306
* Database - kreditsystem
* User - kreditsystem
* Password - ask Magnus <3

## Built With

* [Tomcat](www.tomcat.apache.org) - Java EE server
* [Jersey](https://jersey.github.io) - RESTful API for Java
* [JQuery](https://jquery.com) - Communicate with REST API

## License

This project is licensed under the blabla License - see the [LICENSE.MD](LICENSE.md) file for details

