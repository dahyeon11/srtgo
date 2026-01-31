package w2;

import android.util.Base64;
import java.util.Random;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Random f37377a = new Random();

    public static String zzw() {
        byte[] bArr = new byte[16];
        f37377a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
