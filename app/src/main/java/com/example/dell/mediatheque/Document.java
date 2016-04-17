package com.example.dell.mediatheque;

/**
 * Created by DELL on 13/04/2016.
 */
public class Document {
    private String code ;
    private String titre;
    private String auteur;
    private String type;

    public Document(String code,String titre,String auteur,String type){
        this.setCode(code);
        this.setTitre(titre);
        this.setAuteur(auteur);
        this.setType(type);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}



