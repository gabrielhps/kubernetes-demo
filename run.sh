#!/bin/bash

eval $(minikube docker-env)

mvn clean install
docker build -t kubernetes-demo:v1 .
kubectl apply -f k8s/
