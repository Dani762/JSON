import java.util.ArrayList;

public class Coche {

    private int puertas;
    private String marca;
    private ArrayList<String> DatosExtra = new ArrayList<>();


    public Coche(){
        this.puertas = 5;
        this.marca = "Mercedes-Benz";
        this.DatosExtra.add("Tracción a las cuatro ruedas");
        this.DatosExtra.add("240 CV");
        this.DatosExtra.add("Motor híbrido");
    }
    public Coche(int puertas, String marca, ArrayList<String> DatosExtra){
        this.puertas = puertas;
        this.marca = marca;
        this.DatosExtra = DatosExtra;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<String> getDatosExtra() {
        return DatosExtra;
    }

    public void setDatosExtra(ArrayList<String> datosExtra) {
        DatosExtra = datosExtra;
    }

    public String toString(){
        StringBuilder info;
        info = new StringBuilder("Coche con " + puertas + " puertas, marca " + marca + ", con las siguientes características: ");
        for(String Datos : DatosExtra) {
            info.append(" ").append(Datos);
        }
        return info.toString();
    }
}
