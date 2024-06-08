package com.example.demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/translate")
public class TranslationController {

     @PostMapping
     public ResponseEntity<String> translate(@RequestBody String request) {
         // checking if the repsonse is Null or Empty
          if (request == null || request.isEmpty()) {
              return new ResponseEntity<>("Text input is required", HttpStatus.BAD_REQUEST);
          }
          //Calling the function
          String translatedText = simulateTranslation(request);

          return new ResponseEntity<>(translatedText, HttpStatus.OK);
     }

    private String simulateTranslation(String text) {
        // Here we are simulating the translation process
         return "Translation successful for text: " + text;

    }
}
