Feature: Analise de criptomoedas

Scenario Outline: Verificar cotacao de uma criptomoeda
  Given estou na tela inicial
  And busco pelo item "<cryptocurrency>" na lista
  And clico no item
  Then verificar cotacao da criptomoeda

Examples:
   | cryptocurrency |
  | nano |
  | btc  |