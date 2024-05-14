public class Bus extends Vehiculo{
	int placa;
	Computador computadora;
	Televisor tele;
	Bus(){
		computadora = new Computador(2,8,4,5);
		tele = new Televisor(6,6,5,6);
		
	}
	
	public void acelerar(int revolucion){
		System.out.println("El carro esta adquiriendo velocidad");

}
	public void frenar(){
		computadora.prender();
		tele.encender();
	}
}