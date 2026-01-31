package h1;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.util.Log;
import com.code1system.code1cardscanlib.activities.CamActivity;
import j1.C5812b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C5884c;

/* renamed from: h1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5577a {
    public static final C0308a Companion = new C0308a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31382a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f31383b;

    /* renamed from: c, reason: collision with root package name */
    private final AssetManager f31384c;

    /* renamed from: d, reason: collision with root package name */
    private final C5812b f31385d;

    /* renamed from: e, reason: collision with root package name */
    private int f31386e;

    /* renamed from: f, reason: collision with root package name */
    private String f31387f;

    /* renamed from: h1.a$a, reason: collision with other inner class name */
    public static final class C0308a {
        public /* synthetic */ C0308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0308a() {
        }
    }

    public C5577a(Context context) throws IOException {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31382a = true;
        AssetManager assets = context.getAssets();
        Intrinsics.checkNotNullExpressionValue(assets, "context.assets");
        this.f31384c = assets;
        this.f31385d = new C5812b(null, null, 0, 7, null);
        this.f31387f = "";
        C5884c c5884c = new C5884c();
        String[] list = assets.list("");
        if (list != null) {
            Iterator it = ArrayIteratorKt.iterator(list);
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual((String) it.next(), "code1ocr.lic")) {
                        this.f31386e = 0;
                        this.f31387f = "code1ocr.lic";
                        break;
                    }
                }
            }
        } else {
            this.f31387f = "";
        }
        try {
            InputStream inputStreamOpen = this.f31384c.open(this.f31387f);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "assets.open(licenseFilename)");
            String encrypted = new BufferedReader(new InputStreamReader(inputStreamOpen)).readLine();
            Intrinsics.checkNotNullExpressionValue(encrypted, "encrypted");
            this.f31383b = c5884c.validateLicense$Code1CardScanLib_release(c5884c.decryptedAES128$Code1CardScanLib_release(encrypted), context, this.f31386e);
        } catch (Exception e8) {
            Log.e("LIC DECRYPTED", Intrinsics.stringPlus("라이선스 체크 오류: ", e8.getMessage()));
            c5884c.checkLicense$Code1CardScanLib_release(context, this.f31383b);
        }
        c5884c.checkLicense$Code1CardScanLib_release(context, this.f31383b);
    }

    public final Intent startWithCamera(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new Intent(context, (Class<?>) CamActivity.class);
    }
}
