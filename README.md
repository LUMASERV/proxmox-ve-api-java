# proxmox-ve-api-java
A Java Client for the ProxMox VE API

## Maven
```xml

```

## Usage
```java
ProxMoxVEClient client = new ProxMoxVEClient("example.com", "root", "changeme");
client.getNodes().forEach(node -> System.out.println(node.getName()));
```