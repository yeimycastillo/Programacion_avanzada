public class Televisor extends DispElectronico {


	private int canales;
	private int controles;

	Televisor(int canales, int controles,int pantallas ,int chips){
		super(pantallas,chips);
		this.canales = canales;
		this.controles = controles;
		

	}
	public void encender(){
		System.out.println("el televisor se enciende");
	}
}
