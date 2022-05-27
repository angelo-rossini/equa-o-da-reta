package retas;

public class RetaMain {
	
	public static void main(String[] args) {
		
		reta r0 = new reta(2, -4);
		reta r1 = new reta(-3, 5);
		
		System.out.println(r0.get_cofang());
		System.out.println(r0.get_coflin());
		
		r0.ponto(10, 14);
		
		System.out.println(r0.str_reta());
		
		r0.mesma_reta(r1);
	}

}
