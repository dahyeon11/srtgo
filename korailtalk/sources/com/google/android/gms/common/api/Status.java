package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import f.d;
import f.h;
import f2.C5392b;
import g2.AbstractC5542d;
import g2.n;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class Status extends AbstractC5814a implements n, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f11849a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11850b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f11851c;

    /* renamed from: d, reason: collision with root package name */
    private final C5392b f11852d;
    public static final Status RESULT_SUCCESS_CACHE = new Status(-1);
    public static final Status RESULT_SUCCESS = new Status(0);
    public static final Status RESULT_INTERRUPTED = new Status(14);
    public static final Status RESULT_INTERNAL_ERROR = new Status(8);
    public static final Status RESULT_TIMEOUT = new Status(15);
    public static final Status RESULT_CANCELED = new Status(16);
    public static final Status zza = new Status(17);
    public static final Status RESULT_DEAD_CLIENT = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i8, String str, PendingIntent pendingIntent, C5392b c5392b) {
        this.f11849a = i8;
        this.f11850b = str;
        this.f11851c = pendingIntent;
        this.f11852d = c5392b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f11849a == status.f11849a && AbstractC5681n.equal(this.f11850b, status.f11850b) && AbstractC5681n.equal(this.f11851c, status.f11851c) && AbstractC5681n.equal(this.f11852d, status.f11852d);
    }

    public C5392b getConnectionResult() {
        return this.f11852d;
    }

    public PendingIntent getResolution() {
        return this.f11851c;
    }

    @Override // g2.n
    public Status getStatus() {
        return this;
    }

    @ResultIgnorabilityUnspecified
    public int getStatusCode() {
        return this.f11849a;
    }

    public String getStatusMessage() {
        return this.f11850b;
    }

    public boolean hasResolution() {
        return this.f11851c != null;
    }

    public int hashCode() {
        return AbstractC5681n.hashCode(Integer.valueOf(this.f11849a), this.f11850b, this.f11851c, this.f11852d);
    }

    public boolean isCanceled() {
        return this.f11849a == 16;
    }

    public boolean isInterrupted() {
        return this.f11849a == 14;
    }

    public boolean isSuccess() {
        return this.f11849a <= 0;
    }

    public void startResolutionForResult(Activity activity, int i8) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.f11851c;
            AbstractC5683p.checkNotNull(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i8, null, 0, 0, 0);
        }
    }

    public String toString() {
        AbstractC5681n.a stringHelper = AbstractC5681n.toStringHelper(this);
        stringHelper.add("statusCode", zza());
        stringHelper.add("resolution", this.f11851c);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, getStatusCode());
        AbstractC5816c.writeString(parcel, 2, getStatusMessage(), false);
        AbstractC5816c.writeParcelable(parcel, 3, this.f11851c, i8, false);
        AbstractC5816c.writeParcelable(parcel, 4, getConnectionResult(), i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final String zza() {
        String str = this.f11850b;
        return str != null ? str : AbstractC5542d.getStatusCodeString(this.f11849a);
    }

    public Status(int i8) {
        this(i8, (String) null);
    }

    public Status(C5392b c5392b, String str) {
        this(c5392b, str, 17);
    }

    public void startResolutionForResult(d dVar) {
        if (hasResolution()) {
            PendingIntent pendingIntent = this.f11851c;
            AbstractC5683p.checkNotNull(pendingIntent);
            dVar.launch(new h.a(pendingIntent.getIntentSender()).build());
        }
    }

    public Status(int i8, String str) {
        this(i8, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(C5392b c5392b, String str, int i8) {
        this(i8, str, c5392b.getResolution(), c5392b);
    }

    public Status(int i8, String str, PendingIntent pendingIntent) {
        this(i8, str, pendingIntent, null);
    }
}
