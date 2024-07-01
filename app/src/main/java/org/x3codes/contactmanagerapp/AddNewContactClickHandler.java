package org.x3codes.contactmanagerapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class AddNewContactClickHandler {

    Contacts contact;
    Context context;
    ContactsViewModel contactsViewModel;

    public AddNewContactClickHandler(Contacts contact, Context context, ContactsViewModel contactsViewModel) {
        this.contact = contact;
        this.context = context;
        this.contactsViewModel = contactsViewModel;
    }

    public void onSubmitBtnClicked(View view) {
        if (contact.getName() == null || contact.getEmail() == null) {
            Toast.makeText(context, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
        } else {
            Intent intent = new Intent(context, MainActivity.class);
            // intent.putExtra("Name", contact.getName());
            // intent.putExtra("Email", contact.getEmail());
            Contacts c = new Contacts(
                    contact.getName(),
                    contact.getEmail()
            );

            contactsViewModel.addContact(c);

            context.startActivity(intent);
        }
    }
}
