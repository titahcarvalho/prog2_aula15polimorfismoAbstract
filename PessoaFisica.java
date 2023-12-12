package prog2_aula15;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private double salarioAnual;
	private static int n;
	public PessoaFisica ( String nome, String email, String telefone, String cpf, double salarioAnual) {
			super(nome,email,telefone);
			this.cpf = cpf;
			this.salarioAnual = salarioAnual;
			n++;
		}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Cpf:" + this.cpf);
		System.out.println("Salario anual:" + this.salarioAnual);
		
		}
	@Override
	public void pagarImposto() {
		double imposto;
		imposto = this.salarioAnual*0.1;
		 System.out.println("Pessoa física total imposto:" + imposto);
		}
	public int getTotal() {
		return n;
	}
	}
