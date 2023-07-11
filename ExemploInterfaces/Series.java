//declarada public para ser acessada por códigos de qualquer pacote.
public interface Series { 
	
	default int[] getNextArray(int n){
		int[] vals = new int[n];
		
		for(int i=0; i < n; i++)
			vals[i] = getNext();
		return vals;
	}

	int getNext();
	void reset();
	void setStart(int x);
}