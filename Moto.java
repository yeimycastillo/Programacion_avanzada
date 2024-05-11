public class Moto extends Vehiculo{
	int modelo;
	Moto(){
		super();
		modelo=2022;
	}
	public void setModelo(int modelo){
		this.modelo=modelo;
	}
	public int getModelo(){
		return modelo;
	}
	public void frenar(int cambio){
		System.out.println("La moto baja el cambio:"+cambio);
		l.alumbrar();
}
	public void acelerar(int cambio){
		System.out.println("La moto baja el cambio:"+cambio);
		l.alumbrar();
}
}