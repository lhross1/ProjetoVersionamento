/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frame;

/**
 *
 * @author Aluno
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;

public class JanelaCarros extends JPanel {

    private JButton cadastrar, cancelar, apagar, consultar, editar, gravar, ler;
    private JTextField carMarcaField, carModeloField, carAnoField, carCorField,
            carValorField;

    ArrayList<Carros> listaCarros = new ArrayList<Carros>();

    private JTable jTable;

    public JanelaCarros() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(new JLabel("Cadastro Carros"));
        JPanel a = new JPanel();
        a.setLayout(new GridLayout(5, 2));
        a.add(new JLabel("Marca"));
        carMarcaField = new JTextField(20);
        a.add(carMarcaField);
        a.add(new JLabel("Modelo"));
        carModeloField = new JTextField(20);
        a.add(carModeloField);
        a.add(new JLabel("Ano"));
        carAnoField = new JTextField(20);
        a.add(carAnoField);
        a.add(new JLabel("Cor"));
        carCorField = new JTextField(20);
        a.add(carCorField);
        a.add(new JLabel("Valor"));
        carValorField = new JTextField(20);
        a.add(carValorField);
        add(a);
        JPanel botoes = new JPanel();

        botoes.add(cadastrar = new JButton("Cadastrar"));
        botoes.add(cancelar = new JButton("Cancelar"));
        botoes.add(consultar = new JButton("Consultar"));
        botoes.add(editar = new JButton("Editar"));
        botoes.add(apagar = new JButton("Apagar"));
        botoes.add(gravar = new JButton("Gravar"));
        botoes.add(ler = new JButton("Ler"));
        add(botoes);
        JScrollPane jSPane = new JScrollPane();
        add(jSPane);
        jTable = new JTable();
        jTable.setModel(new DefaultTableModel(new Object[][]{},
                new String[]{"Marca", "Modelo", "Ano", "Cor", "Valor"}));
        jSPane.setViewportView(jTable);

        //Handlers
        HandlerCadastrar handler1 = new HandlerCadastrar();
        cadastrar.addActionListener(handler1);

        HandlerCancelar handler2 = new HandlerCancelar();
        cancelar.addActionListener(handler2);

        HandlerApagar handler3 = new HandlerApagar();
        apagar.addActionListener(handler3);

        HandlerConsultar handler4 = new HandlerConsultar();
        consultar.addActionListener(handler4);

        HandlerEditar handler5 = new HandlerEditar();
        editar.addActionListener(handler5);

        HandlerGravar handler6 = new HandlerGravar();
        gravar.addActionListener(handler6);

        HandlerLer handler7 = new HandlerLer();
        gravar.addActionListener(handler7);

    }

    //add linhas do arrayList ao jTable
    public void atualizarTabela() {
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        model.setNumRows(0);
        Object linha[] = new Object[5];
        for (int i = 0; i < listaCarros.size(); i++) {
            linha[0] = listaCarros.get(i).marca;
            linha[1] = listaCarros.get(i).modelo;
            linha[2] = listaCarros.get(i).ano;
            linha[3] = listaCarros.get(i).cor;
            linha[4] = listaCarros.get(i).valor;
            model.addRow(linha);

        }
    }

    public class HandlerCadastrar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            Carros c = new Carros(carMarcaField.getText(), carModeloField.getText(), carAnoField.getText(), carCorField.getText(), carValorField.getText());
            listaCarros.add(c);
            JOptionPane.showMessageDialog(null, "Veículo Registrado", "Informação", JOptionPane.INFORMATION_MESSAGE);
            carMarcaField.setText("");
            carModeloField.setText("");
            carAnoField.setText("");
            carCorField.setText("");
            carValorField.setText("");
            atualizarTabela();

        }
    }

    public class HandlerCancelar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            carMarcaField.setText("");
            carModeloField.setText("");
            carAnoField.setText("");
            carCorField.setText("");
            carValorField.setText("");

        }
    }

    public class HandlerApagar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            //int i = Integer.parseInt(JOptionPane.showInputDialog("Confirme a posição do Carro na Tabela que deseja Apagar"));
            //i--;
            int i = jTable.getSelectedRow();

            listaCarros.remove(i);
            carMarcaField.setText("");
            carModeloField.setText("");
            carAnoField.setText("");
            carCorField.setText("");
            carValorField.setText("");
            JOptionPane.showMessageDialog(null, "Exclusão Realizado com Sucesso", "Informação",JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();

        }
    }

    public class HandlerConsultar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            int i = Integer.parseInt(JOptionPane.showInputDialog("A posição do carro na Tabela"));
            i--;

            //int i = jTable.getSelectedRow();
            carMarcaField.setText(listaCarros.get(i).marca);
            carModeloField.setText(listaCarros.get(i).modelo);
            carAnoField.setText(listaCarros.get(i).ano);
            carCorField.setText(listaCarros.get(i).cor);
            carValorField.setText(listaCarros.get(i).valor);

        }
    }

    public class HandlerEditar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {

            int i = Integer.parseInt(JOptionPane.showInputDialog("Confirme a posição do Carro na Tabela que deseja Editar"));
            i--;

            //int i = jTable.getSelectedRow();
            listaCarros.remove(i);
            Carros c = new Carros(carMarcaField.getText(), carModeloField.getText(), carAnoField.getText(), carCorField.getText(), carValorField.getText());
            listaCarros.add(i, c);
            carMarcaField.setText("");
            carModeloField.setText("");
            carAnoField.setText("");
            carCorField.setText("");
            carValorField.setText("");
            JOptionPane.showMessageDialog(null, "Edição Realizado com Sucesso", "Informação", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();

        }
    }

    public class HandlerGravar implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
               Empacotamento.gravarArquivoBinario(listaCarros, "dados.dat");
        }

    }

    public class HandlerLer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evento) {
             Empacotamento.lerArquivoBinario("dados.dat");
        }
    }

}
