package com.mp.playcardsmanager.Model;


import java.util.List;

public class Request {
    private String phone;
    private String name;
    private String address;
    private String total;
    private String status;
    private List<Order> decks; //the order's list

    public Request() {
    }

    public Request(String phone, String name, String address, String total, List<Order> decks) {
        this.phone = phone;
        this.name = name;
        this.address = address;
        this.total = total;
        this.decks = decks;
        this.status= "0"; //by default 0 | > 0 Placed |>1:In Transit |> 2 Received
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public List<Order> getDecks() {
        return decks;
    }

    public void setDecks(List<Order> decks) {
        this.decks = decks;
    }
}
