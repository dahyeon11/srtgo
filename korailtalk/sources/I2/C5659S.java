package i2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import j2.AbstractC5814a;
import j2.AbstractC5816c;

/* renamed from: i2.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5659S extends AbstractC5814a {
    public static final Parcelable.Creator<C5659S> CREATOR = new C5660T();

    /* renamed from: a, reason: collision with root package name */
    final int f31718a;

    /* renamed from: b, reason: collision with root package name */
    private final Account f31719b;

    /* renamed from: c, reason: collision with root package name */
    private final int f31720c;

    /* renamed from: d, reason: collision with root package name */
    private final GoogleSignInAccount f31721d;

    C5659S(int i8, Account account, int i9, GoogleSignInAccount googleSignInAccount) {
        this.f31718a = i8;
        this.f31719b = account;
        this.f31720c = i9;
        this.f31721d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, this.f31718a);
        AbstractC5816c.writeParcelable(parcel, 2, this.f31719b, i8, false);
        AbstractC5816c.writeInt(parcel, 3, this.f31720c);
        AbstractC5816c.writeParcelable(parcel, 4, this.f31721d, i8, false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public C5659S(Account account, int i8, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i8, googleSignInAccount);
    }
}
