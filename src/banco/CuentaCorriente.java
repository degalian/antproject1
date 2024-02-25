package banco;
public class CuentaCorriente {   
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCuenta() {
        return cuenta;
    }
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getTipoInteres() {
        return tipoInteres;
    }
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public CuentaCorriente()
    {
    }
    public CuentaCorriente(String nombre, String cuenta, double saldo, double tipoInteres)
    {
        this.nombre =nombre;
        this.cuenta=cuenta;
        this.saldo=saldo;
        this.tipoInteres=tipoInteres;
    }


    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    public void retiro(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
