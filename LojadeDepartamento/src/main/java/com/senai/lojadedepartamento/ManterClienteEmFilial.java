package com.senai.lojadedepartamento;

import java.util.ArrayList;

public class ManterClienteEmFilial {
    private Filial filial;
    
    public ManterClienteEmFilial(Filial filial){
        this.filial = filial;
    }
    
    public void addCliente(String nome, int dia, int mes, int ano, String telefone, String rua, String bairro, String cidade, String estado){
        filial.addCliente(new Cliente(nome, dia, mes, ano, telefone, rua, bairro, cidade, estado));
    }
    
    public ArrayList<Cliente> listBairro(){
        return filial.listClienteBairro();
    }
    public ArrayList<Cliente> listEstado(){
        return filial.listClienteEstado();
    }
    public ArrayList<Cliente> listMais60(){
        return filial.listClienteMais60();
    }
    
}
