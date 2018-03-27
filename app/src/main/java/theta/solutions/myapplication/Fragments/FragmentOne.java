package theta.solutions.myapplication.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import theta.solutions.myapplication.Interfaces.DataPassing;
import theta.solutions.myapplication.R;


public class FragmentOne extends Fragment implements View.OnClickListener {
    Button mBtnMove;
    DataPassing oDataPassing;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view= inflater.inflate(R.layout.fragment_one, container,false);
        mBtnMove=(Button)view.findViewById(R.id.btnMove);

        mBtnMove.setOnClickListener(this);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        oDataPassing=(DataPassing)context;
    }

    @Override
    public void onClick(View view) {
        //oDataPassing.SenddataToString("abcd");

        FragmentTwo ofr2=new FragmentTwo("abc");
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frlayout,ofr2).addToBackStack(null).commit();
    }
}
