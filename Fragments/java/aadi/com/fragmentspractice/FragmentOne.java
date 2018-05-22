package aadi.com.fragmentspractice;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by AADI on 5/22/2018.
 */

public class FragmentOne extends Fragment {

    Register register;
    EditText name, hobby;
    Button btn;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        name = (EditText) view.findViewById(R.id.Name);
        hobby = (EditText) view.findViewById(R.id.Hobby);
        btn = (Button) view.findViewById(R.id.Submit);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                register.Change(name.getText().toString(), hobby.getText().toString());
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{

            register = (Register) context;
        }catch (Exception e){}
    }

    public interface Register{
        public void Change(String name, String hobby);
    }

}
