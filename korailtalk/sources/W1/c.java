package W1;

import H1.C0537g1;
import L1.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import y1.AbstractC6524e;
import y1.C6528i;

/* loaded from: classes.dex */
public final class c extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private final C0537g1 f5302a;

    public c(Context context) {
        super(context);
        this.f5302a = new C0537g1(this);
    }

    public void destroy() {
        this.f5302a.zzk();
    }

    public AbstractC6524e getAdListener() {
        return this.f5302a.zza();
    }

    public C6528i getAdSize() {
        return this.f5302a.zzb();
    }

    public String getAdUnitId() {
        return this.f5302a.zzj();
    }

    public void loadAd(a aVar) {
        if (!C6528i.SEARCH.equals(getAdSize())) {
            throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
        }
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i12 = ((i10 - i8) - measuredWidth) / 2;
        int i13 = ((i11 - i9) - measuredHeight) / 2;
        childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        C6528i adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e8) {
                n.zzh("Unable to retrieve ad size.", e8);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i8, i9);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i8), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i9));
    }

    public void pause() {
        this.f5302a.zzn();
    }

    public void resume() {
        this.f5302a.zzp();
    }

    public void setAdListener(AbstractC6524e abstractC6524e) {
        this.f5302a.zzr(abstractC6524e);
    }

    public void setAdSize(C6528i c6528i) {
        this.f5302a.zzs(c6528i);
    }

    public void setAdUnitId(String str) {
        this.f5302a.zzu(str);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5302a = new C0537g1(this, attributeSet, false);
    }

    public void loadAd(b bVar) {
        throw null;
    }

    public c(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f5302a = new C0537g1(this, attributeSet, false);
    }
}
