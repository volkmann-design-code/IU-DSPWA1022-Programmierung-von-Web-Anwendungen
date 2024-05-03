---
layout: default
---

<Footer
    text="🎁 Objektorientierte Programmierung"
/>

# Interfaces

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

- Interfaces werden in Anwendungen auch genutzt, damit Komponenten an gewissen "Lifecycle-Events" teilnehmen können
- Beispiele finden sich in vielen Frameworks
  - [Svelte](https://svelte.dev/docs/svelte#onmount)
  - [Angular](https://angular.io/guide/lifecycle-hooks#lifecycle-event-sequence)
  - [NestJS](https://docs.nestjs.com/fundamentals/lifecycle-events)
  - [Spring Boot](https://docs.spring.io/spring-framework/reference/core/beans/annotation-config/postconstruct-and-predestroy-annotations.html)
  - ...

</div>
<div class="col-span-6">

```mermaid
classDiagram
    Component ..|> OnInit : implements
    Component ..|> OnDestroy : implements
    Component ..|> AfterViewInit : implements

    class OnInit {
        <<interface>>
        ngOnInit()
    }

    class OnDestroy {
        <<interface>>
        ngOnDestroy()
    }

    class AfterViewInit {
        <<interface>>
        ngAfterViewInit()
    }

    class Component {

    }
```

<span class="text-sm absolute right bottom-30">
    Ausschnitt aus den
    <a href="https://angular.io/guide/lifecycle-hooks#lifecycle-event-sequence" target="_blank">
        Angular Lifecycle Hooks
    </a>
</span>

</div>
</div>

<PageNumber/>
