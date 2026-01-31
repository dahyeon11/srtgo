package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.h;
import android.support.v4.media.session.l;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n0.C5924b;

/* loaded from: classes.dex */
public class MediaSessionCompat {
    public static final String ACTION_ARGUMENT_CAPTIONING_ENABLED = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    public static final String ACTION_ARGUMENT_EXTRAS = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    public static final String ACTION_ARGUMENT_MEDIA_ID = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";
    public static final String ACTION_ARGUMENT_QUERY = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    public static final String ACTION_ARGUMENT_RATING = "android.support.v4.media.session.action.ARGUMENT_RATING";
    public static final String ACTION_ARGUMENT_REPEAT_MODE = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    public static final String ACTION_ARGUMENT_SHUFFLE_MODE = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    public static final String ACTION_ARGUMENT_URI = "android.support.v4.media.session.action.ARGUMENT_URI";
    public static final String ACTION_FLAG_AS_INAPPROPRIATE = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";
    public static final String ACTION_FOLLOW = "android.support.v4.media.session.action.FOLLOW";
    public static final String ACTION_PLAY_FROM_URI = "android.support.v4.media.session.action.PLAY_FROM_URI";
    public static final String ACTION_PREPARE = "android.support.v4.media.session.action.PREPARE";
    public static final String ACTION_PREPARE_FROM_MEDIA_ID = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    public static final String ACTION_PREPARE_FROM_SEARCH = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    public static final String ACTION_PREPARE_FROM_URI = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    public static final String ACTION_SET_CAPTIONING_ENABLED = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    public static final String ACTION_SET_RATING = "android.support.v4.media.session.action.SET_RATING";
    public static final String ACTION_SET_REPEAT_MODE = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    public static final String ACTION_SET_SHUFFLE_MODE = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    public static final String ACTION_SKIP_AD = "android.support.v4.media.session.action.SKIP_AD";
    public static final String ACTION_UNFOLLOW = "android.support.v4.media.session.action.UNFOLLOW";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";
    public static final String ARGUMENT_MEDIA_ATTRIBUTE_VALUE = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";
    public static final int FLAG_HANDLES_MEDIA_BUTTONS = 1;
    public static final int FLAG_HANDLES_QUEUE_COMMANDS = 4;
    public static final int FLAG_HANDLES_TRANSPORT_CONTROLS = 2;
    public static final String KEY_EXTRA_BINDER = "android.support.v4.media.session.EXTRA_BINDER";
    public static final String KEY_SESSION_TOKEN2_BUNDLE = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";
    public static final String KEY_TOKEN = "android.support.v4.media.session.TOKEN";
    public static final int MEDIA_ATTRIBUTE_ALBUM = 1;
    public static final int MEDIA_ATTRIBUTE_ARTIST = 0;
    public static final int MEDIA_ATTRIBUTE_PLAYLIST = 2;

    /* renamed from: d, reason: collision with root package name */
    static int f6113d;

    /* renamed from: a, reason: collision with root package name */
    private final e f6114a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaControllerCompat f6115b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f6116c;

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public static final int UNKNOWN_ID = -1;

        /* renamed from: a, reason: collision with root package name */
        private final MediaDescriptionCompat f6117a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6118b;

