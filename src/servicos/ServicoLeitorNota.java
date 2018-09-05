package servicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import negocio.Nota;

public class ServicoLeitorNota {
	
	public ServicoLeitorNota(){
		
		ArrayList<String> nota = new ArrayList<String>();
		nota.add("001 0000001 nome nome 1 un x 3,00 3,00");
		nota.add("002 0000002 nome nome 2 un x 3,00 6,00");
		
		lerNota(nota);
	}
	
	public ArrayList<Nota> lerNota(ArrayList<String> cupom){
		
		String[] textoSeparado = null;
		ArrayList<Nota> valor = new ArrayList<Nota>();
				
		for(int i=0; i < cupom.size(); i++){	
			Nota nota = new Nota();
		
			textoSeparado = cupom.get(i).split(" ");
			int j=textoSeparado.length;
			
			nota.setIdNota(textoSeparado[0]);
			nota.setCodigoBarra(textoSeparado[1]);
			nota.setPrecoUnitario(textoSeparado[j-2]);
			nota.setTotal(textoSeparado[j-1]);
			
			valor.add(nota);
			
		}
		return valor;	
			
	}
	
}
