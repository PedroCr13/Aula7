class FixedQueue implements ICharQ {
	private char q[]; //esse array contem a fila.
	private int putloc, getloc; //os indices put e getloc
	
	//constroi a fila vazia dado o seu tamanho
	public FixedQueue(int size) {
		q = new char[size]; //aloca memoria para a fila
		putloc = getloc = 0;
	}
	
	//insere um caractere na fila
	public void put(char ch) {
		if(putloc == q.length) {
			System.out.println(" - Queue is full.");
			return;
		}
		q[putloc++] = ch;
	}
	
	//Remove um caractere da fila
	public char get() {
		if(getloc == putloc) {
			System.out.println(" -Queue is empty");
			return (char) 0;
		}
		return q[getloc++];
	}	
	
	public int getSizeActual(){
		return q.length;
	}
}


















