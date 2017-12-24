package com.example.umar.mad_assigment_1;

/**
 * Created by umar on 23/12/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private ArrayList<User> users;
    Intent callIntent;
    private Context context;

    public UserAdapter(ArrayList<User> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_row, parent, false);
        ViewHolder ev = new ViewHolder(view);
        return ev;
    }

    @Override
    public void onBindViewHolder(final UserAdapter.ViewHolder holder, final int position) {

        holder.image.setImageResource(users.get(position).getCall());
        holder.name.setText(users.get(position).getName());
        holder.phone.setText(users.get(position).getPhone());

        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + users.get(position).getPhone()));
                context.startActivity(callIntent);
                Toast.makeText(context, "Call starting" + users.get(position).getPhone(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, phone;
        ImageView image;
        LinearLayout btnLayout;
        private static final String UOL = "ABC";

        public ViewHolder(View itemView) {
            super(itemView);
            btnLayout = itemView.findViewById(R.id.btnLayout);
            image = itemView.findViewById(R.id.image1);
            name = itemView.findViewById(R.id.name);
            phone = itemView.findViewById(R.id.phone);

        }
    }

}