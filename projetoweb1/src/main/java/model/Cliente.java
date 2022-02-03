package model;

public class Cliente {
	
	private Integer codigo;
	private String nome;
	private String email;
	private String tipo;
	private String id;
	
	public Cliente(String nome, String email, String tipo, String id) {
		super();
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
		this.id = id;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getTipo() {
		return tipo;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", email=" + email + ", tipo=" + tipo + ", id=" + id
				+ "]";
	}
}
