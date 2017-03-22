FROM tomcat:7-jre8
MAINTAINER gabrielhps <gabriel.hpsilva@gmail.com>

RUN rm -rf /usr/local/tomcat/webapps/*

ADD target/kubernetes-demo.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
