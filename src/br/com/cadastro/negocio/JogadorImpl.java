package br.com.cadastro.negocio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.cadastro.model.Jogador;

public class JogadorImpl {

	public boolean verificaArquivoExiste(Path caminho) {
		boolean ret = false;

		try {
			Stream<Path> stream = Files.list(caminho);
			Optional<Path> arq = stream.filter(p -> p.toString().endsWith("jogadore.txt")).findAny();
			ret = arq.isPresent(); // informa se o arquivo está presente
		}

		catch (IOException ex) {
			ex.printStackTrace();
		}
		return ret;
	}

	public List<Jogador> getListaDeJogadores(Path caminho) throws IOException {
		Stream<String> linhas = Files.lines(caminho, StandardCharsets.ISO_8859_1);
		List<String> listaDeLinhas = linhas.collect(Collectors.toList());
		List<Jogador> listaDeJogadores = new ArrayList<>();
		Jogador jogador;
		Iterator it = listaDeLinhas.listaIterator();
		String str = null;
			while (it.hasNext()) {
			str = (String) it.next();
			
		String info[] = str.split(",");
		
		jogador = new Jogador();
		jogador.setNome(info[0]);
		
		}

	}

}
