package com.example.mundo4_n3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class RemindersActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminders);

        // Exemplo simples de exibição de lembretes
        TextView textView = findViewById(R.id.textView);
        textView.setText("Aqui estão seus lembretes!");
    }
}