package android.support.v4.media.session;

import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
abstract class l {

    public interface a extends j {
        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onCustomAction(String str, Bundle bundle);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onFastForward();

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ boolean onMediaButtonEvent(Intent intent);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onPause();

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onPlay();

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onPlayFromMediaId(String str, Bundle bundle);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onPlayFromSearch(String str, Bundle bundle);

        @Override // android.support.v4.media.session.j
        /* synthetic */ void onPlayFromUri(Uri uri, Bundle bundle);

        void onPrepare();

        void onPrepareFromMediaId(String str, Bundle bundle);

        void onPrepareFromSearch(String str, Bundle bundle);

        void onPrepareFromUri(Uri uri, Bundle bundle);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onRewind();

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onSeekTo(long j8);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onSetRating(Object obj);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onSetRating(Object obj, Bundle bundle);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onSkipToNext();

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onSkipToPrevious();

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onSkipToQueueItem(long j8);

        @Override // android.support.v4.media.session.j, android.support.v4.media.session.h.a
        /* synthetic */ void onStop();
    }

    static class b extends k {
        public b(a aVar) {
            super(aVar);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepare() {
            ((a) this.f6178a).onPrepare();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((a) this.f6178a).onPrepareFromMediaId(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((a) this.f6178a).onPrepareFromSearch(str, bundle);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.ensureClassLoader(bundle);
            ((a) this.f6178a).onPrepareFromUri(uri, bundle);
        }
    }

    public static Object createCallback(a aVar) {
        return new b(aVar);
    }

    public static String getCallingPackage(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
            Log.e("MediaSessionCompatApi24", "Cannot execute MediaSession.getCallingPackage()", e8);
            return null;
        }
    }
}
