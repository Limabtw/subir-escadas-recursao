  Sobre o projeto

Este projeto apresenta uma solução para o problema clássico Climb Stairs, utilizando recursão na linguagem Java.

O desafio consiste em determinar de quantas maneiras diferentes é possível subir uma escada com n degraus, sabendo que, a cada movimento, é permitido subir 1 ou 2 degraus.

A solução foi desenvolvida como exercício para praticar conceitos de recursão, resolução de problemas e lógica de programação.

  Como funciona

A lógica utilizada considera que:

Para chegar ao degrau n, é possível vir do degrau n - 1.
Ou do degrau n - 2.

Assim, a função recursiva segue a relação:

f(n) = f(n - 1) + f(n - 2)
Casos base
f(1) = 1
f(2) = 2
  Tecnologias utilizadas
Java
Programação Recursiva

  Exemplo

Entrada

4

Saída

Número de maneiras de subir: 5
  Objetivo

Praticar os conceitos de recursão por meio da implementação de uma solução 
para um problema clássico de programação.