package N1;

import Q1.c;
import android.os.Bundle;
import android.view.View;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private String f3207a;

    /* renamed from: b, reason: collision with root package name */
    private List f3208b;

    /* renamed from: c, reason: collision with root package name */
    private String f3209c;

    /* renamed from: d, reason: collision with root package name */
    private c.b f3210d;

    /* renamed from: e, reason: collision with root package name */
    private String f3211e;

    /* renamed from: f, reason: collision with root package name */
    private String f3212f;

    /* renamed from: g, reason: collision with root package name */
    private Double f3213g;

    /* renamed from: h, reason: collision with root package name */
    private String f3214h;

    /* renamed from: i, reason: collision with root package name */
    private String f3215i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3216j;

    /* renamed from: k, reason: collision with root package name */
    private View f3217k;

    /* renamed from: l, reason: collision with root package name */
    private View f3218l;

    /* renamed from: m, reason: collision with root package name */
    private Bundle f3219m = new Bundle();

    /* renamed from: n, reason: collision with root package name */
    private boolean f3220n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3221o;

    /* renamed from: p, reason: collision with root package name */
    private float f3222p;

    public View getAdChoicesContent() {
        return this.f3217k;
    }

    public final String getAdvertiser() {
        return this.f3212f;
    }

    public final String getBody() {
        return this.f3209c;
    }

    public final String getCallToAction() {
        return this.f3211e;
    }

    public float getCurrentTime() {
        return 0.0f;
    }

    public float getDuration() {
        return 0.0f;
    }

    public final Bundle getExtras() {
        return this.f3219m;
    }

    public final String getHeadline() {
        return this.f3207a;
    }

    public final c.b getIcon() {
        return this.f3210d;
    }

    public final List<c.b> getImages() {
        return this.f3208b;
    }

    public float getMediaContentAspectRatio() {
        return this.f3222p;
    }

    public final boolean getOverrideClickHandling() {
        return this.f3221o;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.f3220n;
    }

    public final String getPrice() {
        return this.f3215i;
    }

    public final Double getStarRating() {
        return this.f3213g;
    }

    public final String getStore() {
        return this.f3214h;
    }

    public boolean hasVideoContent() {
        return this.f3216j;
    }

    public void setAdChoicesContent(View view) {
        this.f3217k = view;
    }

    public final void setAdvertiser(String str) {
        this.f3212f = str;
    }

    public final void setBody(String str) {
        this.f3209c = str;
    }

    public final void setCallToAction(String str) {
        this.f3211e = str;
    }

    public final void setExtras(Bundle bundle) {
        this.f3219m = bundle;
    }

    public void setHasVideoContent(boolean z8) {
        this.f3216j = z8;
    }

    public final void setHeadline(String str) {
        this.f3207a = str;
    }

    public final void setIcon(c.b bVar) {
        this.f3210d = bVar;
    }

    public final void setImages(List<c.b> list) {
        this.f3208b = list;
    }

    public void setMediaContentAspectRatio(float f8) {
        this.f3222p = f8;
    }

    public void setMediaView(View view) {
        this.f3218l = view;
    }

    public final void setOverrideClickHandling(boolean z8) {
        this.f3221o = z8;
    }

    public final void setOverrideImpressionRecording(boolean z8) {
        this.f3220n = z8;
    }

    public final void setPrice(String str) {
        this.f3215i = str;
    }

    public final void setStarRating(Double d9) {
        this.f3213g = d9;
    }

    public final void setStore(String str) {
        this.f3214h = str;
    }

    public final View zza() {
        return this.f3218l;
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
