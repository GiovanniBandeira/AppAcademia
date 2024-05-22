package Model;

import Enum.EnumMes;

public class Data {

    public int dia;
    public EnumMes mes;
    public int ano;

    public Data(int dia, EnumMes mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
}
