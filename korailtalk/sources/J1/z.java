package J1;

import H1.C0591z;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.kakao.sdk.link.Constants;

/* loaded from: classes.dex */
public final class z extends FrameLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ImageButton f2572a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0623f f2573b;

    public z(Context context, y yVar, InterfaceC0623f interfaceC0623f) throws Resources.NotFoundException {
        super(context);
        this.f2573b = interfaceC0623f;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f2572a = imageButton;
        b();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        C0591z.zzb();
        int iZzy = L1.g.zzy(context, yVar.zza);
        C0591z.zzb();
        int iZzy2 = L1.g.zzy(context, 0);
        C0591z.zzb();
        int iZzy3 = L1.g.zzy(context, yVar.zzb);
        C0591z.zzb();
        imageButton.setPadding(iZzy, iZzy2, iZzy3, L1.g.zzy(context, yVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        C0591z.zzb();
        int iZzy4 = L1.g.zzy(context, yVar.zzd + yVar.zza + yVar.zzb);
        C0591z.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(iZzy4, L1.g.zzy(context, yVar.zzd + yVar.zzc), 17));
        long jLongValue = ((Long) H1.C.zzc().zza(AbstractC4439th.zzbd)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        x xVar = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbe)).booleanValue() ? new x(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(xVar);
    }

    private final void b() throws Resources.NotFoundException {
        String str = (String) H1.C.zzc().zza(AbstractC4439th.zzbc);
        if (!o2.n.isAtLeastLollipop() || TextUtils.isEmpty(str) || Constants.VALIDATION_DEFAULT.equals(str)) {
            this.f2572a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources resourcesZze = G1.u.zzo().zze();
        if (resourcesZze == null) {
            this.f2572a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = resourcesZze.getDrawable(E1.a.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = resourcesZze.getDrawable(E1.a.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            L1.n.zze("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.f2572a.setImageResource(R.drawable.btn_dialog);
        } else {
            this.f2572a.setImageDrawable(drawable);
            this.f2572a.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0623f interfaceC0623f = this.f2573b;
        if (interfaceC0623f != null) {
            interfaceC0623f.zzj();
        }
    }

    public final void zzb(boolean z8) {
        if (!z8) {
            this.f2572a.setVisibility(0);
            return;
        }
        this.f2572a.setVisibility(8);
        if (((Long) H1.C.zzc().zza(AbstractC4439th.zzbd)).longValue() > 0) {
            this.f2572a.animate().cancel();
            this.f2572a.clearAnimation();
        }
    }
}
