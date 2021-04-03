package com.example.okapp.ui.devoloper;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DevoloperViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DevoloperViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Devoloper fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}