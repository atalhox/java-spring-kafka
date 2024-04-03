# Java Spring Kafka

This project exists because there is a need for integrating distributed systems with real-time data processing capabilities. 

Thinking about solving this problem, the project was born with the objective of understanding how to build a robust solution for real-time data streaming and processing for the data consistency and real-time analysis problems to be resolved in an optimized way. 

This project was developed using Java with Spring Boot and Apache Kafka.

## Objectives

The problem of data inconsistency and delayed processing in distributed systems appeared when users felt the need to perform real-time data analysis and did not find a simple way to do it. 

To meet the functionality of real-time data streaming and processing, the application was developed to optimize this process.

## Project Requirements

- [ ] Real-time data streaming;
- [ ] Data processing and analysis;
- [ ] Scalability and fault tolerance.

## Getting Started

Make sure to set up your environment with Java, Spring Boot, and Apache Kafka. **It is recommended** to use the versions listed in the compatibility matrix.

## Compatibility Matrix

| Tool           | Supported Version |
|----------------|:-----------------:|
| Java           |         11.0      |
| Spring Boot    |        2.5.0      |
| Apache Kafka   |        2.8.0      |
| Docker         |       26.0.0      |
| Docker-compose |       2.23.3      |


## Configuration

Add kafka as an available host in /etc/hosts: 

```shell
127.0.0.1   kafka
``` 

### Apache Kafka

To run Apache Kafka, use the docker-compose to create its containers: 

```shell
$ docker-compose up
```

## Application usage

To run the application, execute the command below in a terminal:

```shell
$ ./mvnw spring-boot:run 
```

## Making a request

Send this request as curl: 

```shell
    curl --location 'http://kafka:8080/kafka/my-topic' \
    --header 'Content-Type: application/json' \
    --data '{
        "message": "Apache Kafka is awesome"
    }'
```

Considering: 
- my-topic: as the Producer/Consumer Kafka listening topic
- message: the message to be sent

## Check the result

You can check the sent messages running this:

```shell
docker exec <your-container-name> /bin/kafka-console-consumer --bootstrap-server kafka:9092 --topic my-topic --from-beginning
```

## How to Contribute
Please refer to the contribution guidelines for detailed instructions on sending pull requests.

## Versioning
This project follows SemVer for version control.

## Author
Luis Felipe Brum is the author of this project. He is a Backend developer with experience in information security and integration architecture.

<img src="https://avatars.githubusercontent.com/u/53919226"  width="40"> <img src="https://cdn-icons-png.flaticon.com/512/174/174857.png"  width="40"> <img src="https://cdn-icons-png.flaticon.com/512/2111/2111463.png"  width="40"> <img src="https://i.pinimg.com/originals/22/0a/62/220a624ba2fa59ddda4db763f474f50f.jpg"  width="40"> <img src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/twitter.svg" width="40">

## Colaborate

| Colaborator      | Github    |
|------------------|:---------:|
| Luis Felipe Brum | atalhox   |

