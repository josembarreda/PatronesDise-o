package Usuario;

public class Usuario {

		private String nombre;
		private String direccion;
		private int telefono;
		private String gmail;
		
		public Usuario(String nombre, String direccion,int telefono,String gmail) {
			this.setNombre(nombre);
			this.setDireccion(direccion);
			this.setTelefono(telefono);
			this.setGmail(gmail);
			
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		
		public String getGmail() {
			return gmail;
		}

		public void setGmail(String gmail) {
			this.gmail = gmail;
		}


		@Override
		public String toString() {
			return "Usuario [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", gmail="
					+ gmail + "]";
		}
		
	}
