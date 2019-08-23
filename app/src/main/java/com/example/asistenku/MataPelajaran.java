package com.example.asistenku;

import android.graphics.drawable.Drawable;

public class MataPelajaran {

    String name_pelajaran;
    int image;

    public MataPelajaran(String name_pelajaran, int image) {
        this.name_pelajaran = name_pelajaran;
        this.image = image;
    }

    public String getName_pelajaran() {
        return name_pelajaran;
    }

    public int getImage() {
        return image;
    }
}
