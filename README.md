<h1 align="center">Consumo da API Via CEP em Java </h1>

<p align="center">Projeto desenvolvido em Java para consultar informações de endereço com base no CEP fornecido.</p>
<p align="center">Para interagir com a API de consulta do ViaCEP, foi utilizada a biblioteca JAX-RS.</p>
 
---

### 💬 Principais características:
- Permite consultar informações detalhadas do endereço com base no CEP fornecido.
- Implementa tratamento de erros para cenários como CEP inválido, CEP inexistente ou sistema indisponível.
- Utiliza conceitos de orientação a objetos para encapsular a lógica de consumo da API em um método reutilizável.
- Emprega a biblioteca Lombok para reduzir a verbosidade do código e melhorar a legibilidade.
- Oferece uma abordagem fácil e eficiente para consumo de API integrando o Spring Boot com o framework Jersey, através da dependência `spring-boot-starter-jersey`.

### 🛠 Resumo de como o código funciona:

- O código implementa um método `consultarCep()` que recebe um CEP como entrada e faz uma requisição GET para a API do ViaCEP. 
- Em seguida, processa a resposta da API, mapeando os dados do endereço para um objeto `EnderecoModel`. 
- O método também inclui tratamento de erros para casos como CEP inválido, inexistente ou sistema indisponível.
   
---
### 🔗 Links auxiliares:
 - [API Via Cep](https://viacep.com.br/)
 - [Link de consulta cep](https://viacep.com.br/ws/01310100/json/)

---

### Autor:

<img alt="Giselle Souza" title="Giselle Souza" src="https://github.com/gisellesouzaa.png" height="100" width="100"/>

Feito com ❤️ por Giselle Souza. 👋
<br>
<a href="https://www.linkedin.com/in/giselle-de-souza-gabriel/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-05122A?style=for-the-flat&logo=linkedin&logoColor=white" target="_blank"></a>
