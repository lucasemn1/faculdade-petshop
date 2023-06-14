<template>
  <div class="newUser-container">
    <h2>Adicionar Usuário</h2>
    <form class="form-inputs" @submit.prevent="handleSubmit">
      <div class="input">
        <label for="nome">Nome</label>
        <input type="text" name="nome" v-model="form.name" />
      </div>
      <div class="input">
        <label for="email">E-mail</label>
        <input type="email" name="email" v-model="form.email" />
      </div>
      <div class="input">
        <label for="password">Senha</label>
        <input type="password" name="password" v-model="form.password" />
      </div>
      <button type="submit" @click="addUserFunction">Registrar</button>
    </form>
  </div>
</template>

<script lang="js" setup>
import HttpClient from '@/config/HttpClient';
import { defineProps, defineEmits, ref } from 'vue';

const emits = defineEmits(["created"]);

defineProps({
  addUserFunction: {
    type: Function
  }
});

const form = ref({
  name: "",
  email: "",
  password: ""
});

function handleSubmit() {
  new HttpClient().post("http://localhost:8080/user", form.value)
    .then(() => {
      emits("created");
    }).catch(() => {
      alert("Erro ao salvar o usuário");
    });
}
</script>

<style lang="scss" scoped>
.newUser-container {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  h2 {
    font-family: "Roboto";
    font-style: normal;
    font-weight: 400;
    font-size: 24px;
    line-height: 20px;

    display: flex;
    align-items: center;
    text-align: center;

    color: #000000;
    margin-bottom: 25px;
  }
}

.form-inputs {
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  gap: 15px;
  .input {
    display: flex;
    align-items: flex-start;
    justify-content: center;
    flex-direction: column;
    gap: 5px;
    label {
      font-family: "Roboto";
      font-style: normal;
      font-weight: 400;
      font-size: 15px;
      line-height: 20px;

      display: flex;
      align-items: center;
      text-align: center;

      color: #000000;
    }

    input {
      width: 399px;
      height: 30px;
      border: none;
      background: rgba(255, 255, 255, 0.7);
      box-shadow: rgba(0, 0, 0, 0.16) 0px 1px 4px;
      outline: none;
      border-radius: 3px;
      padding: 5px;
      opacity: 80%;
    }
  }
}

button {
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 5px 12px 7px;
  cursor: pointer;

  width: 120px;
  height: 32px;
  background: #005fb8;
  font-family: "Roboto";
  font-style: normal;
  font-weight: 400;
  font-size: 14px;
  border-radius: 12px;
  border: none;
  line-height: 20px;

  text-align: center;
  font-feature-settings: "rclt" off;

  color: #ffffff;

  border-radius: 2px;
}
</style>
