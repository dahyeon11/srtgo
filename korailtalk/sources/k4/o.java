package k4;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private j4.s f33640a;

    /* renamed from: b, reason: collision with root package name */
    private int f33641b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33642c = false;

    /* renamed from: d, reason: collision with root package name */
    private s f33643d = new p();

    public o(int i8) {
        this.f33641b = i8;
    }

    public j4.s getBestPreviewSize(List<j4.s> list, boolean z8) {
        return this.f33643d.getBestPreviewSize(list, getDesiredPreviewSize(z8));
    }

    public j4.s getDesiredPreviewSize(boolean z8) {
        j4.s sVar = this.f33640a;
        if (sVar == null) {
            return null;
        }
        return z8 ? sVar.rotate() : sVar;
    }

    public s getPreviewScalingStrategy() {
        return this.f33643d;
    }

    public int getRotation() {
        return this.f33641b;
    }

    public j4.s getViewfinderSize() {
        return this.f33640a;
    }

    public Rect scalePreview(j4.s sVar) {
        return this.f33643d.scalePreview(sVar, this.f33640a);
    }

    public void setPreviewScalingStrategy(s sVar) {
        this.f33643d = sVar;
    }

    public o(int i8, j4.s sVar) {
        this.f33641b = i8;
        this.f33640a = sVar;
    }
}
