package androidx.media;

import android.media.session.MediaSessionManager;

/* loaded from: classes.dex */
final class j implements d {

    /* renamed from: a, reason: collision with root package name */
    final MediaSessionManager.RemoteUserInfo f10098a;

    j(String str, int i8, int i9) {
        this.f10098a = i.a(str, i8, i9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.f10098a.equals(((j) obj).f10098a);
        }
        return false;
    }

    @Override // androidx.media.d
    public String getPackageName() {
        return this.f10098a.getPackageName();
    }

    @Override // androidx.media.d
    public int getPid() {
        return this.f10098a.getPid();
    }

    @Override // androidx.media.d
    public int getUid() {
        return this.f10098a.getUid();
    }

    public int hashCode() {
        return Z.c.hash(this.f10098a);
    }

    j(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f10098a = remoteUserInfo;
    }
}
