# dubbo-demo

## How to build this project

### Step1, clone project
```
git clone https://github.com/bq-xiao/springboot-dubbo-demo
```

### Step2, install dubbo-spring-boot-api
```
cd springboot-dubbo-demo/dubbo-spring-boot-api
mvn install
```

### Step3, run dubbo-spring-boot-provider
```
cd springboot-dubbo-demo/dubbo-spring-boot-provider
mvn package
java -jar target/dubbo-spring-boot-provider-0.0.1-SNAPSHOT.jar
```

### Step4, run dubbo-spring-boot-consumer
```
cd springboot-dubbo-demo/dubbo-spring-boot-consumer
mvn package
java -jar target/dubbo-spring-boot-consumer-0.0.1-SNAPSHOT.jar
```

### Testing

#### use browser
http://localhost:9080/swagger-ui.html

#### use command line
```
curl -X GET "http://localhost:9080/sample/hello/aaa" -H "accept: */*"
```

