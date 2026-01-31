package i2;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import f2.C5394d;
import j2.AbstractC5815b;
import j2.AbstractC5816c;

/* loaded from: classes.dex */
public final class p0 implements Parcelable.Creator {
    static void a(C5673f c5673f, Parcel parcel, int i8) {
        int iBeginObjectHeader = AbstractC5816c.beginObjectHeader(parcel);
        AbstractC5816c.writeInt(parcel, 1, c5673f.f31787a);
        AbstractC5816c.writeInt(parcel, 2, c5673f.f31788b);
        AbstractC5816c.writeInt(parcel, 3, c5673f.f31789c);
        AbstractC5816c.writeString(parcel, 4, c5673f.f31790d, false);
        AbstractC5816c.writeIBinder(parcel, 5, c5673f.f31791e, false);
        AbstractC5816c.writeTypedArray(parcel, 6, c5673f.f31792f, i8, false);
        AbstractC5816c.writeBundle(parcel, 7, c5673f.f31793g, false);
        AbstractC5816c.writeParcelable(parcel, 8, c5673f.f31794h, i8, false);
        AbstractC5816c.writeTypedArray(parcel, 10, c5673f.f31795i, i8, false);
        AbstractC5816c.writeTypedArray(parcel, 11, c5673f.f31796j, i8, false);
        AbstractC5816c.writeBoolean(parcel, 12, c5673f.f31797k);
        AbstractC5816c.writeInt(parcel, 13, c5673f.f31798l);
        AbstractC5816c.writeBoolean(parcel, 14, c5673f.f31799m);
        AbstractC5816c.writeString(parcel, 15, c5673f.zza(), false);
        AbstractC5816c.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        Scope[] scopeArr = C5673f.f31785o;
        Bundle bundle = new Bundle();
        C5394d[] c5394dArr = C5673f.f31786p;
        C5394d[] c5394dArr2 = c5394dArr;
        String strCreateString = null;
        IBinder iBinder = null;
        Account account = null;
        String strCreateString2 = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        boolean z8 = false;
        int i11 = 0;
        boolean z9 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            switch (AbstractC5815b.getFieldId(header)) {
                case 1:
                    i8 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 2:
                    i9 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 3:
                    i10 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 4:
                    strCreateString = AbstractC5815b.createString(parcel, header);
                    break;
                case 5:
                    iBinder = AbstractC5815b.readIBinder(parcel, header);
                    break;
                case 6:
                    scopeArr = (Scope[]) AbstractC5815b.createTypedArray(parcel, header, Scope.CREATOR);
                    break;
                case 7:
                    bundle = AbstractC5815b.createBundle(parcel, header);
                    break;
                case 8:
                    account = (Account) AbstractC5815b.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 9:
                default:
                    AbstractC5815b.skipUnknownField(parcel, header);
                    break;
                case 10:
                    c5394dArr = (C5394d[]) AbstractC5815b.createTypedArray(parcel, header, C5394d.CREATOR);
                    break;
                case 11:
                    c5394dArr2 = (C5394d[]) AbstractC5815b.createTypedArray(parcel, header, C5394d.CREATOR);
                    break;
                case 12:
                    z8 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 13:
                    i11 = AbstractC5815b.readInt(parcel, header);
                    break;
                case 14:
                    z9 = AbstractC5815b.readBoolean(parcel, header);
                    break;
                case 15:
                    strCreateString2 = AbstractC5815b.createString(parcel, header);
                    break;
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5673f(i8, i9, i10, strCreateString, iBinder, scopeArr, bundle, account, c5394dArr, c5394dArr2, z8, i11, z9, strCreateString2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5673f[i8];
    }
}
