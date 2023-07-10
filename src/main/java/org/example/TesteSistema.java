package org.example;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(223);

        Administrador adm = new Administrador();
        adm.setSenha(222);

        Cliente cliente = new Cliente();
        cliente.setSenha(223);

        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cliente);
    }
}
