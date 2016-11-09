package id.sch.smktelkom_mlg.learn.recyclerview01.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.sch.smktelkom_mlg.learn.recyclerview01.R;
import id.sch.smktelkom_mlg.learn.recyclerview01.model.Hotel;

/**
 * Created by DINI PUJI LESTARI on 11/9/2016.
 */

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.ViewHolder>
{
    ArrayList<Hotel> hotelList;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    public  HotelAdapter(ArrayList<Hotel> hotelList)
    {
        this.hotelList = hotelList;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {

        Hotel hotel = hotelList.get(position);
        holder.tvjJudul.setText(hotel.judul);
        holder.tvDeskripsi.setText(hotel.deskripsi);
        holder.ivFoto.setImageDrawable(hotel.foto);

    }

    @Override
    public int getItemCount()
    {
        if (hotelList!=null)
            return hotelList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivFoto;
        TextView tvjJudul;
        TextView tvDeskripsi;
        public ViewHolder(View itemView)
        {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvjJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);
        }
    }
}
