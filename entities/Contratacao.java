package entities;

import java.util.Date;

import entities.enums.Cargo;
import entities.enums.Status;

public class Contratacao {
	private Date dataI;
	private Cargo cargo;
	private Status status;
	private Funcionario funcionario;
	private Projeto projeto;
	
	
	
	public Contratacao(Date parse, Cargo cargo, Funcionario funcionario, Projeto projeto) {
		this.dataI = dataI;
		this.cargo = cargo;
		this.status = Status.PENDENTE;
		this.funcionario = funcionario;
		this.projeto = projeto;
	}


	public Date getDataI() {
		return dataI;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public Status getStatus() {
		return status;
	}
	

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	@Override
	public String toString() {
		return "Contratacao [dataI=" + dataI + ", cargo=" + cargo + ", status=" + status + "]";
	}
	
	public void pendente() {
		this.status = Status.PENDENTE;
	}
	
	public void contratar() {
		if (this.status == Status.PENDENTE)
			this.status = Status.CONTRATADO;
		}
	
	public void demitir() {
		if(this.status == Status.CONTRATADO)
			this.status = Status.DEMITIDO;
		}



}
