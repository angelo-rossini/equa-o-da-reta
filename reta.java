package retas;

public class reta {
	
	private static final String String = null;
	float cofang, coflin;
	int x1, x2, y1, y2;
	
	public reta(float cofang, float coflin) {
		this.cofang = cofang;
		this.coflin = coflin;
		this.x1 = 0;
		this.y1 = (int) coflin;
		this.x2 = 1;
		this.y2 = (int) (cofang + coflin);
	}
	
	public reta(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
		this.cofang = (y2 - y1)/(x2 - x1);
		this.coflin = (cofang*x2)- y2; 
	}
	
	float get_cofang() {
		return cofang;
	}
	
	float get_coflin() {
		return coflin;
	}
	
	void ponto(int x1, int y1) {
		
		float confirm;
		
		if (x1 < this.x2){
			confirm = (this.y2 - y1)/(this.x2 - x1);
			
		}else {
			
			confirm = (y1 - this.y2)/(x1 - this.x2);
		}
		
		if (confirm == this.cofang) {
			
			System.out.println("o ponto (" + x1 + "," + y1 + ") pertence a reta");
		} else {
			System.out.println("o ponto (" + x1 + "," + y1 + ") não pertence a reta");
		}
		
	 }
	
	String str_reta(){
		 
		 return this.y2 + " = " + this.cofang + "*" + this.x2 + " + " + this.coflin;
	
	}
	 
	void mesma_reta(reta r1) {
		
		double x,y;
		
		x= (r1.coflin - this.coflin)/(r1.cofang - this.cofang);
        y= this.cofang*x + this.coflin;
        
        if(this.cofang == r1.cofang){
           System.out.println("Não existe ponto de intersecção");
        }else{
           System.out.println("Ponto de intersecção:(" + x + "," + y + ")");
       }
	 }
}
