package Funciones;

public class zapatos {

	int AñoLanzamiento;
	String modeloZapato;
	String marca;
		
		public zapatos() {}

		public zapatos(int AñoLanzamiento, String modeloZapato, String marca) {
			
			this.AñoLanzamiento = AñoLanzamiento;
			this.modeloZapato = modeloZapato;
			this.marca = marca;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public int getAñoLanzamiento() {
			return AñoLanzamiento;
		}

		public void setAñoLanzamiento(int AñoLanzamiento) {
			this.AñoLanzamiento = AñoLanzamiento;
		}

		public String getmodeloZapato() {
			return modeloZapato;
		}

		public void setmodeloZapato(String modeloZapato) {
			this.modeloZapato = modeloZapato;
		}
		

		public void vermodelos(String zapatos) {
		
		}

		public void comparamodelos(String zapatos) {
		
		}
}