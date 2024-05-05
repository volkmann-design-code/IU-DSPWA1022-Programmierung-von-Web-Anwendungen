---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Generics <SubHeading text="Übersicht"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Neben sehr konkreten Klassen wie `Car` oder `Person` gibt es häufig auch allgemeingültige Klassen/Interfaces, die eher eine Funktionalität oder eine Struktur beschreiben
- Beispiele hierfür sind [`List<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html), [`Map<K,V>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Map.html) oder [`Set<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Set.html)
- Sie besitzen **Typparameter** und können so Objekte unterschiedlicher Klassen aufnehmen, z.B. Liste von Autos (`List<Car>`) oder eine Zuordnung von IBANs zu Kontoständen (`Map<String, Float>`)

</div>
<div class="col-span-6">

````md magic-move
```java
void main() {
    final Map<String, Float> accounts = new HashMap();
    accounts.put("DE02120300000000202051", 100f);
    accounts.put("DE02500105170137075030", 123.45f);

    // 🚫 ERROR: The key must be a String!
    accounts.put(42, 123.45f);
}
```
````

</div>
</div>

<PageNumber/>
