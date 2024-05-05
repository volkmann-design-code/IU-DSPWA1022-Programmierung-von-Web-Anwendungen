---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="Unbenannte Variablen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-5">

- [Seit Java 22](https://docs.oracle.com/en/java/javase/22/language/unnamed-variables-and-patterns.html#GUID-D54E1CF1-BDFD-4B57-8A6E-5B4C87F4D58A) können ungenutze Variablen mit einem `_` ersetzt werden
- Vermeidung von "Ungenutzte Variable"-Warnungen

</div>
<div class="col-span-7">

````md magic-move
```java
int[] orderIDs = {34, 45, 23, 27, 15};
int total = 0;
for (int id : orderIDs) {
    total++;
}
System.out.println("Total: " + total);
```

```java
int[] orderIDs = {34, 45, 23, 27, 15};
int total = 0;
for (int _ : orderIDs) {
    total++;
}
System.out.println("Total: " + total);
```
````

</div>
</div>

<PageNumber/>
