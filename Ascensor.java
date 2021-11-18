public class Ascensor
{
    private String marca;
    private int velocidad;
    private Motor motor;
    
    public Ascensor(String marcaAscensor, Motor nuevoMotor){
        marca = marcaAscensor;
        velocidad = 3;
        motor = nuevoMotor;
    }
}
