package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Shader f8938a;

    /* renamed from: b, reason: collision with root package name */
    private final ColorStateList f8939b;

    /* renamed from: c, reason: collision with root package name */
    private int f8940c;

    private d(Shader shader, ColorStateList colorStateList, int i8) {
        this.f8938a = shader;
        this.f8939b = colorStateList;
        this.f8940c = i8;
    }

    private static d a(Resources resources, int i8, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i8);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.hashCode();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.createFromXmlInner(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i8) {
        return new d(null, null, i8);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d inflate(Resources resources, int i8, Resources.Theme theme) {
        try {
            return a(resources, i8, theme);
        } catch (Exception e8) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e8);
            return null;
        }
    }

    public int getColor() {
        return this.f8940c;
    }

    public Shader getShader() {
        return this.f8938a;
    }

    public boolean isGradient() {
        return this.f8938a != null;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        return this.f8938a == null && (colorStateList = this.f8939b) != null && colorStateList.isStateful();
    }

    public boolean onStateChanged(int[] iArr) {
        if (isStateful()) {
            ColorStateList colorStateList = this.f8939b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f8940c) {
                this.f8940c = colorForState;
                return true;
            }
        }
        return false;
    }

    public void setColor(int i8) {
        this.f8940c = i8;
    }

    public boolean willDraw() {
        return isGradient() || this.f8940c != 0;
    }
}
