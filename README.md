# Curso de Java - Usando Instruções break e continue

Este repositório contém exemplos práticos sobre o uso das instruções de controle de fluxo `break` e `continue` em Java, demonstrando como interromper e pular iterações em loops de forma eficiente.

## 📚 Conceitos Fundamentais

### 🔴 Instrução `break`
Interrompe completamente a execução do loop mais próximo e transfere o controle para a primeira instrução após o loop.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Sai do loop quando i = 5
    }
    System.out.println(i); // Imprime: 0, 1, 2, 3, 4
}
```

### 🟡 Instrução `continue`
Pula a iteração atual do loop e vai diretamente para a próxima iteração, ignorando o código restante no corpo do loop.

```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue; // Pula quando i = 2
    }
    System.out.println(i); // Imprime: 0, 1, 3, 4
}
```

## 🛠️ Exemplos Práticos

### 1. **Sistema de Processamento de Pedidos**
Demonstra o uso de `break` para interromper o processamento ao encontrar um pedido cancelado.

**Funcionalidades:**
- Lista de pedidos com status
- Interrupção automática ao encontrar pedido cancelado
- Classe `Pedido` com encapsulamento

### 2. **Calculadora de Faturamento Diário**
Sistema que coleta vendas do dia usando `break` como condição de parada.

**Características:**
- Máximo de 10 vendas por dia
- Valor 0 encerra a coleta
- Cálculo automático do faturamento total

### 3. **Listagem de Produtos em Estoque**
Utiliza `continue` para ignorar produtos fora de estoque na listagem.

**Funcionalidades:**
- Array de produtos e quantidades
- Exibe apenas produtos disponíveis
- Ignora itens com estoque zero

### 4. **Validação de Códigos de Cliente**
Sistema de verificação contínua usando `while(true)` com `break`.

**Características:**
- Loop infinito controlado
- Código -1 para finalizar
- Validação em tempo real

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE Java ou terminal

### Executando o Projeto

1. **Clone o repositório:**
```bash
git clone <url-do-repositorio>
cd java-break-continue-course
```

2. **Compile:**
```bash
javac -d out src/main/java/org/example/Main.java
```

3. **Execute:**
```bash
java -cp out org.example.Main
```

### 🔧 Testando Diferentes Exemplos

Para testar exemplos específicos, descomente as seções correspondentes:

- **Exemplo 1 - Pedidos**: Descomente linhas 7-35 + classe Pedido
- **Exemplo 2 - Faturamento**: Descomente linhas 37-48
- **Exemplo 3 - Estoque**: Descomente linhas 49-58
- **Exemplo 4 - Códigos**: Já está ativo (linhas 59-68)

## 📊 Comparação: break vs continue

| Aspecto | `break` | `continue` |
|---------|---------|------------|
| **Ação** | Sai completamente do loop | Pula para próxima iteração |
| **Execução** | Para imediatamente | Continua o loop |
| **Uso comum** | Condições de parada | Filtrar elementos |
| **Fluxo** | Vai para após o loop | Vai para início do loop |

## 🎯 Casos de Uso Práticos

### Quando usar `break`:
- ✅ Busca em listas (parar ao encontrar)
- ✅ Validação com condição de erro
- ✅ Menus com opção "sair"
- ✅ Loops infinitos controlados
- ✅ Processamento até limite específico

### Quando usar `continue`:
- ✅ Filtrar elementos inválidos
- ✅ Pular processamento desnecessário
- ✅ Ignorar valores especiais
- ✅ Processamento condicional
- ✅ Limpeza de dados

## 💡 Exemplos de Saída

### Processamento de Pedidos:
```
Processando pedido: 1
Processando pedido: 2
// Para ao encontrar pedido cancelado (ID: 3)
```

### Faturamento Diário:
```
Informe os valores das vendas do dia (máximo 10). Digite 0 para encerrar:
100.50
200.00
0
Faturamento total: R$ 300.5
```

### Produtos em Estoque:
```
Produtos disponíveis:
Produto A - Quantidade: 5
Produto C - Quantidade: 3
// Produto B e D são ignorados (estoque 0)
```

### Validação de Códigos:
```
Informe os códigos de clientes (digite -1 para encerrar):
101
Código válido: 101
102
Código válido: 102
-1
Fim da verificação.
```

## ⚠️ Boas Práticas

### ✅ Recomendações:
- Use `break` para saídas limpas de loops
- Prefira `continue` a múltiplos `if-else` aninhados
- Combine com condições claras e legíveis
- Evite `break` em loops aninhados sem labels
- Documente o motivo do `break`/`continue`

### ❌ Evite:
- Uso excessivo que dificulta a leitura
- `break` sem condição clara
- Loops infinitos sem `break` de segurança
- `continue` quando simples `if` seria melhor

## 🔍 Conceitos Avançados

### Labels com break/continue:
```java
outer: for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (j == 1) break outer; // Sai dos dois loops
    }
}
```

### Break em Switch:
```java
switch (opcao) {
    case 1:
        System.out.println("Opção 1");
        break; // Evita fall-through
    case 2:
        System.out.println("Opção 2");
        break;
}
```

## 📖 Objetivos de Aprendizagem

Ao estudar este código, você aprenderá:

- 🎯 Diferenças fundamentais entre `break` e `continue`
- 🔄 Controle fino do fluxo de loops
- 💻 Implementação de sistemas interativos
- 🛡️ Validação e tratamento de entrada
- 📊 Filtros e processamento condicional
- 🔧 Boas práticas de estruturas de controle
- 🎨 Padrões comuns de programação

## 🤝 Contribuição

Este é um projeto educacional. Contribuições com novos exemplos e melhorias são bem-vindas!

## 📚 Próximos Passos

- Estude loops aninhados com labels
- Aprenda sobre exceções como alternativa ao break
- Explore padrões de design com controle de fluxo
- Pratique com estruturas de dados mais complexas

---

**Autor**: Vinícius Santos Briches
**Curso**: Fundamentos Java  
**Versão**: 1.0  
**Data**: 2025
