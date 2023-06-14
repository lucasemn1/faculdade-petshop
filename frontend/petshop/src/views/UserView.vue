<template>
  <div class="userContainer" :class="{ isAddUser: isAddUser }">
    <div class="title-options" v-show="isAddUser == false">
      <h2>Usuários</h2>
      <button @click="isAddUser = true">Novo usuário</button>
    </div>
    <section class="table" v-show="isAddUser == false">
      <div class="title">
        <span>Nome</span>
        <span>E-mail</span>
        <span>Útimo login</span>
        <span>Ações</span>
      </div>
      <div class="col">
        <span>First column</span>
        <span>Middle column</span>
        <span>Last column</span>
        <div class="btn-actions">
          <button @click="toggleDeleteUser">Excluir</button>
        </div>
      </div>
    </section>
    <NewUser v-show="isAddUser" :addUserFunction="addUser" />
  </div>
</template>

<script lang="js" setup>
import { ref } from 'vue';
import NewUser from '@/components/NewUser.vue';

const isAddUser = ref(false);
const isDeleteUser = ref(false);


function toggleDeleteUser() {
  isDeleteUser.value = true
  console.log("Excluindo...");
}

function addUser() {
  console.log("AddUser");
}
</script>

<style lang="scss" scoped>
.userContainer {
  width: 100%;
  height: 100%;
  padding: 60px 40px;
  display: flex;
  align-items: center;
  flex-direction: column;
  justify-content: flex-start;
}

.isAddUser {
  display: flex;
  align-items: center;
  justify-content: center;
}
.title-options {
  display: flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  margin-bottom: 39px;
  h2 {
    font-family: "Roboto";
    font-style: normal;
    font-weight: 400;
    font-size: 24px;
    line-height: 20px;
    /* identical to box height, or 83% */

    text-align: center;

    color: #000000;
  }

  button {
    border: none;
    width: 120px;
    cursor: pointer;
    height: 32px;
    font-family: "Roboto";
    font-style: normal;
    font-weight: 400;
    font-size: 14px;
    line-height: 20px;
    padding: 4px 11px 6px;
    box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;
    text-align: center;
    font-feature-settings: "rclt" off;

    color: rgba(0, 0, 0, 0.8956);
    background: rgba(255, 255, 255, 0.7);
    border-radius: 2px;

    border-radius: 4px;
  }
}

.table {
  width: 80%;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 9px;
  .title {
    width: 100%;
    display: flex;
    gap: 60px;
    align-items: center;
    justify-content: center;
    span {
      width: 100%;
      font-family: "Roboto";
      text-align: start;
      font-style: normal;
      width: 204.25px;

      font-weight: 400;
      font-size: 14px;
      line-height: 20px;

      font-feature-settings: "rclt" off;

      color: rgba(0, 0, 0, 0.6063);

      border-radius: 2px;
    }
  }
}

.col {
  width: 100%;
  display: flex;
  align-items: center;
  justify-content: center;
  gap: 60px;

  span {
    font-family: "Roboto";
    font-style: normal;
    font-weight: 400;
    width: 204.25px;

    font-size: 14px;
    line-height: 20px;

    font-feature-settings: "rclt" off;

    color: rgba(0, 0, 0, 0.8956);

    border-radius: 2px;
  }
  .btn-actions {
    display: flex;
    align-items: center;
    justify-content: flex-start;
    width: 204.25px;

    gap: 5px;
    button {
      border: none;
      width: 100px;
      height: 30px;

      font-family: "Roboto";
      font-style: normal;
      font-weight: 400;
      font-size: 14px;
      line-height: 20px;
      padding: 4px 11px 6px;
      box-shadow: rgba(99, 99, 99, 0.2) 0px 2px 8px 0px;
      text-align: center;
      font-feature-settings: "rclt" off;

      color: rgba(0, 0, 0, 0.8956);
      background: rgba(255, 255, 255, 0.7);
      border-radius: 2px;

      border-radius: 4px;
    }
  }
}
</style>
