package com.senai.lojavendasonline;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Classe principal que representa o sistema de cadastro de produtos.
 * Ela permite a criação de produtos do tipo Eletrônico ou Roupa,
 * calculando seus preços com e sem desconto.
 */

public class LojaVendasOnline {
    
    /**
     * Método principal que controla o fluxo do programa.
     * Ele solicita ao usuário informações sobre os produtos e os exibe.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */

    public static void main(String[] args) {

        
        /**
         * @param scanner Objeto da classe Scanner para entrada de dados.
         * Método Scanner(System.in):
         * Feito para inserção de dados via terminal;
         * Faz sua busca através de Tokens;
         * Pode ser instanciado e possui métodos:
         * Ex: Scanner.nextLine() ou Scanner.nextInt();
         */
            
            Scanner sc = new Scanner(System.in);
            List <Produto> produtos = new ArrayList<>();
            
        /**
         * List é uma colection ordenada do tipo lista;
         * O ArrayList pode conter somente objetos e não primitivos;
         * Pode ser instanciado e possui métodos;
         * Ex: add(), get(), remove(), indexof();
         */
            
            try {
                System.out.println("Quantos produtos você deseja cadastrar?");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                for(int i = 0; i < quantidade; i++){
                    int tipo = obterTipoDeProduto(sc);
                    sc.nextLine();
                
                    System.out.println("Digite o nome do Produto: ");
                    String nome = sc.nextLine();

                    System.out.println("Digite o preço do Produto: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                
                    
                        /**
                        * Switch executa uma sentença a partir de um valor;
                        * Pode usar break;
                        */
                    
                        switch(tipo){
                            case 1:
                                    System.out.println("Digite a marca: ");
                                    String marca = sc.nextLine();
                                    produtos.add(new Eletronicos (nome,marca, preco));
                                    break;
                            case 2:
                                    System.out.println("Digite o tamanho: ");
                                    String tamanho = sc.nextLine();
                                    produtos.add(new Roupas (nome, tamanho, preco));
                                    break;
                            default:
                                    throw new IllegalArgumentException("Tipo de produto inválido!");
                        }
                   }
                
            
                for (Produto produto : produtos) {
                System.out.println(produto.getInformacoes());
                System.out.println("Preço com desconto (10%): R$" + produto.calcularComDesconto());
                System.out.println("Preço com desconto personalizado (20%): R$ " + produto.calcularComDesconto(0.20));
                System.out.println();
                }
            } catch (InputMismatchException e) {
            System.err.println("Erro: Entrada inválida. Por favor, insira valores corretos.");
            } catch (IllegalArgumentException e) {
                System.err.println("Erro: " + e.getMessage());
            } finally {
                sc.close();

            }
        
        }
    
     /**
     * Obtém o tipo de produto inserido pelo usuário, garantindo que seja um valor válido.
     * Se o valor inserido for inválido, será lançada uma exceção.
     *
     * @param scanner Objeto da classe Scanner para entrada de dados.
     * @return O tipo de produto (1 para Eletrônico, 2 para Roupa).
     */
        private static int obterTipoDeProduto(Scanner sc){
            int tipo;
            while(true){
                try{
                    System.out.println("Digite o tipo de produto (1 para Eletrônico, 2 para Roupa): ");
                    tipo = sc.nextInt();
                    //sc.nextLine();
                    
                    if(tipo !=1 && tipo != 2){
                        throw new IllegalArgumentException("Tipo de produto deve ser 1 (eletrônico) ou 2 (Roupa). ");
                    }
                    break;
                } catch(InputMismatchException e){
                    System.err.println("Erro: Por favor insira um numero inteiro válido. ");
                    //sc.nextLine();
                } catch (IllegalArgumentException e){
                    System.err.println("Erro: " + e.getMessage());
                }
            }
            return tipo;
        }
        
    /**
     * @InputMismatchException é uma excessão que é lançada (throw) por que a entrada não pode ser analisada como o tipo esperado.
     * @IllegalArgumentException é uma excessão que é lançada (throw) por que foi passado um argumento ilegal ou inapropriado.
     * @IllegalStateException é uma excessão que é lançada (throw) quando o fluxo tenta ser acessado depois de ter sido fechado.
     * @NullPointerException é uma excessão que é lançada (throw) quando uma aplicação tenta usar null em um caso que o objeto é necessário;
     */
}
    /**
     * Garbage Collector é um coletor de lixo, que serve para liberar a memória dos objetos que não tem mais referencia;
     */