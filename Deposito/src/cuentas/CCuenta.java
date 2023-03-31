package cuentas;

/** @author Jose Ignacio Gonzalez Tejedor
 *  @version 1.0
 *  @since 1.0
 */

public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
	/**
	 * Constructor de CCuenta sin parametros
	 */
    public CCuenta()
    {
    }
    
	/**
	 * Constructor que inicializa los parametros de clase de CCuenta
	 * @param nom Nombre de la Cuenta
	 * @param cue Cuenta
	 * @param sal Saldo de la Cuenta
	 * @param tipo Tipo de Interes de la Cuenta
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * @return the saldo
     */
    public double estado()
    {
        return getSaldo();
    }
    
	/**
	 * Implementa el ingreso de dinero en la cuenta
	 * @param cantidad Importe a ingresar
	 */
    public void ingresar(double cantidad) throws Exception
    {
        /** @exception Si cantidad es menor a 0
         * @throws Se lanza una expcepcion con el mensaje de que no se puede ingresar
         * una cantidad negativa
         */
    	
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
	/**
	 * Implementa la retirada de dinero de la cuenta
	 * @param cantidad Importe a retirar
	 */
    public void retirar(double cantidad) throws Exception
    {
        /** @exception Si cantidad es igual o menor a 0
         * @throws Se lanza una excepcion con el mensaje de que no se puede retirar
         * una cantidad negativa
         */
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        
        /** @exception Si estado es menor a cantidad
         * @throws Se lanza una excepcion con el mensaje de que no hay suficiente saldo
         */
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    
	/**
     * @return the nombre
     */
	private String getNombre() {
		return nombre;
	}
	
    /**
     * @param nombre the nombre to set
     */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	   
	/**
     * @return the cuenta
     */
	private String getCuenta() {
		return cuenta;
	}

    /**
     * @param cuenta the cuenta to set
     */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
    /**
     * @return the saldo
     */
	private double getSaldo() {
		return saldo;
	}
	
    /**
     * @param saldo the saldo to set
     */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
     * @return the tipoInterés
     */
	private double getTipoInteres() {
		return tipoInteres;
	}
    /**
     * @param tipoInteres the tipoInterés to set
     */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}

