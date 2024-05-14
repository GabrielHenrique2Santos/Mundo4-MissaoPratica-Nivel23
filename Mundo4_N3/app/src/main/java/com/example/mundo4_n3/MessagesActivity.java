package com.example.mundo4_n3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MessagesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        // Exemplo simples de exibição de mensagem
        TextView textView = findViewById(R.id.textView);
        textView.setText("Bem-vindo aos Recados!");
    }
}

