import java.util.Scanner;

public class Menu {
    
    public void menusito(){
        //Se define el Scan
        Scanner s = new Scanner(System.in);
        Vista V = new Vista();

        //Se definen variables para cada uno de las posiciones
        int Primera_Posicion=0; int Segunda_Posicion=0;
        //Condicion Booleana para salir del Menu
        boolean Salir_Menu=true;
            
            V.Welcome();
            V.LineasSeparacion();
            int OpcionMenu = V.MenuOp();
     
            if(OpcionMenu==1){
                V.Ciudad1();
                String First_City = s.nextLine();
                V.Ciudad2();
                String Second_City = s.nextLine();

                for(int ciclo=0;ciclo<ciudades.size();ciclo++){
                    if(ciudades.get(ciclo).toUpperCase().equals(First_City.toUpperCase())){
                        Primera_Posicion=ciclo+1;
                    }
                    if(ciudades.get(ciclo).toUpperCase().equals(Second_City.toUpperCase())){
                        Segunda_Posicion=ciclo+1;
                    }
                }
                V.LineasSeparacion();
                System.out.println(First_City + "->" + Second_City + " = " + datas[Primera_Posicion][Segunda_Posicion]);
                V.LineasSeparacion();

            }else if(OpcionMenu==2){ Salir_Menu=false;V.MensajeSalida(); }
    
    }
    
}
