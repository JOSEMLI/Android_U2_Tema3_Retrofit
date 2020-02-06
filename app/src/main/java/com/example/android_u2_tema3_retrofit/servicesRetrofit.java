package com.example.android_u2_tema3_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface servicesRetrofit {
  @GET("UPT/clientes.php")//indicamos el metodo y el endpoint
  //el call es el retorno de como nos devolvera
  Call<List<Cliente>> getUsersGet();//Recuerda que debes colocar como recibiremos esos datos,en este caso una lista de objs

  @GET("login.php")
  Call<String> getLoginGet(@Query("Usuario") String idUser, @Query("pass") String mipass);//Recuerda que el valor
// @Query(valor) debe ser igual a como lo espera el servicio



}
