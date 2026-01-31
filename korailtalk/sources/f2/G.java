package f2;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class G extends AbstractC5814a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* renamed from: a, reason: collision with root package name */
    private final String f30537a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f30538b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30539c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f30540d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f30541e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30542f;

    G(String str, boolean z8, boolean z9, IBinder iBinder, boolean z10, boolean z11) {
        this.f30537a = str;
        this.f30538b = z8;
        this.f30539c = z9;
        this.f30540d = (Context) r2.b.unwrap(InterfaceC6172a.AbstractBinderC0399a.asInterface(iBinder));
        this.f30541e = z10;
        this.f30542f = z11;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, r2.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f30537a;
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeString(parcel, 1, str, false);
        AbstractC5816c.writeBoolean(parcel, 2, this.f30538b);
        AbstractC5816c.writeBoolean(parcel, 3, this.f30539c);
        AbstractC5816c.writeIBinder(parcel, 4, r2.b.wrap(this.f30540d), false);
        AbstractC5816c.writeBoolean(parcel, 5, this.f30541e);
        AbstractC5816c.writeBoolean(parcel, 6, this.f30542f);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
