package ucu.edu.uy.ta92022;

public class Producto implements IProducto {

    private Comparable etiqueta;
    private String nombre;
    private Integer precio;
    private Integer stock;

    public Producto(Comparable etiqueta, String nombre) {
        this.etiqueta = etiqueta;
        this.nombre = nombre;
        this.stock = 0;
        this.precio = 0;
    }

    public Producto(Comparable codigo, String nombre, Integer precio, Integer stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.etiqueta = codigo;
        this.stock = stock;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public Integer getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public Integer getStock() {
        return stock;
    }

    public void agergarStock(Integer stock) {
        this.stock += stock;
    }

// restarStock devolverá -1 si se pretende extraer más de lo que hay... 
    // y el campo stock quedará inalterado
    public Integer restarStock(Integer stock) {
        if (stock > this.stock) {
            return -1;
        } else {
            setStock(this.stock - stock);
            return this.stock;
        }
    }

    @Override
    public String toString() {
        String price = Integer.toString(this.precio);
        String stock = Integer.toString(this.getStock());
        String code = this.etiqueta.toString();
        return ("Etiqueta: " + code + " || Nombre : " + this.nombre + " || Precio : " + price + " || Stock : " + stock);
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

}
