package starter.miArtefacto.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("idioma.mensaje")
public class IdiomaProperties {
	
	private String lenguaje = "Castellano";
	

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}


	
	
	

}
