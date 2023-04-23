package controller;

import java.util.concurrent.Semaphore;

import br.mari.FilaObject.Fila;
import model.CriarFila;

public class FilaController extends Thread  {
	private Semaphore s1;
	private Semaphore s2;
	Fila f=new Fila();
	private CriarFila fila;
	private CriarFila fila1;
	
	public FilaController(Semaphore s1, Semaphore s2, CriarFila fila, CriarFila fila1){
		this.s1=s1;
		this.s2=s2;
		this.fila =fila;
		this.fila1=fila1;
		
	}
	
		public void run() {
		CFila();
		Lista();
		try {
			s1.acquire();
			remover(fila);
			s2.acquire();
			remover(fila1);
			
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
		
	}
	private void Lista() {
		try {
	f.list();
			System.out.println("");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
			
		}

	private void remover(CriarFila fila) {
		while (!f.isEmpty()) {
			try {
				Object c =f.remove();
				System.out.println(c);
			} catch (Exception e) {
				e.printStackTrace();
			}

				}
			
		}

	private void CFila() {
		f.insert(fila);
		f.insert(fila1);
		
		
	}
	
		
		
}
