package Y0;

import a1.p;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final List f5571a;

    /* renamed from: b, reason: collision with root package name */
    private final char f5572b;

    /* renamed from: c, reason: collision with root package name */
    private final double f5573c;

    /* renamed from: d, reason: collision with root package name */
    private final double f5574d;

    /* renamed from: e, reason: collision with root package name */
    private final String f5575e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5576f;

    public d(List<p> list, char c9, double d9, double d10, String str, String str2) {
        this.f5571a = list;
        this.f5572b = c9;
        this.f5573c = d9;
        this.f5574d = d10;
        this.f5575e = str;
        this.f5576f = str2;
    }

    public static int hashFor(char c9, String str, String str2) {
        return (((c9 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<p> getShapes() {
        return this.f5571a;
    }

    public double getWidth() {
        return this.f5574d;
    }

    public int hashCode() {
        return hashFor(this.f5572b, this.f5576f, this.f5575e);
    }
}
