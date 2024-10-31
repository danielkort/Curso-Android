package devandroid.kort.applistacurso.controller;

import android.util.Log;

import devandroid.kort.applistacurso.model.Pessoa;

public class PessoaController {

    public String toString(){

        Log.d("MVC_Controller","Controller iniciada...");

        return super.toString();

    }

    public void salvar(Pessoa pessoa) {

        Log.d("MVC_Controller","Salvo: "+pessoa.toString());

    }
}
