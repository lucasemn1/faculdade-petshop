import { createRouter, createWebHistory } from "vue-router";

const routes = [
  {
    path: "/login",
    name: "login",
    component: () => import("../views/LoginView"),
  },
  {
    component: () => import("../layouts/AppLayout"),
    children: [
      {
        path: "/",
        name: "users",
        component: () => import("../views/UserView.vue"),
        meta: { auth: true },
      },
      {
        path: "/caregiver",
        name: "caregiver",
        component: () => import("../views/CaregiverView.vue"),
        meta: { auth: true },
      },
      {
        path: "/pets",
        name: "pets",
        component: () => import("../views/PetView.vue"),
        meta: { auth: true },
      },
      {
        path: "/sale",
        name: "sale",
        component: () => import("../views/SaleView.vue"),
        meta: { auth: true },
      },
      {
        path: "/typeservice",
        name: "typeservice",
        component: () => import("../views/TypesServicesView.vue"),
        meta: { auth: true },
      },
      {
        path: "/service",
        name: "service",
        component: () => import("../views/ServiceView.vue"),
        meta: { auth: true },
      },
    ],
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

router.beforeEach((from, to, next) => {
  const userId = localStorage.getItem("userId");

  if (to.meta.auth && !userId) {
    router.push("/login");
  } else {
    next();
  }
});

export default router;
