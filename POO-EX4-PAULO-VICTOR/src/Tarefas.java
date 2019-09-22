
public class Tarefas {
	public static void main(String[] args) {
		Horario h1 = new Horario(17, 50, 8);
		Caledario c1 = new Caledario("Festa", 12, 13, 2018, h1);
		c1.getCompromisso();
		c1.cancelarCompromisso();
		c1.cancelarCompromisso();
		c1.ativaCompromisso();
		c1.getCompromisso();
		h1.limparHora();
		c1.getCompromisso();
		
	}
}
