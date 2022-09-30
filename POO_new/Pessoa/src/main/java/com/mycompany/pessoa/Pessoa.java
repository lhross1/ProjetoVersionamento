/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author Aluno
 */
import java.io.Serializable;
import java.util.ArrayList;

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

   public static void main(String[] args) {

        // desserialização: recuperando os objetos gravados no arquivo binário "dados.dat"
        ArrayList<Object> pessoa = Empacotamento.lerArquivoBinario("dados.dat");
        int i = 1;
        for (Object item : pessoa) {
            System.out.printf("Ficha nro....: %d.\n", i++);
// ((Pessoa)item) - implementa o mecanismo de downcast, ou seja,
// o objeto "item" declarado a partir da classe
// base "Object" é referenciado como um objeto "Pessoa"
            System.out.printf("Nome.........: %s\n", ((Pessoa) item).getNome());
            System.out.printf("Peso Corporal: %.2f kgs\n", ((Pessoa) item).getPC());
            System.out.printf("Altura.......: %.2f metros\n", ((Pessoa) item).getAlt());
            System.out.printf("IMC..........: %.2f\n", ((Pessoa) item).IMC());
            System.out.printf("Interpretacao: %s\n\n", ((Pessoa) item).interpretaIMC());
        }
     }

    }

