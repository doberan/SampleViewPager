package com.doberan.study.myapplication.adapter;import android.content.Context;import android.support.annotation.NonNull;import android.support.v4.view.PagerAdapter;import android.view.View;import android.view.ViewGroup;public class SamplePagerAdapter extends PagerAdapter {    private Context mContext = null;    public SamplePagerAdapter() {        super();    }    @NonNull    @Override    public Object instantiateItem(@NonNull ViewGroup container, int position) {        return super.instantiateItem(container, position);    }    @Override    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {        super.destroyItem(container, position, object);    }    @Override    public int getItemPosition(@NonNull Object object) {        return super.getItemPosition(object);    }    @Override    public int getCount() {        return 0;    }    @Override    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {        return false;    }}