package i2;

import android.os.Parcel;
import android.os.Parcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: i2.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5685r extends AbstractC5814a {
    public static final Parcelable.Creator<C5685r> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    private final int f31846a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f31847b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31848c;

    /* renamed from: d, reason: collision with root package name */
    private final int f31849d;

    /* renamed from: e, reason: collision with root package name */
    private final int f31850e;

    public C5685r(int i8, boolean z8, boolean z9, int i9, int i10) {
        this.f31846a = i8;
        this.f31847b = z8;
        this.f31848c = z9;
        this.f31849d = i9;
        this.f31850e = i10;
    }

    public int getBatchPeriodMillis() {
        return this.f31849d;
    }

    public int getMaxMethodInvocationsInBatch() {
        return this.f31850e;
    }

    public boolean getMethodInvocationTelemetryEnabled() {
        return this.f31847b;
    }

    public boolean getMethodTimingTelemetryEnabled() {
        return this.f31848c;
    }

    public int getVersion() {
        return this.f31846a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, getVersion());
        AbstractC5816c.writeBoolean(parcel, 2, getMethodInvocationTelemetryEnabled());
        AbstractC5816c.writeBoolean(parcel, 3, getMethodTimingTelemetryEnabled());
        AbstractC5816c.writeInt(parcel, 4, getBatchPeriodMillis());
        AbstractC5816c.writeInt(parcel, 5, getMaxMethodInvocationsInBatch());
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
