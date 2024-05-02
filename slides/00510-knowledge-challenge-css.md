---
layout: default
---

<ChallengeHeader index="2"/>

````md magic-move {at:2}
```css
.grid {
  display: grid;
  grid-template-columns: repeat(12, minmax(0, 1fr));
}

.col {
  grid-column: span 2 / span 2;
}
```

```css
.col {
  grid-column: span 12 / span 12;
}

@media (min-width: 500px) {
  .col {
    grid-column: span 6 / span 6;
  }
}
```
````

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-css3 text-6xl"/>
    <a href="https://developer.mozilla.org/en-US/docs/Web/CSS" target="_blank">
      CSS
    </a>
  </div>
</div>

<PageNumber/>
