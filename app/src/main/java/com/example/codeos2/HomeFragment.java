package com.example.codeos2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    ArrayList<datamodel> dataholder;
    TextView tv_userName, tv_logout;
    FirebaseAuth auth = FirebaseAuth.getInstance();
    FirebaseUser user = auth.getCurrentUser();
    Context context;

    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_home, container, false);
       recyclerView = view.findViewById(R.id.recview);

        tv_userName = view.findViewById(R.id.tv_userName);
        tv_logout = view.findViewById(R.id.tv_logout);

        if(user != null){
            tv_userName.setText("Hey " + user.getDisplayName() + "!");
        }


        tv_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
                startActivity(new Intent(getContext(), LoginActivity.class));
                getActivity().finish();
            }
        });

       dataholder= new ArrayList<>();

       datamodel ob1 = new datamodel(R.drawable.java, "Java");
       dataholder.add(ob1);

       datamodel ob2 = new datamodel(R.drawable.python, "Python");
       dataholder.add(ob2);

       datamodel ob3 = new datamodel(R.drawable.cplus, "C++");
       dataholder.add(ob3);

       datamodel ob4 = new datamodel(R.drawable.html5, "HTML");
       dataholder.add(ob4);

       datamodel ob5 = new datamodel(R.drawable.css, "CSS");
       dataholder.add(ob5);

       datamodel ob6 = new datamodel(R.drawable.js2, "JavaScript");
       dataholder.add(ob6);



        recyclerView.setAdapter(new myadapter(getContext(),dataholder));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

       return view;
    }

}