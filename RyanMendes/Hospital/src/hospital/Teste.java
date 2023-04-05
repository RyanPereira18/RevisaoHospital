/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucyv
 */
public class Teste {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Paciente pac = new Paciente();
        Medico med = new Medico();
        Enfermeiro enf = new Enfermeiro();
        
        System.out.println("Insira o nome do paciente: ");
        pac.setNome(entrada.nextLine());
        System.out.println("Insira o nome do medico: ");
        med.setNome(entrada.next());
        System.out.println("Insira o nome do enfermeiro: ");
        enf.setNome(entrada.next());        
        
        Internacao internacao = new Internacao(pac, enf, med);
        
        System.out.println("Insira o Motivo da Internação: ");
        internacao.setMotivo(entrada.next());
        System.out.println("Insira o Custo por Dia: ");
        internacao.setValorDia(entrada.nextDouble());
        System.out.println("Insira a Quantidade de Dias: ");
        internacao.setDias(entrada.nextInt());
        
        List<Internacao> listaInternacao = new ArrayList<>();
        
        listaInternacao.add(internacao);
}
}