package Examen_Progreso2;

public class Laptop implements IProducto{
    private String nombre;
    private String marca;
    private double precio;
    private int anos_garantia;

    //Definir el constructor
    public Laptop(String nombre, String marca, double precio, int anos_garantia) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.anos_garantia = anos_garantia;
    }

    @Override
    public String getNombre() {
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

    public int getAnos_garantia() {
        return anos_garantia;
    }
    @Override
    public void ImprimeDetallesProducto() {
        System.out.println("Laptop: " + marca + " " + nombre + "$"+ precio);
    }
}


