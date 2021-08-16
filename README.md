# proxmox-ve-api-java
A Java Client for the ProxMox VE API

## Maven
```xml
<repository>
    <id>lumaserv</id>
    <url>https://maven.lumaserv.cloud</url>
</repository>
```
```xml
<dependency>
    <groupId>com.lumaserv</groupId>
    <artifactId>proxmox-ve-api</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>
```

## Usage
```java
ProxMoxVEClient client = new ProxMoxVEClient("example.com", "root", "changeme");
client.getNodes().forEach(node -> System.out.println(node.getName()));
```