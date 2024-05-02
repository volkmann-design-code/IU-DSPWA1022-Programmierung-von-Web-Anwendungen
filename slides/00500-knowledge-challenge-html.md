---
layout: default
---

# 🤷‍♂️ Wo steht ihr?

**Challenge 1**

````md magic-move {at:2}
```html
<figure>
  <img src="jane.webp" alt="Profile Picture of Jane Doe" />
  <figcaption>
    <div>Jane Dow</div>
    <div>Job Title, Company</div>
  </figcaption>
</figure>
```

```html
<figure class="flex bg-slate-100 rounded-xl p-8">
  <img src="jane.webp" alt="Profile Picture of Jane Doe" class="w-24 p-24" />
  <figcaption>
    <div class="text-sky-500 dark:text-sky-400">Jane Dow</div>
    <div class="text-slate-700 dark:text-slate-500">Job Title, Company</div>
  </figcaption>
</figure>
```
````

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-html5 text-6xl"/>
    <a href="https://developer.mozilla.org/en-US/docs/Web/HTML" target="_blank">
      HTML
    </a>
  </div>
  <div class="flex flex-col items-center gap-2 duration-500" v-click="3">
    <div class="i-devicon-tailwindcss text-6xl"/>
    <a href="https://tailwindcss.com/" target="_blank">
      Tailwind
    </a>
  </div>
</div>

<PageNumber/>
