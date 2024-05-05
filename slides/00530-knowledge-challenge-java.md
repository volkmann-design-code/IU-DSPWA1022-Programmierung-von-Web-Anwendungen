---
layout: default
---

<ChallengeHeader index="9"/>

````md magic-move {at:2}
```java
public class DemoApp {

    public static void main(String[] args) {
        final String message = getMessage();
        System.out.println(message);
    }

    private static String getMessage() {
        return "Hello, World";
    }
}
```

```java
@SpringBootApplication
public class DemoApp {

    public static void main(String[] args) {
        SpringApplication.run(DemoApp.class, args);
    }
}
```
````

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-java text-6xl"/>
    <a href="https://www.java.com/" target="_blank">
      Java
    </a>
  </div>
  <div class="flex flex-col items-center gap-2 duration-500" v-click="3">
    <div class="i-devicon-spring text-6xl"/>
    <a href="https://spring.io/projects/spring-boot" target="_blank">
      Spring Boot
    </a>
  </div>
</div>

<PageNumber/>

<!--
- Spring als Haupt-Framework für die serverseitige Entwicklung in diesem Kurs
-->
