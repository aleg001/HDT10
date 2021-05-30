/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Controlador.java
* Autor: Alejandro Gomez
* Fecha de creacion: 28-05-21
* Ultima edicion: 28-05-21
********************************************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controlador {
    
     Controlador() { 
    //Instancia de Vista
    Vista V = new Vista();

    //Instancia del menu
    Menu M = new Menu();
   
    //Instancia de AgregarGrafo:
    AgregarGrafo AG = new AgregarGrafo();

    //Se define el arraylist a utilizar
    ArrayList<ArrayList<String>> ArrayObjetos = new ArrayList<>();

    //Se define el scanner para leer el archivo de texto
    Scanner s = new Scanner(System.in);

    //Ciclo TryCatch para leer el archivo
    try{

        //Se define el file a utilizar, en esta caso el de guategrafo
        File GuateGrafo = new File("guategrafo.txt");
        Scanner l = new Scanner(GuateGrafo);
        while(l.hasNextLine()){
            String Datos = l.nextLine();
            String[] sDatos = Datos.split(" ");
                ArrayList<String> d = new ArrayList<>();
                for(int i = 0; i<sDatos.length;i++){
                    d.add(sDatos[i]);
                }
                ArrayObjetos.add(d);
        }

    } catch(FileNotFoundException e){ 
        System.out.println("Archivo no encontrado");
    }
    AgregarGrafo.AddGraph(ArrayObjetos);
    V.LineasSeparacion();
    M.menusito();
}
}


