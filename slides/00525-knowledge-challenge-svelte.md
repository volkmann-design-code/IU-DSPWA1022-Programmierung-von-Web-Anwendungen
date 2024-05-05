---
layout: default
---

<ChallengeHeader index="8"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-9">

```svelte
<script>
	let count = 0;

	function handleClick() {
		count += 1;
	}
</script>

<button on:click={handleClick}>
	Clicked {count}
	{count === 1 ? 'time' : 'times'}
</button>
```

</div>
</div>

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-svelte text-5xl"/>
    <a href="https://svelte.dev/" target="_blank">
      Svelte
    </a>
  </div>
</div>

![Svelte Component](/images/svelte-click-component.gif){.absolute .right .top-content .w-[12rem] .border .rounded}

<PageNumber/>
````
