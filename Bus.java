public class Bus extends Vehiculo{
	int placa;
	Bus(){
		super();
		placa=0710;
	}
	public void setPlaca(int placa){
		this.placa=placa;
	}
	public int getPlaca(){
		return placa;
	}
	public void acelerar(int revolucion){
		System.out.println("El carro esta adquiriendo velocidad");

}
}