package org.x3codes.contactmanagerapp;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ContactsViewModel extends AndroidViewModel  {
    private Repository repo;

    public ContactsViewModel(@NonNull Application application) {
        super(application);
        this.repo = new Repository(application);
    }

    public LiveData<List<Contacts>> getAllContacts () {

        return repo.getAllContacts();
    }

    public void addContact(Contacts contact) {
        repo.addContact(contact);
    }

    public void deleteContact(Contacts contact) {
        repo.deleteContact(contact);
    }

}
