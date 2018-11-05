package com.example.asus.aplikasimodul2kel24new.ui.detailCar;

import com.example.asus.aplikasimodul2kel24new.data.model.DataCar;
import com.example.asus.aplikasimodul2kel24new.data.model.DataCar;

import java.util.List;

public interface DetailView {
    String getName();

    String getMerk();

    String getModel();

    String getYear();
    void showError(String message);
    void showSuccess(List<DataCar> car);

    void successUpdate();

    void failedUpdate();
}