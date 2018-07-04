package com.chptr1.flixlix.activity.Cliente;

/**
 * Created by Vitor on 23/04/2018.
 */
import android.os.Parcel;
import android.os.Parcelable;

import static java.lang.System.in;

public class Cliente implements Parcelable{
    public int codigo;
    public String nome;

    public Cliente(int codigo, String nome){
        this.codigo = codigo;
        this.nome   = nome;
    }

    private Cliente(Parcel from){
        codigo  = from.readInt();
        nome    = from.readString();
    }

    public static final Parcelable.Creator<Cliente>
            CREATOR = new Parcelable.Creator<Cliente>(){

        public Cliente createFromParcel(Parcel in){
            return new Cliente(in);
        }

        public Cliente[] newArray(int size){
            return new Cliente[size];
        }
    };

    @Override
    public int describeContents(){
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags){
        dest.writeInt(codigo);
        dest.writeString(nome);
    }
}
