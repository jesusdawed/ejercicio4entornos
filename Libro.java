package ejercicio4;

public class Libro {
	private String titulo;
	private int numPaginas;
	private String genero;
	private double precio;
	private boolean prestamo;
	Libro(){
		this.titulo=null;
		this.numPaginas=0;
		this.genero=null;
		this.precio=0;
		this.prestamo=false;
	}
	Libro(String t,int nP,String g,double p,boolean pr){
		this.titulo=t;
		this.numPaginas=nP;
		this.genero=g;
		this.precio=p;
		this.prestamo=pr;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(boolean prestamo) {
		this.prestamo = prestamo;
	}
	public String toString() {
		return "Libro [titulo=" + titulo + ", numPaginas=" + numPaginas + ", genero=" + genero + ", precio=" + precio
				+ ", prestamo=" + prestamo + "]";
	}
	public void prestamo() {
		this.prestamo=true;
	}
	public void devolucion() {
		this.prestamo=false;
	}
	
	
}
