import { createApp } from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import { OhVueIcon, addIcons } from "oh-vue-icons";
import { MdExittoapp } from "oh-vue-icons/icons";

addIcons(MdExittoapp);

createApp(App)
  .component("v-icon", OhVueIcon)
  .use(store)
  .use(router)
  .mount("#app");
