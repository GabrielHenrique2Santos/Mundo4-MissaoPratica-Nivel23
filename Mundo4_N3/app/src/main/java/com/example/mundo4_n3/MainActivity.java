package com.example.mundo4_n3;

import android.os.Bundle;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import MessagesActivityç;
import RemindersActivity


public class MainActivity extends Activity {

    private Button btnMessages;
    private Button btnReminders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMessages = findViewById(R.id.MessagesActivity);
        btnReminders = findViewById(R.id.RemindersActivity);

        btnMessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação quando o botão de "Recados" é clicado
                startActivity(new Intent(MainActivity.this, MessagesActivity.class));
            }
        });

        btnReminders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ação quando o botão de "Lembretes" é clicado
                startActivity(new Intent(MainActivity.this, RemindersActivity.class));
            }
        });
    }
}