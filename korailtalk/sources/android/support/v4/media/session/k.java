package android.support.v4.media.session;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.h;

/* loaded from: classes.dex */
class k extends h.b {
    public k(j jVar) {
        super(jVar);
    }

    @Override // android.media.session.MediaSession.Callback
    public void onPlayFromUri(Uri uri, Bundle bundle) {
        MediaSessionCompat.ensureClassLoader(bundle);
        ((j) this.f6178a).onPlayFromUri(uri, bundle);
    }
}
