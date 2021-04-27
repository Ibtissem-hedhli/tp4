package modele;

public class Ex1_NomberBean {
	
	private  double number ;
	public Ex1_NomberBean() {
		setNumber(0);
	}
	

	public double getNumber() {
		return number;
	}


	public void setNumber(double number) {
		this.number = number;
	}


	public static double getRandomNum(int n) {
		
		return  Math.random() * n;
	}
	
	



	
	
	
	
	
	
	
	
	
	
	
	
}
