---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Objekterzeugung <SubHeading text="Factory"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Ein gängiges Muster für die Erstellung neuer Objekte ist die **Factory**
- Eine Factory hält statische Methoden bereit, um Objekte ohne direkte Nutzung von `new()` zu erzeugen
- Die Factory kann beispielsweise sinnvolle Standard-Werte für die Konstruktor-Parameter einsetzen (etwa aus Umgebungsvariablen)
- Beispiel: [`Calendar.getInstance()`](<https://docs.oracle.com/en/java/javase/22/docs/api/java.base/java/util/Calendar.html#getInstance()>)

</div>
<div class="col-span-6">

````md magic-move
```java
void main() {
    Calendar rightNow = Calendar.getInstance();
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat fmt = new SimpleDateFormat(pattern);

    // 2024-05-06
    sdf.format(cal.getTime());
}

```
````

</div>
</div>

<PageNumber/>
