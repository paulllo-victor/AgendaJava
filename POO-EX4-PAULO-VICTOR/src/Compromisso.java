
public class Compromisso {
	public Horario horario;	
	public String descricao;
	private boolean ativo;
		
	public Compromisso(String descricaoCompromisso,Horario horario) {//construtor da classe Compromisso, onde recebe os dados e enviar os mesmo para a classe horario, � public pois quando foi instanciado por outra classe ele possa ser acessado e visto!!!
		this.horario = horario;					
		this.descricao = descricaoCompromisso;
		this.ativo = true;
	}
	public void cancelarCompromisso() {	//cancelar compromiso do objeto intanciado e retorna uma mensagem informando a situa��o do cancelamemnto do compromisso, � publico pois como � um metodo de cancelamento precisa ser acessado por outra classe
		if (this.ativo == true) {
			this.ativo = false;
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Compromisso Cancelado!!");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		else {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Compromisso j� est� Cancelado!!!");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		
	}
	public void ativaCompromisso() {//cancelar compromiso do objeto intanciado e retorna uma mensagem informando a situa��o do Ativamento do compromisso,� publico pois como � um metodo de Ativamento precisa ser acessado por outra classe
		if (this.ativo == false) {
			this.ativo = true;
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Compromisso Ativo!!");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}else {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Compromisso j� est� Ativo!!!");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}	
	}
	public void getCompromisso() {//Retorna todos os dados informado do compromisso que vem da classe caledario, e informa se tem algum compromisso ativo ou n�o, � publico pois como � um metodo de retorno de informa�oes precisa ser acessado por outra classe
		if (this.ativo == true) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Voc� tem um compromisso!!");
			System.out.println("Com a descri��o: " + this.descricao);
			System.out.println("Que acontecer� as: " + horario.getHora());
			
		}
		else {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Voc� n�o tem nenhum Compromisso Ativo!!!");
			
		}
		
	}
}
