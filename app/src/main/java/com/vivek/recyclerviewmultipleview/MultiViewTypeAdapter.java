package com.vivek.recyclerviewmultipleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class MultiViewTypeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>
{
    private ArrayList<Model> data;
    Context mContext;
    int total_types;

    public static class TextTypeViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView_FirstItem;

        public TextTypeViewHolder(@NonNull View itemView)
        {
            super(itemView);
            this.textView_FirstItem=itemView.findViewById(R.id.textView_FirstItem);

        }
    }

    public static class RadioTypeViewHolder extends RecyclerView.ViewHolder
    {
        RadioButton radio_One,radio_Two;
        TextView textView_Radio;

        public RadioTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            radio_One=itemView.findViewById(R.id.radio_One);
            radio_Two=itemView.findViewById(R.id.radio_Two);
            textView_Radio=itemView.findViewById(R.id.textView_Radio);
        }
    }

    public static class ImageTypeViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView_SecondItem;
        TextView textView_ImageView;

        public ImageTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView_SecondItem=itemView.findViewById(R.id.imageView_SecondItem);
            textView_ImageView=itemView.findViewById(R.id.textView_ImageView);
        }
    }

    public static class RatingTypeViewHolder extends RecyclerView.ViewHolder
    {
        RatingBar ratingBar_ThirdItem;
        TextView textView_Rating;

        public RatingTypeViewHolder(@NonNull View itemView) {
            super(itemView);

            ratingBar_ThirdItem=itemView.findViewById(R.id.ratingBar_ThirdItem);
            textView_Rating=itemView.findViewById(R.id.textView_Rating);
        }
    }

    public MultiViewTypeAdapter(ArrayList<Model> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;
        total_types=data.size();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType)
    {
        View view;
        switch (viewType) {
            case Model.TEXT_TYPE:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_textview, viewGroup, false);
                return new TextTypeViewHolder(view);
            case Model.RADIO_TYPE:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_radiobuttons, viewGroup, false);
                return new RadioTypeViewHolder(view);
            case Model.IMAGE_TYPE:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_imageview, viewGroup, false);
                return new ImageTypeViewHolder(view);
            case Model.RATING_TYPE:
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_ratingbar, viewGroup, false);
                return new RatingTypeViewHolder(view);
        }
        return null;

    }

    @Override
    public int getItemViewType(int position) {

        switch (data.get(position).type) {
            case 0:
                return Model.TEXT_TYPE;
            case 1:
                return Model.RADIO_TYPE;
            case 2:
                return Model.IMAGE_TYPE;
            case 3:
                return Model.RATING_TYPE;
            default:
                return -1;
        }


    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int listPosition)
    {

        Model model=data.get(listPosition);
        if (model!=null)
        {
            switch (model.type)
            {
                case Model.TEXT_TYPE:
                    ((TextTypeViewHolder) viewHolder).textView_FirstItem.setText(model.text);
                    break;
                case Model.RADIO_TYPE:
                    ((RadioTypeViewHolder) viewHolder).textView_Radio.setText(model.text);
                    if (model.data == 0)
                    {
                        ((RadioTypeViewHolder) viewHolder).radio_One.setChecked(true);
                    }
                    else
                    {
                        ((RadioTypeViewHolder) viewHolder).radio_Two.setChecked(true);
                    }
                    break;
                case Model.IMAGE_TYPE:
                    ((ImageTypeViewHolder) viewHolder).textView_ImageView.setText(model.text);
                    ((ImageTypeViewHolder) viewHolder).imageView_SecondItem.setImageResource(model.data);
                    break;
                case Model.RATING_TYPE:
                    ((RatingTypeViewHolder) viewHolder).textView_Rating.setText(model.text);
                    ((RatingTypeViewHolder) viewHolder).ratingBar_ThirdItem.setRating(Float.parseFloat(String.valueOf(model.data)));
                    break;

            }
        }

    }

    @Override
    public int getItemCount()
    {
        return data.size();

    }


}
