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
    
    public void imprimirDetalles(){
        if(encendido == true){
            System.out.println(" El motor está encendido ");  
        }
        else{
            System.out.println(" El motor está apagado ");
        }
        System.out.println(" La velocidad del motor es: "+potenciaMotor+ " Kw.");
    }
}
