package servicos;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServicoLeitorNota nota = new ServicoLeitorNota();
		
		ArrayList<String> nota1 = new ArrayList<String>();
		nota1.add("001 0000001 nome nome 1 un x 3,00 3,00");
		nota1.add("002 0000002 nome nome 2 un x 3,00 6,00");
		
		nota.lerNota(nota1);
		
	}

}
