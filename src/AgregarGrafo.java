/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* AgregarGrafo.java
* Autor: Alejandro Gomez
* Fecha de creacion: 28-05-21
* Ultima edicion: 28-05-21
********************************************************/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgregarGrafo {
    public static ArrayList<Integer> AddGraph(ArrayList<ArrayList<String>> ArrayObjetos){
        Vista V = new Vista();
        //Se definen los arrays a implementar
        ArrayList<Integer> Array_Length = new ArrayList<>();
        ArrayList<String> Start_Of_Array = new ArrayList<>(); 
        ArrayList<String> End_Of_Array = new ArrayList<>();  
        ArrayList<String> General_Array = new ArrayList<>();

        //Se define variable a implementar
        boolean TurnOn;

        for (ArrayList<String> data: ArrayObjetos){
            Array_Length.add(Integer.parseInt(data.get(2)));
            Start_Of_Array.add(data.get(0));
            if(!General_Array.contains(data.get(0))){
                General_Array.add(data.get(0));
            }
            if(!General_Array.contains(data.get(1))){
                General_Array.add(data.get(1));
            }
            End_Of_Array.add(data.get(1));
        }
  

        ArrayList<Integer> Array_Values = new ArrayList<>();
    
        for(int i=0;i<General_Array.size();i++){
            for(int j=0;j<General_Array.size();j++){TurnOn = true;
                for(int x=0;x<Start_Of_Array.size();x++){  

                    if(Start_Of_Array.size()>0 && End_Of_Array.size()>0 && Array_Length.size()>0){
                        if(General_Array.get(i).equals(Start_Of_Array.get(x)) && General_Array.get(j).equals(End_Of_Array.get(x))){
                            Array_Values.add(Array_Length.get(x));
                            TurnOn=false;
                        }
                    }else{
                        Array_Values.add(0);
                    }
                }
                if(TurnOn){Array_Values.add(0);}
            }
        }

        ArrayList<Integer> Copy_Of_Array_Values = new ArrayList<>();
        Copy_Of_Array_Values = (ArrayList<Integer>)Array_Values.clone();
        Cities=General_Array;
        GraphSearch(Array_Values,General_Array);
        return Copy_Of_Array_Values;
    }
    

    public static void GraphSearch(ArrayList<Integer> valores,ArrayList<String> General ){
        

        int INFINITY = 999;
        int adjacency_matrix[][];
        int numberofvertices;
 
        numberofvertices = General.size();
        System.out.println(General.size());
        
        adjacency_matrix = new int[numberofvertices + 1][numberofvertices + 1];
        
        for (int source = 1; source <= numberofvertices; source++)
        {
            for (int destination = 1; destination <= numberofvertices; destination++)
            {
                adjacency_matrix[source][destination] = valores.get(0);
                valores.remove(0);
                if (source == destination)
                {
                    adjacency_matrix[source][destination] = 0;
                    continue;
                }
                if (adjacency_matrix[source][destination] == 0)
                {
                    adjacency_matrix[source][destination] = INFINITY;
                }
            }
        }
        int i=1;
        V.Distancia();
        V.LineasSeparacion();
        for(String data : General){
            System.out.println(data + "->" + i);
            i++;
        }
        V.LineasSeparacion();
        AlgoritmoFloyd FloydWarshall_Algoritmo = new AlgoritmoFloyd(numberofvertices);
        datas=FloydWarshall_Algoritmo.floydwarshall(adjacency_matrix);

        
        
    }

}
