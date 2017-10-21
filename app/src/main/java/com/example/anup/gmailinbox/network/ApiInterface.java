package com.example.anup.gmailinbox.network;

import com.example.anup.gmailinbox.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Anup on 10/21/2017.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();

}
