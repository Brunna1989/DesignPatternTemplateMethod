# Design Pattern (Comportamentais): Template Method

Este projeto em Java demonstra o uso do padrão de design comportamental "Template Method" para a criação de três tipos de bebidas aquecidas: Chocolate Quente Mexicano, Dalgona Coffe e Cappucino Vegano.

## Estrutura do Projeto

O padrão "Template Method" é aplicado por meio da classe abstrata `BebidaAquecida`, que define um esqueleto de algoritmo para a preparação de bebidas aquecidas. As subclasses concretas (`ChocolateQuenteMexicano`, `DalgonaCoffe` e `CappucinoVegano`) implementam os passos específicos para cada tipo de bebida.

### Classes Principais

- **BebidaAquecida (Pacote: model)**
  - Classe abstrata que define o esqueleto do algoritmo para a preparação de bebidas aquecidas.

- **ChocolateQuenteMexicano, DalgonaCoffe, CappucinoVegano (Pacote: model)**
  - Subclasses concretas que implementam os passos específicos para cada tipo de bebida.

- **Menu (Pacote: main)**
  - Classe que representa um menu simples em uma interface gráfica (usando `JOptionPane`) para escolher entre as diferentes bebidas.

## Como Usar

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    cd seu-repositorio
    ```

2. Compile e execute o programa:

    ```bash
    javac main/Menu.java
    java main.Menu
    ```

3. Siga as instruções no menu para escolher uma bebida e veja a preparação acontecer.

## Padrão de Design Utilizado

O padrão de design "Template Method" é aplicado na classe abstrata `BebidaAquecida`, onde o esqueleto do algoritmo para a preparação é definido e os passos específicos são implementados nas subclasses concretas.

## Observações

- O projeto utiliza JOptionPane para uma interface gráfica básica no console.
