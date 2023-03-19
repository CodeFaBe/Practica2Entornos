
package examen;

public class Producto {
 private int identificador;
 private String nombre;
 private String descripcion;
 private int precio;
  public Producto(int identificador, String nombre, String descripcion, int precio){
  this.identificador=identificador;
  this.nombre=nombre;
  this.descripcion=descripcion;
  this.precio=precio;
  }
  public int getidentificador(){
  return identificador;
  }
  public void setidentificador(int identificador){
  this.identificador=identificador;
  }
  public String getnombre(){
  return nombre;
  }
 public void setnombre(String nombre){
 this.nombre=nombre;
 }
 public String getdescripcion(){
 return descripcion;
 }
 public void setdescripcion(String descripcion){
 this.descripcion=descripcion;
 }
 public int getprecio(){
 return precio;
 }
 public void setprecio(int precio){
 this.precio=precio;
 }
 public String toString(){
 return"id="+identificador+"nombre="+nombre+"descripcion"+descripcion+"precio $"+precio;
 }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 

