package Peliculas;

import java.util.ArrayList;

public class Pelicula {
private int codigo;
private String nombre;
private int anno;
private int presupuesto;
private String pais;
private String direccion;
private String guion;
private String fotografia;
private String[] reparto;

public Pelicula() {
	super();
	// TODO Auto-generated constructor stub
}

public Pelicula(int codigo, String nombre, int anno, int presupuesto, String pais, String direccion, String guion,
		 String[] reparto) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
	this.anno = anno;
	this.presupuesto = presupuesto;
	this.pais = pais;
	this.direccion = direccion;
	this.guion = guion;
	this.fotografia = String.valueOf(codigo)+".jpg";
	this.reparto = reparto;
}

public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getAnno() {
	return anno;
}
public void setAnno(int anno) {
	this.anno = anno;
}
public int getPresupuesto() {
	return presupuesto;
}
public void setPresupuesto(int presupuesto) {
	this.presupuesto = presupuesto;
}
public String getPais() {
	return pais;
}
public void setPais(String pais) {
	this.pais = pais;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getGuion() {
	return guion;
}
public void setGuion(String guion) {
	this.guion = guion;
}
public String getFotografia() {
	return fotografia;
}
public void setFotografia(String fotografia) {
	this.fotografia = fotografia;
}
public String[] getReparto() {
	return reparto;
}
public void setReparto(String[] reparto) {
	this.reparto = reparto;
}

@Override
public String toString() {
	return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", anno=" + anno + ", presupuesto=" + presupuesto
			+ ", pais=" + pais + ", direccion=" + direccion + ", guion=" + guion + ", fotografia=" + fotografia
			+ ", reparto=" + reparto + "]";
}

}
