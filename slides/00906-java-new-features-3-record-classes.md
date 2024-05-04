---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="Record Classes"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-5">

- Die klassiche Klassen-Deklaration bring tsehr viel _Boilerplate_-Code mit sich (Konstruktor, Getter, Setter)
- Seit [Java 14 gibt es _Record Classes_](https://docs.oracle.com/en/java/javase/15/language/records.html#GUID-6699E26F-4A9B-4393-A08B-1E47D4B2D263), mit denen simple Strukturen zum "Datentransport" abgebildet werden können
- Zusätzliche Methoden, Validierung von Konstruktur-Parametern ist möglich

</div>
<div class="col-span-7">

````md magic-move
```java
// Vor Java 14
public final class Rectangle {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double length() { return this.length; }
    double width()  { return this.width; }

    // Implementation of general Object functions
    public boolean equals...
    public int hashCode...
    public String toString...
}

```

```java
// Seit Java 14
record Rectangle(double length, double width) { }

```

```java
// Seit Java 14
record Rectangle(double length, double width) { }

void main() {
    var rect = new Rectangle(3, 4);
}

```

```java
// Seit Java 14
record Rectangle(double length, double width) {
    public Rectangle {
        if (length <= 0 || width <= 0) {
            throw new java.lang.IllegalArgumentException(
                "Invalid dimensions"
            );
        }
    }
}

void main() {
    var rect = new Rectangle(0, 4);
    // 🚫 ERROR
}

```

```java
// Seit Java 14
record Rectangle(double length, double width) {
    public Rectangle {
        if (length <= 0 || width <= 0) {
            throw new java.lang.IllegalArgumentException(
                "Invalid dimensions"
            );
        }
    }

    public double area() {
        return length * width;
    }
}

void main() {
    var rect = new Rectangle(3, 4);
    System.out.println(rect.area()); // 12
}

```
````

</div>
</div>

<PageNumber/>
