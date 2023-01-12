package com.stackroute.AIChat.controller;

import com.stackroute.AIChat.model.Question;
import com.stackroute.AIChat.model.ReqModel;
import com.stackroute.AIChat.model.ResModel;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/AIChat")
public class ChatController {
    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
//    private ResponseEntity responseEntity;

    @GetMapping("/greet")
    public String greet() {
        return "Good Morning, Have a nice day";
    }


    @PostMapping("/chat")
//    public String chat(@RequestBody Question question) {
    public ResponseEntity<?> chat(@RequestBody Question question) {
        //URL
        String url = "https://api.openai.com/v1/completions";

        // Headers info
        headers.set("Host", "<calculated when request is sent>");
        headers.set("User-Agent", "PostmanRuntime/7.29.2");
        headers.set("Accept", "*/*");
        headers.set("Accept-Encoding", "gzip, deflate, br");
        headers.set("Connection", "keep-alive");
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "Bearer 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");

        // Request model
        ReqModel reqModel = new ReqModel();
        reqModel.setModel("text-davinci-003");
        reqModel.setPrompt(question.getQuestion());
        reqModel.setTemperature(0.7);
        reqModel.setMax_tokens(256);
        reqModel.setTop_p(1);
        reqModel.setFrequency_penalty(0);
        reqModel.setPresence_penalty(0);

        // Make a post call to third party api
        HttpEntity entity = new HttpEntity(reqModel, headers);
        ResModel data = restTemplate.exchange(url, HttpMethod.POST, entity, ResModel.class).getBody();
        String response = data.getChoices().get(0).getText();
//        return response;
//        System.out.println(responseEntity);
//        return responseEntity;
        return new ResponseEntity<>(data, HttpStatus.OK);
    }

}
