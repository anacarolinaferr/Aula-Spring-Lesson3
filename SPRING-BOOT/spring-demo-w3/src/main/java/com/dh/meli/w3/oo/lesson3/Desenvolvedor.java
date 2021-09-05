package com.dh.meli.w3.oo.lesson3;

public class Desenvolvedor extends Funcionario{

    private String senha;

    public Desenvolvedor(String n, String s, double sal) {
        super(n, s, sal);
        this.senha = String.valueOf(Long.MAX_VALUE);;
    }


    public String getSenha() {
        return senha;
    }

    @Override
    public String toString() {
        return super.toString() + "      " + getSenha();
    }
}
