package Model.Usuarios;

public class Perfil {

    public String nickName;
    
    //Medidas
    public float peso;
    public float altura;
    public float cintura;
    public float peito;
    public float ombro;
    public float quadril;
    public float coxaEsqueda;
    public float coxaDireita;
    public float panturilhaEsquerda;
    public float panturilhaDireita;
    public float bracoEsquerdo;
    public float bracoDireito;
    public float antibracoEsquerdo;
    public float antibracoDireito;

    public Perfil(){}

    public Perfil(String nome){

        this.nickName = nome;
        
    }
}
