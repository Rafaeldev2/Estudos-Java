package com.senai.lojadedepartamento;

import java.util.ArrayList;

public class Filial {
    private String nome;
    private Endereco endereco;
    private ArrayList<Cliente> clientes;

    public Filial(String nome, String rua, String bairro, String cidade, String estado) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
        this.endereco = new Endereco(rua, bairro, cidade, estado);
    }
    
    public ArrayList<Cliente> listClienteBairro(){
        ArrayList<Cliente> lista = new ArrayList<>();
        for(Cliente c: clientes){
            if(c.getBairro().equalsIgnoreCase(endereco.getBairro())){
                lista.add(c);
                
//                Caso c.getBairro seja igual a endereco.getBairro ele vai adicionar no ArrayList, senão retorna o array vazio.
            }
        }
        return lista;
    }
    public ArrayList<Cliente> listClienteMais60(){
        ArrayList<Cliente> lista = new ArrayList<>();
        for(Cliente c: clientes){
            if(c.getIdade() > 60){
                lista.add(c);
                
//                Caso a idade seja maior que 60 anos, ele adiciona no ArrayList, senão retorna o array vazio.
            }
        }
        return lista;
    }
    public ArrayList<Cliente> listClienteEstado(){
        ArrayList<Cliente> lista = new ArrayList<>();
        for(Cliente c: clientes){
            if(c.getEstado().equalsIgnoreCase(endereco.getEstado())){
                lista.add(c);
                
//               Caso c.getEstado seja igual a endereco.getEstado ele vai adicionar no ArrayList, senão retorna o array vazio.
            }
        }
        return lista;
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
}
