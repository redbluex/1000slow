package pl.redblue.rob.a100slow;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by ROB on 3/22/2018.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(185, 185));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(6, 6, 6, 6);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
        R.drawable.a1, R.drawable.b2, R.drawable.b3, R.drawable.b4, R.drawable.b5, R.drawable.b6, R.drawable.b7,
            R.drawable.b8, R.drawable.b9, R.drawable.b10,  R.drawable.b11, R.drawable.b12, R.drawable.b13, R.drawable.b14,
            R.drawable.b15, R.drawable.b16, R.drawable.b17, R.drawable.b18, R.drawable.b19, R.drawable.b20, R.drawable.b21,
            R.drawable.b22, R.drawable.b23, R.drawable.b24, R.drawable.b25
    };

    public Integer getmThumbIds(int n) {
        return this.mThumbIds[n];
    }

    public void setmThumbIdsNumber(int x, int y) {
        this.mThumbIds[x] = y;
    }
}
