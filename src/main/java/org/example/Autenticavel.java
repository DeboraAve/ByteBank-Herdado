package org.example;

//Contrato Autenticavel, quem assina precisa implementar os métodos setSenha e autentica
public abstract interface Autenticavel{

    public abstract void setSenha(int senha);


    public abstract boolean autentica(int senha);

}

