package com.example.LTDapi.controllers.model;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Evento {


    private Long id;
    private String nome;
    private Date data;
    private int horario;
    private String status;
  
    }
   

    

    
