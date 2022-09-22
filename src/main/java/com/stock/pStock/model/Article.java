package com.stock.pStock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="Article")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String libelle;
    private float pa;
    private int tva;
    private int fodec;
    private float pv;
    private float stkinit;
    private float stock;
    private String image;
    private Long id_cat;
    private Long id_scat;
}
