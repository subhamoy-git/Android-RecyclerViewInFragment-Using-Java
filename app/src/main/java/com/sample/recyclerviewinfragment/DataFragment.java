package com.sample.recyclerviewinfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DataFragment#newInstance} factory method to
 * create an instance of this fragment.
 */

public class DataFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<DataModel> dataholder;

    public DataFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DataFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DataFragment newInstance(String param1, String param2) {
        DataFragment fragment = new DataFragment();
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
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_datafragment, container, false);
        recyclerView=view.findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder=new ArrayList<>();

        DataModel ob1=new DataModel(R.drawable.android_img,"Android","Mobile Application");
        dataholder.add(ob1);

        DataModel ob2=new DataModel(R.drawable.apple,"ios","Mobile Application");
        dataholder.add(ob2);

        DataModel ob3=new DataModel(R.drawable.magento,"Magento","Web Application Framework");
        dataholder.add(ob3);

        DataModel ob4=new DataModel(R.drawable.angular,"Angular","Web Application");
        dataholder.add(ob4);

        DataModel ob5=new DataModel(R.drawable.dotnet,".NET Programming","Desktop and Web Programming");
        dataholder.add(ob5);

        DataModel ob6=new DataModel(R.drawable.java,"Java Programming","Desktop and Web Programming");
        dataholder.add(ob6);

        DataModel ob7=new DataModel(R.drawable.cp,"C Programming","Embed Programming");
        dataholder.add(ob7);

        DataModel ob8=new DataModel(R.drawable.cpp,"C++ Programming","Embed Programming");
        dataholder.add(ob8);

        DataModel ob9=new DataModel(R.drawable.shopify,"Shopify","E-Commerce Framework");
        dataholder.add(ob9);

        DataModel ob10=new DataModel(R.drawable.wordpress,"Wordpress","WebApplication Framewrok");
        dataholder.add(ob10);

        DataModel ob11=new DataModel(R.drawable.nodejs,"NodeJS","Web Application Framework");
        dataholder.add(ob11);

        DataModel ob12=new DataModel(R.drawable.python,"Python","Desktop and Web Programming");
        dataholder.add(ob12);

        recyclerView.setAdapter(new MyViewAdapter(dataholder));

        return view;
    }

}
