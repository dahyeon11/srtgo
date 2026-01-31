package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class CredentialPickerConfig extends AbstractC5814a implements ReflectedParcelable {
    public static final Parcelable.Creator<CredentialPickerConfig> CREATOR = new d();

    /* renamed from: a, reason: collision with root package name */
    private final int f11768a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f11769b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11770c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f11771d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11772e;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f11773a = false;

        /* renamed from: b, reason: collision with root package name */
        private boolean f11774b = true;

        /* renamed from: c, reason: collision with root package name */
        private int f11775c = 1;

        public CredentialPickerConfig build() {
            return new CredentialPickerConfig(this);
        }

        @Deprecated
        public a setForNewAccount(boolean z8) {
            this.f11775c = z8 ? 3 : 1;
            return this;
        }

        public a setPrompt(int i8) {
            this.f11775c = i8;
            return this;
        }

        public a setShowAddAccountButton(boolean z8) {
            this.f11773a = z8;
            return this;
        }

        public a setShowCancelButton(boolean z8) {
            this.f11774b = z8;
            return this;
        }
    }

    CredentialPickerConfig(int i8, boolean z8, boolean z9, boolean z10, int i9) {
        this.f11768a = i8;
        this.f11769b = z8;
        this.f11770c = z9;
        if (i8 < 2) {
            this.f11771d = z10;
            this.f11772e = z10 ? 3 : 1;
        } else {
            this.f11771d = i9 == 3;
            this.f11772e = i9;
        }
    }

    @Deprecated
    public final boolean isForNewAccount() {
        return this.f11772e == 3;
    }

    public final boolean shouldShowAddAccountButton() {
        return this.f11769b;
    }

    public final boolean shouldShowCancelButton() {
        return this.f11770c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeBoolean(parcel, 1, shouldShowAddAccountButton());
        AbstractC5816c.writeBoolean(parcel, 2, shouldShowCancelButton());
        AbstractC5816c.writeBoolean(parcel, 3, isForNewAccount());
        AbstractC5816c.writeInt(parcel, 4, this.f11772e);
        AbstractC5816c.writeInt(parcel, 1000, this.f11768a);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private CredentialPickerConfig(a aVar) {
        this(2, aVar.f11773a, aVar.f11774b, false, aVar.f11775c);
    }
}
