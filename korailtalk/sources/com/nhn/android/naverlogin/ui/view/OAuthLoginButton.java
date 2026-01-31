package com.nhn.android.naverlogin.ui.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import com.nhn.android.naverlogin.util.OAuthLoginUiUtil;

/* loaded from: classes.dex */
public class OAuthLoginButton extends ImageView {
    public static final String TAG = "OAuthLoginButton";

    /* renamed from: d, reason: collision with root package name */
    private static OAuthLoginHandler f29705d;

    /* renamed from: a, reason: collision with root package name */
    private Context f29706a;

    /* renamed from: b, reason: collision with root package name */
    private int f29707b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f29708c;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OAuthLogin.getInstance().startOauthLoginActivity((Activity) OAuthLoginButton.this.f29706a, OAuthLoginButton.f29705d);
        }
    }

    public OAuthLoginButton(Context context) {
        super(context);
        this.f29707b = E6.a.login_btn_img;
        c(context);
    }

    private void c(Context context) {
        this.f29706a = context;
        d();
        setOnClickListener(new a());
    }

    private void d() {
        if (getDrawable() == null) {
            Drawable drawableById = OAuthLoginUiUtil.getDrawableById(this.f29706a, this.f29707b);
            this.f29708c = drawableById;
            setImageDrawable(drawableById);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        if (isInEditMode()) {
            return;
        }
        super.onLayout(z8, i8, i9, i10, i11);
    }

    @Deprecated
    public void setBgResourceId(int i8) {
        setImageResource(i8);
    }

    @Deprecated
    public void setBgType(String str, String str2) {
    }

    public void setOAuthLoginHandler(OAuthLoginHandler oAuthLoginHandler) {
        f29705d = oAuthLoginHandler;
    }

    public OAuthLoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29707b = E6.a.login_btn_img;
        c(context);
    }

    public OAuthLoginButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f29707b = E6.a.login_btn_img;
        c(context);
    }
}
