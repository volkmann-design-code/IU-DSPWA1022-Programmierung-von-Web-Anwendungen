<template>
  <div
    class="bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-slate-50 rounded p-3 flex flex-col"
  >
    <strong class="mb-1">{{ title }}</strong>
    <span class="text-slate-400 text-base">{{ description }}</span>
  </div>
</template>

<script>
export default {
  props: {
    title: {
      type: String,
      required: true,
    },
    description: {
      type: String,
      required: true,
    },
  },
};
</script>
