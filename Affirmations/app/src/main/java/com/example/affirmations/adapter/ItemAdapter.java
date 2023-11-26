package com.example.affirmations.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.affirmations.R;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {

    private List<Affirmation> dataset;
    private Context context;

    public ItemAdapter(Context context, List<Affirmation> dataset) {
        this.dataset = dataset;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View adapterLayout = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(adapterLayout);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Affirmation item = dataset.get(position);
        holder.textView.setText(context.getResources().getString(item.stringResourceId));
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private View view;
        private TextView textView;

        public ItemViewHolder(View view) {
            super(view);
            this.view = view;
            textView = view.findViewById(R.id.item_title);
        }
    }
}
