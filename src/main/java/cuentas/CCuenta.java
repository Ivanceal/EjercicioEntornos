package cuentas;

public class CCuenta {

    /**rtyr
     * @return el nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre establecer nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return la cuenta
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta cuenta a establecer
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return el saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo establece saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return el tipo de interes tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés Establece el tipo de interes
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
/**
 * Variables de la clase CCuenta
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
/**
 * Contructor vacio de CCuenta
 */
    public CCuenta()
    {
    }

    /**
     * Constructor con parametros
     * @param nom es el nombre
     * @param cue numero de cuenta
     * @param sal saldo inicial
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Metodo para retornar saldo
 * @return saldo
 */
    public double estado()
    {
        return getSaldo();
    }

 /**
  * Metodo para ingresar una cantidad
  * @param cantidad la cantidad a ingresar
  * @throws Exception 
  */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * Metodo para retirar una cantidad
 * @param cantidad
 * @throws Exception 
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
