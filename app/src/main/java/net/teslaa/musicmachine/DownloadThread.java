package net.teslaa.musicmachine;

import android.os.Looper;
import android.provider.MediaStore;
import android.util.Log;

public class DownloadThread extends Thread {
    private static final String TAG = DownloadThread.class.getSimpleName();

    public DownloadHandler mHandler;
    @Override
    public void run() {
        Looper.prepare();
        mHandler = new DownloadHandler();
        Looper.loop();
    }

}
