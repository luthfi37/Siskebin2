package com.example.siskebin.ui.JadwalKegiatan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class JadwalKegiatanViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public JadwalKegiatanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Belum ada Jadwal Kegiatan");
    }

    public LiveData<String> getText() {
        return mText;
    }
}