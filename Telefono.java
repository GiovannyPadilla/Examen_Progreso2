package Examen_Progreso2;

public class Telefono implements IProducto {
    private String nombre;
    private String marca;
    private double precio;

    // Constructor
    public Telefono(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    // Implementar los métodos
    //creamos los getters

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getModelo() {
        return nombre;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public double getPrecio() {
        return precio;
    }


    @Override
    public void imprimeDetallesProducto() {
        System.out.println("Tablet: "  + marca  + "Marca: "  + nombre  + "Precio: $ "  + precio);
    }
}

