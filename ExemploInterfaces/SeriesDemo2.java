class SeriesDemo2 {

	public static void main(String args[]){
		ByTwos twoOb = new ByTwos();
		ByThrees threeOb = new ByThrees();
		Series ob; //pode ser usada p/ armazernar referencia a qualquer 
		           //objeto que implementa Series
		
		for(int i=0; i < 5; i++){
			//acessa um objeto através de uma referencia da interface
			ob = twoOb; 
			System.out.println("Next ByTwos value is " + ob.getNext());
			
			//acessa um objeto através de uma referencia da interface
			ob = threeOb;
			System.out.println("Next ByThress value is" + ob.getNext());
		}
	}
}