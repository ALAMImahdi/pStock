package com.stock.pStock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="Fournisseur")
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String libelle;
    private String contact;
    private String adresse;
    private String tel;
    private String email;
    private String matfisc;
    private String asuj;
    private String timbre;
    private float soldeInit;
    private float solde;
    private String login;
}
