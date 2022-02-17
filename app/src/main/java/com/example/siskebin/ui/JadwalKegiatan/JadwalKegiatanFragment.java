package com.example.siskebin.ui.JadwalKegiatan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.siskebin.databinding.FragmentGalleryBinding;

public class JadwalKegiatanFragment extends Fragment {

    private FragmentGalleryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        JadwalKegiatanViewModel jadwalKegiatanViewModel =
                new ViewModelProvider(this).get(JadwalKegiatanViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        jadwalKegiatanViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}