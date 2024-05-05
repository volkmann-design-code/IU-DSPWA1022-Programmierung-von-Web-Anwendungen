---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Java Neuerungen <SubHeading text="switch"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-5">

- Das klassische `switch`-_Statement_ wird seit [Java 12](https://docs.oracle.com/en/java/javase/22/language/java-language-changes.html#JSLAN-GUID-B01F389D-5DFE-4A3F-818E-99478DC642CE) erweitert um eine `switch`-_Expression_
- Vorteile: Keine `break`-Statements / kein _Fallthrough_

</div>
<div class="col-span-7">

````md magic-move
```java
public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY; }

void printNumOfLettersInDay(Day day) {
    var numLetters = 0;
    switch (day) {
        case MONDAY:
        case FRIDAY:
        case SUNDAY:
            numLetters = 6;
            break;
        case TUESDAY:
            numLetters = 7;
            break;
        case THURSDAY:
        case SATURDAY:
            numLetters = 8;
            break;
        case WEDNESDAY:
            numLetters = 9;
            break;
        default: throw new IllegalStateException("...");
    }
    System.out.println(numLetters);
}

```

```java
public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY; }

void printNumOfLettersInDay(Day day) {
    System.out.println(
        switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
            default -> throw new IllegalStateException("...");
        }
    );
}

```

```java
public enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY; }

int getNumberOfLetters(Day day) {
    return switch (day) {
        case MONDAY, FRIDAY, SUNDAY -> 6;
        case TUESDAY                -> 7;
        case THURSDAY, SATURDAY     -> 8;
        case WEDNESDAY              -> 9;
        default -> throw new IllegalStateException("...");
    };
}

void main() {
    var letterCount = getNumberOfLetters(Day.MONDAY);
    System.out.ptintln(letterCount); // 6
}

```
````

</div>
</div>

<!--
<PageNumber/>
-->
