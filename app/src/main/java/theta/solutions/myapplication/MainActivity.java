package theta.solutions.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import theta.solutions.myapplication.Fragments.FragmentOne;
import theta.solutions.myapplication.Fragments.FragmentThree;
import theta.solutions.myapplication.Fragments.FragmentTwo;
import theta.solutions.myapplication.Interfaces.DataPassing;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,DataPassing {
Button mBtnFragment1,mBtnFragment2,mBtnFragment3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnFragment1=(Button)findViewById(R.id.btnfrag1);
        mBtnFragment2=(Button)findViewById(R.id.btnfrag2);
        mBtnFragment3=(Button)findViewById(R.id.btnfrag3);
        mBtnFragment1.setOnClickListener(this);
        mBtnFragment2.setOnClickListener(this);
        mBtnFragment3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnfrag1:
                FragmentOne fr1=new FragmentOne();
                getSupportFragmentManager().beginTransaction().replace(R.id.frlayout,fr1).addToBackStack(null).commit();

                break;
            case R.id.btnfrag2:
                FragmentTwo fr2=new FragmentTwo("abcde");
                getSupportFragmentManager().beginTransaction().replace(R.id.frlayout,fr2).addToBackStack(null).commit();
                break;
            case R.id.btnfrag3:
                FragmentThree fr3=new FragmentThree();
                getSupportFragmentManager().beginTransaction().replace(R.id.frlayout,fr3).addToBackStack(null).commit();
                break;
        }
    }

    @Override
    public int ReturnSenddatatoint(String Name, String Number) {
        return 0;
    }

    @Override
    public void SenddataToString(String data) {
       // Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void SenddataToInt(int data) {

    }
}
