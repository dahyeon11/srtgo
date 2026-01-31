package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.mType = aVar.readInt(iconCompat.mType, 1);
        iconCompat.mData = aVar.readByteArray(iconCompat.mData, 2);
        iconCompat.mParcelable = aVar.readParcelable(iconCompat.mParcelable, 3);
        iconCompat.mInt1 = aVar.readInt(iconCompat.mInt1, 4);
        iconCompat.mInt2 = aVar.readInt(iconCompat.mInt2, 5);
        iconCompat.mTintList = (ColorStateList) aVar.readParcelable(iconCompat.mTintList, 6);
        iconCompat.mTintModeStr = aVar.readString(iconCompat.mTintModeStr, 7);
        iconCompat.mString1 = aVar.readString(iconCompat.mString1, 8);
        iconCompat.onPostParceling();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.setSerializationFlags(true, true);
        iconCompat.onPreParceling(aVar.isStream());
        int i8 = iconCompat.mType;
        if (-1 != i8) {
            aVar.writeInt(i8, 1);
        }
        byte[] bArr = iconCompat.mData;
        if (bArr != null) {
            aVar.writeByteArray(bArr, 2);
        }
        Parcelable parcelable = iconCompat.mParcelable;
        if (parcelable != null) {
            aVar.writeParcelable(parcelable, 3);
        }
        int i9 = iconCompat.mInt1;
        if (i9 != 0) {
            aVar.writeInt(i9, 4);
        }
        int i10 = iconCompat.mInt2;
        if (i10 != 0) {
            aVar.writeInt(i10, 5);
        }
        ColorStateList colorStateList = iconCompat.mTintList;
        if (colorStateList != null) {
            aVar.writeParcelable(colorStateList, 6);
        }
        String str = iconCompat.mTintModeStr;
        if (str != null) {
            aVar.writeString(str, 7);
        }
        String str2 = iconCompat.mString1;
        if (str2 != null) {
            aVar.writeString(str2, 8);
        }
    }
}
