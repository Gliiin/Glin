package com.example.aaaaaaa;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link zeroragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class zeroragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public zeroragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment zeroragment.
     */
    // TODO: Rename and change types and number of parameters
    public static zeroragment newInstance(String param1, String param2) {
        zeroragment fragment = new zeroragment();
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
        View fragment = inflater.inflate(R.layout.fragment_zeroragment, container, false);
        NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);

        View view1 = fragment.findViewById(R.id.puzz);

        view1.setOnClickListener(v -> navController.navigate(R.id.action_zeroragment_to_nineFragment));
     //   view1.setOnClickListener(v -> Log.d("tag", "1"));
        return fragment;
    }
}