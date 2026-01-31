package o2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6029a {
    @Deprecated
    public static byte[] getPackageCertificateHashBytes(Context context, String str) {
        MessageDigest messageDigestZza;
        PackageInfo packageInfo = q2.e.packageManager(context).getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestZza = zza("SHA1")) == null) {
            return null;
        }
        return messageDigestZza.digest(packageInfo.signatures[0].toByteArray());
    }

    public static MessageDigest zza(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i8 = 0; i8 < 2; i8++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
