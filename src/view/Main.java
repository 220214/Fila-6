package view;

import java.util.concurrent.Semaphore;

import br.mari.FilaObject.Fila;
import controller.FilaController;
import model.CriarFila;

public class Main {

	public static void main(String[] args) {
	
	 Semaphore s= new Semaphore(3);
	 Semaphore s2= new Semaphore(1);
		
		
		CriarFila fila1 =new CriarFila ();
		CriarFila fila =new CriarFila ();
		for(int i =0; i<=12;i++) {
		fila.nome = "Prioritario ";
		fila.numero=(int)((Math.random()*100)+1);
		
		fila1.nome = "Comum ";
		fila1.numero=(int)((Math.random()*1000)+1);
		
	}
		for (int i=0;i<=12;i++) {
		Thread f1 = new FilaController(s,s2,fila,fila1);
		f1.start();
		}
}
}
