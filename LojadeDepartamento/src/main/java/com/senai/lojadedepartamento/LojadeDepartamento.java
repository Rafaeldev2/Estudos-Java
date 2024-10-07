package com.senai.lojadedepartamento;

public class LojadeDepartamento {

    public static void main(String[] args) {
        
        
//Os objetos (instâncias de classe) possuem estruturas de dados individuais, cada um
//guardando seus dados de forma independente dos outros.
        
        Filial f = new Filial("dois irmaos", "sem fim", "coqueiros", "kiev", "kansas");
        ManterClienteEmFilial g = new ManterClienteEmFilial(f);
        g.addCliente("Rafael", 5, 6, 1990, "481234-5678", "Rua do porre", "perdizes", "mahakesh", "kansas");
        g.addCliente("Orlando", 15, 12, 1999, "481234-5678", "Rua do morro", "coqueiros", "mahakesh", "patagonia");
        g.addCliente("nei", 25, 12, 1915, "481234-5678", "Rua do porre", "perdizes", "mahakesh", "borgonha");
        for(Cliente c: g.listEstado()){
            System.out.println(c.getNome());
        }
        for(Cliente c: g.listBairro()){
            System.out.println(c.getNome());
        }
        for(Cliente c: g.listMais60()){
            System.out.println(c.getNome());
        }
    }
}
