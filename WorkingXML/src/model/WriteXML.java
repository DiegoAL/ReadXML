package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class WriteXML {
	public static void main(String[] args) {

		// Inicialização do objeto xstream:
		XStream xstream = new XStream(new DomDriver());
		// alias para não gerar fully qualified name
		// xstream.alias("Aluno", Aluno.class);

		// Criando objeto aluno:
		Aluno aluno = new Aluno("Aislan", 27, 6231);

		// Gerar o XML:
		String xml = xstream.toXML(aluno);

		System.out.println(xml);

		// Gerar arquivo "arquivo.xml" com o conteúdo XML:
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("arquivo.xml"));
			out.write(xml);
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao gerar arquivo!");
		}

	}
}