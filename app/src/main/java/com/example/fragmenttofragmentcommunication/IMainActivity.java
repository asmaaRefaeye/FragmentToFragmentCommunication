package com.example.fragmenttofragmentcommunication;

public interface IMainActivity {

    void setToolbarTitle(String fragmentTag);

    void inflateFragment(String fragmentTag, String message);
}
