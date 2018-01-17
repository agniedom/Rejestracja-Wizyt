package com.example.student.rejestracjawizyt;

/**
 * Created by student on 2018-01-17.
 */
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;



public class LekarzAdapter extends RecyclerView.Adapter<LekarzAdapter.ViewHolder>{

    private ArrayList<Lekarz> lekarz = new ArrayList<>();

    LekarzAdapter(ArrayList<Lekarz> lekarz) {
        this.lekarz = lekarz;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, null);
        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.setName(lekarz.get(position).getName());
        holder.setSpecjal(lekarz.get(position).getSpecjal());
    }

    @Override
    public int getItemCount() {
        return lekarz.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.btn_wybierz)
        Button Wybrane;

        @BindView(R.id.txtimie)
        TextView imie;

        @BindView(R.id.txtzawod)
        TextView zawod;

        public ViewHolder(View itemView)
        {
            super(itemView);
            ButterKnife.bind(this,itemView);
            Wybrane.setVisibility(View.INVISIBLE);
        }

        private void setName(String Name) {
            imie.setText(Name);
        }


        public void setSpecjal(String specjal) {
            zawod.setText(specjal);
        }
    }


}
