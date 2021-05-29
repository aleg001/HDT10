/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructuras de Datos
* Profesor: Moises Gonzales
* Vista.java
* Autor: Alejandro Gomez
* Fecha de creacion: 28-05-21
* Ultima edicion: 28-05-21
********************************************************/

/**
 * Metodos de Vista
 * @author Alejandro Gomez
 * */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;


public class Vista {
    Scanner scan;

    /**
     * Metodo constructor
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/

    public Vista(){
        scan = new Scanner(System.in);
    }

    /**
     * Metodo de opciones
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/

    public int MenuOp(){
        int op = 2;
        String ops = "";
        boolean validar = true;
        System.out.println("\n1. Usar traductor");
        System.out.println("2. Salir\n");
        while(validar == true){
            System.out.println("Ingrese su opcion:  ");
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else {}
        } return op;
        

    /**
     * Metodo de OperationalResultInString
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    }
    public void OperationalResultInString(String x){
        System.out.println(x);
    }

    /**
     * Metodo de Bienvenida
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public void Welcome(){
        System.out.println("\nBienvenido a Duolingo");
        System.out.println("Actualmente contamos con: Ingles/Espanol/Frances");
        System.out.println("En el futuro... Portugues");
    }

    /**
     * Opciones
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public int Options(){
        int op = 3;
        String ops = "";
        boolean validar = true;
        System.out.println("\nCual lenguaje desea utilizar?");
        System.out.println("1. Ingles");
        System.out.println("2. Espanol");
        System.out.println("3. Frances\n");
        System.out.println("4. Salir\n");
        while(validar == true){
            System.out.println("Ingrese su opcion:  ");
            ops = scan.next();
            op = validarNum(ops);
            if(op != -1){
                validar = false;
            } else {}
        } return op;
    }


    /**
     * Error
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/

    public void Error(){
        System.out.println("ERROR: ");
        System.out.println("Ingreso erroneo, intente de nuevo.");
    }

    /**
     * FileInput
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/
    public void FileInput(){
        System.out.println("Ingrese el nombre del archivo que desea leer");
        System.out.println("Tip: No escriba la extension .txt");
    }

    /**
     * FileOption
     * @param n/a
     * @author Alejandro Gomez
     * @return n/a
     **/

    public void FileOption(){
        System.out.println("Que desea hacer?");
        System.out.println("1. Abrir otro archivo");
        System.out.println("2. Salir\n");
        System.out.println("Ingrese su opcion:  ");
    }

  

    public int validarNum (String rawNumero) {
        int numInt = -1;
        try {
            numInt = Integer.parseInt(rawNumero);
        }
        catch (NumberFormatException e)
        {
           System.out.println( "\nIngrese un numero valido porfa." );
        }
        
        return numInt;
      }

      
    public void MensajeSalida(){
        System.out.println("Gracias por usar nuestro supermercado!");
        System.out.println("Autor:");
        System.out.println("Alejandro Gomez");
    }

    public void LectorArchivo(String name){
        System.out.println("Leyendo el archivo... "+name+".txt");
    }

    public void ReadArchivo(){
        int Num = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("ListadoProducto.txt"));
            while (reader.readLine() != null) {
                Num++;
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
            
    }

}


public void FileName(){
    System.out.println("\nDICCIONARIO A UTILIZAR\n");
    System.out.println("Ingrese el nombre del archivo que desea leer (.txt) soalmente");
    System.out.println("Tip: Ingrese diccionario.txt jeje");
}

public void Palabras(String Palabrajeje){
    System.out.println("El texto a analizar corresponde a: " + Palabrajeje);
}

public void OrdenarDic(){
    System.out.println("\n\nA continuacion se muestra el diccionario en orden (original)\n");
}

public void FileName1(){
    System.out.println(" \nTEXTO A TRADUCIR\n");
    System.out.println("Ingrese el nombre del archivo que desea leer (.txt) soalmente");
    System.out.println("Tip: Ingrese traduccion.txt jeje");
}

public String Archivo(){
    return scan.next();
}

public void Lineas(){
    System.out.println("RESULTADOS DE TRADUCCION");
    System.out.println("--------------------------------------------------------");
    
}

public void Impresion(String XD){
    System.out.println(XD);
}


    public void Despedida() {
    System.out.println("Gracias por usar el diccionario. Feliz dia. \n Creado por: Alejandro Gomez");
    }

    public void Iniciando()
    {
        System.out.println("Iniciando diccionario... paciencia :o");
    }
}

