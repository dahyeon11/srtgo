package c0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1087a implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final Parcelable f11439a;
    public static final AbstractC1087a EMPTY_STATE = new C0192a();
    public static final Parcelable.Creator<AbstractC1087a> CREATOR = new b();

    /* renamed from: c0.a$a, reason: collision with other inner class name */
    static class C0192a extends AbstractC1087a {
        C0192a() {
            super((C0192a) null);
        }
    }

    /* renamed from: c0.a$b */
    static class b implements Parcelable.ClassLoaderCreator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public AbstractC1087a[] newArray(int i8) {
            return new AbstractC1087a[i8];
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public AbstractC1087a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC1087a.EMPTY_STATE;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public AbstractC1087a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }
    }

    /* synthetic */ AbstractC1087a(C0192a c0192a) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Parcelable getSuperState() {
        return this.f11439a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeParcelable(this.f11439a, i8);
    }

    private AbstractC1087a() {
        this.f11439a = null;
    }

    protected AbstractC1087a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f11439a = parcelable == EMPTY_STATE ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbstractC1087a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f11439a = parcelable == null ? EMPTY_STATE : parcelable;
    }
}
