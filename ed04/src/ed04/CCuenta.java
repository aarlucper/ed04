
package ed04;

/**
 * Clase que representa una cuenta bancaria
 * @author Aarón Lucas Pérez
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros.
     */
    public CCuenta()
    {
    }
    
    /**
     * Constructor con parámetros.
     * @param nom Nombre del propietario de la cuenta
     * @param cue Identificador de la cuenta
     * @param sal Saldo actual de la cuenta
     * @param tipo Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    /**
     * Asigna un nombre como propietario de la cuenta.
     * @param nom nombre del propietario de la cuenta
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
    
    /**
     * Obtiene el nombre del propietario de la cuenta
     * @return el nombre del propietario de la cuenta
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * Obtiene el saldo actual de la cuenta
     * @return el saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad indicada, aumentando el saldo de la cuenta
     * @param cantidad cantidad a ingresar en la cuenta
     * @throws Exception Devuelve Exception si se intenta ingresar una cantidad negativa,
     * muestra mensaje de error.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Retira una cantidad indicada, disminuyendo el saldo de la cuenta
     * @param cantidad la cantidad a retirar de la cuenta
     * @throws Exception Devuelve Exception si se intenta ingresar una cantidad negativa
     * o si el saldo disponible es inferior a la cantidad especificada.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Obtiene el identificador de la cuenta
     * @return el String identificador de la cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }

    /**
     * Getter: Devuelve el parámetro nombre
     * @return el nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter: Establece el parámetro nombre
     * @param nombre nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter: Devuelve el parámetro cuenta
     * @return el identificador de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Setter: Establece el parámetro cuenta
     * @param cuenta identificador de la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Getter: Devuelve el parámetro saldo
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Setter: Establece el parámetro saldo
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Getter: Devuelve el parámetro tipoInterés
     * @return el tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Setter: Establece el parámetro tipoInterés
     * @param tipoInterés tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    
    
}
