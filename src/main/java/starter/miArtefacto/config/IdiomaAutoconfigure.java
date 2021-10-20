package starter.miArtefacto.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import starter.miArtefacto.Idioma;



	
	@Configuration
	@ConditionalOnClass(Idioma.class)
	@EnableConfigurationProperties(IdiomaProperties.class)
	public class IdiomaAutoconfigure {
		
		private final IdiomaProperties ip;
		
		public IdiomaAutoconfigure(IdiomaProperties properties) {
			this.ip= properties;
		}
		@Bean
		public Idioma idioma() {
			System.out.println("hola: " + ip.getLenguaje());
			return new Idioma(ip.getLenguaje());
		}
		
	}


