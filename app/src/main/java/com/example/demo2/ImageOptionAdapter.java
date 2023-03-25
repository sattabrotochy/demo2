package com.example.demo2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ImageOptionAdapter extends ArrayAdapter<ImageOption> {

    private Context mContext;
    private List<ImageOption> mImageOptions;

    public ImageOptionAdapter(Context context, List<ImageOption> imageOptions) {
        super(context, 0, imageOptions);
        mContext = context;
        mImageOptions = imageOptions;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.image_option_dropdown_item, parent, false);
        }

        ImageView imageView = view.findViewById(R.id.image_view);
        TextView nameView = view.findViewById(R.id.name_view);

        ImageOption imageOption = mImageOptions.get(position);
        imageView.setImageResource(imageOption.getImageResourceId());
        nameView.setText(imageOption.getName());

        return view;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.image_option_dropdown_item, parent, false);
        }

        ImageView imageView = view.findViewById(R.id.image_view);
        TextView nameView = view.findViewById(R.id.name_view);

        ImageOption imageOption = mImageOptions.get(position);
        imageView.setImageResource(imageOption.getImageResourceId());
        nameView.setText(imageOption.getName());

        return view;
    }
}

