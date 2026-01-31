package j4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.accessibility.AbstractC0927b;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class r {
    public static final String DATA_MATRIX = "DATA_MATRIX";
    public static final String PDF_417 = "PDF_417";
    public static final String QR_CODE = "QR_CODE";

    /* renamed from: a, reason: collision with root package name */
    private final Map f33478a = new HashMap(3);

    /* renamed from: b, reason: collision with root package name */
    private Collection f33479b;

    /* renamed from: c, reason: collision with root package name */
    private Class f33480c;
    public static final String UPC_A = "UPC_A";
    public static final String UPC_E = "UPC_E";
    public static final String EAN_8 = "EAN_8";
    public static final String EAN_13 = "EAN_13";
    public static final String RSS_14 = "RSS_14";
    public static final Collection<String> PRODUCT_CODE_TYPES = c(UPC_A, UPC_E, EAN_8, EAN_13, RSS_14);
    public static final String CODE_39 = "CODE_39";
    public static final String CODE_93 = "CODE_93";
    public static final String CODE_128 = "CODE_128";
    public static final String ITF = "ITF";
    public static final String RSS_EXPANDED = "RSS_EXPANDED";
    public static final Collection<String> ONE_D_CODE_TYPES = c(UPC_A, UPC_E, EAN_8, EAN_13, RSS_14, CODE_39, CODE_93, CODE_128, ITF, RSS_14, RSS_EXPANDED);
    public static final Collection<String> ALL_CODE_TYPES = null;

    private void a(Intent intent) {
        for (Map.Entry entry : this.f33478a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                intent.putExtra(str, (Integer) value);
            } else if (value instanceof Long) {
                intent.putExtra(str, (Long) value);
            } else if (value instanceof Boolean) {
                intent.putExtra(str, (Boolean) value);
            } else if (value instanceof Double) {
                intent.putExtra(str, (Double) value);
            } else if (value instanceof Float) {
                intent.putExtra(str, (Float) value);
            } else if (value instanceof Bundle) {
                intent.putExtra(str, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(str, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(str, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(str, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(str, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(str, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(str, (String[]) value);
            } else {
                intent.putExtra(str, value.toString());
            }
        }
    }

    private static List c(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final r addExtra(String str, Object obj) {
        this.f33478a.put(str, obj);
        return this;
    }

    protected Class b() {
        return CaptureActivity.class;
    }

    public Intent createScanIntent(Context context) {
        Intent intent = new Intent(context, getCaptureActivity());
        intent.setAction("com.google.zxing.client.android.SCAN");
        if (this.f33479b != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : this.f33479b) {
                if (sb.length() > 0) {
                    sb.append(',');
                }
                sb.append(str);
            }
            intent.putExtra("SCAN_FORMATS", sb.toString());
        }
        intent.addFlags(AbstractC0927b.TYPE_VIEW_TARGETED_BY_SCROLL);
        intent.addFlags(524288);
        a(intent);
        return intent;
    }

    public Class<?> getCaptureActivity() {
        if (this.f33480c == null) {
            this.f33480c = b();
        }
        return this.f33480c;
    }

    public Map<String, ?> getMoreExtras() {
        return this.f33478a;
    }

    public r setBarcodeImageEnabled(boolean z8) {
        addExtra("BARCODE_IMAGE_ENABLED", Boolean.valueOf(z8));
        return this;
    }

    public r setBeepEnabled(boolean z8) {
        addExtra("BEEP_ENABLED", Boolean.valueOf(z8));
        return this;
    }

    public r setCameraId(int i8) {
        if (i8 >= 0) {
            addExtra("SCAN_CAMERA_ID", Integer.valueOf(i8));
        }
        return this;
    }

    public r setCaptureActivity(Class<?> cls) {
        this.f33480c = cls;
        return this;
    }

    public r setDesiredBarcodeFormats(Collection<String> collection) {
        this.f33479b = collection;
        return this;
    }

    public r setOrientationLocked(boolean z8) {
        addExtra("SCAN_ORIENTATION_LOCKED", Boolean.valueOf(z8));
        return this;
    }

    public final r setPrompt(String str) {
        if (str != null) {
            addExtra("PROMPT_MESSAGE", str);
        }
        return this;
    }

    public r setTimeout(long j8) {
        addExtra("TIMEOUT", Long.valueOf(j8));
        return this;
    }

    public r setTorchEnabled(boolean z8) {
        addExtra("TORCH_ENABLED", Boolean.valueOf(z8));
        return this;
    }

    public r setDesiredBarcodeFormats(String... strArr) {
        this.f33479b = Arrays.asList(strArr);
        return this;
    }
}
