package com.stock.pStock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="Scategorie")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Scategorie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String code_categ;
    private String libelle;
    private Long id_cat;
}
