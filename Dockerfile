FROM tomcat:7-jre8 
MAINTAINER gabrielhps <gabriel.hpsilva@gmail.com>

ADD target/kubernetes-demo.war /usr/local/tomcat/webapps/kubernetes-demo.war

EXPOSE 8080

