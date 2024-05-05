<template>
  <div
    class="bg-slate-50 dark:bg-slate-800 text-slate-900 dark:text-slate-50 rounded p-3 flex flex-col"
    :class="{ 'border-2 border-slate-3 dark:border-slate-6': highlight }"
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
    highlight: {
      type: Boolean,
      default: false,
    },
  },
};
</script>
