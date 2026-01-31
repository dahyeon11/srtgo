package y1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class x {
    public static final String MAX_AD_CONTENT_RATING_T = "T";
    public static final String MAX_AD_CONTENT_RATING_UNSPECIFIED = "";
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_FALSE = 0;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_TRUE = 1;
    public static final int TAG_FOR_UNDER_AGE_OF_CONSENT_UNSPECIFIED = -1;

    /* renamed from: a, reason: collision with root package name */
    private final int f37590a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37591b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37592c;

    /* renamed from: d, reason: collision with root package name */
    private final List f37593d;

    /* renamed from: e, reason: collision with root package name */
    private final b f37594e;
    public static final String MAX_AD_CONTENT_RATING_MA = "MA";
    public static final String MAX_AD_CONTENT_RATING_PG = "PG";
    public static final String MAX_AD_CONTENT_RATING_G = "G";
    public static final List zza = Arrays.asList(MAX_AD_CONTENT_RATING_MA, "T", MAX_AD_CONTENT_RATING_PG, MAX_AD_CONTENT_RATING_G);

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f37595a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f37596b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f37597c = null;

        /* renamed from: d, reason: collision with root package name */
        private final List f37598d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private b f37599e = b.DEFAULT;

        public x build() {
            return new x(this.f37595a, this.f37596b, this.f37597c, this.f37598d, this.f37599e, null);
        }

        public a setMaxAdContentRating(String str) {
            if (str == null || "".equals(str)) {
                this.f37597c = null;
            } else if (x.MAX_AD_CONTENT_RATING_G.equals(str) || x.MAX_AD_CONTENT_RATING_PG.equals(str) || "T".equals(str) || x.MAX_AD_CONTENT_RATING_MA.equals(str)) {
                this.f37597c = str;
            } else {
                L1.n.zzj("Invalid value passed to setMaxAdContentRating: ".concat(str));
            }
            return this;
        }

        public a setPublisherPrivacyPersonalizationState(b bVar) {
            this.f37599e = bVar;
            return this;
        }

        public a setTagForChildDirectedTreatment(int i8) {
            if (i8 == -1 || i8 == 0 || i8 == 1) {
                this.f37595a = i8;
            } else {
                L1.n.zzj("Invalid value passed to setTagForChildDirectedTreatment: " + i8);
            }
            return this;
        }

        public a setTagForUnderAgeOfConsent(int i8) {
            if (i8 == -1 || i8 == 0 || i8 == 1) {
                this.f37596b = i8;
            } else {
                L1.n.zzj("Invalid value passed to setTagForUnderAgeOfConsent: " + i8);
            }
            return this;
        }

        public a setTestDeviceIds(List<String> list) {
            this.f37598d.clear();
            if (list != null) {
                this.f37598d.addAll(list);
            }
            return this;
        }
    }

    public enum b {
        DEFAULT(0),
        ENABLED(1),
        DISABLED(2);


        /* renamed from: a, reason: collision with root package name */
        private final int f37601a;

        b(int i8) {
            this.f37601a = i8;
        }

        public int getValue() {
            return this.f37601a;
        }
    }

    /* synthetic */ x(int i8, int i9, String str, List list, b bVar, J j8) {
        this.f37590a = i8;
        this.f37591b = i9;
        this.f37592c = str;
        this.f37593d = list;
        this.f37594e = bVar;
    }

    public String getMaxAdContentRating() {
        String str = this.f37592c;
        return str == null ? "" : str;
    }

    public b getPublisherPrivacyPersonalizationState() {
        return this.f37594e;
    }

    public int getTagForChildDirectedTreatment() {
        return this.f37590a;
    }

    public int getTagForUnderAgeOfConsent() {
        return this.f37591b;
    }

    public List<String> getTestDeviceIds() {
        return new ArrayList(this.f37593d);
    }

    public a toBuilder() {
        a aVar = new a();
        aVar.setTagForChildDirectedTreatment(this.f37590a);
        aVar.setTagForUnderAgeOfConsent(this.f37591b);
        aVar.setMaxAdContentRating(this.f37592c);
        aVar.setTestDeviceIds(this.f37593d);
        return aVar;
    }
}
