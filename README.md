# kubernetes-demo

This project is a simple demostration of [Kubernetes](https://kubernetes.io/) main concepts.

## Running
### Requirements
To run this project you will need:
* [Maven](https://maven.apache.org/install.html)
* [Minikube](https://kubernetes.io/docs/getting-started-guides/minikube)

### Execution
Once you have Maven and Minikube installed, clone the project and go to its directory. After that execute the following command in your terminal.
```sh
$ sh run.sh
```
The `run.sh` script will build both project and docker image then kubernetes deployment and service will be created.

### Result

To get the address where our service it's been exposed execute the following command.

```sh
$ address=$(minikube service kubernetes-demo --url)
```

#### Request Example
```sh
$ curl $address/hello/Foo
```
#### Response Example
```javascript
{"message":"Hello Foo! You're at kubernetes-demo-17156349-ngpsg"}
```
__NOTE:__ In the response example above the message show that our location is *kubernetes-demo-17156349-ngpsg*, but it will vary in your machine. Even if you execute the request more than once you'll get different locations. It happens because we have 3 replicas of our service running inside our Kubernete cluster.

To learn more about Kubernetes, please read [Kubernetes Docs](https://kubernetes.io/docs/).
