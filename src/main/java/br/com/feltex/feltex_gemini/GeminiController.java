package br.com.feltex.feltex_gemini;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.vertexai.gemini.VertexAiGeminiChatModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/gemini", produces = MediaType.APPLICATION_JSON_VALUE)
public class GeminiController {

    private final VertexAiGeminiChatModel chatModel;


    public GeminiController(VertexAiGeminiChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @RequestMapping("/chat")
    public String chat(
        @RequestParam(value = "query", defaultValue = "Liste o nome dos paises sul-americanos") String query) {
        var prompt = new Prompt(query);

        return chatModel
            .call(prompt)
            .getResult()
            .getOutput()
            .getText();
    }

}
