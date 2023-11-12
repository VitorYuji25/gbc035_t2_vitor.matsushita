package entities;

public class Ingrediente {
	
	private String nome;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    //GETTERS AND SETTERS
    public String getNome() {
        return nome;
    }

	@Override
	public String toString() {
		return "Nome: " + nome;
	}
}
