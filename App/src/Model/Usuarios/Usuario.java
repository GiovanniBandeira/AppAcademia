package Model.Usuarios;

abstract public class Usuario {
    public String email;
    public String senha;
    public String nomeCompleto;


    public Usuario(){}

    public Usuario(String email, String senha, String nome){

        this.email = email;
        this.senha = senha;
        this.nomeCompleto = nome;

    }


}