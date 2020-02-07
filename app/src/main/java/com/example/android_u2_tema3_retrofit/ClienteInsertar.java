package com.example.android_u2_tema3_retrofit;

public class ClienteInsertar {
  public String nombre;
  public String apellido;
  public int sexo;
  public String direccion;
  public String telefono;
  public ClienteInsertar(String nombre, String apellido, int sexo, String direccion, String telefono) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.sexo = sexo;
    this.direccion = direccion;
    this.telefono = telefono;
  }
}
