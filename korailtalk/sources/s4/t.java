package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.korail.talk.database.model.MainPopupData;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import s4.C6219c;
import z4.C6630d;
import z4.C6634h;
import z4.C6641o;
import z4.N;

/* loaded from: classes.dex */
public class t extends C6219c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: q, reason: collision with root package name */
    private ImageView f36274q;

    /* renamed from: r, reason: collision with root package name */
    private NestedScrollView f36275r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f36276s;

    public t(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(String str, MainPopupData mainPopupData, View view) {
        if (N.isNotNull(str)) {
            if ("Y".equals(mainPopupData.getExternalBrowser())) {
                C6630d.moveToOutSideBrowser(getContext(), mainPopupData.getLinkUrl());
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("WEB_POST_URL", z4.z.getWebHost() + mainPopupData.getLinkUrl());
            C6641o.navigation(getContext(), IntegrationWebViewActivity.class, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void w(MainPopupData mainPopupData, DialogInterface dialogInterface, int i8, boolean z8) {
        if (100 == i8) {
            mainPopupData.setConfirmDate(C6634h.addDay("yyyyMMdd", 1));
            C6111b.getInstance().updateMainPopupData(mainPopupData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        int iDpToPx = N.dpToPx(50.0f) + (this.f36276s.getLineCount() * N.dpToPx(19.0f));
        if (this.f36276s.getLineCount() >= 10) {
            iDpToPx = N.dpToPx(190.0f);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36275r.getLayoutParams();
        layoutParams.height = iDpToPx;
        this.f36275r.setLayoutParams(layoutParams);
    }

    private void y(String str) {
        if (N.isNotNull(str) && "LARGE".equals(str)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36179p.getLayoutParams();
            layoutParams.weight = 2.0f;
            this.f36179p.setLayoutParams(layoutParams);
        }
    }

    @Override // s4.C6219c, t4.C6364a
    protected void f() {
        g(AbstractC5957h.dialog_main_popup);
    }

    @Override // s4.C6219c, t4.C6364a
    protected void k() {
        super.k();
        this.f36274q = (ImageView) a(AbstractC5955f.iv_dialog_image);
        this.f36275r = (NestedScrollView) a(AbstractC5955f.nsv_dialog);
        this.f36276s = (TextView) a(AbstractC5955f.tv_dialog_content);
    }

    public void setMainPopupData(final MainPopupData mainPopupData) {
        String message = mainPopupData.getMessage();
        final String linkUrl = mainPopupData.getLinkUrl();
        mainPopupData.getLinkTitle();
        String imageUrl = mainPopupData.getImageUrl();
        mainPopupData.getClsBtn();
        int i8 = 1 == mainPopupData.getCheckType() ? 1002 : 1001;
        this.f36274q.setVisibility(N.isNotNull(imageUrl) ? 0 : 8);
        this.f36274q.setOnClickListener(new View.OnClickListener() { // from class: s4.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f36269a.v(linkUrl, mainPopupData, view);
            }
        });
        this.f36275r.setVisibility(N.isNotNull(message) ? 0 : 8);
        setType(i8);
        setTheme(0);
        setContent(message);
        String[] strArr = new String[2];
        if (i8 == 1001) {
            strArr[0] = c(AbstractC5959j.common_close);
        } else {
            strArr[0] = c(AbstractC5959j.do_not_show_one_day);
            strArr[1] = c(AbstractC5959j.common_close);
        }
        setButtonNames(strArr);
        setButtonListener(new C6219c.InterfaceC0421c() { // from class: s4.r
            @Override // s4.C6219c.InterfaceC0421c
            public final void onClick(DialogInterface dialogInterface, int i9, boolean z8) {
                t.w(mainPopupData, dialogInterface, i9, z8);
            }
        });
        if (1002 == i8) {
            y(mainPopupData.getButtonType());
        }
        if (N.isNotNull(imageUrl)) {
            int iDpToPx = getContext().getResources().getDisplayMetrics().heightPixels - N.dpToPx(50.0f);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f36274q.getLayoutParams();
            layoutParams.height = iDpToPx;
            this.f36274q.setLayoutParams(layoutParams);
            this.f36274q.setContentDescription(mainPopupData.getVoice());
            com.squareup.picasso.s.get().load(z4.z.getWebHost() + imageUrl).resize((int) (getContext().getResources().getDisplayMetrics().widthPixels * 1.0d), iDpToPx).into(this.f36274q);
        }
        if (N.isNotNull(message) && N.isNotNull(linkUrl)) {
            this.f36276s.setText(message);
            this.f36275r.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: s4.s
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    this.f36273a.x();
                }
            });
        }
    }

    public t(Context context, int i8) {
        super(context, i8);
    }
}
