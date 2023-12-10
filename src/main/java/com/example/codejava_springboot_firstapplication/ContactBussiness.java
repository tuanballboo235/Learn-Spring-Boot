package com.example.codejava_springboot_firstapplication;

import java.util.ArrayList;
import java.util.List;

public class ContactBussiness {
    public List<Contact> getContactList(){
        List<Contact> listContact = new ArrayList<>();
        listContact.add(new Contact("Tuan Anh","tuanballboo@gmail.com","VN"));
        listContact.add(new Contact("Jonh Knead","jknead@gmail.com","GB"));
        listContact.add(new Contact("Marry Anna","manna@gmail.com","US"));
        listContact.add(new Contact("Kotonami","kotonami@gmail.com","JP"));
        return listContact;
    }
}
