package com.mp.playcardsmanager.Common;

import com.mp.playcardsmanager.Model.Request;
import com.mp.playcardsmanager.Model.User;

/**
 * Created by Madalin on 31-Ian-18.
 */

public class Common {
    public static User currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)
    {
        if(code.equals("0"))
            return "Placed";
        else  if(code.equals("1"))
            return "In Transit";
        else
            return "Received";
    }
}
