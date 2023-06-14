<template>
  <section class="sidebar">
    <div class="profile">
      <img src="images/image-profile.png" alt="imagem do perfil" />

      <strong>Olá, lufffy!</strong>
      <h2>Bem-Vindo!</h2>
    </div>
    <ul class="list-itens">
      <li class="item">
        <router-link to="/">Usuarios</router-link>
      </li>
      <li class="item">
        <router-link to="/caregiver">Cuidadores</router-link>
      </li>
      <li class="item">
        <router-link to="/pets">Pets</router-link>
      </li>
      <li class="item">
        <router-link to="/sale">Vendas</router-link>
      </li>
      <li class="item">
        <router-link to="/typeservice">Tipos de Serviços</router-link>
      </li>
      <li class="item">
        <router-link to="/service">Serviços</router-link>
      </li>
    </ul>

    <button class="btn-exit">
      <span>Sair</span>
      <v-icon name="md-exittoapp" class="icon" />
    </button>
  </section>
</template>

<script lang="js" setup></script>

<style lang="scss" scoped>
.sidebar {
  position: sticky;
  top: 0;
  background-color: #391f1f;
  width: 403px;
  height: 100%;
  display: flex;
  align-items: center;
  justify-content: space-around;
  flex-direction: column;
}

.profile {
  width: 80%;
  padding: 40px;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-direction: column;
  border-bottom: 1px solid #6a5151;
  img {
    width: 118px;
    height: 118px;
    border-radius: 999px;
    margin-bottom: 43px;
  }

  strong {
    font-family: "Inter";
    font-style: normal;
    font-weight: 500;
    font-size: 24px;
    line-height: 29px;

    display: flex;
    align-items: center;
    text-align: center;

    color: #ffffff;
  }

  h2 {
    font-family: "Inter";
    font-style: normal;
    font-weight: 500;
    font-size: 36px;
    line-height: 44px;
    /* identical to box height */

    display: flex;
    align-items: center;
    text-align: center;

    color: #ffffff;
  }
}

.list-itens {
  display: flex;
  flex-direction: column;
  gap: 37px;
  width: 100%;
  height: 80%;
  list-style: none;
  align-items: center;
  justify-content: flex-start;
  margin-top: 50px;

  .item {
    width: 100%;
    display: flex;
    align-self: center;
    justify-content: center;
    a {
      text-decoration: none;
      font-family: "Inter";
      font-style: normal;
      font-weight: 500;
      font-size: 20px;
      line-height: 24px;
      display: flex;
      align-items: center;
      text-align: center;

      color: #ffffff;
      text-align: start;
      width: 80%;
    }
  }
}

.btn-exit {
  margin-top: 76px;
  width: 297px;
  height: 50px;
  left: 50px;
  top: 925px;
  display: flex;
  align-items: center;
  justify-content: space-between;
  padding: 20px;
  border: none;

  background: #674646;
  border-radius: 6px;
  cursor: pointer;
  margin-bottom: 20px;

  span {
    font-family: "Inter";
    font-style: normal;
    font-weight: 500;
    font-size: 20px;
    line-height: 24px;
    display: flex;
    align-items: center;
    text-align: center;

    color: #ffffff;
  }

  .icon {
    scale: 1.2;
    color: #fff;
  }
}
</style>
