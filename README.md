# JavaDsList

A API é um mecanismo de busca de jogos que permite aos usuários encontrar informações sobre diferentes jogos. Os usuários podem realizar pesquisas com base no gênero e classificação dos jogos. A API também possui um endpoint que permite ao usuário organizar a lista da maneira que preferir.

## Modelo de Domínio

![App Screenshot](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

## End Points
- `GET Games`: Procura a lista de jogos
- `GET Games by ID`: Procura um jogo por id
- `GET Lists`: Procura pela categoria da lista de jogos
- `GET Lists by ID from Games`: Procura a lista baseada no gênero dos games
- `POST Lists Replacement`: Permite que o usuário organize a lista da forma desejada


## A resposta da API
![App Screenshot](https://github.com/matheusgmello/dslist-backend/blob/ea73c3a2f73d0ed3a3dc308fa81e5f8bfeee4179/assets/retorno%20api%20end%20point.png)

# Tecnologias

## Back end
- Java
- Spring Boot
- PostgreSQL
- Jpa/Hibernate
- H2
- Maven
  
# Como Rodar
### Pre-requisitos: Java 17

```bash
# Clone repository
git clone https://github.com/jwlioCesar/JavaDsList

# Enter the backend folder
cd dslist-backend

# Run the project
./mvnw spring-boot:run
```

# Autor
[Julio Cesar Francisco da Silva](https://www.linkedin.com/in/juliocesa/)
#
DSList é uma API Rest construída durante o Intensivão Java Spring, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").
