package aOOPS;

public class Polynomial {

	private DynamicArray d;
	
	public Polynomial(){
		d= new DynamicArray();
	}
	public void setCoefficient(int degree, int coeff){
		while (degree > this.d.size()) {
			this.d.set(this.d.size(), 0);
		}
		this.d.set(degree, coeff);
		
	}
	
	public void print(){
		
		String result="";
	    for(int i=0;i<this.d.size();i++){
	      if(this.d.get(i)==0)
	          continue;
	      result+=d.get(i)+"X^"+i+" + ";
	    }
	    System.out.println(result);
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
		int count=0;
		Polynomial pNew = new Polynomial();
		for (int i =0; i < p.d.size() && i< this.d.size(); i++ ) {
			pNew.d.set(i, p.d.get(i)+ this.d.get(i)); 
			count++;
		}
		
		while (count < p.d.size()) {
			pNew.d.set(count, p.d.get(count));
			count++;
		}
		while (count <this.d.size()) {
			pNew.d.set(count, this.d.get(count));
			count++;
		}
		
		return pNew;
		
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		int count=0;
		Polynomial pNew = new Polynomial();
		for (int i =0; i < p.degree() && i< this.degree(); i++ ) {
			pNew.d.set(i, p.d.get(i)- this.d.get(i)); 
			count++;
		}
		
		while (count < p.degree()) {
			pNew.d.set(count, p.d.get(count));
			count++;
		}
		while (count <this.d.size()) {
			pNew.d.set(count, this.d.get(count));
			count++;
		}
		
		return pNew;
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int count=0;
		Polynomial pNew = new Polynomial();
		int[] temp = new int[this.d.size()+p.d.size()];
		for (int i =0; i < this.d.size(); i++) {
			for (int j =0; j < p.d.size(); j++) {
				temp[i+j] += this.d.get(i) * p.d.get(j);
				pNew.d.set(i+j, temp[i+j]);
			}
		}
		
		return pNew;
	}
	
	public int degree() {
		return d.size();
	}

}
