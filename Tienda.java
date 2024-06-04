package Examen_Progreso2;

import java.util.ArrayList;
import java.util.List;

public class Tienda implements ITienda {
    private List<IProducto> productos;

    public Tienda() {
        this.productos = new ArrayList<>();
    }

    @Override
    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    @Override
    public void listarProductos() {
        for (IProducto producto : productos) {
            producto.imprimeDetallesProducto();
        }
    }

    @Override
    public double obtenerPromedioPrecioProductos() {
        if (productos.isEmpty()) {
            return 0;
        }
        double promedio = 0;
        for (IProducto producto : productos) {
            promedio += producto.getPrecio();
        }
        return promedio / productos.size();
    }

    @Override
    public IProducto obtenerProductoMasCostoso() {
        if (productos.isEmpty()) {
            return null;
        }
        IProducto productoMasCostoso = productos.get(0);
        for (IProducto producto : productos) {
            if (producto.getPrecio() > productoMasCostoso.getPrecio()) {
                productoMasCostoso = producto;
            }
        }
        return productoMasCostoso;
    }

    public Boolean buscarProductoPorNombre(String nombre) {
        for (IProducto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }
}