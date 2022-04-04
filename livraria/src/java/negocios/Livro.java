/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocios;

/**
 *
 * @author danylosilva
 */
public class Livro {
    
    private int id;
    private String nome;
    private String autor;
    private String ano;
    private String ses;
    private String gen;
    private String pra;  

public Livro( String nome, String autor, String ano, String ses, String gen, String pra) {
        
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.ses = ses;
        this.gen = gen;
        this.pra = pra;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getSes() {
        return ses;
    }

    public void setSes(String ses) {
        this.ses = ses;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getPra() {
        return pra;
    }

    public void setPra(String pra) {
        this.pra = pra;
    }





}