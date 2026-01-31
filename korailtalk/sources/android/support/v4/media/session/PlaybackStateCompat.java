package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.m;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

    @Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;

    /* renamed from: a */
    final int f6147a;

    /* renamed from: b */
    final long f6148b;

    /* renamed from: c */
    final long f6149c;

    /* renamed from: d */
    final float f6150d;

    /* renamed from: e */
    final long f6151e;

    /* renamed from: f */
    final int f6152f;

    /* renamed from: g */
    final CharSequence f6153g;

    /* renamed from: h */
    final long f6154h;

    /* renamed from: i */
    List f6155i;

    /* renamed from: j */
    final long f6156j;

    /* renamed from: k */
    final Bundle f6157k;

    /* renamed from: l */
    private Object f6158l;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i8) {
            return new PlaybackStateCompat[i8];
        }
    }

    public static final class b {

        /* renamed from: a */
        private final List f6164a;

        /* renamed from: b */
        private int f6165b;

        /* renamed from: c */
        private long f6166c;

        /* renamed from: d */
        private long f6167d;

        /* renamed from: e */
        private float f6168e;

        /* renamed from: f */
        private long f6169f;

        /* renamed from: g */
        private int f6170g;

        /* renamed from: h */
        private CharSequence f6171h;

        /* renamed from: i */
        private long f6172i;

        /* renamed from: j */
        private long f6173j;

        /* renamed from: k */
        private Bundle f6174k;

        public b() {
            this.f6164a = new ArrayList();
            this.f6173j = -1L;
        }

        public b addCustomAction(String str, String str2, int i8) {
            return addCustomAction(new CustomAction(str, str2, i8, null));
        }

        public PlaybackStateCompat build() {
            return new PlaybackStateCompat(this.f6165b, this.f6166c, this.f6167d, this.f6168e, this.f6169f, this.f6170g, this.f6171h, this.f6172i, this.f6164a, this.f6173j, this.f6174k);
        }

        public b setActions(long j8) {
            this.f6169f = j8;
            return this;
        }

        public b setActiveQueueItemId(long j8) {
            this.f6173j = j8;
            return this;
        }

        public b setBufferedPosition(long j8) {
            this.f6167d = j8;
            return this;
        }

        public b setErrorMessage(CharSequence charSequence) {
            this.f6171h = charSequence;
            return this;
        }

        public b setExtras(Bundle bundle) {
            this.f6174k = bundle;
            return this;
        }

        public b setState(int i8, long j8, float f8) {
            return setState(i8, j8, f8, SystemClock.elapsedRealtime());
        }

        public b addCustomAction(CustomAction customAction) {
            if (customAction == null) {
                throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
            }
            this.f6164a.add(customAction);
            return this;
        }

        public b setErrorMessage(int i8, CharSequence charSequence) {
            this.f6170g = i8;
            this.f6171h = charSequence;
            return this;
        }

        public b setState(int i8, long j8, float f8, long j9) {
            this.f6165b = i8;
            this.f6166c = j8;
            this.f6172i = j9;
            this.f6168e = f8;
            return this;
        }

        public b(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f6164a = arrayList;
            this.f6173j = -1L;
            this.f6165b = playbackStateCompat.f6147a;
            this.f6166c = playbackStateCompat.f6148b;
            this.f6168e = playbackStateCompat.f6150d;
            this.f6172i = playbackStateCompat.f6154h;
            this.f6167d = playbackStateCompat.f6149c;
            this.f6169f = playbackStateCompat.f6151e;
            this.f6170g = playbackStateCompat.f6152f;
            this.f6171h = playbackStateCompat.f6153g;
            List list = playbackStateCompat.f6155i;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f6173j = playbackStateCompat.f6156j;
            this.f6174k = playbackStateCompat.f6157k;
        }
    }

    PlaybackStateCompat(int i8, long j8, long j9, float f8, long j10, int i9, CharSequence charSequence, long j11, List list, long j12, Bundle bundle) {
        this.f6147a = i8;
        this.f6148b = j8;
        this.f6149c = j9;
        this.f6150d = f8;
        this.f6151e = j10;
        this.f6152f = i9;
        this.f6153g = charSequence;
        this.f6154h = j11;
        this.f6155i = new ArrayList(list);
        this.f6156j = j12;
        this.f6157k = bundle;
    }

    public static PlaybackStateCompat fromPlaybackState(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        List<Object> customActions = m.getCustomActions(obj);
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            Iterator<Object> it = customActions.iterator();
            while (it.hasNext()) {
                arrayList.add(CustomAction.fromCustomAction(it.next()));
            }
        }
        Bundle extras = n.getExtras(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(m.getState(obj), m.getPosition(obj), m.getBufferedPosition(obj), m.getPlaybackSpeed(obj), m.getActions(obj), 0, m.getErrorMessage(obj), m.getLastPositionUpdateTime(obj), arrayList, m.getActiveQueueItemId(obj), extras);
        playbackStateCompat.f6158l = obj;
        return playbackStateCompat;
    }

    public static int toKeyCode(long j8) {
        if (j8 == 4) {
            return 126;
        }
        if (j8 == 2) {
            return 127;
        }
        if (j8 == 32) {
            return 87;
        }
        if (j8 == 16) {
            return 88;
        }
        if (j8 == 1) {
            return 86;
        }
        if (j8 == 64) {
            return 90;
        }
        if (j8 == 8) {
            return 89;
        }
        return j8 == 512 ? 85 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getActions() {
        return this.f6151e;
    }

    public long getActiveQueueItemId() {
        return this.f6156j;
    }

    public long getBufferedPosition() {
        return this.f6149c;
    }

    public long getCurrentPosition(Long l8) {
        return Math.max(0L, this.f6148b + ((long) (this.f6150d * (l8 != null ? l8.longValue() : SystemClock.elapsedRealtime() - this.f6154h))));
    }

    public List<CustomAction> getCustomActions() {
        return this.f6155i;
    }

    public int getErrorCode() {
        return this.f6152f;
    }

    public CharSequence getErrorMessage() {
        return this.f6153g;
    }

    public Bundle getExtras() {
        return this.f6157k;
    }

    public long getLastPositionUpdateTime() {
        return this.f6154h;
    }

    public float getPlaybackSpeed() {
        return this.f6150d;
    }

    public Object getPlaybackState() {
        ArrayList arrayList;
        if (this.f6158l == null) {
            if (this.f6155i != null) {
                arrayList = new ArrayList(this.f6155i.size());
                Iterator it = this.f6155i.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CustomAction) it.next()).getCustomAction());
                }
            } else {
                arrayList = null;
            }
            this.f6158l = n.newInstance(this.f6147a, this.f6148b, this.f6149c, this.f6150d, this.f6151e, this.f6153g, this.f6154h, arrayList, this.f6156j, this.f6157k);
        }
        return this.f6158l;
    }

    public long getPosition() {
        return this.f6148b;
    }

    public int getState() {
        return this.f6147a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f6147a + ", position=" + this.f6148b + ", buffered position=" + this.f6149c + ", speed=" + this.f6150d + ", updated=" + this.f6154h + ", actions=" + this.f6151e + ", error code=" + this.f6152f + ", error message=" + this.f6153g + ", custom actions=" + this.f6155i + ", active item id=" + this.f6156j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f6147a);
        parcel.writeLong(this.f6148b);
        parcel.writeFloat(this.f6150d);
        parcel.writeLong(this.f6154h);
        parcel.writeLong(this.f6149c);
        parcel.writeLong(this.f6151e);
        TextUtils.writeToParcel(this.f6153g, parcel, i8);
        parcel.writeTypedList(this.f6155i);
        parcel.writeLong(this.f6156j);
        parcel.writeBundle(this.f6157k);
        parcel.writeInt(this.f6152f);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a */
        private final String f6159a;

        /* renamed from: b */
        private final CharSequence f6160b;

        /* renamed from: c */
        private final int f6161c;

        /* renamed from: d */
        private final Bundle f6162d;

        /* renamed from: e */
        private Object f6163e;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i8) {
                return new CustomAction[i8];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i8, Bundle bundle) {
            this.f6159a = str;
            this.f6160b = charSequence;
            this.f6161c = i8;
            this.f6162d = bundle;
        }

        public static CustomAction fromCustomAction(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(m.a.getAction(obj), m.a.getName(obj), m.a.getIcon(obj), m.a.getExtras(obj));
            customAction.f6163e = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAction() {
            return this.f6159a;
        }

        public Object getCustomAction() {
            Object obj = this.f6163e;
            if (obj != null) {
                return obj;
            }
            Object objNewInstance = m.a.newInstance(this.f6159a, this.f6160b, this.f6161c, this.f6162d);
            this.f6163e = objNewInstance;
            return objNewInstance;
        }

        public Bundle getExtras() {
            return this.f6162d;
        }

        public int getIcon() {
            return this.f6161c;
        }

        public CharSequence getName() {
            return this.f6160b;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f6160b) + ", mIcon=" + this.f6161c + ", mExtras=" + this.f6162d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f6159a);
            TextUtils.writeToParcel(this.f6160b, parcel, i8);
            parcel.writeInt(this.f6161c);
            parcel.writeBundle(this.f6162d);
        }

        CustomAction(Parcel parcel) {
            this.f6159a = parcel.readString();
            this.f6160b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f6161c = parcel.readInt();
            this.f6162d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f6147a = parcel.readInt();
        this.f6148b = parcel.readLong();
        this.f6150d = parcel.readFloat();
        this.f6154h = parcel.readLong();
        this.f6149c = parcel.readLong();
        this.f6151e = parcel.readLong();
        this.f6153g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6155i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f6156j = parcel.readLong();
        this.f6157k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f6152f = parcel.readInt();
    }
}
