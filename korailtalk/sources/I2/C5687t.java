package i2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: i2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5687t extends AbstractC5814a {
    public static final Parcelable.Creator<C5687t> CREATOR = new C5691x();

    /* renamed from: a, reason: collision with root package name */
    private final int f31860a;

    /* renamed from: b, reason: collision with root package name */
    private List f31861b;

    public C5687t(int i8, List<C5680m> list) {
        this.f31860a = i8;
        this.f31861b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f31860a);
        AbstractC5816c.writeTypedList(parcel, 2, this.f31861b, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zaa() {
        return this.f31860a;
    }

    public final List<C5680m> zab() {
        return this.f31861b;
    }

    public final void zac(C5680m c5680m) {
        if (this.f31861b == null) {
            this.f31861b = new ArrayList();
        }
        this.f31861b.add(c5680m);
    }
}
