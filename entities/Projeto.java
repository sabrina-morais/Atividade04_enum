package entities;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Projeto {
	private String nome;
	private Date dt_Inicio;
	private Date dt_Termino;
	private List <Contratacao> listaContratacao = new ArrayList<>();
	
	public Projeto(String nome, Date dt_Inicio, Date dt_Termino) {
		this.nome = nome;
		this.dt_Inicio = dt_Inicio;
		this.dt_Termino = dt_Termino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDt_Inicio() {
		return dt_Inicio;
	}

	public void setDt_Inicio(Date dt_Inicio) {
		this.dt_Inicio = dt_Inicio;
	}

	public Date getDt_Termino() {
		return dt_Termino;
	}

	public void setDt_Termino(Date dt_Termino) {
		this.dt_Termino = dt_Termino;
	}
	
		
	public List<Contratacao> getListaContratacao() {
		return listaContratacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dt_Inicio, dt_Termino, listaContratacao, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Projeto other = (Projeto) obj;
		return Objects.equals(dt_Inicio, other.dt_Inicio) && Objects.equals(dt_Termino, other.dt_Termino)
				&& Objects.equals(listaContratacao, other.listaContratacao) && Objects.equals(nome, other.nome);
	}
	
	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", dt_Inicio=" + dt_Inicio + ", dt_Termino=" + dt_Termino
				+ ", listaContratacao=" + listaContratacao + "]";
	}

	public boolean adicionarContratacao(Contratacao c) {
		if (c !=null && !listaContratacao.contains(c)) {
			this.listaContratacao.add(c);
			return true;
		}
		return false;
	}
	
	public boolean removerContratacao(Contratacao c) {
		if (c !=null && !listaContratacao.isEmpty() && listaContratacao.contains(c)) {
			this.listaContratacao.remove(c);
			return true;
		}
		return false;
	}
	
	public void listarContratacao() {
		System.out.println();
		System.out.println("***Contratações***");
		if (listaContratacao.isEmpty()) {
			System.out.println("O projeto " + this.nome + " não possui contratação.");
		}
		else {
			System.out.println("Projeto: \n\t"+ this.nome);
			System.out.println("Funcionário(s): ");
			for (Contratacao c: this.listaContratacao) {
				System.out.println("\t " + c.getFuncionario().getNome() +" [Status: "+ c.getStatus()+"]");
			}
	}
	
	}
}
