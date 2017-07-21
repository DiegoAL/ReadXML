package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class ReadXML {

	public static void main(String[] args) {

		try {
			// Le arquivo
			FileInputStream in = new FileInputStream(new File("arquivo.xml"));

			// Cria objeto da classe XStream
			XStream xStream = new XStream(new DomDriver());
			// alias para não gerar fully qualified name
			// xStream.alias("Aluno", Aluno.class);

			// Criar objeto da classe aluno com base no arquivo XML
			Aluno aluno = (Aluno) xStream.fromXML(in);

			// Imprime método toString() da classe aluno:
			System.out.println(aluno);

		} catch (IOException ex) {
			System.out.println("Erro ao ler arquivo!");
		}

	}
}