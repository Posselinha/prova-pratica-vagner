# Respostas — Sistema de Reserva de Laboratorio

Nome completo: **\*\*\*\***\*\***\*\*\*\***\_\_**\*\*\*\***\*\***\*\*\*\*** RA: **\*\***\_\_**\*\***

> Preencha **todos** os campos. Campo vazio é campo não avaliado.
> Não apague os títulos nem os rótulos em negrito: a correção procura por eles.

---

# Etapa 1 — Diagnóstico

## Problema 1 — a conversão do inventario patrimonial

**Em que consiste o problema, e o que acontece quando o sistema cresce:**

O problema referente à conversão acontece por conta de que a equipe de desenvolvimento anterior criou o serviço "InventarioLegadoWS" fazendo uso de matriz de texto e realizando a códificação da situação em letra. Com o passar do tempo e com o crescimento do sistema, a conversão do formato foi escrita em dois lugares, e isso fez com que esses dois lugares acabassem se divergindo, visto que uma está tratando com letra minuscula e a outra não, fazendo a possibilidade de itens aparecerem como indisponiveis no catalogo mas disponiveis no relatorio.

**Princípio SOLID violado:**

O principal princípio solid violado foi o SRP, pois as classes estão acumulando a regra e negocios com a responsabilidade de interpretar e converter os dados. Também está sendo violado o DIP, visto que módulos de alto nível dependem da classe "InventarioLegadoWS" em vez de uma abstração.

**Classes afetadas (pelo nome):**

As classes afetadas são "CatalogoEquipamentos" e "RelatorioAcervo"

**Que outra dependência indevida essas classes têm em relação ao
inventario patrimonial, e por que ela é um problema:**

As classes dependem diretamente da estrutura da matriz, e isso se em outro dia o sistema chegar a alterar o layout das colunas da matriz, tudo que depende eles irá quebrar.

## Problema 2 — o ciclo de vida de Reserva

**Em que consiste o problema, e o que acontece quando o sistema cresce:**

O problema do ciclo de vida de Reserva ocorre por conta da utilização das estruturas condicionais if e else espalhados nos métodos publicos. E conforme o sistema cresce, pode chegar a surgir novos estados e assim criando a necessidade de aumentar a estrutura condicional, gereando um acoplamento no código e grande probabilidade de erros.

**Princípio SOLID violado:**

O principal príncipio violado foi o OCP, pois a classe "Reserva" não está fechada para modificações, e também está sendo violado o SRP por conta de que ela está acumulando responsabilidades

**Classes afetadas (pelo nome):**

Estão sendo afetadas a classe "Reserva"

---

# Etapa 4 — Justificativa

## Padrão aplicado ao Problema 1

**O problema que ele resolve (descreva antes de nomear o padrão):**

A utilização do padrão Adapter permite converter a interface de uma classe existente na que o cliente espera, resolvendo a incompatibilidade dos dados com o código legado que havia sido criado pela outra equipe de desenvolvimento, permitindo unificar a conversão de formatado em um unico componente

**Nome do padrão:**
Adapter

**Alternativa descartada e por que ela não resolveria por completo:**
A outra alternativa seria alterar diretamente a classe Legado, mas não pode ser realizado por conta de que ela foi desenvolvida por outra equipe e já estava integrada dentro do sistema, tendo que sua alteração poderia gerar incompatibilidade em outras partes do sistema.

## Padrão aplicado ao Problema 2

**O problema que ele resolve (descreva antes de nomear o padrão):**
Foi utilizado o padrão State que permite mudar o comportamento de um objeto conforme seu estado, ela foi utilizada para resolver o problema de acoplamento gerado pelo uso do bloco condicional If else dentro de reserva

**Nome do padrão:**
State

**Alternativa descartada e por que ela não resolveria por completo:**

Caso fosse trocado o String por Enum, isso ainda estaria mantendo a violação do padrão OCP com o uso do bloco condicional If Else. Não resolvendo assim o problema por completo
