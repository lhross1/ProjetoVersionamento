/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo1;

/**
 *
 * @author Aluno
 */
import java.util.ArrayList;

public class Exemplo2 {
    
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
