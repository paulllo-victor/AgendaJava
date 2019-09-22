
public class Compromisso {
	public Horario horario;	
	public String descricao;
	private boolean ativo;
		
	public Compromisso(String descricaoCompromisso,Horario horario) {//construtor da classe Compromisso, onde recebe os dados e enviar os mesmo para a classe horario, é public pois quando foi instanciado por outra classe ele possa ser acessado e visto!!!
		this.horario = horario;					
		this.descricao = descricaoCompromisso;
		this.ativo = true;
	}
	public void cancelarCompromisso() {	//cancelar compromiso do objeto intanciado e retorna uma mensagem informando a situação do cancelamemnto do compromisso, é publico pois como é um metodo de cancelamento precisa ser acessado por outra classe
		if (this.ativo == true) {
			this.ativo = false;
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Compromisso Cancelado!!");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		else {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Compromisso já está Cancelado!!!");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}
		
	}
	public void ativaCompromisso() {//cancelar compromiso do objeto intanciado e retorna uma mensagem informando a situação do Ativamento do compromisso,é publico pois como é um metodo de Ativamento precisa ser acessado por outra classe
		if (this.ativo == false) {
			this.ativo = true;
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Compromisso Ativo!!");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}else {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Compromisso já está Ativo!!!");
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		}	
	}
	public void getCompromisso() {//Retorna todos os dados informado do compromisso que vem da classe caledario, e informa se tem algum compromisso ativo ou não, é publico pois como é um metodo de retorno de informaçoes precisa ser acessado por outra classe
		if (this.ativo == true) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Você tem um compromisso!!");
			System.out.println("Com a descrição: " + this.descricao);
			System.out.println("Que acontecerá as: " + horario.getHora());
			
		}
		else {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Você não tem nenhum Compromisso Ativo!!!");
			
		}
		
	}
}
