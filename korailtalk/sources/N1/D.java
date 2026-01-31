package N1;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import java.util.Map;
import y1.C6514A;

/* loaded from: classes.dex */
public abstract class D {

    /* renamed from: a, reason: collision with root package name */
    private String f3176a;

    /* renamed from: b, reason: collision with root package name */
    private List f3177b;

    /* renamed from: c, reason: collision with root package name */
    private String f3178c;

    /* renamed from: d, reason: collision with root package name */
    private B1.d f3179d;

    /* renamed from: e, reason: collision with root package name */
    private String f3180e;

    /* renamed from: f, reason: collision with root package name */
    private String f3181f;

    /* renamed from: g, reason: collision with root package name */
    private Double f3182g;

    /* renamed from: h, reason: collision with root package name */
    private String f3183h;

    /* renamed from: i, reason: collision with root package name */
    private String f3184i;

    /* renamed from: j, reason: collision with root package name */
    private C6514A f3185j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3186k;

    /* renamed from: l, reason: collision with root package name */
    private View f3187l;

    /* renamed from: m, reason: collision with root package name */
    private View f3188m;

    /* renamed from: n, reason: collision with root package name */
    private Object f3189n;

    /* renamed from: o, reason: collision with root package name */
    private Bundle f3190o = new Bundle();

    /* renamed from: p, reason: collision with root package name */
    private boolean f3191p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3192q;

    /* renamed from: r, reason: collision with root package name */
    private float f3193r;

    public View getAdChoicesContent() {
        return this.f3187l;
    }

    public final String getAdvertiser() {
        return this.f3181f;
    }

    public final String getBody() {
        return this.f3178c;
    }

    public final String getCallToAction() {
        return this.f3180e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.f3190o;
    }

    public final String getHeadline() {
        return this.f3176a;
    }

    public final B1.d getIcon() {
        return this.f3179d;
    }

    public final List<B1.d> getImages() {
        return this.f3177b;
    }

    public float getMediaContentAspectRatio() {
        return this.f3193r;
    }

    public final boolean getOverrideClickHandling() {
        return this.f3192q;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f3191p;
    }

    public final String getPrice() {
        return this.f3184i;
    }

    public final Double getStarRating() {
        return this.f3182g;
    }

    public final String getStore() {
        return this.f3183h;
    }

    public boolean hasVideoContent() {
        return this.f3186k;
    }

    public void setAdChoicesContent(View view) {
        this.f3187l = view;
    }

    public final void setAdvertiser(String str) {
        this.f3181f = str;
    }

    public final void setBody(String str) {
        this.f3178c = str;
    }

    public final void setCallToAction(String str) {
        this.f3180e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.f3190o = bundle;
    }

    public void setHasVideoContent(boolean z8) {
        this.f3186k = z8;
    }

    public final void setHeadline(String str) {
        this.f3176a = str;
    }

    public final void setIcon(B1.d dVar) {
        this.f3179d = dVar;
    }

    public final void setImages(List<B1.d> list) {
        this.f3177b = list;
    }

    public void setMediaContentAspectRatio(float f8) {
        this.f3193r = f8;
    }

    public void setMediaView(View view) {
        this.f3188m = view;
    }

    public final void setOverrideClickHandling(boolean z8) {
        this.f3192q = z8;
    }

    public final void setOverrideImpressionRecording(boolean z8) {
        this.f3191p = z8;
    }

    public final void setPrice(String str) {
        this.f3184i = str;
    }

    public final void setStarRating(Double d9) {
        this.f3182g = d9;
    }

    public final void setStore(String str) {
        this.f3183h = str;
    }

    public final View zza() {
        return this.f3188m;
    }

    public final C6514A zzb() {
        return this.f3185j;
    }

    public final Object zzc() {
        return this.f3189n;
    }

    public final void zzd(Object obj) {
        this.f3189n = obj;
    }

    public final void zze(C6514A c6514a) {
        this.f3185j = c6514a;
    }

    public void recordImpression() {
    }

    public void handleClick(View view) {
    }

    public void untrackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }
}
