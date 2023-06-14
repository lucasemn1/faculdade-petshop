import { createRouter, createWebHistory } from "vue-router";

const routes = [
  {
    path: "/login",
    name: "login",
    component: () => import("../views/LoginView"),
  },
  {
    path: "/",
    component: () => import("../layouts/AppLayout.vue"),
    meta: { auth: true },
    children: [
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
    ],
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

router.beforeEach((to, from, next) => {
  const userId = localStorage.getItem("userId");

  if (to.meta.auth && !userId) {
    router.push("/login");
  } else {
    next();
  }
});

export default router;
