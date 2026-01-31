package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;

/* loaded from: classes.dex */
public final class c {
    public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";

    /* renamed from: a, reason: collision with root package name */
    d f10097a;

    public c(String str, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f10097a = new j(str, i8, i9);
        } else {
            this.f10097a = new k(str, i8, i9);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.f10097a.equals(((c) obj).f10097a);
        }
        return false;
    }

    public String getPackageName() {
        return this.f10097a.getPackageName();
    }

    public int getPid() {
        return this.f10097a.getPid();
    }

    public int getUid() {
        return this.f10097a.getUid();
    }

    public int hashCode() {
        return this.f10097a.hashCode();
    }

    public c(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f10097a = new j(remoteUserInfo);
    }
}
