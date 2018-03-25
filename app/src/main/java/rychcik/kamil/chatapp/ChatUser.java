package rychcik.kamil.chatapp;

import android.text.format.DateFormat;

import java.util.Date;

/**
 * Created by Kamil on 2018-03-24.
 */

public class ChatUser {

    private String email;
    private String displayName;
    private String signupDate;

    public ChatUser(String email, String displayName) {
        this.email = email;
        this.displayName = displayName;

        // Initialize to current time
        DateFormat df = new DateFormat();
        signupDate = df.format("dd-MM-yyyy (HH:mm:ss)",new Date().getTime()).toString();

    }

    public ChatUser(){
    }

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getDisplayName() {return displayName;}

    public void setDisplayName(String displayName) {this.displayName = displayName;}

    public String getSignupDate() {return signupDate;}

    public void setSignupDate(String signupDate) {this.signupDate = signupDate;}
}