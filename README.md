# zipkindemo
Demo of Zipkin with Spring Boot

This Demo consists of two applications:

1. ```zipkindemoapp```, which is a simple Spring Boot App with a Rest endpoint at /demo that returns "hello". Zipkin and Sleuth dependencies are included to trace the requests.
 
2. ```zipkinserver```, which collects the traces from ```zipkindemoapp``` and displays them in the Zipkin UI
 
 
```Apache Kafka``` is used as the transport to send the traces from ```zipkindemoapp```to ```zipkinserver```

The ```docker-compose.yml``` file contains the two applications, Kafka and Zookeeper.

It can be run by first building the application containers with ```mvn clean install``` and then running everything with ```docker-compose up```

```$DOCKER_HOST_IP``` should be set to the ip of your docker machine if you are using Windows or Mac, or to the host ip on Linux.

```zikpkinserver``` is configured to use Cassandra (version 3) as a backend when using Docker