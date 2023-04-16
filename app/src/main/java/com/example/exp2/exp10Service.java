package com.example.exp2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class exp10Service extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void onCreate()
    {
        Toast.makeText(this, "My Service Started",Toast.LENGTH_LONG).show();
    }
    public void onDestroy()
    {
        Toast.makeText(this, "My Service Stopped", Toast.LENGTH_LONG).show();
    }
    public void onStart(Intent intent, int startid)
    {
        Intent dialogIntent = new Intent(getBaseContext(),
                exp10Second.class);
        dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        getApplication().startActivity(dialogIntent);
    }
}