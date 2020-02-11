package com.example.booklibrary.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {

            String No = "" ;
            switch (input){

                case 1:
                    No = "読んだ本" ;
                    break;
                case 2:
                    No = "読みんでいる本" ;
                    break;
                case 3:
                    No = "積読本" ;
                    break;
                case 4:
                    No = "読んでみたい本" ;
                    break;
                default:
                    No = "" ;
                    break;
            }
            return No;
        }
    });

    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}