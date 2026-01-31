package Y5;

import I4.h;
import Q7.X;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import g5.e;
import k0.AbstractC5837a;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.g;
import z4.C;
import z4.C6630d;
import z4.C6633g;
import z4.N;

/* loaded from: classes.dex */
public class b extends com.korail.talk.view.base.a implements c, View.OnClickListener {

    /* renamed from: d0, reason: collision with root package name */
    private TextView f5642d0;

    /* renamed from: e0, reason: collision with root package name */
    private TextView f5643e0;

    /* renamed from: f0, reason: collision with root package name */
    private TextView f5644f0;

    protected class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f5645a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5646b;

        a(ImageView imageView, String str) {
            this.f5645a = imageView;
            this.f5646b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            return new BitmapDrawable(b.this.getResources(), C6633g.createBarcode(this.f5646b, N.dpToPx(210.0f), N.dpToPx(80.0f), androidx.core.content.a.getColor(b.this.getApplicationContext(), AbstractC5953d.barcode_line_mypage), androidx.core.content.a.getColor(b.this.getApplicationContext(), AbstractC5953d.barcode_background_mypage)));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            super.onPostExecute(drawable);
            this.f5645a.setBackground(drawable);
            b.this.o0();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            b.this.showLoading();
        }
    }

    /* renamed from: Y5.b$b, reason: collision with other inner class name */
    protected class AsyncTaskC0094b extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f5648a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5649b;

        AsyncTaskC0094b(ImageView imageView, String str) {
            this.f5648a = imageView;
            this.f5649b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Drawable doInBackground(Void... voidArr) {
            return new BitmapDrawable(b.this.getResources(), C6633g.createQRCode(this.f5649b, N.dpToPx(160.0f), N.dpToPx(160.0f), -15574641, -1971213));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Drawable drawable) {
            super.onPostExecute(drawable);
            this.f5648a.setBackground(drawable);
            b.this.o0();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            b.this.showLoading();
        }
    }

    private void A0() {
        p0(AbstractC5955f.btn_member_card_benefit).setOnClickListener(this);
    }

    private void C0() {
        this.f5642d0 = (TextView) p0(AbstractC5955f.tv_member_card_name);
        this.f5643e0 = (TextView) p0(AbstractC5955f.tv_member_card_owner);
        this.f5644f0 = (TextView) p0(AbstractC5955f.tv_member_card_auth_info);
    }

    private String y0(boolean z8) {
        String memberEmailAdr = h.getInstance().getMemberEmailAdr();
        if (!z8 || !C.isValidEmail(memberEmailAdr)) {
            return getString(AbstractC5959j.membership_email_unverified);
        }
        StringBuilder sb = new StringBuilder();
        String[] strArrSplit = memberEmailAdr.split("@");
        if (strArrSplit[0].length() == 1) {
            sb.append("*");
        } else if (strArrSplit[0].length() == 2) {
            sb.append(strArrSplit[0].substring(0, 1));
            sb.append("*");
        } else if (strArrSplit[0].length() > 2) {
            String str = strArrSplit[0];
            sb.append(str.substring(0, str.length() - 2));
            sb.append("**");
        }
        sb.append("@");
        sb.append(strArrSplit[1]);
        return getString(AbstractC5959j.membership_email_verified, sb.toString());
    }

    private String z0(boolean z8) {
        String memberPhoneNo = h.getInstance().getMemberPhoneNo();
        if (!z8 || N.isNull(memberPhoneNo)) {
            return getString(AbstractC5959j.membership_cellphone_unverified);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(memberPhoneNo.substring(0, 3));
        sb.append(e.STATE_NAME_NONE);
        if (memberPhoneNo.length() == 10) {
            sb.append("***");
        } else {
            sb.append("****");
        }
        sb.append(e.STATE_NAME_NONE);
        sb.append(memberPhoneNo.substring(sb.length() - 2));
        return getString(AbstractC5959j.membership_cellphone_verified, sb.toString());
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            C0();
            B0();
            A0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.btn_member_card_benefit == view.getId()) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", g.PARTNER_URL);
            startActivity(intent);
        }
    }

    @Override // Y5.c
    public void setAuthInfo(boolean z8, boolean z9) {
        this.f5644f0.setText(z0(z8) + X.LF + y0(z9));
    }

    @Override // Y5.c
    public void setMemberInfo() {
        h hVar = h.getInstance();
        String youthType = hVar.getYouthType();
        String memberName = hVar.getMemberName();
        String memberNum = hVar.getMemberNum();
        if (h.TEENAGER_TYPE.equals(youthType)) {
            this.f5642d0.setText(getString(AbstractC5959j.membership_card_teen_dream_card));
        } else if (h.YOUTH_TYPE.equals(youthType)) {
            this.f5642d0.setText(getString(AbstractC5959j.membership_card_fighting_young_card));
        } else {
            this.f5642d0.setText(getString(AbstractC5959j.membership_card_happy_korail));
        }
        this.f5643e0.setText(memberName);
        this.f5643e0.append(N.applySpannable(" | ", new ForegroundColorSpan(Color.parseColor("#33000000"))));
        this.f5643e0.append(memberNum);
    }

    private void B0() {
    }

    public void setBitmap() {
    }
}
