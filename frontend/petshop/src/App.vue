<template>
  <div class="container">
    <side-bar-component />
    <router-view />
  </div>
</template>

<script lang="js" setup>
import SideBarComponent from './components/SideBarComponent.vue';
</script>

<style lang="scss">
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

.container {
  width: 100vw;
  height: 100vh;
  display: flex;
}
</style>
