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
public class Version {
    private String nom;
    private ArrayList<Pokemon> listeStarter;

    public Version(String nom) {
        this.nom = nom;
        this.listeStarter = new ArrayList<Pokemon>();
    }
    public void addPokemon(Pokemon p)
    {
        this.listeStarter.add(p);
    }
    public void removePokemon(Pokemon p)
    {
        this.listeStarter.remove(p);
    }
    
}
