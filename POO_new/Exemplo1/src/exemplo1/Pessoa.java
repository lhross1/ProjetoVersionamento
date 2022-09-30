/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo1;

/**
 *
 * @author Aluno
 */
import java.io.Serializable;

public class Pessoa implements Serializable {

    private String nome;
    private double pc; // peso corporal
    private double alt; // altura em metros

    public Pessoa(String nome, double pc, double alt) {
        this.nome = nome;
        this.pc = pc;
        this.alt = alt;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPC() {
        return pc;
    }

    public void setPC(float pc) {
        this.pc = pc;
    }

    public double getAlt() {
        return alt;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }

    public double IMC() {
        return (getPC() / (getAlt() * getAlt()));
    }

    public String interpretaIMC() {
        double vlrIMC = IMC();
        if (vlrIMC < 18.5) {
            return ("baixo peso");
        } else if (vlrIMC < 25.0) {
            return ("peso adequado");
        } else if (vlrIMC < 30.0) {
            return ("sobrepeso");
        } else {
            return ("obesidade");
        }

    }
    
}
