package theta.solutions.myapplication.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import theta.solutions.myapplication.R;


public class FragmentTwo extends Fragment {
    String UserName;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view= inflater.inflate(R.layout.fragment_two, container,false);
        Toast.makeText(getContext(), UserName, Toast.LENGTH_SHORT).show();
        return view;
    }


    @SuppressLint("ValidFragment")
    public FragmentTwo(String Name){
        UserName=Name;
    }
    @SuppressLint("ValidFragment")
    public FragmentTwo(String Name,int Id){
        UserName=Name;
    }
    public  FragmentTwo(){

    }

}
