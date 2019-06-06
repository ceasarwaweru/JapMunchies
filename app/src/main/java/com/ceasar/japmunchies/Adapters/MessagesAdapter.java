package com.ceasar.japmunchies.Adapters;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ceasar.japmunchies.Models.Ingredient;
import com.ceasar.japmunchies.Models.MessageItem;
import com.ceasar.japmunchies.R;

import java.util.List;

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.ViewHolder>   {
    private List<MessageItem> mMessagesList;
    private Activity mActivity;
    private Context mContext;


    public MessagesAdapter(List<MessageItem> messageList, Activity activity) {
        mMessagesList = messageList;
        this.mActivity = activity;
    }

    public List<MessageItem> getCurrentMessages(){
        return mMessagesList;
    }

    @NonNull
    @Override
    public MessagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View recipeView = inflater.inflate(R.layout.message_item, viewGroup, false);
        return new MessagesAdapter.ViewHolder(recipeView);
    }

    @Override
    public void onBindViewHolder(@NonNull MessagesAdapter.ViewHolder viewHolder, int i) {
        final MessageItem message = mMessagesList.get(i);

        viewHolder.senderName.setText(message.getmSenderName());
        viewHolder.commentText.setText(message.getmMessageText());

    }

    @Override
    public int getItemCount() {
        return mMessagesList.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        LinearLayout otherMessageLayout;
        TextView senderName;
        TextView commentText;

        CardView myMessageView;
        TextView senderName2;
        TextView commentText2;

        ViewHolder(View itemView) {
            super(itemView);
            otherMessageLayout = itemView.findViewById(R.id.otherMessageLayout);
            senderName = itemView.findViewById(R.id.senderName);
            commentText = itemView.findViewById(R.id.commentText);

            myMessageView = itemView.findViewById(R.id.myMessageView);
            senderName2 = itemView.findViewById(R.id.senderName2);
            commentText2 = itemView.findViewById(R.id.commentText2);
        }
    }

}
