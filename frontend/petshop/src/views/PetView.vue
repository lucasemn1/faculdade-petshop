<template>
  <div class="userContainer">
    <div class="title-options">
      <h2>Pets</h2>
      <button>Novo Pet</button>
    </div>
    <section class="table">
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
          <button>Visualizar</button>
          <button>Excluir</button>
        </div>
      </div>
    </section>
  </div>
</template>

<script lang="js" setup></script>

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
