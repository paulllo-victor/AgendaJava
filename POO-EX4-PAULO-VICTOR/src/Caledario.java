import java.util.Scanner;

public class Caledario extends Compromisso {
	Scanner leitor = new Scanner(System.in);
	private int dia; //privados para não serem acessados ou modificados diretamente por outra classe
	private int mes;
	private int ano;
	
	
	public Caledario(String descricaoCompromisso,int dia, int mes, int ano, Horario horario) { //construtor da classe caledario onde recebe como parametro dados e informa diretamente para os metodos e para a classe a cima com  a palavra super, envia esses parametro para a classe compromisso, e os outros são enviados para os metodos  da classe
	super(descricaoCompromisso, horario);
	setDia(dia);
	setMes(mes);
	setAno(ano);
	}	
	public int getDia() {
		return dia;
	}
	private void setDia(int dia) {//metodos privados para serem modificados apenas pelos construtores e não serem acessados diretamente por outra classe, e não ser feita a validação dos dados informados
		if (dia>=0 && dia<=31) {
			this.dia = dia;
		}else {
			System.out.println("Valor informado para Dia fora do permitido!!");
			do {
				System.out.println("Digite o valor do Dia novamente:");
				dia = leitor.nextInt();
			} while (!(dia>=0) || !(dia<=31));
				this.dia = dia;
		}
	}
	public int getMes() {
		return mes;
	}
	private void setMes(int mes) {
		if (mes>=0 && mes<=12) {
			this.mes = mes;
		}else {
			System.out.println("Valor informado para mes fora do permitido!!");
			do {
				System.out.println("Digite o valor do mes novamente:");
				mes = leitor.nextInt();
			} while (!(mes>=0) || !(mes<=12));
			this.mes = mes;
		}
	}
	public int getAno() {
		return ano;
	}
	private void setAno(int ano) {
		this.ano = ano;
		if (ano>=2019 && ano<=3000) {
			this.ano = ano;
		}else {
			System.out.println("Valor informado para ano fora do permitido!!");
			do {
				System.out.println("Digite o valor do ano novamente:");
				ano = leitor.nextInt();
			} while (!(ano>=2019) || !(ano<=3000));
			this.ano = ano;
		}
	}
	public void getCompromisso() {//publico pois retorna todos os dados do compromisso data, horario e descrição, com o super ele procura na classe compromisso algum metodo com essa assinatura e o executa
		super.getCompromisso();
		System.out.println("Na data: " + this.dia+ "/" + this.mes + "/"+this.ano);
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	}
	
}
