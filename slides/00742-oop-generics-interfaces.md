---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Generics <SubHeading text="Interfaces und Implementierungen"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Generische Konstrukte in Java, wie etwa [`List<E>`](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/List.html), sind häufig _Interfaces_
- Es gibt also verschiedene Implementierungsmöglichkeiten (_Klassen_), um die Erfordernisse des _Interfaces_ zu bedienen
- Je nach Anwendungsfall kann dann die sinnvollste konkrete Klasse verwendet werden (z.B. [ArrayList](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/ArrayList.html) oder [LinkedList](https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/LinkedList.html))

</div>
<div class="col-span-6">

````md magic-move
```java
void main() {
    final List<String> ibans = new ArrayList<String>();
    ibans.add("DE02120300000000202051");
    ibans.add("DE02500105170137075030");

    final List<Integer> pin = new LinkedList<int>();
    pin.offer(1); // offer() fügt am Ende ein
    pin.offer(2);
    pin.offer(3);
    pin.offer(4);

    // `contains()` ist im `List` Interface definiert
    final boolean hasMyIban = ibans.contains("DE...");
    final boolean pinHasOne = pin.contains(1); ✅
    final boolean pinHasFive = pin.contains(5); 🚫
}
```
````

</div>
</div>

<PageNumber/>
