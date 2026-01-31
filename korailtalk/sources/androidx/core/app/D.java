package androidx.core.app;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class D {
    public static final int EDIT_CHOICES_BEFORE_SENDING_AUTO = 0;
    public static final int EDIT_CHOICES_BEFORE_SENDING_DISABLED = 1;
    public static final int EDIT_CHOICES_BEFORE_SENDING_ENABLED = 2;
    public static final String EXTRA_RESULTS_DATA = "android.remoteinput.resultsData";
    public static final String RESULTS_CLIP_LABEL = "android.remoteinput.results";
    public static final int SOURCE_CHOICE = 1;
    public static final int SOURCE_FREE_FORM_INPUT = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f8689a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f8690b;

    /* renamed from: c, reason: collision with root package name */
    private final CharSequence[] f8691c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f8692d;

    /* renamed from: e, reason: collision with root package name */
    private final int f8693e;

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f8694f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f8695g;

    static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        static D b(Object obj) {
            Set<String> setB;
            RemoteInput remoteInput = (RemoteInput) obj;
            e eVarAddExtras = new e(remoteInput.getResultKey()).setLabel(remoteInput.getLabel()).setChoices(remoteInput.getChoices()).setAllowFreeFormInput(remoteInput.getAllowFreeFormInput()).addExtras(remoteInput.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (setB = b.b(remoteInput)) != null) {
                Iterator<String> it = setB.iterator();
                while (it.hasNext()) {
                    eVarAddExtras.setAllowDataType(it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                eVarAddExtras.setEditChoicesBeforeSending(d.a(remoteInput));
            }
            return eVarAddExtras.build();
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }

        public static RemoteInput fromCompat(D d9) {
            Set<String> allowedDataTypes;
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(d9.getResultKey()).setLabel(d9.getLabel()).setChoices(d9.getChoices()).setAllowFreeFormInput(d9.getAllowFreeFormInput()).addExtras(d9.getExtras());
            if (Build.VERSION.SDK_INT >= 26 && (allowedDataTypes = d9.getAllowedDataTypes()) != null) {
                Iterator<String> it = allowedDataTypes.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                d.b(builderAddExtras, d9.getEditChoicesBeforeSending());
            }
            return builderAddExtras.build();
        }
    }

    static class b {
        static void a(D d9, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(D.a(d9), intent, map);
        }

        static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z8) {
            return builder.setAllowDataType(str, z8);
        }
    }

    static class c {
        static int a(Intent intent) {
            return RemoteInput.getResultsSource(intent);
        }

        static void b(Intent intent, int i8) {
            RemoteInput.setResultsSource(intent, i8);
        }
    }

    static class d {
        static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        static RemoteInput.Builder b(RemoteInput.Builder builder, int i8) {
            return builder.setEditChoicesBeforeSending(i8);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f8696a;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f8699d;

        /* renamed from: e, reason: collision with root package name */
        private CharSequence[] f8700e;

        /* renamed from: b, reason: collision with root package name */
        private final Set f8697b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f8698c = new Bundle();

        /* renamed from: f, reason: collision with root package name */
        private boolean f8701f = true;

        /* renamed from: g, reason: collision with root package name */
        private int f8702g = 0;

        public e(String str) {
            if (str == null) {
                throw new IllegalArgumentException("Result key can't be null");
            }
            this.f8696a = str;
        }

        public e addExtras(Bundle bundle) {
            if (bundle != null) {
                this.f8698c.putAll(bundle);
            }
            return this;
        }

        public D build() {
            return new D(this.f8696a, this.f8699d, this.f8700e, this.f8701f, this.f8702g, this.f8698c, this.f8697b);
        }

        public Bundle getExtras() {
            return this.f8698c;
        }

        public e setAllowDataType(String str, boolean z8) {
            if (z8) {
                this.f8697b.add(str);
            } else {
                this.f8697b.remove(str);
            }
            return this;
        }

        public e setAllowFreeFormInput(boolean z8) {
            this.f8701f = z8;
            return this;
        }

        public e setChoices(CharSequence[] charSequenceArr) {
            this.f8700e = charSequenceArr;
            return this;
        }

        public e setEditChoicesBeforeSending(int i8) {
            this.f8702g = i8;
            return this;
        }

        public e setLabel(CharSequence charSequence) {
            this.f8699d = charSequence;
            return this;
        }
    }

    D(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z8, int i8, Bundle bundle, Set set) {
        this.f8689a = str;
        this.f8690b = charSequence;
        this.f8691c = charSequenceArr;
        this.f8692d = z8;
        this.f8693e = i8;
        this.f8694f = bundle;
        this.f8695g = set;
        if (getEditChoicesBeforeSending() == 2 && !getAllowFreeFormInput()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    static RemoteInput a(D d9) {
        return a.fromCompat(d9);
    }

    public static void addDataResultToIntent(D d9, Intent intent, Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            b.a(d9, intent, map);
            return;
        }
        Intent intentD = d(intent);
        if (intentD == null) {
            intentD = new Intent();
        }
        for (Map.Entry<String, Uri> entry : map.entrySet()) {
            String key = entry.getKey();
            Uri value = entry.getValue();
            if (key != null) {
                Bundle bundleExtra = intentD.getBundleExtra(e(key));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(d9.getResultKey(), value.toString());
                intentD.putExtra(e(key), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent(RESULTS_CLIP_LABEL, intentD));
    }

    public static void addResultsToIntent(D[] dArr, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            a.a(b(dArr), intent, bundle);
            return;
        }
        Bundle resultsFromIntent = getResultsFromIntent(intent);
        int resultsSource = getResultsSource(intent);
        if (resultsFromIntent != null) {
            resultsFromIntent.putAll(bundle);
            bundle = resultsFromIntent;
        }
        for (D d9 : dArr) {
            Map<String, Uri> dataResultsFromIntent = getDataResultsFromIntent(intent, d9.getResultKey());
            a.a(b(new D[]{d9}), intent, bundle);
            if (dataResultsFromIntent != null) {
                addDataResultToIntent(d9, intent, dataResultsFromIntent);
            }
        }
        setResultsSource(intent, resultsSource);
    }

    static RemoteInput[] b(D[] dArr) {
        if (dArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            remoteInputArr[i8] = a(dArr[i8]);
        }
        return remoteInputArr;
    }

    static D c(RemoteInput remoteInput) {
        return a.b(remoteInput);
    }

    private static Intent d(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(RESULTS_CLIP_LABEL)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    private static String e(String str) {
        return "android.remoteinput.dataTypeResultsData" + str;
    }

    public static Map<String, Uri> getDataResultsFromIntent(Intent intent, String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(intent, str);
        }
        Intent intentD = d(intent);
        if (intentD == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (String str2 : intentD.getExtras().keySet()) {
            if (str2.startsWith("android.remoteinput.dataTypeResultsData")) {
                String strSubstring = str2.substring(39);
                if (!strSubstring.isEmpty() && (string = intentD.getBundleExtra(str2).getString(str)) != null && !string.isEmpty()) {
                    map.put(strSubstring, Uri.parse(string));
                }
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static Bundle getResultsFromIntent(Intent intent) {
        return a.c(intent);
    }

    public static int getResultsSource(Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(intent);
        }
        Intent intentD = d(intent);
        if (intentD == null) {
            return 0;
        }
        return intentD.getExtras().getInt("android.remoteinput.resultsSource", 0);
    }

    public static void setResultsSource(Intent intent, int i8) {
        if (Build.VERSION.SDK_INT >= 28) {
            c.b(intent, i8);
            return;
        }
        Intent intentD = d(intent);
        if (intentD == null) {
            intentD = new Intent();
        }
        intentD.putExtra("android.remoteinput.resultsSource", i8);
        intent.setClipData(ClipData.newIntent(RESULTS_CLIP_LABEL, intentD));
    }

    public boolean getAllowFreeFormInput() {
        return this.f8692d;
    }

    public Set<String> getAllowedDataTypes() {
        return this.f8695g;
    }

    public CharSequence[] getChoices() {
        return this.f8691c;
    }

    public int getEditChoicesBeforeSending() {
        return this.f8693e;
    }

    public Bundle getExtras() {
        return this.f8694f;
    }

    public CharSequence getLabel() {
        return this.f8690b;
    }

    public String getResultKey() {
        return this.f8689a;
    }

    public boolean isDataOnly() {
        return (getAllowFreeFormInput() || (getChoices() != null && getChoices().length != 0) || getAllowedDataTypes() == null || getAllowedDataTypes().isEmpty()) ? false : true;
    }
}
