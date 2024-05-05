---
layout: default
---

<ChallengeHeader index="6"/>

<div class="grid grid-cols-12 gap-6">
<div class="col-span-6">

```js
function Video({ video }) {
  return (
    <div>
      <Thumbnail video={video} />
      <a href={video.url}>
        <h3>{video.title}</h3>
        <p>{video.description}</p>
      </a>
      <LikeButton video={video} />
    </div>
  );
}
```

</div>
</div>

<div class="flex gap-6 absolute bottom left">
  <div class="flex flex-col items-center gap-2 duration-500" v-click>
    <div class="i-devicon-react text-5xl"/>
    <a href="https://react.dev/" target="_blank">
      React
    </a>
  </div>
</div>

![React Component](/images/react-video-component.gif){.absolute .right .top-content .w-[24rem] .border .rounded}

<PageNumber/>
