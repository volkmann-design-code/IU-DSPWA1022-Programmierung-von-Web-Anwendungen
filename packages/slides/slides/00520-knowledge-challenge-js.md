---
layout: default
---

<ChallengeHeader index="3"/>

```js
const navbar = document.querySelector("nav.main-nav");
const toggles = document.querySelectorAll("[menu-toggle]");

toggles.forEach((el) =>
  el.addEventListener("click", () => {
    // ...
  }),
);

window.addEventListener("scroll", () => {
  if (window.scrollY > 100) {
    navbar.classList.add("scrolled");
  } else {
    navbar.classList.remove("scrolled");
  }
});
```

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-javascript text-5xl"/>
    <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank">
      JavaScript
    </a>
  </div>
</div>

<PageNumber/>

<!--
- Was macht der Code?
- Wozu könnte er nützlich sein?
-->
