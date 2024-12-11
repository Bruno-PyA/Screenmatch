# Screen Match

O Screen Match é um projeto Java para organização e manipulação de filmes e séries. Com funcionalidades como ordenação, filtragem, integração com APIs e manipulação dinâmica de listas, o projeto permite trabalhar de forma intuitiva com dados de entretenimento. O intuito é poder trabalhar com POO, gravação de API e trabalhar com exceções.

## Estrutura do Projeto

### Pacotes:
- **`br.com.java.screenmatch.calculos`**: Códigos relacionados a cálculos e manipulação de dados.
- **`br.com.java.screenmatch.modelos`**: Contém as classes principais, como `Filme`, `Serie` e `Titulo`.
- **`br.com.java.screenmatch.principal`**: Classes principais para execução, como buscas e manipulação de listas.

## Funcionalidades

1. **Criação de objetos**:
   - Adicione filmes e séries com nome e ano de lançamento.
   - Avalie filmes, atribuindo uma classificação. 

2. **Filtragem**:
   - Exiba filmes com classificações acima de um determinado valor.

3. **Integração com API OMDb**:
   - Realize buscas de filmes em tempo real através da API OMDb.
   - Converta os dados retornados para objetos Java e armazene em JSON.

4. **Salvamento em Arquivo**:
   - Salve os filmes buscados em um arquivo JSON local, garantindo persistência dos dados.

## Requisitos

- Java 17 ou superior.
- IDE de sua preferência como IntelliJ IDEA para execução e edição do código.
- Dependência: Gson.

**Contribuições**  
Sugestões, ideias ou feedbacks são sempre bem-vindos! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Deseja colocar em pratica? Basta apenas clonar este repositório.

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/screenmatch
---

**Curiosidade**  
Você sabia que a primeira linguagem de programação de alto nível foi criada nos anos 1950 e chamada de Fortran? Ela foi projetada para computação científica e engenharia. Mesmo depois de várias décadas, Fortran ainda é usado em alguns domínios especializados!

---

**Referências Úteis**  
- [Documentação Java: Java SE Documentation](https://docs.oracle.com/en/java/javase/)
- [API OMDb: OMDb API](http://www.omdbapi.com/)
- [Gson para JSON em Java: Gson GitHub](https://github.com/google/gson)
