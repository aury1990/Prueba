package mipaquete;


/**
 * 
 * @author Laura Calvo   
 * @version 13/03/2016
 * @since 1.0
 * 
 */

public class Operaciones {
	
    /**
     * Variables de instancia, atributos o campos
     * @deprecated SMI no es utilizado en ningún método de la clase.
     * @serial a entero, para almacenar un número a calcular
     * @serial b entero, para almacenar otro número a calcular
     * @since 13/03/2016
     */
    static final double SMI = 5322.234;
    private int a;
    private int b;
    
    /**
     * Constructor que inicializa los valores a 0.
     * @deprecated No se recomienda su uso porque no hay métodos para modificar los atributos después, y siempre operará con "0".
     * @see #Operaciones(int, int)
     */
    public Operaciones() {
        a = 0;
        b = 0;
    }

    /**
     * Constructor por defecto.
     * @param a entero, almacena el parámetro a en el atributo a
     * @param b entero, almacena el parámetro b en el atributo b
     */
    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Método que suma los valores a y b
     * @return devuelve el resultado de la suma
     * @serial resultado, almacena el cálculo
     */
    public int calculaSuma(){
        int resultado = a + b;
        return resultado;
    }

    /**
     * Método que resta los valores a y b
     * @return devuelve el resultado de la resta
     * @serial resultado, almacena el cálculo
     */
    public int calculaResta(){
        int resultado = a - b;
        return resultado;
    }

    /**
     * Método que multiplica a , b y un parámetro.
     * @param parametro multiplicará a 'a' y 'b'
     * @serial resultado, almacena el cálculo
     * @return devuelve el resultado de la multiplicación
     */
    public int  multiplicaNumero (int parametro){
        int resultado = a * b * parametro;
        return resultado;
    }

}


	


