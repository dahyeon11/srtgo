package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f10855d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f10856e;

    /* renamed from: f, reason: collision with root package name */
    private final int f10857f;

    /* renamed from: g, reason: collision with root package name */
    private final int f10858g;

    /* renamed from: h, reason: collision with root package name */
    private final String f10859h;

    /* renamed from: i, reason: collision with root package name */
    private int f10860i;

    /* renamed from: j, reason: collision with root package name */
    private int f10861j;

    /* renamed from: k, reason: collision with root package name */
    private int f10862k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new O.a(), new O.a(), new O.a());
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f10856e;
        int iDataPosition = parcel.dataPosition();
        int i8 = this.f10861j;
        if (i8 == this.f10857f) {
            i8 = this.f10858g;
        }
        return new b(parcel, iDataPosition, i8, this.f10859h + "  ", this.f10851a, this.f10852b, this.f10853c);
    }

    @Override // androidx.versionedparcelable.a
    public void closeField() {
        int i8 = this.f10860i;
        if (i8 >= 0) {
            int i9 = this.f10855d.get(i8);
            int iDataPosition = this.f10856e.dataPosition();
            this.f10856e.setDataPosition(i9);
            this.f10856e.writeInt(iDataPosition - i9);
            this.f10856e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence i() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f10856e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean readBoolean() {
        return this.f10856e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public Bundle readBundle() {
        return this.f10856e.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public byte[] readByteArray() {
        int i8 = this.f10856e.readInt();
        if (i8 < 0) {
            return null;
        }
        byte[] bArr = new byte[i8];
        this.f10856e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    public double readDouble() {
        return this.f10856e.readDouble();
    }

    @Override // androidx.versionedparcelable.a
    public boolean readField(int i8) {
        while (this.f10861j < this.f10858g) {
            int i9 = this.f10862k;
            if (i9 == i8) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i8)) > 0) {
                return false;
            }
            this.f10856e.setDataPosition(this.f10861j);
            int i10 = this.f10856e.readInt();
            this.f10862k = this.f10856e.readInt();
            this.f10861j += i10;
        }
        return this.f10862k == i8;
    }

    @Override // androidx.versionedparcelable.a
    public float readFloat() {
        return this.f10856e.readFloat();
    }

    @Override // androidx.versionedparcelable.a
    public int readInt() {
        return this.f10856e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public long readLong() {
        return this.f10856e.readLong();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T readParcelable() {
        return (T) this.f10856e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String readString() {
        return this.f10856e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public IBinder readStrongBinder() {
        return this.f10856e.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.a
    public void setOutputField(int i8) {
        closeField();
        this.f10860i = i8;
        this.f10855d.put(i8, this.f10856e.dataPosition());
        writeInt(0);
        writeInt(i8);
    }

    @Override // androidx.versionedparcelable.a
    protected void v(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f10856e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void writeBoolean(boolean z8) {
        this.f10856e.writeInt(z8 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.a
    public void writeBundle(Bundle bundle) {
        this.f10856e.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.a
    public void writeByteArray(byte[] bArr) {
        if (bArr == null) {
            this.f10856e.writeInt(-1);
        } else {
            this.f10856e.writeInt(bArr.length);
            this.f10856e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    public void writeDouble(double d9) {
        this.f10856e.writeDouble(d9);
    }

    @Override // androidx.versionedparcelable.a
    public void writeFloat(float f8) {
        this.f10856e.writeFloat(f8);
    }

    @Override // androidx.versionedparcelable.a
    public void writeInt(int i8) {
        this.f10856e.writeInt(i8);
    }

    @Override // androidx.versionedparcelable.a
    public void writeLong(long j8) {
        this.f10856e.writeLong(j8);
    }

    @Override // androidx.versionedparcelable.a
    public void writeParcelable(Parcelable parcelable) {
        this.f10856e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void writeString(String str) {
        this.f10856e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void writeStrongBinder(IBinder iBinder) {
        this.f10856e.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.a
    public void writeStrongInterface(IInterface iInterface) {
        this.f10856e.writeStrongInterface(iInterface);
    }

    private b(Parcel parcel, int i8, int i9, String str, O.a aVar, O.a aVar2, O.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f10855d = new SparseIntArray();
        this.f10860i = -1;
        this.f10862k = -1;
        this.f10856e = parcel;
        this.f10857f = i8;
        this.f10858g = i9;
        this.f10861j = i8;
        this.f10859h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void writeByteArray(byte[] bArr, int i8, int i9) {
        if (bArr != null) {
            this.f10856e.writeInt(bArr.length);
            this.f10856e.writeByteArray(bArr, i8, i9);
        } else {
            this.f10856e.writeInt(-1);
        }
    }
}
