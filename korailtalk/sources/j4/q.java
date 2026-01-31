package j4;

import android.content.Intent;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final String f33471a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33472b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f33473c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f33474d;

    /* renamed from: e, reason: collision with root package name */
    private final String f33475e;

    /* renamed from: f, reason: collision with root package name */
    private final String f33476f;

    /* renamed from: g, reason: collision with root package name */
    private final Intent f33477g;

    q(Intent intent) {
        this(null, null, null, null, null, null, intent);
    }

    public static q parseActivityResult(int i8, Intent intent) {
        if (i8 != -1) {
            return new q(intent);
        }
        String stringExtra = intent.getStringExtra("SCAN_RESULT");
        String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
        byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
        int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", Integer.MIN_VALUE);
        return new q(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"), intent);
    }

    public String getBarcodeImagePath() {
        return this.f33476f;
    }

    public String getContents() {
        return this.f33471a;
    }

    public String getErrorCorrectionLevel() {
        return this.f33475e;
    }

    public String getFormatName() {
        return this.f33472b;
    }

    public Integer getOrientation() {
        return this.f33474d;
    }

    public Intent getOriginalIntent() {
        return this.f33477g;
    }

    public byte[] getRawBytes() {
        return this.f33473c;
    }

    public String toString() {
        byte[] bArr = this.f33473c;
        return "Format: " + this.f33472b + "\nContents: " + this.f33471a + "\nRaw bytes: (" + (bArr == null ? 0 : bArr.length) + " bytes)\nOrientation: " + this.f33474d + "\nEC level: " + this.f33475e + "\nBarcode image: " + this.f33476f + "\nOriginal intent: " + this.f33477g + '\n';
    }

    q(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f33471a = str;
        this.f33472b = str2;
        this.f33473c = bArr;
        this.f33474d = num;
        this.f33475e = str3;
        this.f33476f = str4;
        this.f33477g = intent;
    }
}
