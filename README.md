# feltex-gemini

## Descrição
`feltex-gemini` é um projeto de demonstração para Spring Boot que integra com o Vertex AI Gemini para funcionalidades de chat. Este projeto demonstra como configurar uma aplicação Spring Boot para usar o modelo de chat do Vertex AI Gemini.

## Requisitos
- Java 21
- Maven
- Spring Boot 3.4.2

## Configuração

### Clonar o repositório
```sh
git clone git@github.com:andrefelixbr/feltex-gemini.git
cd feltex-gemini
```

### Construir o projeto
```sh
mvn clean install
```

### Executar a aplicação
```sh
mvn spring-boot:run
```

## Configuração
A configuração da aplicação é gerenciada através do arquivo `application.properties` localizado em `src/main/resources/`.

### Exemplo de configuração
```ini
spring.application.name=feltex-gemini
spring.ai.vertex.ai.gemini.project-id=<Seu projeto no Google Cloud>
spring.ai.vertex.ai.gemini.location=europe-west1
spring.ai.vertex.ai.gemini.chat.options.model=gemini-2.0-flash-001
```

## Endpoints

### Endpoint de Chat
- **URL:** `/api/gemini/chat`
- **Método:** `GET`
- **Parâmetro de Consulta:** `query` (padrão: "Liste o nome dos países sul-americanos")
- **Resposta:** JSON contendo a resposta do modelo de chat

### Exemplo de Requisição
```sh
curl -G http://localhost:8080/api/gemini/chat --data-urlencode "query=Qual é a capital da França?"
```

## Licença
Este projeto está licenciado sob a Licença MIT. Veja o arquivo `LICENSE` para mais detalhes.


Sinta-se à vontade para contribuir com este projeto enviando issues ou pull requests.