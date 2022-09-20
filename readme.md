# Kafka Tutorial

##  Intro Kafka
- Producers -> Kafka -> Consumers
- Kafka works well as a replacement for a more traditional message broker.
- [APACHE KAFKA](https://kafka.apache.org/)

## [Get started](https://kafka.apache.org/quickstart)
- Need to have java installed. [Follow tutorial](youtube.com/watch?v=ogWKP9Lm-Qo)
- Good to have intellij installed. [Follow tutorial](https://www.youtube.com/watch?v=QOcWoDEjj2w)
- Follow step 1.
    - Download
    ```
    tar -xzf kafka_2.13-3.2.1.tgz
    cd kafka_2.13-3.2.1
    ```
- Follow step 2: 
    - **Start the ZooKeeper service**
    ```
    bin/zookeeper-server-start.sh config/zookeeper.properties
    ```
    - **Start the Kafka broker service**, in a new terminal:
    ```
    bin/kafka-server-start.sh config/server.properties
    ```
    **Now kafka start running with localhost: 9092**


## Build springboot application that send messages with given topic
- Open IntelliJ IDEA -> new project -> spring initializr -> put a name (e.g., kafk-example) -> pick springboot version (add dependencies: Spring Web, Spring for Apche Kafka)

- In application properties, add
```
spring.kafka.bootstrap-servers = localhost:9092
```

- Run the KafkaExampleApplication, the program should run sucessfully

- **Config Topic** Create class: KafkaTopicConfig, this class should responsible for creating topics
- **Config Producer** Create class: KafkaProducerConfig

- Follow step 5 to read event. In the terminal, then message will shows up
```
bin/kafka-console-consumer.sh --topic suereeycode --from-beginning --bootstrap-server localhost:9092
```

- Create class KafkaConsumerConfig

- Create class KafkaListeners

- Build a restful api allows us to publish message in queue
    - create a messageContrller class
    - create a messageRequest as Record class

Lei followed tutorial on youtube: https://www.youtube.com/watch?v=SqVfCyfCJqw&t=3s
