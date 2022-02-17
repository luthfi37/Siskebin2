package com.example.siskebin.ui.PengajuanKegiatan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PengajuanKegiatanViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PengajuanKegiatanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Belum ada Pengajuan Kegiatan");
    }

    public LiveData<String> getText() {
        return mText;
    }
}