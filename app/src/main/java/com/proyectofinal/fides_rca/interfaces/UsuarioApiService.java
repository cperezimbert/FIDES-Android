package com.proyectofinal.fides_rca.interfaces;

import com.proyectofinal.fides_rca.*;
import com.proyectofinal.fides_rca.persistence.UsuarioDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface UsuarioApiService {
    @POST("rest/usuario/loginUsuario")
    Call<UsuarioDTO> login(@Body UsuarioDTO usuarioDTO);

    /*@GET("rest/usuario/todos")
    Call<List<ObservacionesDTO>> getDatosObservaciones();*/

    @GET("rest/usuario/{nombreUsuario}")
    Call<UsuarioDTO> getDatosUsuario(@Path("nombreUsuario") String nombreUsuario);

}
