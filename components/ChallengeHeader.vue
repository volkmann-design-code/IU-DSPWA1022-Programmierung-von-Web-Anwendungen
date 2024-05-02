<template>
  <h1>🤷‍♂️ Wo steht ihr?</h1>
  <p>
    <strong>Challenge {{ index }}</strong>
  </p>
</template>

<script>
export default {
  props: {
    index: {
      type: String,
      required: true,
    },
  },
};
</script>
