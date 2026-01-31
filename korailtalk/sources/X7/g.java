package x7;

import S6.AbstractC0765i;
import S6.r;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.kakao.sdk.auth.Constants;
import f7.l;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class g {
    public static final g INSTANCE = new g();

    static final class a extends Lambda implements l {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        public final CharSequence invoke(byte b9) {
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b9)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).byteValue());
        }
    }

    private g() {
    }

    private final String a(Signature signature) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Constants.CODE_CHALLENGE_ALGORITHM);
            messageDigest.update(signature.toByteArray());
            byte[] bArrDigest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
            String strJoinToString$default = AbstractC0765i.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) a.INSTANCE, 30, (Object) null);
            if (strJoinToString$default.length() <= 32) {
                return strJoinToString$default;
            }
            String strSubstring = strJoinToString$default.substring(0, 32);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return strSubstring;
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    private final PackageInfo b(Context context) throws PackageManager.NameNotFoundException {
        if (Build.VERSION.SDK_INT >= 28) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728);
            Intrinsics.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
        Intrinsics.checkNotNull(packageInfo2);
        return packageInfo2;
    }

    private final Signature[] c(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT < 28) {
            Signature[] signatureArr = packageInfo.signatures;
            return signatureArr == null ? new Signature[0] : signatureArr;
        }
        SigningInfo signingInfo = packageInfo.signingInfo;
        Signature[] apkContentsSigners = signingInfo != null ? signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory() : null;
        return apkContentsSigners == null ? new Signature[0] : apkContentsSigners;
    }

    public static final List<String> extractCurrentSignature(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList();
        try {
            g gVar = INSTANCE;
            PackageInfo packageInfoB = gVar.b(context);
            for (Signature signature : gVar.c(packageInfoB)) {
                String strA = INSTANCE.a(signature);
                if (strA.length() > 0) {
                    arrayList.add(strA);
                    StringBuilder sb = new StringBuilder();
                    sb.append("signatureHash: ");
                    sb.append(strA);
                }
            }
            INSTANCE.d(context, packageInfoB);
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static final String getSignatureInfoAsString(Context context) throws PackageManager.NameNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        List<String> listExtractCurrentSignature = extractCurrentSignature(context);
        StringBuilder sb = new StringBuilder();
        sb.append("=== 앱 서명 정보 ===\n");
        sb.append("패키지명: " + context.getPackageName() + '\n');
        int i8 = 0;
        try {
            sb.append("버전명: " + context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName + '\n');
        } catch (Exception unused) {
        }
        sb.append("서명 해시 개수: " + listExtractCurrentSignature.size() + '\n');
        for (Object obj : listExtractCurrentSignature) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                r.throwIndexOverflow();
            }
            sb.append("서명 " + i9 + ": " + ((String) obj) + '\n');
            i8 = i9;
        }
        sb.append("===================");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final void d(Context context, PackageInfo packageInfo) {
    }
}
