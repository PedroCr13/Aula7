//Fila Circular
class CircularQueue implements ICharQ {
	private char q[]; // array que contem a fila
	private int putloc, getloc; //indices put e get
	
	//Constroi a fila circular
	//pode armazernar um numero ilimitado de elementos
	//contanto que elementos também estejam sendo removidos.
	//apenas redefinem o indice apropriado com zero quando o 
	//fim do array é encontrado
	public CircularQueue(int size) {
		q = new char[size+1];
		putloc = getloc = 0;
	}
	
	//Insere caracteres na fila
	public void put(char ch) {
		/* A fila estara cheia se putloc for uma 
		   unidade menor do que getloc ou se putloc
		   estiver no fim do array e getloc estiver no inicio*/
		if((putloc+1 == getloc)|
		   ((putloc == q.length-1)&(getloc == 0))){
			   System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
		if (putloc == q.length) 
			putloc = 0; //retrocede
	}
	
	//Remove um caractere da fila
	public char get() {
		if(getloc == putloc){
			System.out.println(" - Queue is empty");
			return (char) 0;
		}
		char ch = q[getloc++];
		if(getloc == q.length)
			getloc = 0; //loopback
		return ch;
	}
	
	public int getSizeActual(){
		return q.length;
	}
}