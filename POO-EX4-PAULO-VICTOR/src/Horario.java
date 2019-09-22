import java.util.Scanner;

public class Horario {
	Scanner leitor = new Scanner(System.in);
	private int hora; //Atributos privados para não serem acessado diretamente por outra classe, apenas por a propria classe, só poderam se acessadas e cmodificadas através dos metodos da classe
	private int minuto;
	private int segundo;
	
	
	public Horario(int hora,int minuto,int segundo) { //Construtor da Classe horario, é publico pois a classe externa precisa ter acesso para inserir os dados na classe horario, recebe como parametro variaveis onde as mesmas são enviadas diretamentes para os metodos da classe, são validados, verificando se os mesmo estão de acordo com a condicao do metodo.
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}
	public Horario() {//se não for insirido nenhum dado como parametro, as variaveis iram recebem 0 como dado
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}
	public String getHora() { //retorna a hora 
		return this.hora + ":" + this.minuto + ":"+ this.segundo;
	}
	public void limparHora() { //limpa a hora
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}
	private void setHora(int hora) { //metodos ondem são validados os dados informados como parametro, privados para serem acessado apenas pela propria classe e serem instanciado apenas pelo construtor
		if (hora>=0 && hora<=23) {
			this.hora = hora;
		}
		else {
			System.out.println("Valor informado para horas fora do permitido!!");
			do {
				System.out.println("Digite o valor das horas novamente:");
				hora = leitor.nextInt();
			} while (!(hora>=0) || !(hora<=23));
			this.hora = hora;
		}
	}
	private void setMinuto(int minuto) {			
			if (minuto>=0 && minuto<=60) {
				this.minuto = minuto;
			}
			else {
				System.out.println("Valor informado para minutos fora do permitido!!");
				do {
					System.out.println("Digite o valor dos minutos novamente:");
					minuto = leitor.nextInt();
				} while (!(minuto>=0) || !(minuto<=60));
				this.minuto = minuto;
			}
	}
	private void setSegundo(int segundo) {			
			if (segundo>=0 && segundo<=60) {
				this.segundo = segundo;
			}
			else {
				System.out.println("Valor informado para segundos fora do permitido!!");
				do {
					System.out.println("Digite o valor dos segundos novamente:");
					segundo = leitor.nextInt();
				} while (!(segundo>=0) || !(segundo<=60));
				this.segundo = segundo;
			}
	}	
}
