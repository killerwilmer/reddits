package com.killerwilmer.reddits.views.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.killerwilmer.reddits.R;
import com.killerwilmer.reddits.persistence.RealmController;
import com.killerwilmer.reddits.persistence.entity.RedditEntity;
import com.killerwilmer.reddits.views.activities.DetailRedditActivity;
import com.squareup.picasso.Picasso;

import io.realm.Realm;

/**
 * Created by killerwilmer on 25/02/17.
 */

public class ListRedditAdapter extends RealmRecyclerViewAdapter<RedditEntity>  {

    final Context context;
    private Realm realm;
    private LayoutInflater inflater;

    public ListRedditAdapter(Context context) {

        this.context = context;
    }

    @Override
    public ListRedditAdapter.CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list_reddits, parent, false);
        return new ListRedditAdapter.CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {

        realm = RealmController.getInstance().getRealm();

        final RedditEntity redditEntity = getItem(position);
        final ListRedditAdapter.CardViewHolder holder = (ListRedditAdapter.CardViewHolder) viewHolder;

        holder.lblName.setText(redditEntity.getDisplay_name());
        if (redditEntity.getIcon_img() != "" && redditEntity.getIcon_img() != null && !redditEntity.getIcon_img().isEmpty()) {
            Picasso.with(context).load(redditEntity.getIcon_img()).into(holder.imgIcon);
        }
        holder.lblPublicDescription.setText(redditEntity.getPublic_description());

        holder.card.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailRedditActivity.class);
                intent.putExtra("reddit_id", redditEntity.getId().toString());
                context.startActivity(intent);
            }
        });
    }

    public int getItemCount() {

        if (getRealmAdapter() != null) {
            return getRealmAdapter().getCount();
        }
        return 0;
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {

        public CardView card;
        public TextView lblName;
        public ImageView imgIcon;
        public TextView lblPublicDescription;


        public CardViewHolder(View itemView) {
            super(itemView);

            card = (CardView) itemView.findViewById(R.id.card_reddits);
            lblName = (TextView) itemView.findViewById(R.id.display_name);
            imgIcon = (ImageView) itemView.findViewById(R.id.icon_img);
            lblPublicDescription = (TextView) itemView.findViewById(R.id.public_description);
        }
    }
}
