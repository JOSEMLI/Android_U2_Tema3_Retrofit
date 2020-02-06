package com.example.android_u2_tema3_retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface servicesRetrofit {
  @GET("UPT/clientes.php")//indicamos el metodo y el endpoint
  Call<List<Cliente>> getUsersGet();//Recuerda que debes colocar como recibiremos esos datos,en este caso una lista de objs
}
