package com.example.siskebin.ui.DataAnggota;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DataAnggotaViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DataAnggotaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Belum ada Data Anggota");
    }

    public LiveData<String> getText() {
        return mText;
    }
}