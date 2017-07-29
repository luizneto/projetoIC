import java.util.ArrayList;
import java.util.List;


public class Valores implements ValoresITF{

	 List<Integer> lista = new ArrayList<Integer>();
/**
 * 
*/	 
	public boolean ins(int v) {
		
		int tamanho = lista.size();
		
		if((tamanho <= 9) && (v > 0)){
			lista.add(v);
			return true;
		}
		
		return false;
	}
/**
 * 
 */
	public int del(int i) {
				
		int tamanho = lista.size();
		
		if(i == tamanho){
			return -1;
		}
		
		if((lista.size() == 0) && (i > 0)){
			return -1;
		}
		
		if(lista.isEmpty()){
			return -1;
		}
		/**
		 * 
		*/	 
		
		int valDEL = lista.get(i).intValue();
		lista.remove(i);
		return valDEL;
	}
	/**
	 * 
	*/	 

	public int size() {

		int tamanho = lista.size();
		
		return tamanho;
	}
	/**
	 * 
	*/	 

	public double mean() {
		
		int total = 0;
		double media = 0;
		
		if(lista.isEmpty()){
			return -1;
		}else{
			for (int i = 0; i < lista.size(); i++) {
				total = total + lista.get(i);
			}
			media = total / lista.size();
		}
		
		return media;
	}
	/**
	 * 
	*/	 

	public int greater() {
		
		int greater = 0;
		
		if(lista.isEmpty()){
			return -1;
		}else{
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i) > greater){
					greater = lista.get(i);
				}
			}
		}
		
		return greater;
	}
	/**
	 * 
	*/	 

	public int lower() {
		
		int lower = greater();
		
		if(lista.isEmpty()){
			return -1;
		}else{
			for (int i = 0; i < lista.size(); i++) {
				if(lista.get(i) > lower){
					lower = lista.get(i);
				}
			}
		}
		
		return lower;
	
	}

}
