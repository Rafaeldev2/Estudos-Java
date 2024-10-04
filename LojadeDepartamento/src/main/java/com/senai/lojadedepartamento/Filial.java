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
            }
        }
        return lista;
    }
    public ArrayList<Cliente> listClienteMais60(){
        ArrayList<Cliente> lista = new ArrayList<>();
        for(Cliente c: clientes){
            if(c.getIdade() > 60){
                lista.add(c);
            }
        }
        return lista;
    }
    public ArrayList<Cliente> listClienteEstado(){
        ArrayList<Cliente> lista = new ArrayList<>();
        for(Cliente c: clientes){
            if(c.getEstado().equalsIgnoreCase(endereco.getEstado())){
                lista.add(c);
            }
        }
        return lista;
    }
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
}
