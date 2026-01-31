package a5;

import I4.h;
import ai.maum.m2u.cdk.CdkNative;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.K;
import androidx.lifecycle.u;
import com.korail.talk.ui.web.MaumAIV2WebViewActivity;
import k0.AbstractC5837a;
import r4.g;
import z4.N;

/* loaded from: classes.dex */
public class e extends Fragment {

    /* renamed from: c0 */
    private c f5974c0;

    /* renamed from: b0 */
    protected String f5973b0 = "";

    /* renamed from: d0 */
    private int f5975d0 = 0;

    public static e newInstance(int i8) {
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putInt("arg_int_value", i8);
        eVar.setArguments(bundle);
        return eVar;
    }

    public /* synthetic */ void p0(String str) {
        if (str == null || str.isEmpty() || !(getActivity() instanceof MaumAIV2WebViewActivity)) {
            return;
        }
        ((MaumAIV2WebViewActivity) getActivity()).initTitle(str);
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f5975d0 = getArguments().getInt("arg_int_value", 0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int integer = N.getInteger(h.getInstance().getDisableGrade());
        String str = (integer < 1 || integer > 3) ? (integer < 4 || integer > 6) ? "N" : "M" : "S";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("custMgNo=");
        sb2.append(h.getInstance().getCustNo());
        sb2.append("&mbCrdNo=");
        sb2.append(h.getInstance().getMemberNum());
        sb2.append("&hdcpFlg=");
        sb2.append(str);
        sb2.append("&custClCd=");
        sb2.append(h.getInstance().getCustClCd());
        sb2.append("&custLeadFlg=");
        sb2.append(h.getInstance().isCustLeadFlg() ? "Y" : "N");
        sb2.append("&theme=light");
        String string = sb2.toString();
        if (g.SERVER_TYPE == K4.a.REAL) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f5975d0 == 0 ? "https://railbot.korail.com/#/chatbot" : "https://railbot.korail.com/#/voiceChatbot");
            sb3.append("?");
            sb3.append(string);
            this.f5973b0 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.f5975d0 == 0 ? "https://dev-railbot.korail.com/#/chatbot" : "https://dev-railbot.korail.com/#/voiceChatbot");
            sb4.append("?");
            sb4.append(string);
            this.f5973b0 = sb4.toString();
        }
        if (N.isNotNull(string)) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(string);
        }
        c cVar = (c) new K(requireActivity()).get(c.class);
        this.f5974c0 = cVar;
        if (cVar.getState() == null) {
            WebView webView = new WebView(requireActivity().getApplicationContext());
            webView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
            this.f5974c0.setWebView(webView, requireActivity());
            if (this.f5975d0 == 0) {
                this.f5974c0.getWebView().loadUrl(this.f5973b0);
            } else {
                this.f5974c0.setCdkNative(new CdkNative(requireActivity(), webView, this.f5973b0));
            }
        }
        this.f5974c0.getTextData().observe(getViewLifecycleOwner(), new u() { // from class: a5.d
            @Override // androidx.lifecycle.u
            public final void onChanged(Object obj) {
                this.f5972a.p0((String) obj);
            }
        });
        return this.f5974c0.getWebView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() throws IllegalStateException, InterruptedException {
        super.onPause();
        WebView webView = this.f5974c0.getWebView();
        CdkNative cdkNative = this.f5974c0.getCdkNative();
        Bundle bundle = new Bundle();
        webView.saveState(bundle);
        this.f5974c0.saveState(bundle);
        if (cdkNative != null) {
            cdkNative.pause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CdkNative cdkNative = this.f5974c0.getCdkNative();
        if (cdkNative != null) {
            cdkNative.resume();
        }
    }
}
