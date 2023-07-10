package org.example;

public abstract class Funcionario { //não pode ser instanciada porque é abstract, somente os filhos podem private int senha;
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(){

    }

    public abstract double getBonificacao(); //esse método sem corpo

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
