# Calculadora de IMC (Android - Kotlin)

Aplicativo Android simples desenvolvido com o objetivo de praticar conceitos fundamentais de desenvolvimento mobile utilizando Kotlin.

O foco principal do projeto é a navegação entre Activities e a troca de dados entre telas.

---

## Funcionalidades

- Inserção de peso e altura pelo usuário
- Cálculo automático do IMC
- Navegação para tela de resultado
- Exibição do valor calculado e classificação

---

## Conceitos abordados

- Navegação entre Activities
- Uso de `Intent` para envio de dados
- Uso de `putExtra()` e `getIntent()`
- Organização básica de um app Android
- Ciclo de vida de Activities

---

## Estrutura do Projeto

###  `MainActivity`
- Tela inicial do app
- Responsável por capturar peso e altura
- Envia os dados para a próxima tela

### `ResultadoActivity`
- Recebe os dados via `Intent`
- Calcula e exibe o IMC
- Mostra a classificação do resultado

---

##  Fluxo da Aplicação

```text
MainActivity → (Intent com dados) → ResultadoActivity
