package K3;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.util.Log;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    private static final String f2883d = "e";

    /* renamed from: a, reason: collision with root package name */
    private final Context f2884a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2885b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2886c = false;

    public e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f2884a = activity.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void c(MediaPlayer mediaPlayer) throws IllegalStateException {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(MediaPlayer mediaPlayer, int i8, int i9) throws IllegalStateException {
        Log.w(f2883d, "Failed to beep " + i8 + ", " + i9);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    public boolean isBeepEnabled() {
        return this.f2885b;
    }

    public boolean isVibrateEnabled() {
        return this.f2886c;
    }

    public MediaPlayer playBeepSound() throws IllegalStateException, Resources.NotFoundException, IOException, IllegalArgumentException {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: K3.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) throws IllegalStateException {
                e.c(mediaPlayer2);
            }
        });
        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: K3.d
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer2, int i8, int i9) {
                return e.d(mediaPlayer2, i8, i9);
            }
        });
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.f2884a.getResources().openRawResourceFd(m.zxing_beep);
            try {
                mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
                assetFileDescriptorOpenRawResourceFd.close();
                mediaPlayer.setVolume(0.1f, 0.1f);
                mediaPlayer.prepare();
                mediaPlayer.start();
                return mediaPlayer;
            } catch (Throwable th) {
                assetFileDescriptorOpenRawResourceFd.close();
                throw th;
            }
        } catch (IOException e8) {
            Log.w(f2883d, e8);
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        }
    }

    public synchronized void playBeepSoundAndVibrate() {
        Vibrator vibrator;
        try {
            if (this.f2885b) {
                playBeepSound();
            }
            if (this.f2886c && (vibrator = (Vibrator) this.f2884a.getSystemService("vibrator")) != null) {
                vibrator.vibrate(200L);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setBeepEnabled(boolean z8) {
        this.f2885b = z8;
    }

    public void setVibrateEnabled(boolean z8) {
        this.f2886c = z8;
    }
}
