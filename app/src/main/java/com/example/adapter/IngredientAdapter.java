package com.example.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.model.Ingredient;

import java.util.List;

public class IngredientAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Ingredient> ingredients;
    @Override
    public int getCount() {
        return ingredients.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        return view;
    }
    private class IngredientViewHolder{

    }
}
