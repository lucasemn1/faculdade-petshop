<template>
  <div class="newUser-container">
    <h2>Adicionar Cuidador</h2>
    <div class="form-inputs">
      <div class="input">
        <label for="nome">Nome</label>
        <input type="text" name="nome" />
      </div>
      <div class="input">
        <label for="nome">E-mail</label>
        <input type="text" name="nome" />
      </div>
      <div class="input">
        <label for="telphone">Número de Telefone</label>
        <input type="text" name="telphone" />
      </div>
      <div class="input">
        <label for="city">Cidade</label>
        <input type="text" name="city" />
      </div>
      <div class="input">
        <label for="state">Bairro</label>
        <input type="text" name="state" />
      </div>
      <div class="input">
        <label for="cep">Cep</label>
        <input type="text" name="cep" />
      </div>
      <div class="input">
        <label for="number">Número</label>
        <input type="text" name="number" />
      </div>
      <button>Concluir</button>
    </div>
  </div>
</template>

<script lang="js" setup></script>

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
