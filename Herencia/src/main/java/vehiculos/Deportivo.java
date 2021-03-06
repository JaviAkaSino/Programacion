package vehiculos;

/**
 *
 * @author javiakasino
 */
public class Deportivo extends Vehiculo {

    private int cilindrada;

    public Deportivo(int cilindrada, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa) {
        super(bastidor, matricula, marca, modelo, color, tarifa);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    
    
    @Override
    public String getAtributos() {
        return super.getAtributos() + "cilindrada=" + cilindrada + '}';
    }

}
