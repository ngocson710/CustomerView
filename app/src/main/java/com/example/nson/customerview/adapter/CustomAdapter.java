package com.example.nson.customerview.adapter;

/**
 * Created by NSON on 29-03-2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nson.customerview.Model.Contact;
import com.example.nson.customerview.R;

import java.util.ArrayList;
public class CustomAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private int resource;
    private ArrayList<Contact> arrContact;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> arrContact) {
        super(context, resource, arrContact);
        this.context = context;
        this.resource = resource;
        this.arrContact = arrContact;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.row_item_contact, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            viewHolder.tvNumberPhone = (TextView) convertView.findViewById(R.id.tvNumber);
            viewHolder.tvAvatar = (TextView) convertView.findViewById(R.id.tvAvatar);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Contact contact = arrContact.get(position);
        viewHolder.tvAvatar.setText(String.valueOf(position+1));
        viewHolder.tvAvatar.setBackgroundColor(contact.getmColor());
        viewHolder.tvName.setText(contact.getmName());
        viewHolder.tvNumberPhone.setText(contact.getmNumber());
        return convertView;
    }

    public class ViewHolder {
        TextView tvName, tvNumberPhone, tvAvatar;
    }
}