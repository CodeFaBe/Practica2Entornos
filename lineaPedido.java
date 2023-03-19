
package examen;


public class lineaPedido {

private int identificador;
private int cantidad;
private Producto producto;

public lineaPedido(int identificador, int  cantidad, Producto producto){
this.identificador=identificador;
this.cantidad=cantidad;
this.producto=producto;
}
public int getidentificador(){
return identificador;
}
public void setidentificador (int identificador){
this.identificador=identificador;
}
public int getcantidad(){
return cantidad;
}
public void setcantidad(int cantidad){
this.cantidad=cantidad;
}
public Producto getProducto(){
return producto;
}
public void setProducto (Producto producto){
this.producto=producto;
}
public int calculoSubtotallineaPedido(){
return cantidad*producto.getprecio();
}
public String toString(){
return "linea de pedido [id="+ identificador +", cantidad="+cantidad+",producto="+producto;
       }    
}
    
    