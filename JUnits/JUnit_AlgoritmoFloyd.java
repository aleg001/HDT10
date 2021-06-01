import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import org.junit.Test;


public class JUnit_AlgoritmoFloyd {

    @Test
    public void agregarDatosAlGrafo(){
        ArrayList<String> City1Array = new ArrayList<>();
        ArrayList<String> City2Array = new ArrayList<>();
        ArrayList<String> DistanceBetweenCities = new ArrayList<>();
        ArrayList<String> GeneralArray = new ArrayList<>();
        ArrayList<ArrayList<String>> Array_ArrayObjetos = new ArrayList<>();
      
        City1Array.add("Guatemala");
        City1Array.add("Mixco");
        City1Array.add("3");
        Array_ArrayObjetos.add(City1Array);
     
        City2Array.add("Guatemala");
        City2Array.add("Chiquimula");
        City2Array.add("2");
        Array_ArrayObjetos.add(City2Array);
      
        DistanceBetweenCities.add("Mixco");
        DistanceBetweenCities.add("Guatemala");
        DistanceBetweenCities.add("2");
        Array_ArrayObjetos.add(DistanceBetweenCities);
  
        GeneralArray.add("Chiquimula");
        GeneralArray.add("Guate");
        GeneralArray.add("3");
        Array_ArrayObjetos.add(GeneralArray);
  
        ArrayList<Integer> Result_Array = new ArrayList<>();
        Result_Array.add(0);
        Result_Array.add(8);
        Result_Array.add(5);
        Result_Array.add(3);
        Result_Array.add(0);
        Result_Array.add(0);
        Result_Array.add(0);
        Result_Array.add(2);
        Result_Array.add(0);
        ArrayList<Integer> datos =Main.addgrafo(Array_ArrayObjetos);
        assertEquals(Result_Array, datos);
    }
}

}
