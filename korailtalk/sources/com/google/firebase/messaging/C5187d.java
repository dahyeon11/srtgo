package com.google.firebase.messaging;

import I2.AbstractC0611o;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.r;
import com.google.firebase.messaging.AbstractC5185b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: classes2.dex */
class C5187d {

    /* renamed from: a */
    private final Executor f25790a;

    /* renamed from: b */
    private final Context f25791b;

    /* renamed from: c */
    private final y f25792c;

    public C5187d(Context context, y yVar, Executor executor) {
        this.f25790a = executor;
        this.f25791b = context;
        this.f25792c = yVar;
    }

    private boolean b() {
        if (((KeyguardManager) this.f25791b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!o2.n.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int iMyPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f25791b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == iMyPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(AbstractC5185b.a aVar) {
        Log.isLoggable(AbstractC5186c.TAG, 3);
        ((NotificationManager) this.f25791b.getSystemService("notification")).notify(aVar.tag, aVar.id, aVar.notificationBuilder.build());
    }

    private v d() {
        v vVarCreate = v.create(this.f25792c.getString("gcm.n.image"));
        if (vVarCreate != null) {
            vVarCreate.start(this.f25790a);
        }
        return vVarCreate;
    }

    private void e(r.m mVar, v vVar) {
        if (vVar == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC0611o.await(vVar.getTask(), 5L, TimeUnit.SECONDS);
            mVar.setLargeIcon(bitmap);
            mVar.setStyle(new r.j().bigPicture(bitmap).bigLargeIcon((Bitmap) null));
        } catch (InterruptedException unused) {
            Log.w(AbstractC5186c.TAG, "Interrupted while downloading image, showing notification without it");
            vVar.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e8) {
            String strValueOf = String.valueOf(e8.getCause());
            StringBuilder sb = new StringBuilder(strValueOf.length() + 26);
            sb.append("Failed to download image: ");
            sb.append(strValueOf);
            Log.w(AbstractC5186c.TAG, sb.toString());
        } catch (TimeoutException unused2) {
            Log.w(AbstractC5186c.TAG, "Failed to download image in time, showing notification without it");
            vVar.close();
        }
    }

    boolean a() throws PackageManager.NameNotFoundException {
        if (this.f25792c.getBoolean("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        v vVarD = d();
        AbstractC5185b.a aVarD = AbstractC5185b.d(this.f25791b, this.f25792c);
        e(aVarD.notificationBuilder, vVarD);
        c(aVarD);
        return true;
    }
}
