public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Juan Felipe", "Calle 10N #13-14");
        Factura factura = new Factura(123, cliente);

        Producto producto1 = new Producto("Gafas", 50, 2);
        Producto producto2 = new Producto("Medias", 20, 3);

        factura.agregarProducto(producto1);
        factura.agregarProducto(producto2);

        factura.imprimirFactura();
    }
}
