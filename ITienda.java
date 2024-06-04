package Examen_Progreso2;

public interface ITienda {
    void agregarProducto(IProducto producto);
    void listarProductos();
    double obtenerPromedioPrecioProductos();
    IProducto obtenerProductoMasCostoso();
}
