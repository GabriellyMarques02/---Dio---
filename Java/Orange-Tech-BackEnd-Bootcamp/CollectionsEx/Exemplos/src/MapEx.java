/* Dado os modelos dos carros e seus respectivos consumos na estrada, faça:
 * modelo = gol - cosumo = 14,4km/l
 * modelo = uno - cosumo = 15,6km/l
 * modelo = mobi - cosumo = 16,1km/l
 * modelo = hb20 - cosumo = 14,5km/l
 * modelo = kwid - cosumo = 15,6km/l
 * 
 */
import java.util.Map;
import java.util.Collections;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Set;

public class MapEx {
    public static void main(String[] args){
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("Kwid", 15.6);
        }};

        System.out.println(carrosPopulares.toString());

        System.out.println("Substitua o consumo do gol por 15,2km/l: ");
        carrosPopulares.put("gol",15.2);
        System.out.println(carrosPopulares.toString());
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos dos carros: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais ecoonomico e seu consumo: ");
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = ""; //variavel de controle

        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(consumoMaisEficiente))
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente );
        }

        
        
      





















    }
}
