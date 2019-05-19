package br.com.cadastro.main;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

import br.com.cadastro.model.Jogador;
import br.com.cadastro.negocio.JogadorImpl;

public class Principal {
	
	public static void main(String[] args) throws IOException {
		Principal p = new Principal();
		JogadorImpl jogImpl = new JogadorImpl();
		String enderecoDir = "/run/media/diego/Documento/Desenvolvimento/Projetos/Workspace/java8-stream-txt/src";
		 String nomeArquivo = "jogadores.txt";

		 List<Jogador> listaDeJogadores = jogImpl.getListaDeJogadores(Paths.get(enderecoDir + "/" + nomeArquivo));       

		 if (!jogImpl.verificaArquivoExiste(Paths.get(enderecoDir))){

		        System.out.println("Arquivo não encontrado");

		    }

		    else {           

		 jogImpl.imprimirJogadorArtilheiro(listaDeJogadores);

		 jogImpl.imprimirJogadorMaisVelho(listaDeJogadores);

		 jogImpl.imprimirJogadorMaisNovo(listaDeJogadores);

		 }      
	}

}
