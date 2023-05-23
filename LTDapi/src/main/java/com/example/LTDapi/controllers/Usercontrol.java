package com.example.LTDapi.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.LTDapi.controllers.model.Evento;
import com.example.LTDapi.controllers.model.User;

@RestController
@RequestMapping("api/auth")
public class Usercontrol {
    private UserRepository userRepository;

    private List<User> users = new ArrayList<>();

   
    
    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user){
        //lógica para o login
        if("admin".equals(user.getNome()) && "password".equals(user.getSenha())){

            String token = generateToken();
            return ResponseEntity.ok(token);
        }
        else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("informações inválidas");
        }

    }
   
    private String generateToken() {
        return null;
    }

    @PostMapping("/")
    public User user(@RequestBody User user){
        users.add(user);
        return user;
    }
    ////LÓGICA FEITA SEM O USO DO BD, QUANDO ESTIVE PRONTO O BD A LÓGICA VAI SER ALTERADA 
    @RestController
    @RequestMapping("/api/events")
    public class EventController {
        private List<Evento> events = new ArrayList<>();
    
        @GetMapping("/get")
        public ResponseEntity<List<Evento>> getAllEvents() {
            return ResponseEntity.ok(events);
        }
    
        @PostMapping("/ad")
        public ResponseEntity<Evento> createEvent(@RequestBody Evento evento) {
            // Lógica para criar um novo evento
            events.add(evento);
            return ResponseEntity.ok(evento);
        }
    }
    }







