public class Carrito extends Vehiculo{
	int cilindraje;
	Carrito(){

		super();
		cilindraje=150;
	}
	public void setCilindraje(int cilindraje){
		this.cilindraje=cilindraje;
	}
	public int getCilindraje(){
		return cilindraje;
	}
	public void frenar(int primera){
		System.out.println("La moto baja el cambio:"+primera);
		l.alumbrar();
}
}