        /* renamed from: c, reason: collision with root package name */
        private Object f6119c;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public QueueItem[] newArray(int i8) {
                return new QueueItem[i8];
            }
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j8) {
            this(null, mediaDescriptionCompat, j8);
        }

        public static QueueItem fromQueueItem(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.fromMediaDescription(h.c.getDescription(obj)), h.c.getQueueId(obj));
            }
            return null;
        }

        public static List<QueueItem> fromQueueItemList(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(fromQueueItem(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public MediaDescriptionCompat getDescription() {
            return this.f6117a;
        }

        public long getQueueId() {
            return this.f6118b;
        }

        public Object getQueueItem() {
            Object obj = this.f6119c;
            if (obj != null) {
                return obj;
            }
            Object objCreateItem = h.c.createItem(this.f6117a.getMediaDescription(), this.f6118b);
            this.f6119c = objCreateItem;
            return objCreateItem;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f6117a + ", Id=" + this.f6118b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            this.f6117a.writeToParcel(parcel, i8);
            parcel.writeLong(this.f6118b);
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j8) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j8 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f6117a = mediaDescriptionCompat;
            this.f6118b = j8;
            this.f6119c = obj;
        }

        QueueItem(Parcel parcel) {
            this.f6117a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f6118b = parcel.readLong();
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Object f6121a;

        /* renamed from: b, reason: collision with root package name */
        private android.support.v4.media.session.b f6122b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f6123c;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            public Token[] newArray(int i8) {
                return new Token[i8];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public static Token fromBundle(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            android.support.v4.media.session.b bVarAsInterface = b.a.asInterface(androidx.core.app.h.getBinder(bundle, MediaSessionCompat.KEY_EXTRA_BINDER));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.KEY_TOKEN);
            if (token == null) {
                return null;
            }
            return new Token(token.f6121a, bVarAsInterface, bundle2);
        }

        public static Token fromToken(Object obj) {
            return fromToken(obj, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f6121a;
            if (obj2 == null) {
                return token.f6121a == null;
            }
            Object obj3 = token.f6121a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public android.support.v4.media.session.b getExtraBinder() {
            return this.f6122b;
        }

        public Bundle getSessionToken2Bundle() {
            return this.f6123c;
        }

        public Object getToken() {
            return this.f6121a;
        }

        public int hashCode() {
            Object obj = this.f6121a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void setExtraBinder(android.support.v4.media.session.b bVar) {
            this.f6122b = bVar;
        }

        public void setSessionToken2Bundle(Bundle bundle) {
            this.f6123c = bundle;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.KEY_TOKEN, this);
            android.support.v4.media.session.b bVar = this.f6122b;
            if (bVar != null) {
                androidx.core.app.h.putBinder(bundle, MediaSessionCompat.KEY_EXTRA_BINDER, bVar.asBinder());
            }
            Bundle bundle2 = this.f6123c;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE, bundle2);
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable((Parcelable) this.f6121a, i8);
        }

        Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        public static Token fromToken(Object obj, android.support.v4.media.session.b bVar) {
            if (obj != null) {
                return new Token(android.support.v4.media.session.h.verifyToken(obj), bVar);
            }
            return null;
        }

        Token(Object obj, android.support.v4.media.session.b bVar, Bundle bundle) {
            this.f6121a = obj;
            this.f6122b = bVar;
            this.f6123c = bundle;
        }
    }

    class a extends d {
        a() {
        }
    }

    class b extends d {
        b() {
        }
    }

    class c extends d {
        c() {
        }
    }

    public static abstract class d {

        /* renamed from: b, reason: collision with root package name */
        WeakReference f6128b;

        /* renamed from: d, reason: collision with root package name */
        private boolean f6130d;

        /* renamed from: c, reason: collision with root package name */
        private a f6129c = null;

        /* renamed from: a, reason: collision with root package name */
        final Object f6127a = l.createCallback(new C0104d());

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    d.this.a((androidx.media.c) message.obj);
                }
            }
        }

        private class b implements h.a {
            b() {
            }

            @Override // android.support.v4.media.session.h.a
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                try {
                    QueueItem queueItem = null;
                    IBinder iBinderAsBinder = null;
                    queueItem = null;
                    if (str.equals(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER)) {
                        f fVar = (f) d.this.f6128b.get();
                        if (fVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token sessionToken = fVar.getSessionToken();
                            android.support.v4.media.session.b extraBinder = sessionToken.getExtraBinder();
                            if (extraBinder != null) {
                                iBinderAsBinder = extraBinder.asBinder();
                            }
                            androidx.core.app.h.putBinder(bundle2, MediaSessionCompat.KEY_EXTRA_BINDER, iBinderAsBinder);
                            bundle2.putBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE, sessionToken.getSessionToken2Bundle());
                            resultReceiver.send(0, bundle2);
                            return;
                        }
                        return;
                    }
                    if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM)) {
                        d.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                        return;
                    }
                    if (str.equals(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT)) {
                        d.this.onAddQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION), bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX));
                        return;
                    }
                    if (str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM)) {
                        d.this.onRemoveQueueItem((MediaDescriptionCompat) bundle.getParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION));
                        return;
                    }
                    if (!str.equals(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM_AT)) {
                        d.this.onCommand(str, bundle, resultReceiver);
                        return;
                    }
                    f fVar2 = (f) d.this.f6128b.get();
                    if (fVar2 == null || fVar2.f6140f == null) {
                        return;
                    }
                    int i8 = bundle.getInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, -1);
                    if (i8 >= 0 && i8 < fVar2.f6140f.size()) {
                        queueItem = (QueueItem) fVar2.f6140f.get(i8);
                    }
                    if (queueItem != null) {
                        d.this.onRemoveQueueItem(queueItem.getDescription());
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
            }

            @Override // android.support.v4.media.session.h.a
            public void onCustomAction(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS);
                MediaSessionCompat.ensureClassLoader(bundle2);
                if (str.equals(MediaSessionCompat.ACTION_PLAY_FROM_URI)) {
                    d.this.onPlayFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.ACTION_PREPARE)) {
                    d.this.onPrepare();
                    return;
                }
                if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
                    d.this.onPrepareFromMediaId(bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH)) {
                    d.this.onPrepareFromSearch(bundle.getString(MediaSessionCompat.ACTION_ARGUMENT_QUERY), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.ACTION_PREPARE_FROM_URI)) {
                    d.this.onPrepareFromUri((Uri) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI), bundle2);
                    return;
                }
                if (str.equals(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED)) {
                    d.this.onSetCaptioningEnabled(bundle.getBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED));
                    return;
                }
                if (str.equals(MediaSessionCompat.ACTION_SET_REPEAT_MODE)) {
                    d.this.onSetRepeatMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE));
                } else if (str.equals(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE)) {
                    d.this.onSetShuffleMode(bundle.getInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE));
                } else if (!str.equals(MediaSessionCompat.ACTION_SET_RATING)) {
                    d.this.onCustomAction(str, bundle);
                } else {
                    d.this.onSetRating((RatingCompat) bundle.getParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING), bundle2);
                }
            }

            @Override // android.support.v4.media.session.h.a
            public void onFastForward() {
                d.this.onFastForward();
            }

            @Override // android.support.v4.media.session.h.a
            public boolean onMediaButtonEvent(Intent intent) {
                return d.this.onMediaButtonEvent(intent);
            }

            @Override // android.support.v4.media.session.h.a
            public void onPause() {
                d.this.onPause();
            }

            @Override // android.support.v4.media.session.h.a
            public void onPlay() {
                d.this.onPlay();
            }

            @Override // android.support.v4.media.session.h.a
            public void onPlayFromMediaId(String str, Bundle bundle) {
                d.this.onPlayFromMediaId(str, bundle);
            }

            @Override // android.support.v4.media.session.h.a
            public void onPlayFromSearch(String str, Bundle bundle) {
                d.this.onPlayFromSearch(str, bundle);
            }

            @Override // android.support.v4.media.session.h.a
            public void onRewind() {
                d.this.onRewind();
            }

            @Override // android.support.v4.media.session.h.a
            public void onSeekTo(long j8) {
                d.this.onSeekTo(j8);
            }

            @Override // android.support.v4.media.session.h.a
            public void onSetRating(Object obj, Bundle bundle) {
            }

            @Override // android.support.v4.media.session.h.a
            public void onSkipToNext() {
                d.this.onSkipToNext();
            }

            @Override // android.support.v4.media.session.h.a
            public void onSkipToPrevious() {
                d.this.onSkipToPrevious();
            }

            @Override // android.support.v4.media.session.h.a
            public void onSkipToQueueItem(long j8) {
                d.this.onSkipToQueueItem(j8);
            }

            @Override // android.support.v4.media.session.h.a
            public void onStop() {
                d.this.onStop();
            }

            @Override // android.support.v4.media.session.h.a
            public void onSetRating(Object obj) {
                d.this.onSetRating(RatingCompat.fromRating(obj));
            }
        }

        private class c extends b implements j {
            c() {
                super();
            }

            @Override // android.support.v4.media.session.j
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                d.this.onPlayFromUri(uri, bundle);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$d, reason: collision with other inner class name */
        private class C0104d extends c implements l.a {
            C0104d() {
                super();
            }

            @Override // android.support.v4.media.session.l.a
            public void onPrepare() {
                d.this.onPrepare();
            }

            @Override // android.support.v4.media.session.l.a
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                d.this.onPrepareFromMediaId(str, bundle);
            }

            @Override // android.support.v4.media.session.l.a
            public void onPrepareFromSearch(String str, Bundle bundle) {
                d.this.onPrepareFromSearch(str, bundle);
            }

            @Override // android.support.v4.media.session.l.a
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                d.this.onPrepareFromUri(uri, bundle);
            }
        }

        void a(androidx.media.c cVar) {
            if (this.f6130d) {
                this.f6130d = false;
                this.f6129c.removeMessages(1);
                e eVar = (e) this.f6128b.get();
                if (eVar == null) {
                    return;
                }
                PlaybackStateCompat playbackState = eVar.getPlaybackState();
                long actions = playbackState == null ? 0L : playbackState.getActions();
                boolean z8 = playbackState != null && playbackState.getState() == 3;
                boolean z9 = (516 & actions) != 0;
                boolean z10 = (actions & 514) != 0;
                eVar.setCurrentControllerInfo(cVar);
                if (z8 && z10) {
                    onPause();
                } else if (!z8 && z9) {
                    onPlay();
                }
                eVar.setCurrentControllerInfo(null);
            }
        }

        void b(e eVar, Handler handler) {
            this.f6128b = new WeakReference(eVar);
            a aVar = this.f6129c;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages(null);
            }
            this.f6129c = new a(handler.getLooper());
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void onCustomAction(String str, Bundle bundle) {
        }

        public void onFastForward() {
        }

        public boolean onMediaButtonEvent(Intent intent) {
            e eVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (eVar = (e) this.f6128b.get()) == null || this.f6129c == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.c currentControllerInfo = eVar.getCurrentControllerInfo();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(currentControllerInfo);
                return false;
            }
            if (keyEvent.getRepeatCount() > 0) {
                a(currentControllerInfo);
            } else if (this.f6130d) {
                this.f6129c.removeMessages(1);
                this.f6130d = false;
                PlaybackStateCompat playbackState = eVar.getPlaybackState();
                if (((playbackState == null ? 0L : playbackState.getActions()) & 32) != 0) {
                    onSkipToNext();
                }
            } else {
                this.f6130d = true;
                a aVar = this.f6129c;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, currentControllerInfo), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
        }

        public void onPrepare() {
        }

        public void onPrepareFromMediaId(String str, Bundle bundle) {
        }

        public void onPrepareFromSearch(String str, Bundle bundle) {
        }

        public void onPrepareFromUri(Uri uri, Bundle bundle) {
        }

        public void onRemoveQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void onRemoveQueueItemAt(int i8) {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j8) {
        }

        public void onSetCaptioningEnabled(boolean z8) {
        }

        public void onSetRating(RatingCompat ratingCompat) {
        }

        public void onSetRepeatMode(int i8) {
        }

        public void onSetShuffleMode(int i8) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j8) {
        }

        public void onStop() {
        }

        public void onAddQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i8) {
        }

        public void onSetRating(RatingCompat ratingCompat, Bundle bundle) {
        }
    }

    interface e {
        String getCallingPackage();

        androidx.media.c getCurrentControllerInfo();

        Object getMediaSession();

        PlaybackStateCompat getPlaybackState();

        Object getRemoteControlClient();

        Token getSessionToken();

        boolean isActive();

        void release();

        void sendSessionEvent(String str, Bundle bundle);

        void setActive(boolean z8);

        void setCallback(d dVar, Handler handler);

        void setCaptioningEnabled(boolean z8);

        void setCurrentControllerInfo(androidx.media.c cVar);

        void setExtras(Bundle bundle);

        void setFlags(int i8);

        void setMediaButtonReceiver(PendingIntent pendingIntent);

        void setMetadata(MediaMetadataCompat mediaMetadataCompat);

        void setPlaybackState(PlaybackStateCompat playbackStateCompat);

        void setPlaybackToLocal(int i8);

        void setPlaybackToRemote(androidx.media.l lVar);

        void setQueue(List<QueueItem> list);

        void setQueueTitle(CharSequence charSequence);

        void setRatingType(int i8);

        void setRepeatMode(int i8);

        void setSessionActivity(PendingIntent pendingIntent);

        void setShuffleMode(int i8);
    }

    static class g extends f {
        g(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.e
        public final androidx.media.c getCurrentControllerInfo() {
            return new androidx.media.c(((MediaSession) this.f6135a).getCurrentControllerInfo());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.e
        public void setCurrentControllerInfo(androidx.media.c cVar) {
        }
    }

    public interface h {
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    static PlaybackStateCompat a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j8 = -1;
        if (playbackStateCompat.getPosition() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getState() != 3 && playbackStateCompat.getState() != 4 && playbackStateCompat.getState() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.getLastPositionUpdateTime() <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long playbackSpeed = ((long) (playbackStateCompat.getPlaybackSpeed() * (jElapsedRealtime - r0))) + playbackStateCompat.getPosition();
        if (mediaMetadataCompat != null && mediaMetadataCompat.containsKey(MediaMetadataCompat.METADATA_KEY_DURATION)) {
            j8 = mediaMetadataCompat.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
        }
        return new PlaybackStateCompat.b(playbackStateCompat).setState(playbackStateCompat.getState(), (j8 < 0 || playbackSpeed <= j8) ? playbackSpeed < 0 ? 0L : playbackSpeed : j8, playbackStateCompat.getPlaybackSpeed(), jElapsedRealtime).build();
    }

    public static void ensureClassLoader(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat fromMediaSession(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, new f(obj));
    }

    public void addOnActiveChangeListener(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f6116c.add(hVar);
    }

    public String getCallingPackage() {
        return this.f6114a.getCallingPackage();
    }

    public MediaControllerCompat getController() {
        return this.f6115b;
    }

    public final androidx.media.c getCurrentControllerInfo() {
        return this.f6114a.getCurrentControllerInfo();
    }

    public Object getMediaSession() {
        return this.f6114a.getMediaSession();
    }

    public Object getRemoteControlClient() {
        return this.f6114a.getRemoteControlClient();
    }

    public Token getSessionToken() {
        return this.f6114a.getSessionToken();
    }

    public boolean isActive() {
        return this.f6114a.isActive();
    }

    public void release() {
        this.f6114a.release();
    }

    public void removeOnActiveChangeListener(h hVar) {
        if (hVar == null) {
            throw new IllegalArgumentException("Listener may not be null");
        }
        this.f6116c.remove(hVar);
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("event cannot be null or empty");
        }
        this.f6114a.sendSessionEvent(str, bundle);
    }

    public void setActive(boolean z8) {
        this.f6114a.setActive(z8);
        Iterator it = this.f6116c.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
    }

    public void setCallback(d dVar) {
        setCallback(dVar, null);
    }

    public void setCaptioningEnabled(boolean z8) {
        this.f6114a.setCaptioningEnabled(z8);
    }

    public void setExtras(Bundle bundle) {
        this.f6114a.setExtras(bundle);
    }

    public void setFlags(int i8) {
        this.f6114a.setFlags(i8);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.f6114a.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.f6114a.setMetadata(mediaMetadataCompat);
    }

    public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
        this.f6114a.setPlaybackState(playbackStateCompat);
    }

    public void setPlaybackToLocal(int i8) {
        this.f6114a.setPlaybackToLocal(i8);
    }

    public void setPlaybackToRemote(androidx.media.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f6114a.setPlaybackToRemote(lVar);
    }

    public void setQueue(List<QueueItem> list) {
        this.f6114a.setQueue(list);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.f6114a.setQueueTitle(charSequence);
    }

    public void setRatingType(int i8) {
        this.f6114a.setRatingType(i8);
    }

    public void setRepeatMode(int i8) {
        this.f6114a.setRepeatMode(i8);
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.f6114a.setSessionActivity(pendingIntent);
    }

    public void setShuffleMode(int i8) {
        this.f6114a.setShuffleMode(i8);
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        ResultReceiver f6120a;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public ResultReceiverWrapper[] newArray(int i8) {
                return new ResultReceiverWrapper[i8];
            }
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.f6120a = resultReceiver;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            this.f6120a.writeToParcel(parcel, i8);
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f6120a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public void setCallback(d dVar, Handler handler) {
        if (dVar == null) {
            this.f6114a.setCallback(null, null);
            return;
        }
        e eVar = this.f6114a;
        if (handler == null) {
            handler = new Handler();
        }
        eVar.setCallback(dVar, handler);
    }

    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, null, null, bundle);
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f6116c = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (componentName == null && (componentName = C5924b.getMediaButtonReceiverComponent(context)) == null) {
                    Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    g gVar = new g(context, str, bundle);
                    this.f6114a = gVar;
                    setCallback(new a());
                    gVar.setMediaButtonReceiver(pendingIntent);
                } else {
                    f fVar = new f(context, str, bundle);
                    this.f6114a = fVar;
                    setCallback(new b());
                    fVar.setMediaButtonReceiver(pendingIntent);
                }
                this.f6115b = new MediaControllerCompat(context, this);
                if (f6113d == 0) {
                    f6113d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        final Object f6135a;

        /* renamed from: b, reason: collision with root package name */
        final Token f6136b;

        /* renamed from: c, reason: collision with root package name */
        boolean f6137c = false;

        /* renamed from: d, reason: collision with root package name */
        final RemoteCallbackList f6138d = new RemoteCallbackList();

        /* renamed from: e, reason: collision with root package name */
        PlaybackStateCompat f6139e;

        /* renamed from: f, reason: collision with root package name */
        List f6140f;

        /* renamed from: g, reason: collision with root package name */
        MediaMetadataCompat f6141g;

        /* renamed from: h, reason: collision with root package name */
        int f6142h;

        /* renamed from: i, reason: collision with root package name */
        boolean f6143i;

        /* renamed from: j, reason: collision with root package name */
        int f6144j;

        /* renamed from: k, reason: collision with root package name */
        int f6145k;

        class a extends b.a {
            a() {
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i8) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void adjustVolume(int i8, int i9, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void fastForward() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public Bundle getExtras() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public long getFlags() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public PendingIntent getLaunchPendingIntent() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public MediaMetadataCompat getMetadata() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public String getPackageName() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public PlaybackStateCompat getPlaybackState() {
                f fVar = f.this;
                return MediaSessionCompat.a(fVar.f6139e, fVar.f6141g);
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public List<QueueItem> getQueue() {
                return null;
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public CharSequence getQueueTitle() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public int getRatingType() {
                return f.this.f6142h;
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public int getRepeatMode() {
                return f.this.f6144j;
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public int getShuffleMode() {
                return f.this.f6145k;
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public String getTag() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public ParcelableVolumeInfo getVolumeAttributes() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public boolean isCaptioningEnabled() {
                return f.this.f6143i;
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public boolean isShuffleModeEnabledRemoved() {
                return false;
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public boolean isTransportControlEnabled() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void pause() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void play() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void playFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void playFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void playFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void prepare() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void prepareFromMediaId(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void prepareFromSearch(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void prepareFromUri(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void rate(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void registerCallbackListener(android.support.v4.media.session.a aVar) {
                f fVar = f.this;
                if (fVar.f6137c) {
                    return;
                }
                String callingPackage = fVar.getCallingPackage();
                if (callingPackage == null) {
                    callingPackage = androidx.media.c.LEGACY_CONTROLLER;
                }
                f.this.f6138d.register(aVar, new androidx.media.c(callingPackage, Binder.getCallingPid(), Binder.getCallingUid()));
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void removeQueueItemAt(int i8) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void rewind() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void seekTo(long j8) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void sendCommand(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void sendCustomAction(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public boolean sendMediaButton(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void setCaptioningEnabled(boolean z8) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void setRepeatMode(int i8) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void setShuffleMode(int i8) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void setShuffleModeEnabledRemoved(boolean z8) {
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void setVolumeTo(int i8, int i9, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void skipToQueueItem(long j8) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void stop() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b.a, android.support.v4.media.session.b
            public void unregisterCallbackListener(android.support.v4.media.session.a aVar) {
                f.this.f6138d.unregister(aVar);
            }
        }

        f(Context context, String str, Bundle bundle) {
            Object objCreateSession = android.support.v4.media.session.h.createSession(context, str);
            this.f6135a = objCreateSession;
            this.f6136b = new Token(android.support.v4.media.session.h.getSessionToken(objCreateSession), new a(), bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public String getCallingPackage() {
            return l.getCallingPackage(this.f6135a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public androidx.media.c getCurrentControllerInfo() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object getMediaSession() {
            return this.f6135a;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public PlaybackStateCompat getPlaybackState() {
            return this.f6139e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Object getRemoteControlClient() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public Token getSessionToken() {
            return this.f6136b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public boolean isActive() {
            return android.support.v4.media.session.h.isActive(this.f6135a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void release() {
            this.f6137c = true;
            android.support.v4.media.session.h.release(this.f6135a);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void sendSessionEvent(String str, Bundle bundle) {
            android.support.v4.media.session.h.sendSessionEvent(this.f6135a, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setActive(boolean z8) {
            android.support.v4.media.session.h.setActive(this.f6135a, z8);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setCallback(d dVar, Handler handler) {
            android.support.v4.media.session.h.setCallback(this.f6135a, dVar == null ? null : dVar.f6127a, handler);
            if (dVar != null) {
                dVar.b(this, handler);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setCaptioningEnabled(boolean z8) {
            if (this.f6143i != z8) {
                this.f6143i = z8;
                for (int iBeginBroadcast = this.f6138d.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f6138d.getBroadcastItem(iBeginBroadcast)).onCaptioningEnabledChanged(z8);
                    } catch (RemoteException unused) {
                    }
                }
                this.f6138d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setCurrentControllerInfo(androidx.media.c cVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setExtras(Bundle bundle) {
            android.support.v4.media.session.h.setExtras(this.f6135a, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setFlags(int i8) {
            android.support.v4.media.session.h.setFlags(this.f6135a, i8);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setMediaButtonReceiver(PendingIntent pendingIntent) {
            android.support.v4.media.session.h.setMediaButtonReceiver(this.f6135a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
            this.f6141g = mediaMetadataCompat;
            android.support.v4.media.session.h.setMetadata(this.f6135a, mediaMetadataCompat == null ? null : mediaMetadataCompat.getMediaMetadata());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setPlaybackState(PlaybackStateCompat playbackStateCompat) {
            this.f6139e = playbackStateCompat;
            for (int iBeginBroadcast = this.f6138d.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((android.support.v4.media.session.a) this.f6138d.getBroadcastItem(iBeginBroadcast)).onPlaybackStateChanged(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f6138d.finishBroadcast();
            android.support.v4.media.session.h.setPlaybackState(this.f6135a, playbackStateCompat == null ? null : playbackStateCompat.getPlaybackState());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setPlaybackToLocal(int i8) {
            android.support.v4.media.session.h.setPlaybackToLocal(this.f6135a, i8);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setPlaybackToRemote(androidx.media.l lVar) {
            android.support.v4.media.session.h.setPlaybackToRemote(this.f6135a, lVar.getVolumeProvider());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setQueue(List<QueueItem> list) {
            ArrayList arrayList;
            this.f6140f = list;
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<QueueItem> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getQueueItem());
                }
            } else {
                arrayList = null;
            }
            android.support.v4.media.session.h.setQueue(this.f6135a, arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setQueueTitle(CharSequence charSequence) {
            android.support.v4.media.session.h.setQueueTitle(this.f6135a, charSequence);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setRatingType(int i8) {
            i.setRatingType(this.f6135a, i8);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setRepeatMode(int i8) {
            if (this.f6144j != i8) {
                this.f6144j = i8;
                for (int iBeginBroadcast = this.f6138d.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f6138d.getBroadcastItem(iBeginBroadcast)).onRepeatModeChanged(i8);
                    } catch (RemoteException unused) {
                    }
                }
                this.f6138d.finishBroadcast();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setSessionActivity(PendingIntent pendingIntent) {
            android.support.v4.media.session.h.setSessionActivity(this.f6135a, pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.e
        public void setShuffleMode(int i8) {
            if (this.f6145k != i8) {
                this.f6145k = i8;
                for (int iBeginBroadcast = this.f6138d.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                    try {
                        ((android.support.v4.media.session.a) this.f6138d.getBroadcastItem(iBeginBroadcast)).onShuffleModeChanged(i8);
                    } catch (RemoteException unused) {
                    }
                }
                this.f6138d.finishBroadcast();
            }
        }

        f(Object obj) {
            Object objVerifySession = android.support.v4.media.session.h.verifySession(obj);
            this.f6135a = objVerifySession;
            this.f6136b = new Token(android.support.v4.media.session.h.getSessionToken(objVerifySession), new a());
        }
    }

    private MediaSessionCompat(Context context, e eVar) {
        this.f6116c = new ArrayList();
        this.f6114a = eVar;
        if (!android.support.v4.media.session.h.hasCallback(eVar.getMediaSession())) {
            setCallback(new c());
        }
        this.f6115b = new MediaControllerCompat(context, this);
    }
}
