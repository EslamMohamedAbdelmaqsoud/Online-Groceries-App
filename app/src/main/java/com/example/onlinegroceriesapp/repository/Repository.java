package com.example.onlinegroceriesapp.repository;

import com.example.onlinegroceriesapp.models.Products;
import com.example.onlinegroceriesapp.network.RetrofitClient;

import java.util.List;

import retrofit2.Call;

public class Repository {
    public Call<List<Products>> getProducts() {
        return RetrofitClient.getInstance().getMyApi().getProducts();
    }

    public Call<List<Products>> getJewelery() {
        return RetrofitClient.getInstance().getMyApi().getJewelery();
    }

    public Call<List<Products>> getElectronics() {
        return RetrofitClient.getInstance().getMyApi().getElectronics();
    }

    public Call<List<Products>> getMens_Clothing() {
        return RetrofitClient.getInstance().getMyApi().getMens_Clothing();
    }

    public Call<List<Products>> getWomen_Colthing() {
        return RetrofitClient.getInstance().getMyApi().getWomen_Colthing();
    }
}
