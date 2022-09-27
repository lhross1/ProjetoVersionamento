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

public class Clientes extends JPanel {

    public Clientes(String id, String nome, String sobrenome, String idade, String cidade, String CEP, String documento) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cidade = cidade;
        this.CEP = CEP;
        this.documento = documento;
    }

    public JLabel idL;
    public JLabel nomeL;
    public JLabel sobrenomeL;
    public JLabel idadeL;
    public JLabel cidadeL;
    public JLabel CEPL;
    public JLabel documentoL;

    public JButton cadastrar;
    public JButton cancelar;

    public JTextField idT;
    public JTextField nomeT;
    public JTextField sobrenomeT;
    public JTextField idadeT;
    public JTextField cidadeT;
    public JTextField CEPT;
    public JTextField documentoT;

    private String id;
    private String nome;
    private String sobrenome;
    private String idade;
    private String cidade;
    private String CEP;
    private String documento;

    ArrayList<Clientes> listaClientes = new ArrayList<>();

    public Clientes() {

        idL = new JLabel("ID");
        nomeL = new JLabel("Nome");
        sobrenomeL = new JLabel("Sobrenome");
        idadeL = new JLabel("Idade");
        cidadeL = new JLabel("Cidade");
        CEPL = new JLabel("CEP");
        documentoL = new JLabel("Documento");

        idT = new JTextField();
        nomeT = new JTextField();
        sobrenomeT = new JTextField();
        idadeT = new JTextField();
        cidadeT = new JTextField();
        CEPT = new JTextField();
        documentoT = new JTextField();

        cadastrar = new JButton("Cadastrar");
        cancelar = new JButton("Cancelar");

        add(idL);
        add(idT);
        add(nomeL);
        add(nomeT);
        add(sobrenomeL);
        add(sobrenomeT);
        add(idadeL);
        add(idadeT);
        add(cidadeL);
        add(cidadeT);
        add(CEPL);
        add(CEPT);
        add(documentoL);
        add(documentoT);
        add(cadastrar);
        add(cancelar);

        setLayout(new GridLayout(8, 5));

        ButtonHandler handler = new ButtonHandler();
        cadastrar.addActionListener(handler);
        cancelar.addActionListener(handler);
       idT.addActionListener(handler);

    }

    public class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent evento) {

            if (evento.getSource() == cadastrar) {
                if (idT.getText()==null || nomeT.getSelectedText().equals("") || sobrenomeT.getText().equals("") || idadeT.getText().equals("")
                        || cidadeT.getText().equals("") || CEPT.getText().equals("") || documentoT.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos");}
                    Clientes c = new Clientes(idT.getText(), nomeT.getText(), sobrenomeT.getText(), idadeT.getText(), cidadeT.getText(), CEPT.getText(), documentoT.getText());
                    listaClientes.add(c);
                    JOptionPane.showMessageDialog(null, "Cliente Registrado");
                    idT.setText("");
                    nomeT.setText("");
                    sobrenomeT.setText("");
                    idadeT.setText("");
                    cidadeT.setText("");
                    CEPT.setText("");
                    documentoT.setText("");
                }
                 else if (evento.getSource() == cancelar) {
                idT.setText("");
                nomeT.setText("");
                sobrenomeT.setText("");
                idadeT.setText("");
                cidadeT.setText("");
                CEPT.setText("");
                documentoT.setText("");
            }
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public static void main(String[] args) {

    }

}
