package com.nhn.android.naverlogin.ui.view;

import E6.d;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.nhn.android.naverlogin.util.DeviceDisplayInfo;
import com.nhn.android.naverlogin.util.OAuthLoginUiUtil;

/* loaded from: classes.dex */
public class OAuthLoginLayoutNaverAppDownloadBanner extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private Context f29710a;

    /* renamed from: b, reason: collision with root package name */
    private float f29711b;

    /* renamed from: c, reason: collision with root package name */
    private int f29712c;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OAuthLoginLayoutNaverAppDownloadBanner.this.b();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OAuthLoginLayoutNaverAppDownloadBanner.this.b();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OAuthLoginLayoutNaverAppDownloadBanner.this.setVisibility(8);
        }
    }

    public OAuthLoginLayoutNaverAppDownloadBanner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context);
        d(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ((Activity) this.f29710a).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.nhn.android.search")));
        ((Activity) this.f29710a).finish();
    }

    private void c(Context context) {
        this.f29710a = context;
        this.f29711b = context.getResources().getDisplayMetrics().density;
        this.f29712c = this.f29710a.getResources().getDisplayMetrics().densityDpi;
    }

    private void d(AttributeSet attributeSet) {
        setBackgroundColor(Color.rgb(254, 252, 227));
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(getNaverIconView());
        addView(getLayoutDownloadDesc());
        addView(getCloseBtnLayout());
    }

    private int e(double d9) {
        return (int) (d9 * this.f29711b);
    }

    private RelativeLayout getCloseBtnLayout() {
        ImageView imageView = new ImageView(this.f29710a);
        Drawable drawableById = OAuthLoginUiUtil.getDrawableById(this.f29710a, E6.a.close_btn_img_black);
        int iE = e(10);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        imageView.setPadding(iE, iE, iE, iE);
        imageView.setImageDrawable(drawableById);
        imageView.setScaleType(ImageView.ScaleType.FIT_START);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.addRule(11, -1);
        imageView.setLayoutParams(layoutParams);
        imageView.setOnClickListener(new c());
        RelativeLayout relativeLayout = new RelativeLayout(this.f29710a);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
        relativeLayout.addView(imageView);
        return relativeLayout;
    }

    private LinearLayout getLayoutDownloadDesc() {
        LinearLayout linearLayout = new LinearLayout(this.f29710a);
        TextView textView = new TextView(this.f29710a);
        TextView textView2 = new TextView(this.f29710a);
        int iE = e(10);
        linearLayout.setPadding(iE, iE, 0, iE);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setGravity(16);
        linearLayout.setClickable(true);
        int iE2 = e(4.0d);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView.setPadding(0, iE2, 0, iE2);
        textView.setTextColor(Color.rgb(51, 51, 51));
        textView.setText(this.f29710a.getString(d.naveroauthlogin_string_msg_naverapp_download_desc));
        textView.setTypeface(null, 1);
        textView.setTextSize(getTextSizeUpper());
        textView2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        textView2.setPadding(0, 0, 0, iE2);
        textView2.setText(this.f29710a.getString(d.naveroauthlogin_string_msg_naverapp_download_link));
        textView2.setTextColor(Color.rgb(45, 180, 0));
        textView2.setPaintFlags(textView2.getPaintFlags() | 8);
        textView2.setTextSize(getTextSizeUnder());
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.setOnClickListener(new b());
        return linearLayout;
    }

    private ImageView getNaverIconView() {
        ImageView imageView = new ImageView(this.f29710a);
        Drawable drawableById = OAuthLoginUiUtil.getDrawableById(this.f29710a, E6.a.naver_icon);
        int iE = e(10);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(e(70.0d), e(70.0d)));
        imageView.setPadding(iE, iE, 0, iE);
        imageView.setImageDrawable(drawableById);
        imageView.setOnClickListener(new a());
        return imageView;
    }

    private float getTextSizeUnder() {
        if (DeviceDisplayInfo.isXhdpi(this.f29712c)) {
            return 12.0f;
        }
        return DeviceDisplayInfo.isHdpi(this.f29712c) ? 11.0f : 10.15f;
    }

    private float getTextSizeUpper() {
        if (DeviceDisplayInfo.isXhdpi(this.f29712c)) {
            return 14.0f;
        }
        return DeviceDisplayInfo.isHdpi(this.f29712c) ? 13.0f : 12.0f;
    }

    public OAuthLoginLayoutNaverAppDownloadBanner(Context context) {
        super(context);
        c(context);
        d(null);
    }
}
