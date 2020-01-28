# kafka-consumer
Kafka Consumer

zookeeper-server-start.bat H:\kafka2.12\config\zookeeper.properties

kafka-server-start.bat H:\kafka2.12\config\server.properties

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic code_test --from-beginning

Need to add Kafka/bin/windows to environment variable in case of windows OS
