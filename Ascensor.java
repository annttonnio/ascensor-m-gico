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
    
    public void setMarca(String marcaAscensor){
        marca = marcaAscensor;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setVelocidad(int velocidadAscensor){
        velocidad = velocidadAscensor;
    }
    public int getVelocidad(){
        return velocidad;
    }
    
    public void setMotor(Motor nuevoMotor){
        motor = nuevoMotor;
    }
    public Motor getMotor() {
        return motor;
    }
    
    public void imprimirDetalles(){
        System.out.println(" La marca del ascensor es "+marca+ ". "+"\n"+
            " La velocidad es de: "+velocidad+ " Km/h."+"\n"
            + " Estadisticas del motor: ");
        
        motor.imprimirDetalles();
    }
}