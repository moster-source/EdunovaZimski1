package edunova;

import javax.swing.JOptionPane;

public class Zimski1 {
	
	//klasa prima proizvoljan broj brojeva, ispisuje najveci, najmanji i sortira.
	
	int[] brojevi;
	int[] brojeviSortirano;
	int broj;
	
	
	public static void main(String[] args) {
	
			
		Zimski1 mat = new Zimski1();
		mat.Popuni(5);
		mat.ispisi("nesortirano");
		mat.Sort();
		mat.ispisi("sortirano");
		mat.najmanji();
		mat.najveci();
	}
	
	private void Popuni(int broj) {
		//popunjava matricu brojevi
		this.broj = broj;
		this.brojevi= new int[broj];
		int a;
		int brojPoRedu = 1;
		
		for(int i = 0; i < broj; i++) {
			
			try {
			a= Integer.parseInt(JOptionPane.showInputDialog("Unesi broj " + Integer.toString(brojPoRedu)));
			brojPoRedu++;
			brojevi[i]=a;
			}
			catch(Exception e){
				JOptionPane.showConfirmDialog(null,"Nije cijeli broj");
			}
		}
	}
	
	private void Sort() {
		int temp;
		boolean sortirano = false;
		this.brojeviSortirano = this.brojevi;
		
		//bubble sort
		while(!sortirano) {
			sortirano= true;
			for(int i = 0; i < this.brojeviSortirano.length-1;i++) {
				if( this.brojeviSortirano[i]> this.brojeviSortirano[i+1]) {
					temp =  this.brojeviSortirano[i];
					 this.brojeviSortirano[i]= this.brojeviSortirano[i+1];
					 this.brojeviSortirano[i+1]=temp;
					sortirano= false;
				}
			}
		}
	}
	
	private void ispisi(String sortirano) {
		System.out.println();
		
		if(sortirano == "nesortirano"){
		for(int i = 0; i< this.brojevi.length;i++) {
			System.out.print( this.brojevi[i]+", ");
		}
		}else
		{
			for(int i = 0; i< this.brojeviSortirano.length;i++) {
				System.out.print( this.brojeviSortirano[i]+", ");
			}
			
		}
		
		
		System.out.println();
	}
	
	private void najveci() {
		Sort();
		System.out.println(brojeviSortirano[brojeviSortirano.length-1]);
		
	}
	
	private void najmanji() {
		Sort();
		System.out.println(brojeviSortirano[0]);
		
	}
	
	
}
