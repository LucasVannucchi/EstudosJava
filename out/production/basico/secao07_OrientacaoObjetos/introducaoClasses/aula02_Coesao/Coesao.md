# Coesão em Programação Orientada a Objetos

A **coesão** é um princípio de design de software que indica o grau de relacionamento entre os elementos de uma mesma classe. Em termos simples, ela mede **o quanto os atributos e métodos de uma classe estão relacionados entre si e com a responsabilidade principal da classe**.

Quando uma classe possui **alta coesão**, significa que todos os seus elementos trabalham juntos para cumprir um único objetivo bem definido. Isso torna o código mais organizado, fácil de entender, manter e reutilizar.

Por outro lado, quando uma classe possui **baixa coesão**, ela tende a assumir muitas responsabilidades diferentes. Isso geralmente resulta em classes grandes, confusas e mais difíceis de manter.

## Exemplo de baixa coesão

Imagine uma classe chamada `Sistema` que possui métodos para:

- calcular salário
- salvar dados no banco
- enviar e-mails
- gerar relatórios

Nesse caso, a classe está acumulando diversas responsabilidades que poderiam estar separadas em classes diferentes.

## Exemplo de alta coesão

Uma abordagem melhor seria dividir essas responsabilidades em classes mais específicas, como:

- `CalculadoraSalario`
- `RepositorioFuncionario`
- `ServicoEmail`
- `GeradorRelatorio`

Cada classe teria uma responsabilidade clara, aumentando a coesão do sistema.

## Benefícios da alta coesão

- Código mais organizado
- Maior facilidade de manutenção
- Melhor reutilização de código
- Menor complexidade
- Classes com responsabilidades bem definidas

A alta coesão é um dos princípios fundamentais para escrever **código limpo e bem estruturado**, sendo frequentemente aplicada junto com outros conceitos de boas práticas em programação orientada a objetos.