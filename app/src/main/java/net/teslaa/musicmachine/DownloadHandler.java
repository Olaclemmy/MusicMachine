package net.teslaa.musicmachine;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class DownloadHandler extends Handler {

    private static final String TAG = DownloadHandler.class.getSimpleName();

    @Override
    public void handleMessage(Message msg) {
        //downloadSong(msg.obj.toString());
    }

}
