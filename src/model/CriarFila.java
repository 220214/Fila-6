package model;

public class CriarFila {
	public String nome;
	public Object numero;
	@Override
	public String toString() {
		String ret =  nome + " senha " + numero.toString();
		return ret;
	}
}
