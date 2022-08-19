/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.registraautomoveis;

/**
 *
 * @author Aluno
 */
public class RegistraAutomoveis {

    public static void main(String[] args) {
       
        AutomotoveisDisponiveis camaro = new AutomotoveisDisponiveis();
        AutomotoveisDisponiveis chevette = new AutomotoveisDisponiveis();
        AutomotoveisDisponiveis hb20 = new AutomotoveisDisponiveis();
        
        camaro.setMarca("chevrolet");
        camaro.setModelo("camaro");
        camaro.setAno(2022);
        camaro.setCor("Vermelho");
        camaro.setCombustivel("Gasolina");
        camaro.setValor(400000);
        
        chevette.setMarca("chevrolet");
        chevette.setModelo("chevette");
        chevette.setAno(1980);
        chevette.setCor("marrom");
        chevette.setCombustivel("Gasolina");
        chevette.setValor(20000);
        
        hb20.setMarca("Hyundai");
        hb20.setModelo("hb20");
        hb20.setAno(2015);
        hb20.setCor("Prata");
        hb20.setCombustivel("Flex");
        hb20.setValor(60000);
        
          
        System.out.println(camaro.getModelo());
        System.out.println(camaro.getMarca());
        System.out.println(camaro.getAno());
        System.out.println(camaro.getCor());
        System.out.println(camaro.getCombustivel());
        System.out.println("R$ "+camaro.getValor());
        System.out.println();
        
        System.out.println(chevette.getModelo());
        System.out.println(chevette.getMarca());
        System.out.println(chevette.getAno());
        System.out.println(chevette.getCor());
        System.out.println(chevette.getCombustivel());
        System.out.println("R$ "+chevette.getValor());
        System.out.println();
        
        
        System.out.println(hb20.getModelo());
        System.out.println(hb20.getMarca());
        System.out.println(hb20.getAno());
        System.out.println(hb20.getCor());
        System.out.println(hb20.getCombustivel());
        System.out.println("R$ "+hb20.getValor());
        
        
        System.out.println("Contador: "+AutomotoveisDisponiveis.getQuantidadeAutomoveis());
    }
}
