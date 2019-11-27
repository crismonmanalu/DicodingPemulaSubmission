package com.example.perrempahan;

import android.os.Parcel;
import android.os.Parcelable;

public class Rempah implements Parcelable {

    public Rempah(){}

    private String nama_rempah;
    private String keterangan;
    private String photo;
    private String detail;


    protected Rempah(Parcel in) {
        nama_rempah = in.readString();
        keterangan = in.readString();
        photo = in.readString();
        detail = in.readString();
    }

    public static final Creator<Rempah> CREATOR = new Creator<Rempah>() {
        @Override
        public Rempah createFromParcel(Parcel in) {
            return new Rempah(in);
        }

        @Override
        public Rempah[] newArray(int size) {
            return new Rempah[size];
        }
    };

    public String getNama_rempah() {
        return nama_rempah;
    }

    public void setNama_rempah(String nama_rempah) {
        this.nama_rempah = nama_rempah;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama_rempah);
        dest.writeString(keterangan);
        dest.writeString(photo);
        dest.writeString(detail);
    }
}
