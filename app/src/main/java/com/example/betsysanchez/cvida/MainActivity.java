package com.example.betsysanchez.cvida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView mLog;
Button run;
Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLog = (TextView) findViewById(R.id.log);
        run=findViewById(R.id.run_button);
        clear=findViewById(R.id.clear_button);
        mLog.setMovementMethod(new ScrollingMovementMethod());
        mLog.setText("");
        logMessage("onCreate");


        run.setOnClickListener(view -> runCode());
        clear.setOnClickListener(view -> clearLog());
    }

    // Desarrolle los métodos “runCode” y “clearLog”
    public void runCode() {
        logMessage("runCode");
        mLog.setText("runCode");
    }
    public void clearLog() {
        mLog.setText("");
        mLog.scrollTo(0, 0);
    }
    //Incorpore un método para la generación de mensajes y realice los cambios necesarios para el funcionamiento del Scroll
    private void logMessage(String message){
        Log.i("MyActivity",message+'\n');
    }
//HOW TO PRINT ANDROID STUDIO CONSOLE
    @Override
    protected void onStart() {
        super.onStart();
        logMessage("En el metodo OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logMessage("En el metodo OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logMessage("En el metodo OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logMessage("En el metodo OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logMessage("En el metodo OnResume");
    }
}
