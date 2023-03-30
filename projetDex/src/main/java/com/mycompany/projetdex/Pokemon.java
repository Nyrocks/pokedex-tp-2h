/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetdex;

import java.util.ArrayList;

/**
 *
 * @author erwan
 */
public class Pokemon {
    private String nom;
    private int numeroPokedex;
    private String type1;
    private String type2;
    private ArrayList<String> pokemonsSuperieurs;
    private static int nbPokemon;
    

    public Pokemon(String nom, int numeroPokedex, String type1, String type2) {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.type1 = type1;
        this.type2 = type2;
        this.pokemonsSuperieurs = new ArrayList<String>();
    }
    public Pokemon(String nom, int numeroPokedex, String type1) {
        this.nom = nom;
        this.numeroPokedex = numeroPokedex;
        this.type1 = type1;
        this.type2 = "null";
        this.pokemonsSuperieurs = new ArrayList<String>();
    }
    
    public void ajouterPokemonSuperieur(String s)
    {
        this.pokemonsSuperieurs.add(s);
    }
      public void setNom(String nom){
       this.nom = nom;
   }
   public void setNumeroPokedex(int numeroPokedex){
       this.numeroPokedex = numeroPokedex;
   }
   public void setType1(String type1){
       this.type1 = type1;
   }
   public void setType2(String type2){
       this.type2 = type2;
   }
}
