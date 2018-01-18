package com.anselmo.venues.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.anselmo.venues.R;
import com.anselmo.venues.models.Venue;
import com.anselmo.venues.models.VenueReponse;

import java.util.List;

import retrofit2.Response;

/**
 * Created by Anselmo on 1/17/2018.
 */

public class VenuesAdapter extends RecyclerView.Adapter<VenuesAdapter.VenuesHolder> {
    private Context mContext;
    private List<Venue> items;

    public VenuesAdapter(Context context, List<Venue> items) {
        this.mContext = context;
        this.items = items;
    }

    public class VenuesHolder extends RecyclerView.ViewHolder {
        public TextView name;
        public TextView verified;
        public TextView postalCode;
        public ImageButton favorite;

        public VenuesHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.item_name);
            verified = (TextView) view.findViewById(R.id.item_verified);
            postalCode = (TextView) view.findViewById(R.id.item_postalCode);
            favorite = (ImageButton) view.findViewById(R.id.item_favorite);
        }
    }

    @Override
    public VenuesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new VenuesHolder(itemView);
    }

    @Override
    public void onBindViewHolder(VenuesHolder holder, int position) {
        Venue response = items.get(position);
        holder.name.setText(response.getName());
        holder.verified.setText(""  + response.getVerified());
        if( response.getLocation() != null ) {
            holder.postalCode.setText(response.getLocation().getPostalCode());
        } else {
            holder.postalCode.setText("No disponible");
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
