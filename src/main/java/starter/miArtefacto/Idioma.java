package starter.miArtefacto;

public class Idioma {
	
	private String lenguaje;
	
	public String mensajeSaludo() {
		String mensaje= "";
		
		switch (lenguaje) {
		
			case "Ingles":
				mensaje="My tailor is rich";
				break;
				
			
			case "Italiano":
				mensaje="Mamma mia";
				break;
			
			
			case "Castellano":
				mensaje="Hola guapos";
				break;
			
			default:
				mensaje="Bienvenido anonimo/a";
				break;
			
			}
		
		return mensaje;
		
		
		
	}

	public Idioma(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}
	
	

}
