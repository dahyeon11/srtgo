package i2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: i2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5672e extends AbstractC5814a {
    public static final Parcelable.Creator<C5672e> CREATOR = new o0();

    /* renamed from: a, reason: collision with root package name */
    private final C5685r f31779a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31780b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31781c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f31782d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31783e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f31784f;

    public C5672e(C5685r c5685r, boolean z8, boolean z9, int[] iArr, int i8, int[] iArr2) {
        this.f31779a = c5685r;
        this.f31780b = z8;
        this.f31781c = z9;
        this.f31782d = iArr;
        this.f31783e = i8;
        this.f31784f = iArr2;
    }

    public int getMaxMethodInvocationsLogged() {
        return this.f31783e;
    }

    public int[] getMethodInvocationMethodKeyAllowlist() {
        return this.f31782d;
    }

    public int[] getMethodInvocationMethodKeyDisallowlist() {
        return this.f31784f;
    }

    public boolean getMethodInvocationTelemetryEnabled() {
        return this.f31780b;
    }

    public boolean getMethodTimingTelemetryEnabled() {
        return this.f31781c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeParcelable(parcel, 1, this.f31779a, i8, false);
        AbstractC5816c.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        AbstractC5816c.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        AbstractC5816c.writeIntArray(parcel, 4, getMethodInvocationMethodKeyAllowlist(), false);
        AbstractC5816c.writeInt(parcel, 5, getMaxMethodInvocationsLogged());
        AbstractC5816c.writeIntArray(parcel, 6, getMethodInvocationMethodKeyDisallowlist(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final C5685r zza() {
        return this.f31779a;
    }
}
