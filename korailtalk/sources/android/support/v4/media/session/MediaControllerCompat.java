package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.core.app.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class MediaControllerCompat {
    public static final String COMMAND_ADD_QUEUE_ITEM = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    public static final String COMMAND_ADD_QUEUE_ITEM_AT = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    public static final String COMMAND_ARGUMENT_INDEX = "android.support.v4.media.session.command.ARGUMENT_INDEX";
    public static final String COMMAND_ARGUMENT_MEDIA_DESCRIPTION = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    public static final String COMMAND_GET_EXTRA_BINDER = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    public static final String COMMAND_REMOVE_QUEUE_ITEM = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    public static final String COMMAND_REMOVE_QUEUE_ITEM_AT = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";

    /* renamed from: a */
    private final c f6090a;

    /* renamed from: b */
    private final MediaSessionCompat.Token f6091b;

    /* renamed from: c */
    private final HashSet f6092c = new HashSet();

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a */
        final Object f6099a = android.support.v4.media.session.c.createCallback(new b(this));

        /* renamed from: b */
        HandlerC0103a f6100b;

        /* renamed from: c */
        android.support.v4.media.session.a f6101c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        private class HandlerC0103a extends Handler {

            /* renamed from: a */
            boolean f6102a;

            HandlerC0103a(Looper looper) {
                super(looper);
                this.f6102a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f6102a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.ensureClassLoader(data);
                            a.this.onSessionEvent((String) message.obj, data);
                            break;
                        case 2:
                            a.this.onPlaybackStateChanged((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            a.this.onMetadataChanged((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            a.this.onAudioInfoChanged((f) message.obj);
                            break;
                        case 5:
                            a.this.onQueueChanged((List) message.obj);
                            break;
                        case 6:
                            a.this.onQueueTitleChanged((CharSequence) message.obj);
                            break;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.ensureClassLoader(bundle);
                            a.this.onExtrasChanged(bundle);
                            break;
                        case 8:
                            a.this.onSessionDestroyed();
                            break;
                        case 9:
                            a.this.onRepeatModeChanged(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            a.this.onCaptioningEnabledChanged(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            a.this.onShuffleModeChanged(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            a.this.onSessionReady();
                            break;
                    }
                }
            }
        }

        private static class b implements c.a {

            /* renamed from: a */
            private final WeakReference f6104a;

            b(a aVar) {
                this.f6104a = new WeakReference(aVar);
            }

            @Override // android.support.v4.media.session.c.a
            public void onAudioInfoChanged(int i8, int i9, int i10, int i11, int i12) {
                a aVar = (a) this.f6104a.get();
                if (aVar != null) {
                    aVar.onAudioInfoChanged(new f(i8, i9, i10, i11, i12));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void onExtrasChanged(Bundle bundle) {
                a aVar = (a) this.f6104a.get();
                if (aVar != null) {
                    aVar.onExtrasChanged(bundle);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void onMetadataChanged(Object obj) {
                a aVar = (a) this.f6104a.get();
                if (aVar != null) {
                    aVar.onMetadataChanged(MediaMetadataCompat.fromMediaMetadata(obj));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void onPlaybackStateChanged(Object obj) {
                a aVar = (a) this.f6104a.get();
                if (aVar == null || aVar.f6101c != null) {
                    return;
                }
                aVar.onPlaybackStateChanged(PlaybackStateCompat.fromPlaybackState(obj));
            }

            @Override // android.support.v4.media.session.c.a
            public void onQueueChanged(List<?> list) {
                a aVar = (a) this.f6104a.get();
                if (aVar != null) {
                    aVar.onQueueChanged(MediaSessionCompat.QueueItem.fromQueueItemList(list));
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = (a) this.f6104a.get();
                if (aVar != null) {
                    aVar.onQueueTitleChanged(charSequence);
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void onSessionDestroyed() {
                a aVar = (a) this.f6104a.get();
                if (aVar != null) {
                    aVar.onSessionDestroyed();
                }
            }

            @Override // android.support.v4.media.session.c.a
            public void onSessionEvent(String str, Bundle bundle) {
                a aVar = (a) this.f6104a.get();
                if (aVar != null) {
                    aVar.onSessionEvent(str, bundle);
                }
            }
        }

        private static class c extends a.AbstractBinderC0105a {

            /* renamed from: a */
            private final WeakReference f6105a;

            c(a aVar) {
                this.f6105a = new WeakReference(aVar);
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onCaptioningEnabledChanged(boolean z8) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(11, Boolean.valueOf(z8), null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onEvent(String str, Bundle bundle) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(1, str, bundle);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onExtrasChanged(Bundle bundle) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(3, mediaMetadataCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(2, playbackStateCompat, null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(5, list, null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onRepeatModeChanged(int i8) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(9, Integer.valueOf(i8), null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onSessionDestroyed() {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onSessionReady() {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onShuffleModeChanged(int i8) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(12, Integer.valueOf(i8), null);
                }
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onShuffleModeChangedRemoved(boolean z8) {
            }

            @Override // android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = (a) this.f6105a.get();
                if (aVar != null) {
                    aVar.a(4, parcelableVolumeInfo != null ? new f(parcelableVolumeInfo.volumeType, parcelableVolumeInfo.audioStream, parcelableVolumeInfo.controlType, parcelableVolumeInfo.maxVolume, parcelableVolumeInfo.currentVolume) : null, null);
                }
            }
        }

        void a(int i8, Object obj, Bundle bundle) {
            HandlerC0103a handlerC0103a = this.f6100b;
            if (handlerC0103a != null) {
                Message messageObtainMessage = handlerC0103a.obtainMessage(i8, obj);
                messageObtainMessage.setData(bundle);
                messageObtainMessage.sendToTarget();
            }
        }

        void b(Handler handler) {
            if (handler != null) {
                HandlerC0103a handlerC0103a = new HandlerC0103a(handler.getLooper());
                this.f6100b = handlerC0103a;
                handlerC0103a.f6102a = true;
            } else {
                HandlerC0103a handlerC0103a2 = this.f6100b;
                if (handlerC0103a2 != null) {
                    handlerC0103a2.f6102a = false;
                    handlerC0103a2.removeCallbacksAndMessages(null);
                    this.f6100b = null;
                }
            }
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            a(8, null, null);
        }

        public android.support.v4.media.session.a getIControllerCallback() {
            return this.f6101c;
        }

        public void onAudioInfoChanged(f fVar) {
        }

        public void onCaptioningEnabledChanged(boolean z8) {
        }

        public void onExtrasChanged(Bundle bundle) {
        }

        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        }

        public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
        }

        public void onRepeatModeChanged(int i8) {
        }

        public void onSessionDestroyed() {
        }

        public void onSessionEvent(String str, Bundle bundle) {
        }

        public void onSessionReady() {
        }

        public void onShuffleModeChanged(int i8) {
        }
    }

    private static class b extends i.a {

        /* renamed from: a */
        private final MediaControllerCompat f6106a;

        b(MediaControllerCompat mediaControllerCompat) {
            this.f6106a = mediaControllerCompat;
        }

        MediaControllerCompat a() {
            return this.f6106a;
        }
    }

    interface c {
        void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

        void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i8);

        void adjustVolume(int i8, int i9);

        boolean dispatchMediaButtonEvent(KeyEvent keyEvent);

        Bundle getExtras();

        long getFlags();

        Object getMediaController();

        MediaMetadataCompat getMetadata();

        String getPackageName();

        f getPlaybackInfo();

        PlaybackStateCompat getPlaybackState();

        List<MediaSessionCompat.QueueItem> getQueue();

        CharSequence getQueueTitle();

        int getRatingType();

        int getRepeatMode();

        PendingIntent getSessionActivity();

        int getShuffleMode();

        g getTransportControls();

        boolean isCaptioningEnabled();

        boolean isSessionReady();

        void registerCallback(a aVar, Handler handler);

        void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat);

        void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver);

        void setVolumeTo(int i8, int i9);

        void unregisterCallback(a aVar);
    }

    static class d extends MediaControllerImplApi21 {
        public d(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.c
        public g getTransportControls() {
            Object transportControls = android.support.v4.media.session.c.getTransportControls(this.f6093a);
            if (transportControls != null) {
                return new i(transportControls);
            }
            return null;
        }
    }

    static class e extends d {
        public e(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.d, android.support.v4.media.session.MediaControllerCompat.MediaControllerImplApi21, android.support.v4.media.session.MediaControllerCompat.c
        public g getTransportControls() {
            Object transportControls = android.support.v4.media.session.c.getTransportControls(this.f6093a);
            if (transportControls != null) {
                return new j(transportControls);
            }
            return null;
        }
    }

    public static final class f {
        public static final int PLAYBACK_TYPE_LOCAL = 1;
        public static final int PLAYBACK_TYPE_REMOTE = 2;

        /* renamed from: a */
        private final int f6107a;

        /* renamed from: b */
        private final int f6108b;

        /* renamed from: c */
        private final int f6109c;

        /* renamed from: d */
        private final int f6110d;

        /* renamed from: e */
        private final int f6111e;

        f(int i8, int i9, int i10, int i11, int i12) {
            this.f6107a = i8;
            this.f6108b = i9;
            this.f6109c = i10;
            this.f6110d = i11;
            this.f6111e = i12;
        }

        public int getAudioStream() {
            return this.f6108b;
        }

        public int getCurrentVolume() {
            return this.f6111e;
        }

        public int getMaxVolume() {
            return this.f6110d;
        }

        public int getPlaybackType() {
            return this.f6107a;
        }

        public int getVolumeControl() {
            return this.f6109c;
        }
    }

    public static abstract class g {
        public static final String EXTRA_LEGACY_STREAM_TYPE = "android.media.session.extra.LEGACY_STREAM_TYPE";

        g() {
        }

        public abstract void fastForward();

        public abstract void pause();

        public abstract void play();

        public abstract void playFromMediaId(String str, Bundle bundle);

        public abstract void playFromSearch(String str, Bundle bundle);

        public abstract void playFromUri(Uri uri, Bundle bundle);

        public abstract void prepare();

        public abstract void prepareFromMediaId(String str, Bundle bundle);

        public abstract void prepareFromSearch(String str, Bundle bundle);

        public abstract void prepareFromUri(Uri uri, Bundle bundle);

        public abstract void rewind();

        public abstract void seekTo(long j8);

        public abstract void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void sendCustomAction(String str, Bundle bundle);

        public abstract void setCaptioningEnabled(boolean z8);

        public abstract void setRating(RatingCompat ratingCompat);

        public abstract void setRating(RatingCompat ratingCompat, Bundle bundle);

        public abstract void setRepeatMode(int i8);

        public abstract void setShuffleMode(int i8);

        public abstract void skipToNext();

        public abstract void skipToPrevious();

        public abstract void skipToQueueItem(long j8);

        public abstract void stop();
    }

    static class i extends h {
        public i(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h, android.support.v4.media.session.MediaControllerCompat.g
        public void playFromUri(Uri uri, Bundle bundle) {
            android.support.v4.media.session.d.playFromUri(this.f6112a, uri, bundle);
        }
    }

    static class j extends i {
        public j(Object obj) {
            super(obj);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h, android.support.v4.media.session.MediaControllerCompat.g
        public void prepare() {
            android.support.v4.media.session.e.prepare(this.f6112a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h, android.support.v4.media.session.MediaControllerCompat.g
        public void prepareFromMediaId(String str, Bundle bundle) {
            android.support.v4.media.session.e.prepareFromMediaId(this.f6112a, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h, android.support.v4.media.session.MediaControllerCompat.g
        public void prepareFromSearch(String str, Bundle bundle) {
            android.support.v4.media.session.e.prepareFromSearch(this.f6112a, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.h, android.support.v4.media.session.MediaControllerCompat.g
        public void prepareFromUri(Uri uri, Bundle bundle) {
            android.support.v4.media.session.e.prepareFromUri(this.f6112a, uri, bundle);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        e eVar;
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token sessionToken = mediaSessionCompat.getSessionToken();
        this.f6091b = sessionToken;
        try {
            eVar = new e(context, sessionToken);
        } catch (RemoteException e8) {
            Log.w("MediaControllerCompat", "Failed to create MediaControllerImpl.", e8);
            eVar = null;
        }
        this.f6090a = eVar;
    }

    static void a(String str, Bundle bundle) {
        if (str == null) {
            return;
        }
        if (str.equals(MediaSessionCompat.ACTION_FOLLOW) || str.equals(MediaSessionCompat.ACTION_UNFOLLOW)) {
            if (bundle == null || !bundle.containsKey(MediaSessionCompat.ARGUMENT_MEDIA_ATTRIBUTE)) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    public static MediaControllerCompat getMediaController(Activity activity) {
        if (activity instanceof androidx.core.app.i) {
            b bVar = (b) ((androidx.core.app.i) activity).getExtraData(b.class);
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }
        Object mediaController = android.support.v4.media.session.c.getMediaController(activity);
        if (mediaController == null) {
            return null;
        }
        try {
            return new MediaControllerCompat(activity, MediaSessionCompat.Token.fromToken(android.support.v4.media.session.c.getSessionToken(mediaController)));
        } catch (RemoteException e8) {
            Log.e("MediaControllerCompat", "Dead object in getMediaController.", e8);
            return null;
        }
    }

    public static void setMediaController(Activity activity, MediaControllerCompat mediaControllerCompat) {
        if (activity instanceof androidx.core.app.i) {
            ((androidx.core.app.i) activity).putExtraData(new b(mediaControllerCompat));
        }
        android.support.v4.media.session.c.setMediaController(activity, mediaControllerCompat != null ? android.support.v4.media.session.c.fromToken(activity, mediaControllerCompat.getSessionToken().getToken()) : null);
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f6090a.addQueueItem(mediaDescriptionCompat);
    }

    public void adjustVolume(int i8, int i9) {
        this.f6090a.adjustVolume(i8, i9);
    }

    public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f6090a.dispatchMediaButtonEvent(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle getExtras() {
        return this.f6090a.getExtras();
    }

    public long getFlags() {
        return this.f6090a.getFlags();
    }

    public MediaMetadataCompat getMetadata() {
        return this.f6090a.getMetadata();
    }

    public String getPackageName() {
        return this.f6090a.getPackageName();
    }

    public f getPlaybackInfo() {
        return this.f6090a.getPlaybackInfo();
    }

    public PlaybackStateCompat getPlaybackState() {
        return this.f6090a.getPlaybackState();
    }

    public List<MediaSessionCompat.QueueItem> getQueue() {
        return this.f6090a.getQueue();
    }

    public CharSequence getQueueTitle() {
        return this.f6090a.getQueueTitle();
    }

    public int getRatingType() {
        return this.f6090a.getRatingType();
    }

    public int getRepeatMode() {
        return this.f6090a.getRepeatMode();
    }

    public PendingIntent getSessionActivity() {
        return this.f6090a.getSessionActivity();
    }

    public MediaSessionCompat.Token getSessionToken() {
        return this.f6091b;
    }

    public Bundle getSessionToken2Bundle() {
        return this.f6091b.getSessionToken2Bundle();
    }

    public int getShuffleMode() {
        return this.f6090a.getShuffleMode();
    }

    public g getTransportControls() {
        return this.f6090a.getTransportControls();
    }

    public boolean isCaptioningEnabled() {
        return this.f6090a.isCaptioningEnabled();
    }

    public boolean isSessionReady() {
        return this.f6090a.isSessionReady();
    }

    public void registerCallback(a aVar) {
        registerCallback(aVar, null);
    }

    public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f6090a.removeQueueItem(mediaDescriptionCompat);
    }

    @Deprecated
    public void removeQueueItemAt(int i8) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> queue = getQueue();
        if (queue == null || i8 < 0 || i8 >= queue.size() || (queueItem = queue.get(i8)) == null) {
            return;
        }
        removeQueueItem(queueItem.getDescription());
    }

    public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("command must neither be null nor empty");
        }
        this.f6090a.sendCommand(str, bundle, resultReceiver);
    }

    public void setVolumeTo(int i8, int i9) {
        this.f6090a.setVolumeTo(i8, i9);
    }

    public void unregisterCallback(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        try {
            this.f6092c.remove(aVar);
            this.f6090a.unregisterCallback(aVar);
        } finally {
            aVar.b(null);
        }
    }

    public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i8) {
        this.f6090a.addQueueItem(mediaDescriptionCompat, i8);
    }

    public void registerCallback(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (handler == null) {
            handler = new Handler();
        }
        aVar.b(handler);
        this.f6090a.registerCallback(aVar, handler);
        this.f6092c.add(aVar);
    }

    static class h extends g {

        /* renamed from: a */
        protected final Object f6112a;

        public h(Object obj) {
            this.f6112a = obj;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void fastForward() {
            c.d.fastForward(this.f6112a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void pause() {
            c.d.pause(this.f6112a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void play() {
            c.d.play(this.f6112a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void playFromMediaId(String str, Bundle bundle) {
            c.d.playFromMediaId(this.f6112a, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void playFromSearch(String str, Bundle bundle) {
            c.d.playFromSearch(this.f6112a, str, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void playFromUri(Uri uri, Bundle bundle) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PLAY_FROM_URI, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void prepare() {
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE, (Bundle) null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void prepareFromMediaId(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_MEDIA_ID, str);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_MEDIA_ID, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void prepareFromSearch(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.ACTION_ARGUMENT_QUERY, str);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_SEARCH, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void prepareFromUri(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_URI, uri);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_PREPARE_FROM_URI, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void rewind() {
            c.d.rewind(this.f6112a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void seekTo(long j8) {
            c.d.seekTo(this.f6112a, j8);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void sendCustomAction(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.a(customAction.getAction(), bundle);
            c.d.sendCustomAction(this.f6112a, customAction.getAction(), bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void setCaptioningEnabled(boolean z8) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.ACTION_ARGUMENT_CAPTIONING_ENABLED, z8);
            sendCustomAction(MediaSessionCompat.ACTION_SET_CAPTIONING_ENABLED, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void setRating(RatingCompat ratingCompat) {
            c.d.setRating(this.f6112a, ratingCompat != null ? ratingCompat.getRating() : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void setRepeatMode(int i8) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_REPEAT_MODE, i8);
            sendCustomAction(MediaSessionCompat.ACTION_SET_REPEAT_MODE, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void setShuffleMode(int i8) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.ACTION_ARGUMENT_SHUFFLE_MODE, i8);
            sendCustomAction(MediaSessionCompat.ACTION_SET_SHUFFLE_MODE, bundle);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void skipToNext() {
            c.d.skipToNext(this.f6112a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void skipToPrevious() {
            c.d.skipToPrevious(this.f6112a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void skipToQueueItem(long j8) {
            c.d.skipToQueueItem(this.f6112a, j8);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void stop() {
            c.d.stop(this.f6112a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void setRating(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.ACTION_ARGUMENT_RATING, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.ACTION_ARGUMENT_EXTRAS, bundle);
            sendCustomAction(MediaSessionCompat.ACTION_SET_RATING, bundle2);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.g
        public void sendCustomAction(String str, Bundle bundle) {
            MediaControllerCompat.a(str, bundle);
            c.d.sendCustomAction(this.f6112a, str, bundle);
        }
    }

    static class MediaControllerImplApi21 implements c {

        /* renamed from: a */
        protected final Object f6093a;

        /* renamed from: b */
        final Object f6094b = new Object();

        /* renamed from: c */
        private final List f6095c = new ArrayList();

        /* renamed from: d */
        private HashMap f6096d = new HashMap();

        /* renamed from: e */
        final MediaSessionCompat.Token f6097e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference f6098a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f6098a = new WeakReference(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i8, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f6098a.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f6094b) {
                    mediaControllerImplApi21.f6097e.setExtraBinder(b.a.asInterface(androidx.core.app.h.getBinder(bundle, MediaSessionCompat.KEY_EXTRA_BINDER)));
                    mediaControllerImplApi21.f6097e.setSessionToken2Bundle(bundle.getBundle(MediaSessionCompat.KEY_SESSION_TOKEN2_BUNDLE));
                    mediaControllerImplApi21.a();
                }
            }
        }

        private static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onExtrasChanged(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onQueueChanged(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onQueueTitleChanged(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onSessionDestroyed() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a.AbstractBinderC0105a, android.support.v4.media.session.a
            public void onVolumeInfoChanged(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f6097e = token;
            Object objFromToken = android.support.v4.media.session.c.fromToken(context, token.getToken());
            this.f6093a = objFromToken;
            if (objFromToken == null) {
                throw new RemoteException();
            }
            if (token.getExtraBinder() == null) {
                b();
            }
        }

        private void b() {
            sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new ExtraBinderRequestResultReceiver(this));
        }

        void a() {
            if (this.f6097e.getExtraBinder() == null) {
                return;
            }
            for (a aVar : this.f6095c) {
                a aVar2 = new a(aVar);
                this.f6096d.put(aVar, aVar2);
                aVar.f6101c = aVar2;
                try {
                    this.f6097e.getExtraBinder().registerCallbackListener(aVar2);
                    aVar.a(13, null, null);
                } catch (RemoteException e8) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
                }
            }
            this.f6095c.clear();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
            sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void adjustVolume(int i8, int i9) {
            android.support.v4.media.session.c.adjustVolume(this.f6093a, i8, i9);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean dispatchMediaButtonEvent(KeyEvent keyEvent) {
            return android.support.v4.media.session.c.dispatchMediaButtonEvent(this.f6093a, keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Bundle getExtras() {
            return android.support.v4.media.session.c.getExtras(this.f6093a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public long getFlags() {
            return android.support.v4.media.session.c.getFlags(this.f6093a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public Object getMediaController() {
            return this.f6093a;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public MediaMetadataCompat getMetadata() {
            Object metadata = android.support.v4.media.session.c.getMetadata(this.f6093a);
            if (metadata != null) {
                return MediaMetadataCompat.fromMediaMetadata(metadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public String getPackageName() {
            return android.support.v4.media.session.c.getPackageName(this.f6093a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public f getPlaybackInfo() {
            Object playbackInfo = android.support.v4.media.session.c.getPlaybackInfo(this.f6093a);
            if (playbackInfo != null) {
                return new f(c.C0108c.getPlaybackType(playbackInfo), c.C0108c.getLegacyAudioStream(playbackInfo), c.C0108c.getVolumeControl(playbackInfo), c.C0108c.getMaxVolume(playbackInfo), c.C0108c.getCurrentVolume(playbackInfo));
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PlaybackStateCompat getPlaybackState() {
            if (this.f6097e.getExtraBinder() != null) {
                try {
                    return this.f6097e.getExtraBinder().getPlaybackState();
                } catch (RemoteException e8) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e8);
                }
            }
            Object playbackState = android.support.v4.media.session.c.getPlaybackState(this.f6093a);
            if (playbackState != null) {
                return PlaybackStateCompat.fromPlaybackState(playbackState);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public List<MediaSessionCompat.QueueItem> getQueue() {
            List<Object> queue = android.support.v4.media.session.c.getQueue(this.f6093a);
            if (queue != null) {
                return MediaSessionCompat.QueueItem.fromQueueItemList(queue);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public CharSequence getQueueTitle() {
            return android.support.v4.media.session.c.getQueueTitle(this.f6093a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int getRatingType() {
            return android.support.v4.media.session.c.getRatingType(this.f6093a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int getRepeatMode() {
            if (this.f6097e.getExtraBinder() == null) {
                return -1;
            }
            try {
                return this.f6097e.getExtraBinder().getRepeatMode();
            } catch (RemoteException e8) {
                Log.e("MediaControllerCompat", "Dead object in getRepeatMode.", e8);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public PendingIntent getSessionActivity() {
            return android.support.v4.media.session.c.getSessionActivity(this.f6093a);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public int getShuffleMode() {
            if (this.f6097e.getExtraBinder() == null) {
                return -1;
            }
            try {
                return this.f6097e.getExtraBinder().getShuffleMode();
            } catch (RemoteException e8) {
                Log.e("MediaControllerCompat", "Dead object in getShuffleMode.", e8);
                return -1;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public g getTransportControls() {
            Object transportControls = android.support.v4.media.session.c.getTransportControls(this.f6093a);
            if (transportControls != null) {
                return new h(transportControls);
            }
            return null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean isCaptioningEnabled() {
            if (this.f6097e.getExtraBinder() == null) {
                return false;
            }
            try {
                return this.f6097e.getExtraBinder().isCaptioningEnabled();
            } catch (RemoteException e8) {
                Log.e("MediaControllerCompat", "Dead object in isCaptioningEnabled.", e8);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public boolean isSessionReady() {
            return this.f6097e.getExtraBinder() != null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public final void registerCallback(a aVar, Handler handler) {
            android.support.v4.media.session.c.registerCallback(this.f6093a, aVar.f6099a, handler);
            synchronized (this.f6094b) {
                if (this.f6097e.getExtraBinder() != null) {
                    a aVar2 = new a(aVar);
                    this.f6096d.put(aVar, aVar2);
                    aVar.f6101c = aVar2;
                    try {
                        this.f6097e.getExtraBinder().registerCallbackListener(aVar2);
                        aVar.a(13, null, null);
                    } catch (RemoteException e8) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e8);
                    }
                } else {
                    aVar.f6101c = null;
                    this.f6095c.add(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((getFlags() & 4) == 0) {
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
            sendCommand(MediaControllerCompat.COMMAND_REMOVE_QUEUE_ITEM, bundle, null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void sendCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            android.support.v4.media.session.c.sendCommand(this.f6093a, str, bundle, resultReceiver);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void setVolumeTo(int i8, int i9) {
            android.support.v4.media.session.c.setVolumeTo(this.f6093a, i8, i9);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public final void unregisterCallback(a aVar) {
            android.support.v4.media.session.c.unregisterCallback(this.f6093a, aVar.f6099a);
            synchronized (this.f6094b) {
                if (this.f6097e.getExtraBinder() != null) {
                    try {
                        a aVar2 = (a) this.f6096d.remove(aVar);
                        if (aVar2 != null) {
                            aVar.f6101c = null;
                            this.f6097e.getExtraBinder().unregisterCallbackListener(aVar2);
                        }
                    } catch (RemoteException e8) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e8);
                    }
                }
                this.f6095c.remove(aVar);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.c
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat, int i8) {
            if ((getFlags() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.COMMAND_ARGUMENT_MEDIA_DESCRIPTION, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.COMMAND_ARGUMENT_INDEX, i8);
                sendCommand(MediaControllerCompat.COMMAND_ADD_QUEUE_ITEM_AT, bundle, null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f6091b = token;
            this.f6090a = new e(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public Object getMediaController() {
        return this.f6090a.getMediaController();
    }
}
