package y6;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import z4.C6630d;

/* renamed from: y6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6550j extends C6542b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f37652a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37653b;

    /* renamed from: c, reason: collision with root package name */
    private int f37654c;

    /* renamed from: d, reason: collision with root package name */
    private int f37655d;

    /* renamed from: e, reason: collision with root package name */
    private v4.g f37656e;

    public C6550j(Context context) {
        super(context);
        g();
    }

    private void g() {
        h();
    }

    private void h() {
        this.f37652a = true;
        this.f37653b = true;
    }

    public void collapse() {
        findViewById(AbstractC5955f.headerView).setSelected(false);
        ImageView imageView = (ImageView) findViewById(AbstractC5955f.foldImg);
        if (this.f37652a) {
            int i8 = this.f37655d;
            if (i8 == 0) {
                i8 = AbstractC5954e.unfold;
            }
            imageView.setImageResource(i8);
        } else {
            imageView.setImageResource(AbstractC5954e.ic_unfold_s);
        }
        findViewById(AbstractC5955f.expandView).setVisibility(8);
    }

    public void expand() {
        findViewById(AbstractC5955f.headerView).setSelected(true);
        ImageView imageView = (ImageView) findViewById(AbstractC5955f.foldImg);
        if (this.f37652a) {
            int i8 = this.f37654c;
            if (i8 == 0) {
                i8 = AbstractC5954e.fold;
            }
            imageView.setImageResource(i8);
        } else {
            imageView.setImageResource(AbstractC5954e.ic_fold_s);
        }
        findViewById(AbstractC5955f.expandView).setVisibility(0);
    }

    public void onHeaderClick() {
        if (findViewById(AbstractC5955f.expandView).getVisibility() != 8) {
            collapse();
            if (C6630d.isNotNull(this.f37656e)) {
                this.f37656e.onOptionHeaderClick(this, false);
                return;
            }
            return;
        }
        if (this.f37653b) {
            expand();
        }
        if (C6630d.isNotNull(this.f37656e)) {
            this.f37656e.onOptionHeaderClick(this, true);
        }
    }

    public void setAsMainOption(boolean z8) {
        this.f37652a = z8;
    }

    public void setAutoExpand(boolean z8) {
        this.f37653b = z8;
    }

    public void setFoldArrowIcon(int i8, int i9) {
        this.f37654c = i8;
        this.f37655d = i9;
    }

    public void setHeaderClickListener(v4.g gVar) {
        this.f37656e = gVar;
    }

    public C6550j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }
}
