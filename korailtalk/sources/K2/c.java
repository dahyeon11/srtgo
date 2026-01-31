package K2;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public class c implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    private static final c f2863a = new c();

    public static c getInstance() {
        return f2863a;
    }

    @Override // android.animation.TypeEvaluator
    public Integer evaluate(float f8, Integer num, Integer num2) {
        int iIntValue = num.intValue();
        float f9 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = num2.intValue();
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float f10 = f9 + (((((iIntValue2 >> 24) & 255) / 255.0f) - f9) * f8);
        float fPow5 = fPow2 + ((((float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d)) - fPow2) * f8);
        float fPow6 = fPow3 + (f8 * (((float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d)) - fPow3));
        return Integer.valueOf((Math.round(((float) Math.pow(fPow + ((fPow4 - fPow) * f8), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f10 * 255.0f) << 24) | (Math.round(((float) Math.pow(fPow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(fPow6, 0.45454545454545453d)) * 255.0f));
    }
}
