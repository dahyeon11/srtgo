package P7;

import android.support.v4.media.session.PlaybackStateCompat;

/* loaded from: classes3.dex */
abstract class t {

    /* renamed from: a, reason: collision with root package name */
    static s f3820a;

    /* renamed from: b, reason: collision with root package name */
    static long f3821b;

    static void a(s sVar) {
        if (sVar.f3818f != null || sVar.f3819g != null) {
            throw new IllegalArgumentException();
        }
        if (sVar.f3816d) {
            return;
        }
        synchronized (t.class) {
            try {
                long j8 = f3821b;
                if (j8 + PlaybackStateCompat.ACTION_PLAY_FROM_URI > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    return;
                }
                f3821b = j8 + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                sVar.f3818f = f3820a;
                sVar.f3815c = 0;
                sVar.f3814b = 0;
                f3820a = sVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static s b() {
        synchronized (t.class) {
            try {
                s sVar = f3820a;
                if (sVar == null) {
                    return new s();
                }
                f3820a = sVar.f3818f;
                sVar.f3818f = null;
                f3821b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return sVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
