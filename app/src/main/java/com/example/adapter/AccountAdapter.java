package com.example.adapter;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class AccountAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Account> accounts;
    @Override
    public int getCount() {
        return accounts.size();
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
    private class AccountViewHolder{

    }
}
