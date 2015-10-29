package co.jogga.collapsingtoolbarflingexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private String[] mDataSet;

    private static final int TYPE_ITEM = 1;

    public MainAdapter() {
        mDataSet = new String[]{"Aggro Alfons", "Biomuell Bernd", "Chaplin Charlie", "Derpin Detlef", "Easy Eel", "Friggin Fritz", "Good Gustav", "Hans Hilfreich", "Intelligent Inez", "Jogging Joe"};
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        switch (viewType) {
            case TYPE_ITEM:
                View listItemUser = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.list_item_user, parent, false);
                return new ViewHolder(listItemUser);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof ViewHolder) {
            ViewHolder userItemViewHolder = (ViewHolder) holder;
            userItemViewHolder.textView.setText(mDataSet[position]);
            userItemViewHolder.imageView.setImageResource(R.drawable.dummyprofile_drawn);
        }
    }

    @Override
    public int getItemViewType(int position) {
        switch (position) {
            default:
                return 1;
        }
    }

    @Override
    public int getItemCount() { return mDataSet.length; }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;
        public Button button;

        public ViewHolder(View v) {
            super(v);
            textView = (TextView) itemView.findViewById(R.id.list_item_user_actualname);
            imageView = (ImageView) itemView.findViewById(R.id.list_item_user_userimage);
            button = (Button) itemView.findViewById(R.id.list_item_user_befriend_button);

        }
    }
}
