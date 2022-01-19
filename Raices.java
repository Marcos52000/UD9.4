public class Raices {

	//Atributos
	private double a;
	private double b;
	private double c;
	
	//Constructor	
	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	//Metodos	
	
	//Dos soluciones
	public void obtenerRaices() {
		double soluciones[];
		
		if(tieneRaices()) {
			soluciones = new double[2];
			
			soluciones[0] = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			 
            soluciones[1] = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);            
            
            System.out.println("Soulucion 1 = " + soluciones[0]);
            System.out.println("Soulucion 2 = " + soluciones[1]);
            
		} else {
			System.out.println("Sin solucion");
		}
	}
	//Una solucion
	public void obtenerRaiz() {
		if(tieneRaiz()) {
			double solucion;
			
			solucion = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
			
			System.out.println("Soulucion: " + solucion);
			
		} else {
			System.out.println("Sin solucion");
		}
	}
	//Calcula el discriminate
	public double discriminate() {
		double discriminante;		
		discriminante = (Math.pow(b, 2) - (4 * a * c));
		
		return discriminante;
	}
	//Si tiene mas de una solucion devuelve true
	public boolean tieneRaices() {
		if(discriminate() >= 0) {
			return true;
		}else {
			return false;
		}		
	}
	//Si tiene una solucion devuelve true
	public boolean tieneRaiz() {
		if(discriminate() == 0) {
			return true;
		}else {
			return false;
		}		
	}
	//Mira las soluciones que tiene y ejecuta el metodo corresondiente a las soluciones.
	public void calcular() {
		if(tieneRaices()) {
			obtenerRaices();
		} else if(tieneRaiz()) {
			obtenerRaiz();
		} else {
			System.out.println("No tiene solucion");
		}
	}
	
	//GETTERS AND SETTERS

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}		
}
