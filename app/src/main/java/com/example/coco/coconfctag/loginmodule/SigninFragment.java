package com.example.coco.coconfctag.loginmodule;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.coco.coconfctag.R;

/**
 * Created by Srikanth on 5/5/2017.
 */

public class SigninFragment extends Fragment
{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_signin, container, false);
        return v;
    }

}
