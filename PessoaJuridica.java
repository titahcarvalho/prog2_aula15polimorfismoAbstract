package prog2_aula15;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private double rendimentoAnual;
	private static int n;
	public PessoaJuridica(String nome, String email, String telefone, String cnpj, double rendimentoAnual) {
		super(nome,email,telefone);
		this.cnpj = cnpj;
		this.rendimentoAnual = rendimentoAnual;
		n++;
	}
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("CNPJ:"+ this.cnpj);
		System.out.println("Rendimento anual:" + this.rendimentoAnual);
		
	}
	@Override
	public void pagarImposto() {
		double imposto = this.rendimentoAnual* 0.7;
		System.out.println("Pessoa jurídica total imposto:" + imposto);
	}
	public int getTotal() {
		return n;
	}
}
