package aadi.com.fragmentspractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by AADI on 5/22/2018.
 */

public class FragmentTwo extends Fragment {
    EditText name, hobby;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        name = (EditText) view.findViewById(R.id.Name);
        hobby = (EditText) view.findViewById(R.id.Hobby);
        return view;
    }
        public void changetext(String N, String H){
            name.setText(N);
            hobby.setText(H);
    }
}



