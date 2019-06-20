package com.example.share.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {
    private View rootView=null;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView=getSubView(inflater,container);
        setSubListener();
        return rootView;
    }

    protected abstract void setSubListener();

    protected  abstract View getSubView(LayoutInflater inflater,ViewGroup container);
}

