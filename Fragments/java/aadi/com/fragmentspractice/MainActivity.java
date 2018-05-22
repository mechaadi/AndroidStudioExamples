package aadi.com.fragmentspractice;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentOne.Register {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentOne fragmentOne = new FragmentOne();
        FragmentTwo fragmentTwo = new FragmentTwo();

        fragmentTransaction.add(R.id.fragment1, fragmentOne);
        fragmentTransaction.add(R.id.Fragment2, fragmentTwo);
        fragmentTransaction.commit();
    }

    @Override
    public void Change(String name, String hobby) {
        FragmentTwo fragmentTwo = (FragmentTwo) getSupportFragmentManager().findFragmentById(R.id.Fragment2);
        fragmentTwo.changetext(name, hobby);
    }
}
