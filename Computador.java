public class Computador extends DispElectronico {


	private int ram;
	private int teclados;

	Computador(int ram, int teclados, int pantallas ,int chips){
		super(pantallas,chips);
		this.ram = ram;
		this.teclados = teclados;
	}

	public void prender(){
		System.out.println("el computador se prende");
	}	
}