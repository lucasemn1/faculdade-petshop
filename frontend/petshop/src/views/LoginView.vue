<template>
  <div class="container-login">
    <div class="side-left">
      <h2>Bem-Vindo!</h2>
      <form @submit.prevent="handleSubmit">
        <div class="input-container">
          <label for="email">Email</label>
          <input name="email" type="text" v-model="form.email" />
        </div>
        <div class="input-container">
          <label for="senha">Senha</label>
          <input name="senha" type="text" v-model="form.password" />
        </div>
        <button type="submit" class="btn-send">Entrar</button>
      </form>
    </div>

    <div class="side-right">
      <img src="images/login-image.png" alt="imagem login" />
    </div>
  </div>
</template>

<script setup>
import HttpClient from "@/config/HttpClient";
import { ref } from "vue";
import { useRouter } from "vue-router";

const form = ref({
  email: "",
  password: "",
});

const router = useRouter();

function handleSubmit() {
  new HttpClient()
    .post("http://localhost:8080/auth/get-by-credentials", form.value)
    .then((response) => {
      router.push("/");
      localStorage.setItem("userId", response.data.id);
    })
    .catch(() => {
      alert("Erro ao fazer o login");
    });
}
</script>

<style lang="scss" scoped>
.container-login {
  display: flex;
  width: 100%;
  height: 100%;
}

.side-left {
  background-color: #d9d9d9;
  width: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  gap: 16px;
  h2 {
    font-family: "Inter";
    font-style: normal;
    font-weight: 500;
    font-size: 24px;
    line-height: 13px;
    color: #000000;
    margin-bottom: 33px;
  }
}

.input-container {
  display: flex;
  flex-direction: column;
  gap: 11px;
  label {
    font-family: "Roboto";
    font-style: normal;
    font-weight: 400;
    font-size: 15px;
    line-height: 20px;
    color: #000000;
  }

  input {
    width: 399px;
    height: 30px;
    border: none;
    background: rgba(255, 255, 255, 0.7);
    border-radius: 3px;
    padding: 5px;
    opacity: 80%;
  }
}

.btn-send {
  width: 120px;
  height: 32px;

  background: #005fb8;
  border-radius: 4px;
  font-weight: 400;
  font-size: 14px;
  line-height: 20px;

  text-align: center;
  font-feature-settings: "rclt" off;

  color: #ffffff;
}

.side-right {
  background-color: #fff;
  width: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
}
</style>
