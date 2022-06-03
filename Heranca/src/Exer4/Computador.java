package Exer4;

public class Computador {

		private int ram;
		private double armazenamento;
		private boolean teclado;

		public Computador(int ram, double armazenamento, boolean teclado) {
			setRam(ram);
			setArmazenamento(armazenamento);
			setTeclado(teclado);
		}
		
		
		public int getRam() {
			return ram;
		}
		public void setRam(int ram) {
			this.ram = ram;
		}
		public double getArmazenamento() {
			return armazenamento;
		}
		public void setArmazenamento(double armazenamento) {
			this.armazenamento = armazenamento;
		}
		public boolean isTeclado() {
			return teclado;
		}
		public void setTeclado(boolean teclado) {
			this.teclado = teclado;
		}
		
		public void aumentarRam() {
			setRam(getRam() * 2);
			System.out.println(getRam());
		}
		
		public void aumentarArmazenamento() {
			setArmazenamento(getArmazenamento() * 2);
			System.out.println(getArmazenamento());
		}
		
	
}
