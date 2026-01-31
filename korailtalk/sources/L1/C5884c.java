package l1;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Base64;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.Intrinsics;
import l7.C5900f;
import l7.r;

/* renamed from: l1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5884c {

    /* renamed from: a, reason: collision with root package name */
    private final String f33937a = "==cocrdc1==v==v=";

    /* renamed from: b, reason: collision with root package name */
    private boolean f33938b;

    /* renamed from: c, reason: collision with root package name */
    private final long f33939c;

    public C5884c() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 2022);
        calendar.set(2, 11);
        calendar.set(5, 31);
        this.f33939c = calendar.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(DialogInterface dialogInterface, int i8) {
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DialogInterface dialogInterface, int i8) {
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    private final long e(long j8) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j8);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public final boolean barcodeCheck$Code1CardScanLib_release(String LicenseTxt) {
        Intrinsics.checkNotNullParameter(LicenseTxt, "LicenseTxt");
        return Intrinsics.areEqual(r.split$default((CharSequence) LicenseTxt, new String[]{g5.e.STATE_NAME_NONE}, false, 0, 6, (Object) null).get(1), "barcode");
    }

    public final void checkLicense$Code1CardScanLib_release(Context context, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (z8) {
            return;
        }
        if (this.f33938b) {
            new AlertDialog.Builder(context).setMessage("라이선스 유효기간이 종료되었습니다.\n관리자에게 문의 부탁드립니다.").setTitle("오류").setCancelable(false).setPositiveButton("앱 종료", new DialogInterface.OnClickListener() { // from class: l1.a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    C5884c.c(dialogInterface, i8);
                }
            }).create().show();
        } else {
            new AlertDialog.Builder(context).setMessage("유효하지않은 라이선스입니다.\n관리자에게 문의 부탁드립니다.").setTitle("오류").setCancelable(false).setPositiveButton("앱 종료", new DialogInterface.OnClickListener() { // from class: l1.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    C5884c.d(dialogInterface, i8);
                }
            }).create().show();
        }
    }

    public final String decryptedAES128$Code1CardScanLib_release(String encrypted) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        byte[] bArrDecode = Base64.decode(encrypted, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(encrypted, Base64.DEFAULT)");
        String str = this.f33937a;
        Charset charset = C5900f.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec);
        byte[] output = cipher.doFinal(bArrDecode);
        Intrinsics.checkNotNullExpressionValue(output, "output");
        return new String(output, charset);
    }

    public final String encryptAES128$Code1CardScanLib_release(String plainText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Intrinsics.checkNotNullParameter(plainText, "plainText");
        Cipher cipher = Cipher.getInstance("AES");
        String str = this.f33937a;
        Charset charset = C5900f.UTF_8;
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        cipher.init(1, new SecretKeySpec(bytes, "AES"));
        byte[] bytes2 = (plainText + '-' + this.f33939c).getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
        byte[] encodedByte = Base64.encode(cipher.doFinal(bytes2), 0);
        Intrinsics.checkNotNullExpressionValue(encodedByte, "encodedByte");
        return new String(encodedByte, charset);
    }

    public final boolean validateLicense$Code1CardScanLib_release(String LicenseTxt, Context context, int i8) {
        Intrinsics.checkNotNullParameter(LicenseTxt, "LicenseTxt");
        Intrinsics.checkNotNullParameter(context, "context");
        if (i8 != 1) {
            return Intrinsics.areEqual((String) r.split$default((CharSequence) LicenseTxt, new String[]{g5.e.STATE_NAME_NONE}, false, 0, 6, (Object) null).get(0), context.getPackageName());
        }
        this.f33938b = true;
        return ((Intrinsics.areEqual(r.split$default((CharSequence) LicenseTxt, new String[]{g5.e.STATE_NAME_NONE}, false, 0, 6, (Object) null).get(1), "barcode") ? e(Long.parseLong((String) r.split$default((CharSequence) LicenseTxt, new String[]{g5.e.STATE_NAME_NONE}, false, 0, 6, (Object) null).get(2))) : e(Long.parseLong((String) r.split$default((CharSequence) LicenseTxt, new String[]{g5.e.STATE_NAME_NONE}, false, 0, 6, (Object) null).get(1)))) - e(Calendar.getInstance().getTimeInMillis())) / ((long) 86400000) >= 0;
    }
}
