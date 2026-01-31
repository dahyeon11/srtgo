package Y0;

/* loaded from: classes.dex */
public class b {
    public float baselineShift;
    public int color;
    public String fontName;
    public a justification;
    public float lineHeight;
    public float size;
    public int strokeColor;
    public boolean strokeOverFill;
    public float strokeWidth;
    public String text;
    public int tracking;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, float f8, a aVar, int i8, float f9, float f10, int i9, int i10, float f11, boolean z8) {
        set(str, str2, f8, aVar, i8, f9, f10, i9, i10, f11, z8);
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.text.hashCode() * 31) + this.fontName.hashCode()) * 31) + this.size)) * 31) + this.justification.ordinal()) * 31) + this.tracking;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.lineHeight);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.color;
    }

    public void set(String str, String str2, float f8, a aVar, int i8, float f9, float f10, int i9, int i10, float f11, boolean z8) {
        this.text = str;
        this.fontName = str2;
        this.size = f8;
        this.justification = aVar;
        this.tracking = i8;
        this.lineHeight = f9;
        this.baselineShift = f10;
        this.color = i9;
        this.strokeColor = i10;
        this.strokeWidth = f11;
        this.strokeOverFill = z8;
    }

    public b() {
    }
}
