---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="String Templates"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-5">

- [String Templates](https://docs.oracle.com/en/java/javase/22/language/string-templates.html#GUID-CAEF15BD-C3D1-43D4-B38F-1615B0B1699D) befinden sich offiziell noch in Preview
- Moderne und einfachere Form, Strings zusammenzusetzen
- Explizite Angabe von Strings mit einer (`STR."..."`) oder mehreren (`STR."""..."""`) Zeilen
- Ähnliche Konstrukture sind schon länger bekannt in anderen Sprachen (z.B. JavaScript/TypeScript mittels ``)

</div>
<div class="col-span-7">

````md magic-move
```java
String user = "Duke";
char option = 'b';
String choice  = user + " has chosen option " + option;

// "Duke has chosen option b"
System.out.println(choice);
```

```java
String user = "Duke";
char option = 'b';
String choice  = STR."\{user} has chosen option \{option}";

// "Duke has chosen option b"
System.out.println(choice);
```

```java
String user = "Duke";
char option = 'b';
String choice  = STR."\{user} has chosen option \{option}";

// "Duke has chosen option b"
System.out.println(choice);

String time = STR."Today is \{java.time.LocalDate.now()}";

// Today is 2024-05-06
System.out.println(time);
```

```java
String user = "Duke";
char option = 'b';
String choice  = STR."\{user} has chosen option \{option}";

// "Duke has chosen option b"
System.out.println(choice);

String time = STR."Today is \{java.time.LocalDate.now()}";

// Today is 2024-05-06
System.out.println(time);

String title = "My Web Page";
String text = "Hello, world";
String webpage = STR."""
    <html>
      <head>
        <title>\{title}</title>
      </head>
      <body>
        <p>\{text}</p>
      </body>
    </html>
    """;
```
````

</div>
</div>

<PageNumber/>
