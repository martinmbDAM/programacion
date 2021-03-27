
package martin.matobuat06;

public class Circulo {
    
    // El atributo 'radio' puede ser privado porque los métodos 'setRadio()' y
    // 'getRadio()' permiten acceder a él:
    private float radio;
    static final float PI = 3.141592f;
    
    // Constructor sin argumentos:
    Circulo (){}
    
    // Constructor con un argumento:
    Circulo(float r){
        this.radio = r;
    }
    
    // Métodos de la clase Círculo:
    
    void setRadio(float r){
        this.radio = r;
    }
    
    float getRadio(){
        return(this.radio);
    }
    
    float calcularCircunferencia(){
        return(2*PI*radio);
    }
    
    float calcularSuperficie(){
        return(PI*radio*radio);
    }
    
    float calcularDiametro(){
        return(2*radio);
    }
    
}