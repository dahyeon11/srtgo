package Y0;

import Q7.X;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f5581a;
    public final float durationFrames;
    public final float startFrame;

    public h(String str, float f8, float f9) {
        this.f5581a = str;
        this.durationFrames = f9;
        this.startFrame = f8;
    }

    public float getDurationFrames() {
        return this.durationFrames;
    }

    public String getName() {
        return this.f5581a;
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public boolean matchesName(String str) {
        if (this.f5581a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f5581a.endsWith(X.CR)) {
            String str2 = this.f5581a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
