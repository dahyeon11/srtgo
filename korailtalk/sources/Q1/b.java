package Q1;

import L1.n;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.InterfaceC4899xj;
import y1.o;

/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: a */
    private o f3991a;

    /* renamed from: b */
    private boolean f3992b;

    /* renamed from: c */
    private ImageView.ScaleType f3993c;

    /* renamed from: d */
    private boolean f3994d;

    /* renamed from: e */
    private h f3995e;

    /* renamed from: f */
    private i f3996f;

    public b(Context context) {
        super(context);
    }

    protected final synchronized void a(h hVar) {
        this.f3995e = hVar;
        if (this.f3992b) {
            hVar.zza.b(this.f3991a);
        }
    }

    protected final synchronized void b(i iVar) {
        this.f3996f = iVar;
        if (this.f3994d) {
            iVar.zza.c(this.f3993c);
        }
    }

    public o getMediaContent() {
        return this.f3991a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f3994d = true;
        this.f3993c = scaleType;
        i iVar = this.f3996f;
        if (iVar != null) {
            iVar.zza.c(scaleType);
        }
    }

    public void setMediaContent(o oVar) {
        boolean zZzr;
        this.f3992b = true;
        this.f3991a = oVar;
        h hVar = this.f3995e;
        if (hVar != null) {
            hVar.zza.b(oVar);
        }
        if (oVar == null) {
            return;
        }
        try {
            InterfaceC4899xj interfaceC4899xjZza = oVar.zza();
            if (interfaceC4899xjZza != null) {
                if (!oVar.hasVideoContent()) {
                    if (oVar.zzb()) {
                        zZzr = interfaceC4899xjZza.zzr(r2.b.wrap(this));
                    }
                    removeAllViews();
                }
                zZzr = interfaceC4899xjZza.zzs(r2.b.wrap(this));
                if (zZzr) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e8) {
            removeAllViews();
            n.zzh("", e8);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public b(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }
}
