---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Primitive Datentypen <SubHeading text="String"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Häufig müssen Zeichenketten (`String`) verarbeitet werden, daher verhalten sich Objekte der Klasse [`java.lang.String`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/lang/String.html) quasi wie _primitive Datentypen_
- Sie können mit _doppelten_ Anführungsstrichen als _Literale_ erzeugt werden, es ist keine Nutzung von `new` notwendig (wie bei Instanzen anderer Klassen), aber möglich
- Da sie Objekte sind, haben sie auch Methoden, über die wir mit Strings interargieren können

</div>
<div class="col-span-6">

````md magic-move
```java
String jane = "Jane";

char data[] = {'J', 'a', 'n', 'e'};
String alsoJane = new String(data);

jane.length(); // 4
jane.toUpperCase(); // JANE

jane == alsoJane; 🚫
jane.equals(alsoJane); ✅
```
````

</div>
</div>

<PageNumber/>
