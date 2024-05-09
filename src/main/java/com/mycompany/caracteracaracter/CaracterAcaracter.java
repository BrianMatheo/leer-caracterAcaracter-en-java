package com.mycompany.caracteracaracter;

import java.io.FileReader;
import java.io.IOException;

public class CaracterAcaracter {

    public static void main(String[] args) throws IOException{
        String path = "./data.txt"; //lugar del archivo
        FileReader fileReader = null; //inicializar en nulo un lector de archivos
        try{
            fileReader = new FileReader(path); //creas un nuevo archivo
            int value = fileReader.read(); //inicializa un valor para poder utilizarlo y leer el archivo
            while(value != -1){
                System.out.print((char) value); //imprime lo que se encuentre en el cursor
                value = fileReader.read(); //mueve el cursor 1 caracter
            }
        }catch(IOException e){
            System.out.println("Ha ocurrido un error");
        } finally{
            if(fileReader!=null){
                fileReader.close();
            }
        }
    }
}
