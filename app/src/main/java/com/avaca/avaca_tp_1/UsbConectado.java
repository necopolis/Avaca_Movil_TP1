package com.avaca.avaca_tp_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class UsbConectado extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getExtras().getBoolean("connected"))
        {
            String numero = "911";
            Uri llamar = Uri.parse("tel:" + numero);
            Intent emergencia = new Intent(Intent.ACTION_CALL, llamar);
            context.startActivity(emergencia);
        }

    }
}
