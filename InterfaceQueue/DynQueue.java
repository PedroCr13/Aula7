// fila dinâmica
public class DynQueue implements ICharQ {
	
	private char q[]; //array que contem a fila
	private int putloc, getloc; // indices put e get
	
	//constrou a fila vazia dado o seu tamanho
	public DynQueue(int size) {
		q = new char[size];
		putloc = getloc = 0;
	}
	
	//insere um caracter na fila
	public void put(char ch) {
		if(putloc == q.length){
			/*aumenta o tamanho da fila;
			 um array duas vezes maior que o original é realocado
		     o conteudo atual do array é copiado nesse array  
			 e uma referencia ao novo array é armazeda eem q
			*/
			char t[] = new char[q.length * 2];
			
			//copia elementos para nova fila;
			for(int i = 0; i < q.length; i++)
				t[i] = q[i];
			
			q = t;
		}
		q[putloc++] = ch;
	}
	
	//remove um caracter da fila
	public char get() {
		if(getloc == putloc) {
			System.out.println(" - Queue is empty");
			return (char) 0;
		}
		
		return q[getloc++];
	}
	
	public int getSizeActual(){
		return q.length;
	}
}