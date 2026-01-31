package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final E0.a f10850a;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i8) {
            return new ParcelImpl[i8];
        }
    }

    public ParcelImpl(E0.a aVar) {
        this.f10850a = aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public <T extends E0.a> T getVersionedParcel() {
        return (T) this.f10850a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new b(parcel).F(this.f10850a);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f10850a = new b(parcel).s();
    }
}
