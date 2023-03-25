import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    public class Factura {
        private int numeroFactura;
        private Date fecha;
        private Cliente cliente;
        private List<Producto> productos;

        public Factura(int numeroFactura, Cliente cliente) {
            this.numeroFactura = numeroFactura;
            this.fecha = new Date();
            this.cliente = cliente;
            this.productos = new ArrayList<>();
        }

        public void agregarProducto(Producto producto) {
            productos.add(producto);
        }

        public double calcularTotal() {
            double total = 0;
            for (Producto producto : productos) {
                total += producto.getPrecio() * producto.getCantidad();
            }
            return total;
        }

        public void imprimirFactura() {
            System.out.println("Factura #" + numeroFactura);
            System.out.println("=======================");
            System.out.println("Cliente: " + cliente.getNombre());
            System.out.println("Dirección: " + cliente.getDireccion());
            System.out.println("=======================");
            System.out.println("Productos:");
            for (Producto producto : productos) {
                System.out.println(producto.getNombre() + " - $" + producto.getPrecio() + " x " + producto.getCantidad() + " = $" + producto.getPrecio() * producto.getCantidad());
            }
            System.out.println("=======================");
            System.out.println("Total: $" + calcularTotal());
        }
    }

