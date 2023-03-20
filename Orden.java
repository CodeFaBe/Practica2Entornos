package examen;

import java.util.*;
public class Orden {

  private int identificador;
  private Vector itemsPedido;
  private int ordenTotal; 
  private string esto es de prueba;
public Orden(int identificador){
this.identificador=identificador;
itemsPedido= new Vector();
}
public int getidentificador(){
return identificador;
}
public void setidentificador(int identificador){
this.identificador=identificador;
}
public int calculoTotalOrden(){
int totalOrden=0;
for(int i=0;i<itemsPedido.size();i++){
lineaPedido linea=(lineaPedido) itemsPedido.elementAt(i);
totalOrden=totalOrden+linea.calculoSubtotallineaPedido();
    }
return totalOrden;
}
public String toString(){
return "Orden[id=" +identificador+"]"+"Items del pedido"+itemsPedido+"total orden=$" +calculoTotalOrden();
}
public void añadirItem(int identificador, int cantidad, Producto producto){
    lineaPedido linea= new lineaPedido(identificador, cantidad, producto);
    itemsPedido.add(linea);
            }
}
    

