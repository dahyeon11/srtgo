package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import java.util.Set;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
    public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
    public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";

    /* renamed from: d */
    static final O.a f6077d;

    /* renamed from: e */
    private static final String[] f6078e;

    /* renamed from: f */
    private static final String[] f6079f;

    /* renamed from: g */
    private static final String[] f6080g;

    /* renamed from: a */
    final Bundle f6081a;

    /* renamed from: b */
    private Object f6082b;

    /* renamed from: c */
    private MediaDescriptionCompat f6083c;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public MediaMetadataCompat[] newArray(int i8) {
            return new MediaMetadataCompat[i8];
        }
    }

    static {
        O.a aVar = new O.a();
        f6077d = aVar;
        aVar.put(METADATA_KEY_TITLE, 1);
        aVar.put(METADATA_KEY_ARTIST, 1);
        aVar.put(METADATA_KEY_DURATION, 0);
        aVar.put(METADATA_KEY_ALBUM, 1);
        aVar.put(METADATA_KEY_AUTHOR, 1);
        aVar.put(METADATA_KEY_WRITER, 1);
        aVar.put(METADATA_KEY_COMPOSER, 1);
        aVar.put(METADATA_KEY_COMPILATION, 1);
        aVar.put(METADATA_KEY_DATE, 1);
        aVar.put(METADATA_KEY_YEAR, 0);
        aVar.put(METADATA_KEY_GENRE, 1);
        aVar.put(METADATA_KEY_TRACK_NUMBER, 0);
        aVar.put(METADATA_KEY_NUM_TRACKS, 0);
        aVar.put(METADATA_KEY_DISC_NUMBER, 0);
        aVar.put(METADATA_KEY_ALBUM_ARTIST, 1);
        aVar.put(METADATA_KEY_ART, 2);
        aVar.put(METADATA_KEY_ART_URI, 1);
        aVar.put(METADATA_KEY_ALBUM_ART, 2);
        aVar.put(METADATA_KEY_ALBUM_ART_URI, 1);
        aVar.put(METADATA_KEY_USER_RATING, 3);
        aVar.put(METADATA_KEY_RATING, 3);
        aVar.put(METADATA_KEY_DISPLAY_TITLE, 1);
        aVar.put(METADATA_KEY_DISPLAY_SUBTITLE, 1);
        aVar.put(METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        aVar.put(METADATA_KEY_DISPLAY_ICON, 2);
        aVar.put(METADATA_KEY_DISPLAY_ICON_URI, 1);
        aVar.put(METADATA_KEY_MEDIA_ID, 1);
        aVar.put(METADATA_KEY_BT_FOLDER_TYPE, 0);
        aVar.put(METADATA_KEY_MEDIA_URI, 1);
        aVar.put(METADATA_KEY_ADVERTISEMENT, 0);
        aVar.put(METADATA_KEY_DOWNLOAD_STATUS, 0);
        f6078e = new String[]{METADATA_KEY_TITLE, METADATA_KEY_ARTIST, METADATA_KEY_ALBUM, METADATA_KEY_ALBUM_ARTIST, METADATA_KEY_WRITER, METADATA_KEY_AUTHOR, METADATA_KEY_COMPOSER};
        f6079f = new String[]{METADATA_KEY_DISPLAY_ICON, METADATA_KEY_ART, METADATA_KEY_ALBUM_ART};
        f6080g = new String[]{METADATA_KEY_DISPLAY_ICON_URI, METADATA_KEY_ART_URI, METADATA_KEY_ALBUM_ART_URI};
        CREATOR = new a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f6081a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat fromMediaMetadata(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        f.writeToParcel(obj, parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel = CREATOR.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        mediaMetadataCompatCreateFromParcel.f6082b = obj;
        return mediaMetadataCompatCreateFromParcel;
    }

    public boolean containsKey(String str) {
        return this.f6081a.containsKey(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bitmap getBitmap(String str) {
        try {
            return (Bitmap) this.f6081a.getParcelable(str);
        } catch (Exception e8) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e8);
            return null;
        }
    }

    public Bundle getBundle() {
        return new Bundle(this.f6081a);
    }

    public MediaDescriptionCompat getDescription() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f6083c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String string = getString(METADATA_KEY_MEDIA_ID);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence text = getText(METADATA_KEY_DISPLAY_TITLE);
        if (TextUtils.isEmpty(text)) {
            int i8 = 0;
            int i9 = 0;
            while (i8 < 3) {
                String[] strArr = f6078e;
                if (i9 >= strArr.length) {
                    break;
                }
                int i10 = i9 + 1;
                CharSequence text2 = getText(strArr[i9]);
                if (!TextUtils.isEmpty(text2)) {
                    charSequenceArr[i8] = text2;
                    i8++;
                }
                i9 = i10;
            }
        } else {
            charSequenceArr[0] = text;
            charSequenceArr[1] = getText(METADATA_KEY_DISPLAY_SUBTITLE);
            charSequenceArr[2] = getText(METADATA_KEY_DISPLAY_DESCRIPTION);
        }
        int i11 = 0;
        while (true) {
            String[] strArr2 = f6079f;
            if (i11 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = getBitmap(strArr2[i11]);
            if (bitmap != null) {
                break;
            }
            i11++;
        }
        int i12 = 0;
        while (true) {
            String[] strArr3 = f6080g;
            if (i12 >= strArr3.length) {
                uri = null;
                break;
            }
            String string2 = getString(strArr3[i12]);
            if (!TextUtils.isEmpty(string2)) {
                uri = Uri.parse(string2);
                break;
            }
            i12++;
        }
        String string3 = getString(METADATA_KEY_MEDIA_URI);
        Uri uri2 = TextUtils.isEmpty(string3) ? null : Uri.parse(string3);
        MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
        bVar.setMediaId(string);
        bVar.setTitle(charSequenceArr[0]);
        bVar.setSubtitle(charSequenceArr[1]);
        bVar.setDescription(charSequenceArr[2]);
        bVar.setIconBitmap(bitmap);
        bVar.setIconUri(uri);
        bVar.setMediaUri(uri2);
        Bundle bundle = new Bundle();
        if (this.f6081a.containsKey(METADATA_KEY_BT_FOLDER_TYPE)) {
            bundle.putLong(MediaDescriptionCompat.EXTRA_BT_FOLDER_TYPE, getLong(METADATA_KEY_BT_FOLDER_TYPE));
        }
        if (this.f6081a.containsKey(METADATA_KEY_DOWNLOAD_STATUS)) {
            bundle.putLong(MediaDescriptionCompat.EXTRA_DOWNLOAD_STATUS, getLong(METADATA_KEY_DOWNLOAD_STATUS));
        }
        if (!bundle.isEmpty()) {
            bVar.setExtras(bundle);
        }
        MediaDescriptionCompat mediaDescriptionCompatBuild = bVar.build();
        this.f6083c = mediaDescriptionCompatBuild;
        return mediaDescriptionCompatBuild;
    }

    public long getLong(String str) {
        return this.f6081a.getLong(str, 0L);
    }

    public Object getMediaMetadata() {
        if (this.f6082b == null) {
            Parcel parcelObtain = Parcel.obtain();
            writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            this.f6082b = f.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        return this.f6082b;
    }

    public RatingCompat getRating(String str) {
        try {
            return RatingCompat.fromRating(this.f6081a.getParcelable(str));
        } catch (Exception e8) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Rating.", e8);
            return null;
        }
    }

    public String getString(String str) {
        CharSequence charSequence = this.f6081a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence getText(String str) {
        return this.f6081a.getCharSequence(str);
    }

    public Set<String> keySet() {
        return this.f6081a.keySet();
    }

    public int size() {
        return this.f6081a.size();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeBundle(this.f6081a);
    }
}
