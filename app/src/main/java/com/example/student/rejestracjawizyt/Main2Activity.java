package com.example.student.rejestracjawizyt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);


        ArrayList<Lekarz> lekarz = new ArrayList<>();
        lekarz.add(new Lekarz("Jan Kowalski","dermatolog"));
        lekarz.add(new Lekarz("Katarzyna Radecka","hepatolog"));
        lekarz.add(new Lekarz("Agnieszka Domańska","chirurg plastyczny"));
        lekarz.add(new Lekarz("Klaudia Nowak","kardiolog"));
        lekarz.add(new Lekarz("Alicja Mazur","neurolog"));


    }
}
