package i2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import j2.AbstractC5815b;

/* renamed from: i2.T, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5660T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = AbstractC5815b.validateObjectHeader(parcel);
        int i8 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i9 = 0;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = AbstractC5815b.readHeader(parcel);
            int fieldId = AbstractC5815b.getFieldId(header);
            if (fieldId == 1) {
                i8 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId == 2) {
                account = (Account) AbstractC5815b.createParcelable(parcel, header, Account.CREATOR);
            } else if (fieldId == 3) {
                i9 = AbstractC5815b.readInt(parcel, header);
            } else if (fieldId != 4) {
                AbstractC5815b.skipUnknownField(parcel, header);
            } else {
                googleSignInAccount = (GoogleSignInAccount) AbstractC5815b.createParcelable(parcel, header, GoogleSignInAccount.CREATOR);
            }
        }
        AbstractC5815b.ensureAtEnd(parcel, iValidateObjectHeader);
        return new C5659S(i8, account, i9, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i8) {
        return new C5659S[i8];
    }
}
