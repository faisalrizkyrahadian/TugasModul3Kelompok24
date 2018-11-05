package com.example.asus.aplikasimodul2kel24new.ui.home;

import com.example.asus.aplikasimodul2kel24new.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);

}
