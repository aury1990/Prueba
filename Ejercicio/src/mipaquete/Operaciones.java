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
     * @deprecated SMI no es utilizado en ning�n m�todo de la clase.
     * @serial a entero, para almacenar un n�mero a calcular
     * @serial b entero, para almacenar otro n�mero a calcular
     * @since 13/03/2016
     */
    static final double SMI = 5322.234;
    private int a;
    private int b;
    
    /**
     * Constructor que inicializa los valores a 0.
     * @deprecated No se recomienda su uso porque no hay m�todos para modificar los atributos despu�s, y siempre operar� con "0".
     * @see #Operaciones(int, int)
     */
    public Operaciones() {
        a = 0;
        b = 0;
    }

    /**
     * Constructor por defecto.
     * @param a entero, almacena el par�metro a en el atributo a
     * @param b entero, almacena el par�metro b en el atributo b
     */
    public Operaciones(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**
     * M�todo que suma los valores a y b
     * @return devuelve el resultado de la suma
     * @serial resultado, almacena el c�lculo
     */
    public int calculaSuma(){
        int resultado = a + b;
        return resultado;
    }

    /**
     * M�todo que resta los valores a y b
     * @return devuelve el resultado de la resta
     * @serial resultado, almacena el c�lculo
     */
    public int calculaResta(){
        int resultado = a - b;
        return resultado;
    }

    /**
     * M�todo que multiplica a , b y un par�metro.
     * @param parametro multiplicar� a 'a' y 'b'
     * @serial resultado, almacena el c�lculo
     * @return devuelve el resultado de la multiplicaci�n
     */
    public int  multiplicaNumero (int parametro){
        int resultado = a * b * parametro;
        return resultado;
    }

}


	


