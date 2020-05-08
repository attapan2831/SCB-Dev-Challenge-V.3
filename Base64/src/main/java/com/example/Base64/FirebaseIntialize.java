package com.example.Base64;

import java.io.FileInputStream;

import javax.annotation.PostConstruct;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import org.springframework.stereotype.Service;

/**
 * FirebaseIntialize
 */
@Service
public class FirebaseIntialize {

    @PostConstruct
    public void intailize() {
        try {
            FileInputStream serviceAccount = new FileInputStream("./indexbase64.json");

            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://indexbase64.firebaseio.com").build();

            FirebaseApp.initializeApp(options);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}