package prog2_aula15;

public abstract class Pessoa { //NÃO ESQUEÇA DO ABSTRACT
	private String nome, email,telefone;

	public Pessoa( String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void imprimirDados() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Email:" + this.email);
		System.out.println("Telefone:" + this.telefone);
	}
	public abstract void pagarImposto(); //NÃO PRECISA TER MAIS NADA NO CORPO dO MÉTODO
	public abstract int getTotal(); 
}
