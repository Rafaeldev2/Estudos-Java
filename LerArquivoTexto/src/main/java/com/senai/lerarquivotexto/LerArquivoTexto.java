package com.senai.lerarquivotexto;

import java.io.FileInputStream;
import java.io.IOException;

public class LerArquivoTexto {

    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("C:\\Users\\rafael_t_moraes\\Documents\\NetBeansProjects\\GravarArquivoTexto\\output.bin")){
        
            int dado;
            while((dado = fis.read()) != -1){
                System.out.println(dado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
