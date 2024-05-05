---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="switch Pattern Matching"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-5">

- Seit Java 21 gibt es [_Pattern Matching_ in `switch` Statements/Expressions](https://docs.oracle.com/en/java/javase/21/language/pattern-matching-switch-expressions-and-statements.html#GUID-E69EEA63-E204-41B4-AA7F-D58B26A3B232)
- Hiermit können beispielsweise `instanceof`-Prüfungen werden
- Mit `when` können zusätzliche Bedingungen geprüft werden

</div>
<div class="col-span-7">

````md magic-move
```java
interface Shape { }
record Rectangle(double length, double width) implements Shape { }
record Circle(double radius) implements Shape { }

class App {
    public static double getPerimeter(Shape s) {
        if (s instanceof Rectangle r) {
            return 2 * r.length() + 2 * r.width();
        } else if (s instanceof Circle c) {
            return 2 * c.radius() * Math.PI;
        } else {
            throw new IllegalArgumentException("...");
        }
    }
}
```

```java
interface Shape { }
record Rectangle(double length, double width) implements Shape { }
record Circle(double radius) implements Shape { }

class App {
    public static double getPerimeter(Shape s)
        throws IllegalArgumentException {
        return switch (s) {
            case Rectangle r -> 2 * r.length() + 2 * r.width();
            case Circle c    -> 2 * c.radius() * Math.PI;
            default -> throw new IllegalArgumentException("...");
        };
    }
}
```

```java
interface Shape { }
record Rectangle(double length, double width) implements Shape { }
record Circle(double radius) implements Shape { }

class App {
    public static double getPerimeter(Shape s)
        throws IllegalArgumentException {
        return switch (s) {
            case Rectangle r -> 2 * r.length() + 2 * r.width();
            case Circle c    -> 2 * c.radius() * Math.PI;
            default -> throw new IllegalArgumentException("...");
        };
    }

    public static boolean isShort(Object obj) {
        switch (obj) {
            case String s when s.length() == 1 -> true;
            case String s                      -> false;
            default ->  throw new IllegalArgumentException("...");
        }
    }
}
```
````

</div>
</div>

<PageNumber/>
