/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* AlgoritmoFloyd.java
* Autor: Alejandro Gomez
* Fecha de creacion: 28-05-21
* Ultima edicion: 30-05-21
* Obtenido de: https://www.sanfoundry.com/java-program-implement-floyd-warshall-algorithm/
********************************************************/


public class AlgoritmoFloyd {
        
        private int distancematrix[][];
        private int numberofvertices;
        public static final int INFINITY = 999;
     
        public AlgoritmoFloyd(int numberofvertices)
        {
            distancematrix = new int[numberofvertices + 1][numberofvertices + 1];
            this.numberofvertices = numberofvertices;
        }
     
        
        /** 
         * @param adjacencymatrix[][]
         */
        public int[][] floydwarshall(int adjacencymatrix[][])
        {
            for (int source = 1; source <= numberofvertices; source++)
            {
                for (int destination = 1; destination <= numberofvertices; destination++)
                {
                    distancematrix[source][destination] = adjacencymatrix[source][destination];
                }
            }
     
            for (int intermediate = 1; intermediate <= numberofvertices; intermediate++)
            {
                for (int source = 1; source <= numberofvertices; source++)
                {
                    for (int destination = 1; destination <= numberofvertices; destination++)
                    {
                        if (distancematrix[source][intermediate] + distancematrix[intermediate][destination]
                             < distancematrix[source][destination])
                            distancematrix[source][destination] = distancematrix[source][intermediate] 
                                + distancematrix[intermediate][destination];
                    }
                }
            }
     
            for (int source = 1; source <= numberofvertices; source++)
                System.out.print("\t" + source);
     
            System.out.println();
            for (int source = 1; source <= numberofvertices; source++)
            {
                System.out.print(source + "\t");
                for (int destination = 1; destination <= numberofvertices; destination++)
                {
                    System.out.print(distancematrix[source][destination] + "\t");
                }
                System.out.println();
            }
            return distancematrix;
        }
    
    }
    

