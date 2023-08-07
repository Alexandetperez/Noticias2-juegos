package com.breynnerperez.noticias2;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;
public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {
    private List<NewsItem> newsItems;
    private Context context;

    public NewsAdapter(List<NewsItem> newsItems, Context context) {
        this.newsItems = newsItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final NewsItem newsItem = newsItems.get(position);
        holder.titleTextView.setText(newsItem.getTitle());

        // Cargar imagen utilizando Glide
        Glide.with(context)
                .load(newsItem.getImageUrl())
                .into(holder.imageView);
        holder.itemView.setOnClickListener(v -> {
            // Abrir la URL de la noticia en un navegador web
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(newsItem.getUrl()));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return newsItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}


