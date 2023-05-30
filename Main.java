import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) throws IOException {
        Gson gson = new Gson();
        ArrayList DatosExtra = new ArrayList<>();
        DatosExtra.add("Tracción trasera");
        DatosExtra.add("320 CV");
        DatosExtra.add("Motor gasolina");
        String json_original;
        ArrayList<Coche> ListaCoches = new ArrayList<>();
        ListaCoches.add(new Coche());
        ListaCoches.add(new Coche(3,"Audi", DatosExtra));
        ListaCoches.add(new Coche());

        System.out.println(ListaCoches);
        json_original = gson.toJson(ListaCoches, ArrayList.class);

        FileWriter file = new FileWriter("output.json");
        file.write(json_original);
        file.close();

        String json_recuperado = "";
        FileReader reader = new FileReader("output.json");
        int valor = reader.read();

        while(valor != -1){
            json_recuperado += (char) valor;
            valor = reader.read();
        }
        reader.close();

        Type tipoListaCoches = new TypeToken<ArrayList<Coche>>(){}.getType();
        ArrayList<Coche> cochesLeidos = gson.fromJson(json_recuperado,tipoListaCoches);
        System.out.println(json_recuperado);
        System.out.println(cochesLeidos.toString());

    }
}
