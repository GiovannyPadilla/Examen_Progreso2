package Examen_Progreso2;
//Creamos la clase laptop
public class Laptop implements IProducto {
    private String nombre;
    private String marca;
    private double precio;
    private int añosGarantia;

    // Constructor para inicializar la clase laptop
    public Laptop(String nombre, String marca, double precio, int añosGarantia) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.añosGarantia = añosGarantia;
    }

    // Implementar los métodos
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getModelo() {
        return nombre; // En este caso, nombre y modelo son lo mismo.
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
    //creamos el metodo para los años de garantia de la computadora
    public int getañosGarantia() {
        return añosGarantia;
    }

    @Override
    public void imprimeDetallesProducto() {
        System.out.println("Laptop: "  + marca  + "Modelo: "  + nombre  + "Precio: $ "  + precio   + " Años de garantía: "+ getañosGarantia());
    }


}
