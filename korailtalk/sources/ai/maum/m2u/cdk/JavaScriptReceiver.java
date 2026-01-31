package ai.maum.m2u.cdk;

import ai.maum.m2u.cdk.utils.LogUtil;
import ai.maum.m2u.cdk.utils.StringUtil;
import android.app.Activity;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.webkit.JavascriptInterface;
import com.google.protobuf.C5230m0;
import maum.m2u.map.Map;

/* loaded from: classes.dex */
public class JavaScriptReceiver {
    private static final String TAG = "JavaScriptReceiver";
    Activity activity;
    CdkNative cdkNative;
    Context mContext;

    public JavaScriptReceiver(Context context, CdkNative cdkNative) {
        this.mContext = context;
        this.activity = (Activity) context;
        this.cdkNative = cdkNative;
    }

    @JavascriptInterface
    public void closeMicrophone() {
        if (this.cdkNative.isGrpcInitialized()) {
            this.cdkNative.closeMicrophone();
        } else {
            LogUtil.w(TAG, "grpc not initailized");
        }
    }

    @JavascriptInterface
    public void closeSpeaker() {
        if (this.cdkNative.isGrpcInitialized()) {
            this.cdkNative.closeSpeaker();
        } else {
            LogUtil.w(TAG, "grpc not initailized");
        }
    }

    @JavascriptInterface
    public String getPhoneNumber() {
        try {
            return ((TelephonyManager) this.mContext.getSystemService("phone")).getLine1Number().replace("+82", "0");
        } catch (Exception unused) {
            return "";
        }
    }

    @JavascriptInterface
    public void openMicrophone(String str) {
        if (this.cdkNative.isGrpcInitialized()) {
            this.cdkNative.openMicrophone(str);
        } else {
            LogUtil.w(TAG, "grpc not initailized");
        }
    }

    @JavascriptInterface
    public void sendEvent(String str) {
        if (StringUtil.isEmpty(str)) {
            return;
        }
        String str2 = TAG;
        LogUtil.d(str2, "[SendEventT]\n" + str + "\n ");
        try {
            if (!this.cdkNative.isGrpcInitialized()) {
                LogUtil.w(str2, "grpc not initialized");
                return;
            }
            Map.EventStream.Builder builderNewBuilder = Map.EventStream.newBuilder();
            E3.d.parser().merge(str, builderNewBuilder);
            this.cdkNative.sendEventStream(builderNewBuilder.build());
            String operation = builderNewBuilder.getInterface().getOperation();
            if (!operation.equalsIgnoreCase(MapIf.DL_E_SPEECH_TO_SPEECH_TALK) && !operation.equalsIgnoreCase(MapIf.DL_E_SPEECH_TO_TEXT_TALK)) {
                if (operation.equalsIgnoreCase(MapIf.DL_E_STREAM_TALK)) {
                    this.cdkNative.processMicrophoneStart(builderNewBuilder.getStreamId(), builderNewBuilder.getOperationSyncId());
                    return;
                }
                return;
            }
            this.cdkNative.processMicrophoneStart(builderNewBuilder.getStreamId(), builderNewBuilder.getOperationSyncId());
            this.cdkNative.startTimerForMic();
        } catch (C5230m0 unused) {
            LogUtil.e("invalid msg", str);
        }
    }

    @JavascriptInterface
    public void setMapSetting(String str) {
        this.cdkNative.setMapSettings(str);
        LogUtil.d(TAG, "[SETMAP_SETTING]\n" + str);
    }
}
