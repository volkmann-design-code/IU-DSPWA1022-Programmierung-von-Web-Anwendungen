---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Sichtbarkeit <SubHeading text="protected"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Bei der Vererbung können auch geschützte (`protected`) Eigenschaften und Methoden verwendet werden
- Diese können dann von Erben einer Klasse (in Java auch von anderen Klassen im selben `package`) verwendet werden, nicht aber von externen Nutzern

</div>
<div class="col-span-6">

````md magic-move
```java
public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void display() {
        System.out.println("I am an animal named " + name);
    }
}
```

```java
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void introduce() {
        display();
    }
}

void main() {
    Dog myDog = new Dog("Buddy");
    myDog.introduce();
}
```

```java
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void introduce() {
        display();
    }
}

void main() {
    Dog myDog = new Dog("Buddy");
    myDog.introduce();

    // 🚫 ERROR
    final String n = myDog.name;
}
```
````

</div>
</div>

<PageNumber/>
