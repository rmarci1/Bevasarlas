package com.example.bevasarlas;
import java.util.List;

import retrofit2.all;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
public class ListaApiService {
    @GET("acttFJ/bevasrlas")
    Call<List<People>> getAllPeople();

    // GET user by ID
    @GET("acttFJ/bevasarlas/{id}")
    Call<People> getPeopleById(@Path("id") int id);

    // POST (create a new user)
    @POST("acttFJ/bevasrlas")
    Call<People> createPeople(@Body People people);

    // PUT (update a user)
    @PUT("acttFJ/bevasrlas/{id}")
    Call<People> updatePeople(@Path("id") int id, @Body People people);

    // DELETE (delete a user by ID)
    @DELETE("acttFJ/bevarlas/{id}")
    Call<Void> deletePeople(@Path("id") int id);
}
