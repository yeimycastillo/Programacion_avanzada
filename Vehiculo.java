public class Vehiculo implements Conducir, Combustion_interna{
	Luces l;
	Vehiculo(){
		l = new Luces();
	}
	public void acelerar(){
		System.out.println("El carro esta adquiriendo velocidad");
	}
	public void frenar(){
		System.out.println("El carro esta disminuyendo la velocidad");
		l.alumbrar();
	}
	public void admision(){
		System.out.println("El piston baja e ingresa combustible");
	}
	public void compresion(){
		System.out.println("El piston sube y el combustible y aire se comprimen");
   	}
	public void expansion(){
		System.out.println("La mezcla de combustible y aire explota");
	}
	public void escape(){
		System.out.println("El piston sube y expulsa los gases quemados");
	}

}