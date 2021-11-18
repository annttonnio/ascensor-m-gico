public class Motor
{
    private boolean encendido;
    private int potenciaMotor;

    public Motor(boolean encender){
        encendido = encender;
        potenciaMotor = 6;
    }

    public void setPotencia(int potencia){
        potenciaMotor = potencia;
    }
    
    public int getPotenciaMotor(){
        return potenciaMotor;
    }
    
    public void setEstadoMotor(boolean motorEncendido){
        encendido = motorEncendido;
    }
    
    public boolean getEstadoMotot(){
        return encendido;
    }
}
