<template>
  <div>
    <side-bar-component />

    <router-view />
  </div>
</template>

<script lang="js" setup>
import SideBarComponent from '../components/SideBarComponent.vue';
</script>

<style scoped>
div {
  display: flex;
}
</style>
