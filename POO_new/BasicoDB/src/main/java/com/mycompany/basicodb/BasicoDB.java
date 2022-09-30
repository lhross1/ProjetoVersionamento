/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.basicodb;

/**
 *
 * @author Aluno
 */
import java.io.*;
import java.sql.*;

public class BasicoDB {

    Connection db; // Conexão com o servidor de banco de dados
    Statement st; // Declaração para executar os comandos

    public void doexample() throws SQLException {
        System.out.println("\nExecutando os testes:");
// Criar a tabela que armazena os dados
        st.executeUpdate("create table tbl_basica (a int2, b int2)");
// Inserir alguns dados utilizando Statement
        st.executeUpdate("insert into tbl_basica values (1,1)");
        st.executeUpdate("insert into tbl_basica values (2,1)");
        st.executeUpdate("insert into tbl_basica values (3,1)");

        // Mostrar como obter o OID da linha recém inserida
        st.executeUpdate("insert into tbl_basica values (4,1)");
        //long insertedOID = ((org.postgresql.PGStatement) st).getLastOID();
        //System.out.println("Linha inserida com o OID " + insertedOID);
        // Mudar o valor da coluna b de 1 para 8
        st.executeUpdate("update tbl_basica set b = 8");
        System.out.println("Atualizadas " + st.getUpdateCount() + " linhas");

        // Excluir linhas
        st.executeUpdate("delete from tbl_basica where a<3");
        System.out.println("Excluídas " + st.getUpdateCount() + " linhas");

        PreparedStatement ps = db.prepareStatement("insert into tbl_basica values (?,?)");
        for (int i = 2; i < 5; i++) {
            ps.setInt(1, 4); // "coluna a" = 4
            ps.setInt(2, i); // "coluna b" = i
            ps.executeUpdate(); // porque o insert não retorna dados
        }
        ps.close(); // Sempre fechar ao terminar

        // Consultar a tabela
        System.out.println("Realizando uma consulta");
        ResultSet rs = st.executeQuery("select a, b from tbl_basica");
        if (rs != null) {
// Percorrer o conjunto de resultados mostrando os valores.
// É necessário chamar .next() antes de ler qualquer resultado.
            while (rs.next()) {
                int a = rs.getInt("a"); // Nome da coluna
                int b = rs.getInt(2); // Número da coluna
                System.out.println(" a=" + a + " b=" + b);
            }
            rs.close(); // é necessário fechar o resultado ao terminar
        }

        // Consultar a tabela novamente, mostrando uma forma mais
// eficiente de obter os resultados quando não se sabe o
// número da coluna do resultado.
        System.out.println("Realizando outra consulta");
        rs = st.executeQuery("select * from tbl_basica where b>1");
        if (rs != null) {
// Descobrir os números das colunas.
//
// É melhor ser feito neste ponto, porque os métodos chamados
// passando os nomes das colunas realizam internamente esta
// chamada toda toda vez que são chamados. Esta forma realmente
// melhora o desempenho em consultas grandes.
//
            int col_a = rs.findColumn("a");
            int col_b = rs.findColumn("b");
// Percorrer o conjunto de resultados mostrando os valores.
// É necessário chamar .next() antes de ler qualquer resultado.
            while (rs.next()) {
                int a = rs.getInt(col_a); // Número da coluna
                int b = rs.getInt(col_b); // Número da coluna
                System.out.println(" a=" + a + " b=" + b);
            }
            rs.close(); // é necessário fechar o resultado ao terminar.
        }

        // Testar 'maxrows' definindo-o como 3 linhas
        st.setMaxRows(3);
        System.out.println("Realizando uma consulta limitada a "
                + st.getMaxRows() + " linhas.");
        rs = st.executeQuery("select a, b from tbl_basica");
        while (rs.next()) {
            int a = rs.getInt("a"); // Obter o valor pelo nome da coluna
            int b = rs.getInt(2); // Obter o valor pelo número da coluna
            System.out.println(" a=" + a + " b=" + b);
        }
        rs.close(); // repetindo, é necessário fechar o resultado ao terminar.

    }

    public void go() throws ClassNotFoundException, FileNotFoundException,
            IOException, SQLException {
//Criar os Atributos para conexão
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String usr = "postgres";
        String pwd = "postgres";
// Conectar com o servidor de banco de dados
        System.out.println("Conectando ao banco de dados\nURL = " + url);
        db = DriverManager.getConnection(url, usr, pwd);
        System.out.println("Conectado...Criando a declaração");
        st = db.createStatement();
// Limpar o banco de dados (no caso de uma falha anterior) e inicializar
        cleanup();
// Executar os testes utilizando os métodos do JDBC
        doexample();
// Limpar o banco de dados
        //   cleanup();
// Fechar a conexão
        System.out.println("Fechando a conexão");
        st.close();
        db.close();
    }

    public void cleanup() {
        try {
            System.out.println("Limpando o BD");
            st.executeUpdate("drop table tbl_basica");
        } catch (Exception ex) {
// Ignorar todos os erros
        }
    }

    public static void main(String args[]) {

        System.out.println("PostgreSQL - Teste básico \n");
        try {
            BasicoDB objBasico = new BasicoDB();
            objBasico.go();
        } catch (Exception ex) {
            System.err.println("Exceção capturada.\n" + ex);
            ex.printStackTrace();
        }
    }

}
