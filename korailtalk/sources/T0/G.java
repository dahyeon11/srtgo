package T0;

import com.airbnb.lottie.LottieAnimationView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class G {

    /* renamed from: a */
    private final Map f4780a;

    /* renamed from: b */
    private final LottieAnimationView f4781b;

    /* renamed from: c */
    private final com.airbnb.lottie.p f4782c;

    /* renamed from: d */
    private boolean f4783d;

    public G(LottieAnimationView lottieAnimationView) {
        this.f4780a = new HashMap();
        this.f4783d = true;
        this.f4781b = lottieAnimationView;
        this.f4782c = null;
    }

    private void a() {
        LottieAnimationView lottieAnimationView = this.f4781b;
        if (lottieAnimationView != null) {
            lottieAnimationView.invalidate();
        }
        com.airbnb.lottie.p pVar = this.f4782c;
        if (pVar != null) {
            pVar.invalidateSelf();
        }
    }

    public String getText(String str, String str2) {
        return getText(str2);
    }

    public final String getTextInternal(String str, String str2) {
        if (this.f4783d && this.f4780a.containsKey(str2)) {
            return (String) this.f4780a.get(str2);
        }
        String text = getText(str, str2);
        if (this.f4783d) {
            this.f4780a.put(str2, text);
        }
        return text;
    }

    public void invalidateAllText() {
        this.f4780a.clear();
        a();
    }

    public void invalidateText(String str) {
        this.f4780a.remove(str);
        a();
    }

    public void setCacheText(boolean z8) {
        this.f4783d = z8;
    }

    public void setText(String str, String str2) {
        this.f4780a.put(str, str2);
        a();
    }

    public String getText(String str) {
        return str;
    }

    public G(com.airbnb.lottie.p pVar) {
        this.f4780a = new HashMap();
        this.f4783d = true;
        this.f4782c = pVar;
        this.f4781b = null;
    }
}
