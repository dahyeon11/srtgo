package android.support.v4.media.session;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.session.h;

/* loaded from: classes.dex */
public interface j extends h.a {
    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onCustomAction(String str, Bundle bundle);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onFastForward();

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ boolean onMediaButtonEvent(Intent intent);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onPause();

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onPlay();

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onPlayFromMediaId(String str, Bundle bundle);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onPlayFromSearch(String str, Bundle bundle);

    void onPlayFromUri(Uri uri, Bundle bundle);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onRewind();

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onSeekTo(long j8);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onSetRating(Object obj);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onSetRating(Object obj, Bundle bundle);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onSkipToNext();

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onSkipToPrevious();

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onSkipToQueueItem(long j8);

    @Override // android.support.v4.media.session.h.a
    /* synthetic */ void onStop();
}
