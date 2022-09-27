/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lojacarros;

/**
 *
 * @author Aluno
 */
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JTable;

public class Carros extends JPanel {

    public Carros(String marca, String modelo, String ano, String cor, String valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.valor = valor;
    }

    public JLabel marcaL;
    public JLabel modeloL;
    public JLabel anoL;
    public JLabel corL;
    public JLabel valorL;
    public JButton cadastrar;
    public JButton cancelar;

    public JTextField marcaT;
    public JTextField modeloT;
    public JTextField anoT;
    public JTextField corT;
    public JTextField valorT;

    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String valor;

    ArrayList<Carros> listaCarros = new ArrayList<>();

    private JTable tabela;

    private String[] colunas;// = {"Marca","Modelo","Ano","Cor","Valor"};

    private Object dados[][];

    public Carros() {

        marcaL = new JLabel("Marca");
        modeloL = new JLabel("Modelo ");
        anoL = new JLabel("Ano");
        corL = new JLabel("Cor");
        valorL = new JLabel("Valor");

        marcaT = new JTextField();
        modeloT = new JTextField();
        anoT = new JTextField();
        corT = new JTextField();
        valorT = new JTextField();

        cadastrar = new JButton("Cadastrar");
        cancelar = new JButton("Cancelar");

        colunas = new String[]{"Marca", "Modelo", "Ano", "Cor", "Valor"};

        dados = new Object[5][0];

        tabela = new JTable(dados, colunas);

        add(marcaL);
        add(marcaT);
        add(modeloL);
        add(modeloT);
        add(anoL);
        add(anoT);
        add(corL);
        add(corT);
        add(valorL);
        add(valorT);
        add(cadastrar);
        add(cancelar);

        setLayout(new GridLayout(6, 5));

        ButtonHandler handler = new ButtonHandler();
        cadastrar.addActionListener(handler);
        cancelar.addActionListener(handler);

       /* marcaT.addActionListener(handler);
        modeloT.addActionListener(handler);
        anoT.addActionListener(handler);
        corT.addActionListener(handler);
        valorT.addActionListener(handler);*/

    }

    public class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent evento) {

            if (evento.getSource() == cadastrar) {
                Carros c = new Carros(marcaT.getText(), modeloT.getText(), anoT.getText(), corT.getText(), valorT.getText());
                listaCarros.add(c);
                JOptionPane.showMessageDialog(null, "Veículo Registrado");
                marcaT.setText("");
                modeloT.setText("");
                anoT.setText("");
                corT.setText("");
                valorT.setText("");
            } else if(evento.getSource() == cancelar){
                marcaT.setText("");
                modeloT.setText("");
                anoT.setText("");
                corT.setText("");
                valorT.setText("");
            }
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {

    }

}
