package com.example.priteshasvinetsakou.shotgunexercice.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.priteshasvinetsakou.shotgunexercice.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImageListFragment extends Fragment {

    int[]                       myImageList;
    View                        rootview;


    public ImageListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootview                        =   inflater.inflate(R.layout.fragment_image_list, container, false);
        initList();
        GridView            myGridView  =   (GridView) rootview.findViewById(R.id.gv_image_list);
        ImageListAdapter    myAdapter   =   new ImageListAdapter();
        myGridView.setAdapter(myAdapter);


        return rootview;
    }

    void initList() {
        myImageList                     = new int[]{R.drawable.france, R.drawable.louvre, R.drawable.moscou, R.drawable.gw_china, R.drawable.arc, R.drawable.liberty};
    }

    public class ImageListAdapter   extends BaseAdapter {

        @Override
        public int getCount() {
            return myImageList.length;
        }

        @Override
        public Object getItem(int position) {
            return myImageList[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ViewHolder  mViewHolder = new ViewHolder();
            View                    my_view;

            if (convertView == null) {
                my_view = View.inflate(getActivity(), R.layout.item_image,
                        null);
                mViewHolder = new ViewHolder();
            }
            else
                my_view = convertView;

            mViewHolder.iv_imageList = (ImageView) my_view.findViewById(R.id.iv_image_list);
            mViewHolder.iv_imageList.setImageResource(myImageList[position]);


            return my_view;
        }
    }
    class ViewHolder {
        ImageView iv_imageList;
    }
}
