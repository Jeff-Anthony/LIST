package com.ggave.contactlist.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ggave.contactlist.R;
import com.ggave.contactlist.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ViewHolder> {

    private List<Contact> contacts;

    public void setContacts(List<Contact> contacts){

        this.contacts = contacts;

    }

    public ContactsAdapter() {

        this.contacts = new ArrayList<>();

    }

    class ViewHolder extends RecyclerView.ViewHolder{


        ImageView PictureImage;
        TextView fullnameText;
        TextView emailText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            PictureImage = itemView.findViewById(R.id.picture_image);
            fullnameText = itemView.findViewById(R.id.fullname_text);
            emailText = itemView.findViewById(R.id.email_text);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ietm_contact, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
       Contact contact = this.contacts.get(i);

        Context context = viewHolder.itemView.getContext();

       viewHolder.fullnameText.setText(contact.getFullname());
       viewHolder.emailText.setText(contact.getEmail());

       int idres= context.getResources().getIdentifier(contact.getPicture(), "drawable", context.getPackageName());
       viewHolder.PictureImage.setImageResource(idres);

    }

    @Override
    public int getItemCount() {
        return this.contacts.size();
    }
}
