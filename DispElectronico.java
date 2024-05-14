public abstract class DispElectronico {


	private int numerodepantallas;
	private int numerodechips;

	DispElectronico(int pantallas,int chips){	
		this.numerodepantallas=pantallas;
		this.numerodechips=chips;
	}
	public void setpantallas ( int pantallas){
		this.numerodepantallas = pantallas;
	}
	public void setchips (int chips){

		this.numerodechips = chips;
	}


	public int getNumerodepantallas(){
		return numerodepantallas;
	}
	
	public int getNumerodechips(){
		return numerodechips;
	}

	public void Electronico(){
		System.out.println("el dispositivo tiene electronica dentro");
	}
}
