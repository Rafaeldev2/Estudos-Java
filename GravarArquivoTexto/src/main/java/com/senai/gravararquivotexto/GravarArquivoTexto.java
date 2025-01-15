package com.senai.gravararquivotexto;

import java.io.FileOutputStream;
import java.io.IOException;


public class GravarArquivoTexto {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream ("output.bin")){
            fos.write(new byte[]{10, 20, 30});
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}