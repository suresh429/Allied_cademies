package com.journals.alliedacademies.ui.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.journals.alliedacademies.R;
import com.journals.alliedacademies.databinding.CatgeogryListItemBinding;
import com.journals.alliedacademies.model.CategoryResponse;


import java.util.List;

import static android.content.ContentValues.TAG;


public class CategoryListAdapter extends RecyclerView.Adapter<CategoryListAdapter.ViewHolder> {

    List<CategoryResponse.SubcatDetailsBean> modelList;

    Context context;
    public CategoryListAdapter(List<CategoryResponse.SubcatDetailsBean> modelList,Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(CatgeogryListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryListAdapter.ViewHolder holder, int position) {

        holder.rowItemBinding.txtCategoryTitle.setText(modelList.get(position).getManagejournal());
        holder.rowItemBinding.txtCategoryEdition.setText(modelList.get(position).getVolIssueName());
        Log.d(TAG, "onBindViewHolder: "+modelList.get(position).getFlyerimg());
        Glide.with(context)
                .load(modelList.get(position).getFlyerimg())
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new CustomTarget<Drawable>() {
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                        holder.rowItemBinding.imgJournal.setImageDrawable(resource);

                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {


                    }

                });

        holder.rowItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("journal", modelList.get(position).getJournal());
                bundle.putString("page_url", modelList.get(position).getHomeUrl());
                bundle.putString("journalcode", modelList.get(position).getJournalcode());
                bundle.putString("rel_keyword", modelList.get(position).getRelKeyword());
                bundle.putString("journal_logo", modelList.get(position).getJournalLogo());
                bundle.putString("track_paper", modelList.get(position).getTrackPaper());
                bundle.putString("instructions", modelList.get(position).getInstUrl());
                Navigation.findNavController(v).navigate(R.id.dashBoardFragment,bundle);
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CatgeogryListItemBinding rowItemBinding;

        public ViewHolder(@NonNull CatgeogryListItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
