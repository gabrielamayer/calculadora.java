/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author gabrielamayer
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /**
         * Solicitação de valor para usuário
         */
        
        Scanner teclado = new Scanner(System.in); 
        double valor; 
            System.out.print("Insira o valor que você deseja investir no anúncio R$ "); 
            valor = teclado.nextDouble();
       
        /** 
         * Com o valor de investimento, começamos a construir o script
         */
            
        double valorInv = valor;
        
        /**
         * Com a declaração da variável valorInv, podemos criar novas variáveis
         * A cada real investido, 30 pessoas visualizam o anúncio
         * Estas visualizações geram 12% de cliques e destes cliques, 15%
         * retornam como compartilhamento
         */
       
        double visualizacoes = (valorInv * 30);
        double cliques = (visualizacoes * 0.12);
        double compartilhamentos = (cliques * 0.15);
        
        double visualizacoesTotais = visualizacoes;
        double compartilhamentosTotais = compartilhamentos;
        double cliquesTotais = cliques;
        
        /** 
         * Iniciamos o laço de repetição pois o anúncio pode ser compartilhado
         * até no máximo 4 vezes
         * Cada compartilhamento gera 40 novas visualizações que recebem as
         * mesmas porcentagens de cliques e compartilhamentos que o anúncio
         * originalmente publicado
         */
        
        for (int i = 0; i < 4; i++) {
            
            visualizacoes = compartilhamentos * 40;
            cliques = (visualizacoes * 0.12);
            compartilhamentos = (cliques * 0.15);

            compartilhamentosTotais += compartilhamentos;
            cliquesTotais += cliques;
            visualizacoesTotais += visualizacoes;
            
        }
        
        /**
         * Utilizando .round para arrendondar os valores, pois não existe 
         * 0.3 visualização ou 0.5 compartilhamento
         * Feito o comando de saída, o algoritmo está pronto para apresentar 
         * os resultados obtidos
         */
        
        System.out.println();
        System.out.println ("Investindo " + valor + " você obterá os seguintes retornos para este anúncio");
        System.out.println();
        System.out.println("O anúncio acumulará " + Math.round(visualizacoesTotais) + " visualizações");
        System.out.println("O total de cliques que o anúncio receberá será de "
                + Math.round(cliquesTotais));
        System.out.println("Destes cliques recebidos irão se originar " 
                + Math.round(compartilhamentosTotais) + " compartilhamentos.");
        
    }
    
}

