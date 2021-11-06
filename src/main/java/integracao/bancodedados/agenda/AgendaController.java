package integracao.bancodedados.agenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class AgendaController {

	@Autowired
	private ContatoService contatoService;

	public void inserirRegistro(String nome, String ddd, String telefone) throws ContatoException {
		Contato contato = new Contato(nome, ddd, telefone);
		contatoService.inserir(contato);
	}

	public void removerRegistro(Long id) {
		contatoService.remover(id);
	}

}
