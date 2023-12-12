package prog2_aula15;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<>();//AINDA NÃO ENTENDI ESSA PARTE
		Pessoa maria = new PessoaFisica("Maria da Silva", "maria@gmail.com", "3198765-2345", "22234232-09", 2500);
		Pessoa joao = new PessoaFisica("João da Silva", "joão@gmail.com", "3198765-5432", "28764232-79", 1500);
		
		Pessoa google = new PessoaJuridica("Google", "google@gmail.com", "0800-2345", "0001/1230567", 252500);
		Pessoa yahoo = new PessoaJuridica("Yahoo", "yahoo@email.com", "0800-1234", "0001/9876543", 235500);

		
		pessoas.add(maria);
		pessoas.add(joao);
		pessoas.add(google);
		pessoas.add(yahoo);
		
		for(Pessoa p: pessoas) {
			p.imprimirDados();
			p.pagarImposto();
			System.out.println("Total pessoas:" + ((Pessoa)p).getTotal());
		}
	
	}

}
