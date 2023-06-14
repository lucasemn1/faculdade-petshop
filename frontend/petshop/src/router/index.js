import { createRouter, createWebHistory } from "vue-router";

const routes = [
  {
    path: "/",
    name: "users",
    component: () => import("../views/UserView.vue"),
  },
  {
    path: "/caregiver",
    name: "caregiver",
    component: () => import("../views/CaregiverView.vue"),
  },

  {
    path: "/pets",
    name: "pets",
    component: () => import("../views/PetView.vue"),
  },
  {
    path: "/sale",
    name: "sale",
    component: () => import("../views/SaleView.vue"),
  },
  {
    path: "/typeservice",
    name: "typeservice",
    component: () => import("../views/TypesServicesView.vue"),
  },
  {
    path: "/service",
    name: "service",
    component: () => import("../views/ServiceView.vue"),
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
