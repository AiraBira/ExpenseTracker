package com.airabira.expensetracker.model;
import java.time.LocalDate;

public class Expense {
    private int id;
    private double montant;
    private String nom;
    private Category categorie;
    private LocalDate  date;
    private String description;

    public Expense (int id, double montant, String nom, Category categorie, LocalDate  date, String description){
        this.id = id;
        this.montant = montant;
        this.nom = nom;
        this.categorie = categorie;
        this.date = date;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public String getNom() {
        return nom;
    }

    public Category getCategorie() {
        return categorie;
    }

    public LocalDate  getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCategorie(Category categorie) {
        this.categorie = categorie;
    }

    public void setDate(LocalDate  date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return "Id="+getId()+
                ",Montant="+ getMontant()+
                ", Nom="+getNom()+
                ", Categorie="+getCategorie()+
                ", Date="+getDate()+
                ", Description="+getDescription();
    }
}
