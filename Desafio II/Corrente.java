package entities;

public class Corrente extends Conta{
private int contarTalao = 3;
	
	public Corrente(int numero, String cpf) {
		super(numero, cpf);
		// TODO Auto-generated constructor stub
	}

	public int getContarTalao() {
		return contarTalao;
	}

	public void setContarTalao(int contarTalao) {
		this.contarTalao = contarTalao;
	}
	public void pediTalao(int quant) {
		if(quant<this.contarTalao && quant>0) {
			contarTalao =- quant;
			this.credito(30*quant);
			System.out.println("O seu saldo é: "+this.getSaldo());
		}
	}
	

}