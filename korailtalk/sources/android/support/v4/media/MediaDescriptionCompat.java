package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.d;
import android.support.v4.media.e;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;

    /* renamed from: a */
    private final String f6060a;

    /* renamed from: b */
    private final CharSequence f6061b;

    /* renamed from: c */
    private final CharSequence f6062c;

    /* renamed from: d */
    private final CharSequence f6063d;

    /* renamed from: e */
    private final Bitmap f6064e;

    /* renamed from: f */
    private final Uri f6065f;

    /* renamed from: g */
    private final Bundle f6066g;

    /* renamed from: h */
    private final Uri f6067h;

    /* renamed from: i */
    private Object f6068i;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.fromMediaDescription(d.fromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i8) {
            return new MediaDescriptionCompat[i8];
        }
    }

    public static final class b {

        /* renamed from: a */
        private String f6069a;

        /* renamed from: b */
        private CharSequence f6070b;

        /* renamed from: c */
        private CharSequence f6071c;

        /* renamed from: d */
        private CharSequence f6072d;

        /* renamed from: e */
        private Bitmap f6073e;

        /* renamed from: f */
        private Uri f6074f;

        /* renamed from: g */
        private Bundle f6075g;

        /* renamed from: h */
        private Uri f6076h;

        public MediaDescriptionCompat build() {
            return new MediaDescriptionCompat(this.f6069a, this.f6070b, this.f6071c, this.f6072d, this.f6073e, this.f6074f, this.f6075g, this.f6076h);
        }

        public b setDescription(CharSequence charSequence) {
            this.f6072d = charSequence;
            return this;
        }

        public b setExtras(Bundle bundle) {
            this.f6075g = bundle;
            return this;
        }

        public b setIconBitmap(Bitmap bitmap) {
            this.f6073e = bitmap;
            return this;
        }

        public b setIconUri(Uri uri) {
            this.f6074f = uri;
            return this;
        }

        public b setMediaId(String str) {
            this.f6069a = str;
            return this;
        }

        public b setMediaUri(Uri uri) {
            this.f6076h = uri;
            return this;
        }

        public b setSubtitle(CharSequence charSequence) {
            this.f6071c = charSequence;
            return this;
        }

        public b setTitle(CharSequence charSequence) {
            this.f6070b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f6060a = str;
        this.f6061b = charSequence;
        this.f6062c = charSequence2;
        this.f6063d = charSequence3;
        this.f6064e = bitmap;
        this.f6065f = uri;
        this.f6066g = bundle;
        this.f6067h = uri2;
    }

    public static MediaDescriptionCompat fromMediaDescription(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        b bVar = new b();
        bVar.setMediaId(d.getMediaId(obj));
        bVar.setTitle(d.getTitle(obj));
        bVar.setSubtitle(d.getSubtitle(obj));
        bVar.setDescription(d.getDescription(obj));
        bVar.setIconBitmap(d.getIconBitmap(obj));
        bVar.setIconUri(d.getIconUri(obj));
        Bundle extras = d.getExtras(obj);
        if (extras != null) {
            MediaSessionCompat.ensureClassLoader(extras);
            uri = (Uri) extras.getParcelable(DESCRIPTION_KEY_MEDIA_URI);
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = extras;
        } else if (!extras.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) || extras.size() != 2) {
            extras.remove(DESCRIPTION_KEY_MEDIA_URI);
            extras.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
            bundle = extras;
        }
        bVar.setExtras(bundle);
        if (uri != null) {
            bVar.setMediaUri(uri);
        } else {
            bVar.setMediaUri(e.getMediaUri(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatBuild = bVar.build();
        mediaDescriptionCompatBuild.f6068i = obj;
        return mediaDescriptionCompatBuild;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.f6063d;
    }

    public Bundle getExtras() {
        return this.f6066g;
    }

    public Bitmap getIconBitmap() {
        return this.f6064e;
    }

    public Uri getIconUri() {
        return this.f6065f;
    }

    public Object getMediaDescription() {
        Object obj = this.f6068i;
        if (obj != null) {
            return obj;
        }
        Object objNewInstance = d.a.newInstance();
        d.a.setMediaId(objNewInstance, this.f6060a);
        d.a.setTitle(objNewInstance, this.f6061b);
        d.a.setSubtitle(objNewInstance, this.f6062c);
        d.a.setDescription(objNewInstance, this.f6063d);
        d.a.setIconBitmap(objNewInstance, this.f6064e);
        d.a.setIconUri(objNewInstance, this.f6065f);
        d.a.setExtras(objNewInstance, this.f6066g);
        e.a.setMediaUri(objNewInstance, this.f6067h);
        Object objBuild = d.a.build(objNewInstance);
        this.f6068i = objBuild;
        return objBuild;
    }

    public String getMediaId() {
        return this.f6060a;
    }

    public Uri getMediaUri() {
        return this.f6067h;
    }

    public CharSequence getSubtitle() {
        return this.f6062c;
    }

    public CharSequence getTitle() {
        return this.f6061b;
    }

    public String toString() {
        return ((Object) this.f6061b) + ", " + ((Object) this.f6062c) + ", " + ((Object) this.f6063d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        d.writeToParcel(getMediaDescription(), parcel, i8);
    }
}
