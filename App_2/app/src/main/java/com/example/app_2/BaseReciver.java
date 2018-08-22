package com.example.app_2;

        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;
        import android.widget.TextView;

public class BaseReciver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String name = intent.getStringExtra("name");
        String text = intent.getStringExtra("text");

        Intent mainActivity = new Intent(context, MainActivity.class);
        mainActivity.putExtra("name", name);
        mainActivity.putExtra("text",text);
        mainActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(mainActivity);
    }
}
