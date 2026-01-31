package L1;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class a extends AbstractC5814a {
    public static final Parcelable.Creator<a> CREATOR = new t();
    public String afmaVersion;
    public int buddyApkVersion;
    public int clientJarVersion;
    public boolean isClientJar;
    public boolean isLiteSdk;

    public a(int i8, int i9, boolean z8) {
        this(i8, i9, z8, false, false);
    }

    public static a forPackage() {
        return new a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 2, this.afmaVersion, false);
        AbstractC5816c.writeInt(parcel, 3, this.buddyApkVersion);
        AbstractC5816c.writeInt(parcel, 4, this.clientJarVersion);
        AbstractC5816c.writeBoolean(parcel, 5, this.isClientJar);
        AbstractC5816c.writeBoolean(parcel, 6, this.isLiteSdk);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public a(int i8, int i9, boolean z8, boolean z9) {
        this(i8, i9, z8, false, z9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(int i8, int i9, boolean z8, boolean z9, boolean z10) {
        String str;
        if (z8) {
            str = "0";
        } else {
            str = z9 ? "2" : "1";
        }
        this("afma-sdk-a-v" + i8 + "." + i9 + "." + str, i8, i9, z8, z10);
    }

    a(String str, int i8, int i9, boolean z8, boolean z9) {
        this.afmaVersion = str;
        this.buddyApkVersion = i8;
        this.clientJarVersion = i9;
        this.isClientJar = z8;
        this.isLiteSdk = z9;
    }
}
