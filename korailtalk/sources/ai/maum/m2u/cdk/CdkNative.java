package ai.maum.m2u.cdk;

import A7.a;
import ai.maum.m2u.cdk.MicrophoneDTO;
import ai.maum.m2u.cdk.SpeakerDTO;
import ai.maum.m2u.cdk.StreamingStatusDTO;
import ai.maum.m2u.cdk.grpclib.constants.Const;
import ai.maum.m2u.cdk.listeners.AudioConnectionListener;
import ai.maum.m2u.cdk.listeners.AudioConnectionReceiver;
import ai.maum.m2u.cdk.listeners.IncomingCallListener;
import ai.maum.m2u.cdk.listeners.IncomingCallReceiver;
import ai.maum.m2u.cdk.listeners.ScreenLockListener;
import ai.maum.m2u.cdk.listeners.ScreenLockReceiver;
import ai.maum.m2u.cdk.utils.AudioConnectionHelper;
import ai.maum.m2u.cdk.utils.GsonUtil;
import ai.maum.m2u.cdk.utils.LogUtil;
import ai.maum.m2u.cdk.utils.NetworkCheck;
import android.app.Activity;
import android.bluetooth.BluetoothDevice;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.webkit.WebView;
import androidx.core.app.AbstractC0918b;
import com.google.gson.Gson;
import com.google.gson.l;
import com.google.gson.n;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.C5230m0;
import com.google.protobuf.w1;
import com.kakao.sdk.common.Constants;
import io.grpc.J0;
import io.grpc.stub.k;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import maum.m2u.map.Map;
import maum.m2u.map.MaumToYouProxyServiceGrpc;

/* loaded from: classes.dex */
public class CdkNative implements AudioConnectionListener, IncomingCallListener, ScreenLockListener {
    static final String AUTH_TOKEN = "authToken";
    static final String NOTIFY_OBJECT_PREFIX = "notifyObjectPrefix";
    static final String PING_INTERVAL = "pingInterval";
    static final int PING_INTERVAL_DEFAULT = 60;
    private static final int REQUEST_PERMISSION_BLUETOOTH = 102;
    private static final int REQUEST_PERMISSION_CALL_STATE = 103;
    private static final int REQUEST_PERMISSION_RECORD_AUDIO = 101;
    static final String SERVER_IP = "serverIp";
    static final String SERVER_PORT = "serverPort";
    static final String USE_TLS = "useTls";
    private final String TAG;
    final Activity activity;
    private AudioConnectionReceiver audioConnectionReceiver;
    private AudioManager audioManager;
    private AudioPlayAgent audioPlayAgent;
    private AudioRecorderAgent audioRecorderAgent;
    private boolean checkPermission;
    private final Map<String, k> eventStreamObserverMap;
    private IncomingCallReceiver incomingCallReceiver;
    private final String initUrl;
    JavaScriptReceiver javaScriptReceiver;
    private long mMicTimeout;
    private PermissionEventListener mPermissionEventListener;
    private final List<String> mRequestPermission;
    private Timer mTimerMic;
    TimerTaskForMic mTimerTaskForMic;
    MapClient mapClient;
    private MapSettings mapSettings;
    private ScreenLockReceiver screenLockReceiver;
    private a.b speechSynthesizerParam;
    private Map.EventStream streamingEvent;
    private k streamingObserver;
    private WebView webView;

    /* renamed from: ai.maum.m2u.cdk.CdkNative$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase;

        static {
            int[] iArr = new int[Map.MapDirective.TestDirectiveCase.values().length];
            $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase = iArr;
            try {
                iArr[Map.MapDirective.TestDirectiveCase.STREAM_BREAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[Map.MapDirective.TestDirectiveCase.STREAM_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[Map.MapDirective.TestDirectiveCase.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[Map.MapDirective.TestDirectiveCase.META.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[Map.MapDirective.TestDirectiveCase.BYTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[Map.MapDirective.TestDirectiveCase.EXCEPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[Map.MapDirective.TestDirectiveCase.TESTDIRECTIVE_NOT_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[Map.MapDirective.TestDirectiveCase.DIRECTIVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    class AbstractStreamObserver<T> implements k {
        AbstractStreamObserver() {
        }

        @Override // io.grpc.stub.k
        public void onCompleted() {
        }

        @Override // io.grpc.stub.k
        public void onError(Throwable th) {
            th.printStackTrace();
            LogUtil.e(CdkNative.this.TAG, "#@ Event Stream Error : ", th);
            PrintStream printStream = System.err;
            printStream.println("Error occurred: " + th.getMessage());
            String strJsonStringFromObject = GsonUtil.jsonStringFromObject(new GrpcStatus(J0.fromThrowable(th)));
            CdkNative.this.loadUrl("receiveError('" + strJsonStringFromObject + "')");
            StringBuilder sb = new StringBuilder();
            sb.append("Error occurred: ");
            sb.append(th.getMessage());
            printStream.println(sb.toString());
        }

        @Override // io.grpc.stub.k
        public void onNext(T t8) {
        }
    }

    class MapDirectiveForwarder extends AbstractStreamObserver<Map.MapDirective> {
        private Map.AsyncInterface asif;
        private final Map.AsyncInterface callAsIf;
        private boolean first;
        private final String operationSyncId;
        private String streamId;

        public MapDirectiveForwarder(Map.AsyncInterface asyncInterface, String str) {
            super();
            this.streamId = "";
            this.first = true;
            this.callAsIf = asyncInterface;
            this.operationSyncId = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNext$0() throws IllegalStateException {
            CdkNative.this.microphoneRelease(true, MicrophoneDTO.MicrophoneEvent.CLOSE_SUCCESS, null);
            LogUtil.d(CdkNative.this.TAG, "[RECEIVE_DIRECTIVE : SEND STREAM END]\nstreamId = " + this.streamId);
            CdkNative.this.sendStreamEnd();
            CdkNative.this.clearCurStream();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onNext$1() {
            CdkNative.this.startTimerForMic();
        }

        private String toStreamStatusJson(Map.MapDirective mapDirective, String str) {
            int i8 = AnonymousClass2.$SwitchMap$maum$m2u$map$Map$MapDirective$TestDirectiveCase[mapDirective.getTestDirectiveCase().ordinal()];
            if (i8 == 1) {
                return GsonUtil.jsonStringFromObject(new StreamingStatusDTO(str, this.operationSyncId, false, true, false, StreamingStatusDTO.Streamingtype.UNKNOWN, 0));
            }
            if (i8 == 2) {
                return GsonUtil.jsonStringFromObject(new StreamingStatusDTO(str, this.operationSyncId, false, false, true, StreamingStatusDTO.Streamingtype.UNKNOWN, 0));
            }
            if (i8 == 3) {
                return GsonUtil.jsonStringFromObject(new StreamingStatusDTO(str, this.operationSyncId, false, false, false, StreamingStatusDTO.Streamingtype.TEXT, mapDirective.getTextBytes().size()));
            }
            if (i8 == 4) {
                return GsonUtil.jsonStringFromObject(new StreamingStatusDTO(str, this.operationSyncId, false, false, false, StreamingStatusDTO.Streamingtype.STRUCT, mapDirective.getMeta().toByteString().size()));
            }
            if (i8 != 5) {
                return "";
            }
            return GsonUtil.jsonStringFromObject(new StreamingStatusDTO(str, this.operationSyncId, false, false, false, StreamingStatusDTO.Streamingtype.BYTES, mapDirective.getBytes().size()));
        }

        @Override // ai.maum.m2u.cdk.CdkNative.AbstractStreamObserver, io.grpc.stub.k
        public void onCompleted() {
            LogUtil.d(CdkNative.this.TAG, "> onCompleted " + this.operationSyncId);
            CdkNative.this.loadUrl("receiveCompleted('" + this.operationSyncId + "')");
            CdkNative.this.sendStreamEnd();
            this.streamId = "";
        }

        @Override // ai.maum.m2u.cdk.CdkNative.AbstractStreamObserver, io.grpc.stub.k
        public void onError(Throwable th) {
            super.onError(th);
            CdkNative.this.clearEventStreamObserver(this.operationSyncId);
            CdkNative.this.clearCurStream();
            if (this.callAsIf.getOperation().equals(MapIf.DL_E_STREAM_TALK)) {
                CdkNative.this.closeMicrophone();
                CdkNative.this.audioPlayAgent.stop();
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00a2  */
        @Override // ai.maum.m2u.cdk.CdkNative.AbstractStreamObserver, io.grpc.stub.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onNext(maum.m2u.map.Map.MapDirective r11) {
            /*
                Method dump skipped, instructions count: 754
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ai.maum.m2u.cdk.CdkNative.MapDirectiveForwarder.onNext(maum.m2u.map.Map$MapDirective):void");
        }
    }

    interface PermissionEventListener {
        void onDeniedPermission();

        void onGrantedPermission();
    }

    class PongForwarder extends AbstractStreamObserver<Map.PongResponse> {
        PongForwarder() {
            super();
        }

        @Override // ai.maum.m2u.cdk.CdkNative.AbstractStreamObserver, io.grpc.stub.k
        public void onCompleted() {
            LogUtil.e(CdkNative.this.TAG, "PongResponse End");
        }

        @Override // ai.maum.m2u.cdk.CdkNative.AbstractStreamObserver, io.grpc.stub.k
        public void onNext(Map.PongResponse pongResponse) {
            try {
                String strPrint = E3.d.printer().omittingInsignificantWhitespace().includingDefaultValueFields().print(pongResponse);
                CdkNative.this.loadUrl("notifyPong('" + strPrint + "')", false);
            } catch (C5230m0 e8) {
                e8.printStackTrace();
                LogUtil.e(CdkNative.this.TAG, e8.getMessage());
            }
        }
    }

    enum TIMER_KIND {
        TIMER_MULTIMEDIA,
        TIMER_MICROPHONE,
        TIMER_ALL
    }

    class TimerTaskForMic extends TimerTask {
        public TimerTaskForMic() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() throws IllegalStateException {
            CdkNative.this.microphoneRelease(false, MicrophoneDTO.MicrophoneEvent.CLOSE_SUCCESS, MicrophoneDTO.MicrophoneFailure.MICROPHONE_TIMER_EXPIRED);
        }
    }

    public CdkNative(Activity activity, WebView webView, String str) {
        this(activity, webView, str, true);
    }

    private void checkBluetoothPermission() {
        if ((Build.VERSION.SDK_INT >= 31 || "S".equals(Build.VERSION.CODENAME)) && !isGrantedPermission("android.permission.BLUETOOTH_CONNECT")) {
            AbstractC0918b.requestPermissions((androidx.appcompat.app.e) this.activity, new String[]{"android.permission.BLUETOOTH_CONNECT"}, 102);
        }
    }

    private void checkPhoneCallPermission() {
        if (isGrantedPermission("android.permission.READ_PHONE_STATE")) {
            return;
        }
        AbstractC0918b.requestPermissions((androidx.appcompat.app.e) this.activity, new String[]{"android.permission.READ_PHONE_STATE"}, 103);
    }

    private void checkRecordAudioPermission() {
        if (isGrantedPermission("android.permission.RECORD_AUDIO")) {
            this.mPermissionEventListener.onGrantedPermission();
        } else {
            AbstractC0918b.requestPermissions((androidx.appcompat.app.e) this.activity, new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"}, 101);
        }
    }

    private void clearAudioRecorder() throws IllegalStateException {
        AudioRecorderAgent audioRecorderAgent = this.audioRecorderAgent;
        if (audioRecorderAgent == null || audioRecorderAgent.getStatus() != AsyncTask.Status.RUNNING) {
            return;
        }
        this.audioRecorderAgent.cancel(true);
        this.audioRecorderAgent.onPostExecute((Void) null);
        this.audioRecorderAgent.clear();
        this.audioRecorderAgent = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventStreamObserver(String str) {
        k kVarFindEventStreamObserver = findEventStreamObserver(str);
        if (kVarFindEventStreamObserver != null) {
            kVarFindEventStreamObserver.onCompleted();
        }
        this.eventStreamObserverMap.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeAllAudio() {
        this.activity.runOnUiThread(new Runnable() { // from class: ai.maum.m2u.cdk.a
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException {
                this.f5986a.lambda$closeAllAudio$2();
            }
        });
    }

    private k findEventStreamObserver(String str) {
        return this.eventStreamObserverMap.get(str);
    }

    private static w1 getCurrentTimeStamp() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return w1.newBuilder().setSeconds(jCurrentTimeMillis / 1000).setNanos((int) ((jCurrentTimeMillis % 1000) * 1000000)).build();
    }

    private long getMicTimeout() {
        return this.mMicTimeout;
    }

    private void initGrpcAgent() {
        if (this.mapClient != null || this.mapSettings == null) {
            return;
        }
        this.mapClient = new MapClient(this);
    }

    private void initListener() {
        if (this.checkPermission) {
            checkBluetoothPermission();
            checkPhoneCallPermission();
        }
        this.audioConnectionReceiver = new AudioConnectionReceiver(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        this.activity.registerReceiver(this.audioConnectionReceiver, intentFilter);
        this.incomingCallReceiver = new IncomingCallReceiver(this);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PHONE_STATE");
        this.activity.registerReceiver(this.incomingCallReceiver, intentFilter2);
        this.screenLockReceiver = new ScreenLockReceiver(this);
        IntentFilter intentFilter3 = new IntentFilter();
        intentFilter3.addAction("android.intent.action.SCREEN_ON");
        intentFilter3.addAction("android.intent.action.SCREEN_OFF");
        intentFilter3.addAction("android.intent.action.USER_PRESENT");
        this.activity.registerReceiver(this.screenLockReceiver, intentFilter3);
    }

    private void initWebView() {
        if (!NetworkCheck.isNetworkAvailable(this.activity)) {
            throw new RuntimeException("network not available!");
        }
        this.webView.addJavascriptInterface(this.javaScriptReceiver, "m2uWebViewNative");
        this.webView.loadUrl(this.initUrl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeAllAudio$2() throws IllegalStateException {
        microphoneRelease(true, MicrophoneDTO.MicrophoneEvent.CLOSE_SUCCESS, null);
        openOrCloseMic(false, null);
        this.audioPlayAgent.release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeMicrophone$1() throws IllegalStateException {
        openOrCloseMic(false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$closeSpeaker$3() {
        notifySpeakerClose("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadUrl$4(String str, String str2, boolean z8) {
        if (this.activity.isFinishing()) {
            return;
        }
        this.webView.loadUrl(str + str2);
        if (z8) {
            LogUtil.d(this.TAG, "[call script]::" + str + str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$openMicrophone$0(MicrophoneDTO.MicrophoneParam microphoneParam) throws IllegalStateException {
        openOrCloseMic(true, microphoneParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadUrl(String str) {
        loadUrl(str, true);
    }

    private void openOrCloseMic(boolean z8, final MicrophoneDTO.MicrophoneParam microphoneParam) throws IllegalStateException {
        if (!z8) {
            microphoneRelease(true, MicrophoneDTO.MicrophoneEvent.CLOSE_SUCCESS, null);
        } else if (microphoneParam != null) {
            checkPermission("android.permission.RECORD_AUDIO", new PermissionEventListener() { // from class: ai.maum.m2u.cdk.CdkNative.1
                @Override // ai.maum.m2u.cdk.CdkNative.PermissionEventListener
                public void onDeniedPermission() {
                    CdkNative.this.notifyMicrophoneStatus(MicrophoneDTO.MicrophoneEvent.OPEN_FAILURE, Const.EXPECT_MDOE, Const.HAS_REASON, MicrophoneDTO.MicrophoneFailure.MICROPHONE_PERMISSION_DENIED, Const.EMPTY_STRING, microphoneParam.getOperationSyncId());
                }

                @Override // ai.maum.m2u.cdk.CdkNative.PermissionEventListener
                public void onGrantedPermission() {
                    if (!CdkNative.this.processMicrophoneInit(microphoneParam)) {
                        CdkNative.this.notifyMicrophoneStatus(MicrophoneDTO.MicrophoneEvent.OPEN_FAILURE, Const.EXPECT_MDOE, Const.HAS_REASON, MicrophoneDTO.MicrophoneFailure.MICROPHONE_ERROR_UNKNOWN, Const.EMPTY_STRING, microphoneParam.getOperationSyncId());
                        return;
                    }
                    CdkNative cdkNative = CdkNative.this;
                    String str = MicrophoneDTO.MicrophoneEvent.OPEN_SUCCESS;
                    boolean z9 = Const.EXPECT_MDOE;
                    boolean z10 = Const.HAS_NOT_REASON;
                    String str2 = Const.EMPTY_STRING;
                    cdkNative.notifyMicrophoneStatus(str, z9, z10, str2, str2, microphoneParam.getOperationSyncId());
                }
            });
        } else {
            microphoneRelease(false, MicrophoneDTO.MicrophoneEvent.OPEN_FAILURE, MicrophoneDTO.MicrophoneFailure.MICROPHONE_OPEN_ERROR);
        }
    }

    private void setEventStreamObserver(String str, k kVar) {
        this.eventStreamObserverMap.put(str, kVar);
        LogUtil.d(this.TAG, "eventStreamObserverMap. size + " + this.eventStreamObserverMap.size());
    }

    private void setMicTimeout(long j8) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeechParam(a.b bVar) {
        this.speechSynthesizerParam = bVar;
    }

    private boolean stopAudioRecorder() throws IllegalStateException {
        AudioRecorderAgent audioRecorderAgent = this.audioRecorderAgent;
        if (audioRecorderAgent == null || audioRecorderAgent.getStatus() != AsyncTask.Status.RUNNING) {
            return false;
        }
        this.audioRecorderAgent.cancel(true);
        this.audioRecorderAgent.onPostExecute((Void) null);
        this.audioRecorderAgent = null;
        return true;
    }

    private void stopTimerForMic() {
        Timer timer = this.mTimerMic;
        if (timer != null) {
            timer.cancel();
            this.mTimerMic = null;
        }
        TimerTaskForMic timerTaskForMic = this.mTimerTaskForMic;
        if (timerTaskForMic != null) {
            timerTaskForMic.cancel();
            this.mTimerTaskForMic = null;
        }
    }

    protected void checkPermission(String str, PermissionEventListener permissionEventListener) {
        this.mPermissionEventListener = permissionEventListener;
        str.hashCode();
        if (str.equals("android.permission.RECORD_AUDIO")) {
            checkRecordAudioPermission();
        }
    }

    void clearCurStream() {
        if (this.streamingEvent != null) {
            LogUtil.i(this.TAG, "clear current stream: " + this.streamingEvent.getInterface());
            this.streamingEvent = null;
            this.streamingObserver = null;
        }
    }

    public void close() {
        stopTimerTask(TIMER_KIND.TIMER_ALL);
        try {
            this.webView = null;
            clearAudioRecorder();
            microphoneRelease(true, MicrophoneDTO.MicrophoneEvent.CLOSE_SUCCESS, null);
            this.audioPlayAgent.release();
            notifySpeakerClose("");
            MapClient mapClient = this.mapClient;
            if (mapClient != null) {
                mapClient.stopPingProcess();
            }
        } catch (Exception e8) {
            LogUtil.e(this.TAG, "on close closing audio", e8);
        }
        try {
            this.audioManager = null;
            MapClient mapClient2 = this.mapClient;
            if (mapClient2 != null) {
                mapClient2.shutdown();
                this.mapClient = null;
            }
        } catch (InterruptedException e9) {
            LogUtil.e(this.TAG, "on close, closing map client", e9);
        }
        try {
            this.activity.unregisterReceiver(this.audioConnectionReceiver);
            this.activity.unregisterReceiver(this.incomingCallReceiver);
            this.activity.unregisterReceiver(this.screenLockReceiver);
        } catch (Exception e10) {
            LogUtil.e(this.TAG, "on unregisterReceiver", e10);
        }
    }

    void closeMicrophone() {
        this.activity.runOnUiThread(new Runnable() { // from class: ai.maum.m2u.cdk.d
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException {
                this.f5990a.lambda$closeMicrophone$1();
            }
        });
    }

    void closeSpeaker() {
        this.audioPlayAgent.release();
        this.activity.runOnUiThread(new Runnable() { // from class: ai.maum.m2u.cdk.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f5987a.lambda$closeSpeaker$3();
            }
        });
    }

    boolean getCurrentVolumeState() {
        return ((AudioManager) this.activity.getSystemService("audio")).getStreamVolume(0) <= 0;
    }

    MapSettings getMapSettings() {
        return this.mapSettings;
    }

    String getNotifyObjectPrefix() {
        if (this.mapSettings == null) {
            throw new RuntimeException("cdk is not initialized!");
        }
        return "javaScript:" + this.mapSettings.getNotifyObjectPrefix() + ".";
    }

    MaumToYouProxyServiceGrpc.MaumToYouProxyServiceStub getStub() {
        return this.mapClient.getStub();
    }

    boolean isGrantedPermission(String str) {
        return androidx.core.content.e.checkSelfPermission(this.activity, str) == 0;
    }

    boolean isGrpcInitialized() {
        return (this.mapClient == null || this.mapSettings == null) ? false : true;
    }

    void microphoneRelease(boolean z8, String str, String str2) throws IllegalStateException {
        if (z8) {
            stopTimerTask(TIMER_KIND.TIMER_MICROPHONE);
        }
        processMicrophoneStop(str, str2);
    }

    void notifyMicrophoneStatus(String str, boolean z8, boolean z9, String str2, String str3, String str4) {
        MicrophoneDTO.MicrophoneStatus microphoneStatus = new MicrophoneDTO.MicrophoneStatus();
        microphoneStatus.setEventType(str);
        microphoneStatus.setExpectMode(z8);
        microphoneStatus.setHasReason(z9);
        microphoneStatus.setFailure(str2);
        microphoneStatus.setMessage(str3);
        microphoneStatus.setOperationSyncId(str4);
        loadUrl("notifyMicrophoneStatus('" + GsonUtil.jsonStringFromObject(microphoneStatus) + "')");
    }

    void notifySpeakerClose(String str) {
        if (str.isEmpty()) {
            return;
        }
        String str2 = SpeakerDTO.SpeakerEvent.CLOSED;
        boolean z8 = Const.HAS_NOT_REASON;
        String str3 = Const.EMPTY_STRING;
        notifySpeakerStatus(str2, false, z8, str3, str3, str);
    }

    void notifySpeakerStatus(String str, boolean z8, boolean z9, String str2, String str3, String str4) {
        SpeakerDTO.SpeakerStatus speakerStatus = new SpeakerDTO.SpeakerStatus();
        speakerStatus.setEventType(str);
        speakerStatus.setSpeechSynthesizing(z8);
        speakerStatus.setHasReason(z9);
        speakerStatus.setFailure(str2);
        speakerStatus.setMessage(str3);
        speakerStatus.setOperationSyncId(str4);
        reportSpeakerStatus(GsonUtil.jsonStringFromObject(speakerStatus));
    }

    @Override // ai.maum.m2u.cdk.listeners.AudioConnectionListener
    public void onBluetoothConnected(BluetoothDevice bluetoothDevice) {
        AudioConnectionHelper.enableBluetoothSco(this.audioManager);
    }

    @Override // ai.maum.m2u.cdk.listeners.AudioConnectionListener
    public void onBluetoothDisconnected(BluetoothDevice bluetoothDevice) {
        AudioConnectionHelper.disableBluetoothSco(this.audioManager);
    }

    @Override // ai.maum.m2u.cdk.listeners.IncomingCallListener
    public void onNotifyCallStatus(String str) throws IllegalStateException {
        if (TelephonyManager.EXTRA_STATE_RINGING.equals(str)) {
            closeAllAudio();
            clearCurStream();
            processMicrophoneStop(MicrophoneDTO.MicrophoneEvent.CLOSE_SUCCESS, MicrophoneDTO.MicrophoneFailure.MICROPHONE_UNDER_USE);
            notifySpeakerClose("");
        }
    }

    @Override // ai.maum.m2u.cdk.listeners.ScreenLockListener
    public void onScreenLockChanged(String str) {
        if (this.mapSettings != null) {
            loadUrl("onScreenLockChanged('" + str + "')");
        }
    }

    @Override // ai.maum.m2u.cdk.listeners.AudioConnectionListener
    public void onWiredSpeakerConnected() {
        if (AudioConnectionHelper.isBluetoothHeadsetConnected(this.activity)) {
            return;
        }
        this.audioManager.setSpeakerphoneOn(false);
    }

    @Override // ai.maum.m2u.cdk.listeners.AudioConnectionListener
    public void onWiredSpeakerDisconnected() {
        if (AudioConnectionHelper.isBluetoothHeadsetConnected(this.activity)) {
            return;
        }
        this.audioManager.setSpeakerphoneOn(true);
    }

    void openMicrophone(String str) {
        final MicrophoneDTO.MicrophoneParam microphoneParam = (MicrophoneDTO.MicrophoneParam) new Gson().fromJson(str, MicrophoneDTO.MicrophoneParam.class);
        this.activity.runOnUiThread(new Runnable() { // from class: ai.maum.m2u.cdk.c
            @Override // java.lang.Runnable
            public final void run() throws IllegalStateException {
                this.f5988a.lambda$openMicrophone$0(microphoneParam);
            }
        });
    }

    public void pause() throws IllegalStateException, InterruptedException {
        clearAudioRecorder();
        microphoneRelease(true, MicrophoneDTO.MicrophoneEvent.CLOSE_SUCCESS, null);
        this.audioPlayAgent.release();
        notifySpeakerClose("");
        this.streamingEvent = null;
        MapClient mapClient = this.mapClient;
        if (mapClient != null) {
            mapClient.stopPingProcess();
            if (this.mapSettings != null) {
                loadUrl("onPause()");
            }
        }
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException unused) {
            LogUtil.e(this.TAG, "pause interrupted.");
        }
    }

    boolean processMicrophoneInit(MicrophoneDTO.MicrophoneParam microphoneParam) throws IllegalStateException {
        setMicTimeout(microphoneParam.getTimeoutInMilliseconds());
        microphoneParam.getSpeechParam().getEncoding();
        microphoneParam.getSpeechParam().getSampleRate();
        microphoneParam.getSpeechParam().getLang();
        microphoneParam.getSpeechParam().getModel();
        stopAudioRecorder();
        this.audioRecorderAgent = new AudioRecorderAgent(this, microphoneParam);
        return true;
    }

    void processMicrophoneStart(String str, String str2) {
        LogUtil.d(this.TAG, "streamId " + str);
        LogUtil.d(this.TAG, "operationSyncId " + str2);
        AudioRecorderAgent audioRecorderAgent = this.audioRecorderAgent;
        if (audioRecorderAgent != null) {
            audioRecorderAgent.setStreamOperationIds(str, str2);
            this.audioRecorderAgent.execute(new Void[0]);
        }
    }

    void processMicrophoneStop(String str, String str2) throws IllegalStateException {
        stopAudioRecorder();
    }

    void processMicrophoneUtterData(byte[] bArr) {
        sendBytes(bArr);
    }

    void reportError(Throwable th) {
        th.printStackTrace();
        LogUtil.i(this.TAG, "#@ General error : ", th);
        loadUrl("receiveError('" + GsonUtil.jsonStringFromObject(new GrpcStatus(J0.fromThrowable(th))) + "')");
    }

    void reportSpeakerStatus(String str) {
        loadUrl("notifySpeakerStatus('" + str + "')");
    }

    void reportStreamSent(String str, String str2, int i8) {
        StreamingStatusDTO streamingStatusDTO = new StreamingStatusDTO(str, str2, false, false, false, StreamingStatusDTO.Streamingtype.BYTES, i8);
        if (i8 == 0) {
            streamingStatusDTO.setEnd(true);
        }
        loadUrl("sendStreamingEvent('" + GsonUtil.jsonStringFromObject(streamingStatusDTO) + "')", false);
    }

    public void resume() {
        MapClient mapClient = this.mapClient;
        if (mapClient != null) {
            mapClient.startPingProcess();
            if (this.mapSettings != null) {
                loadUrl("onResume()");
            }
        }
    }

    void sendBytes(byte[] bArr) {
        k kVar = this.streamingObserver;
        if (kVar == null) {
            LogUtil.e(this.TAG, "error invalid cur stream observer!!");
            return;
        }
        try {
            kVar.onNext(Map.MapEvent.newBuilder().setBytes(AbstractC5235o.copyFrom(bArr)).build());
        } catch (Exception e8) {
            LogUtil.e(this.TAG, "send bytes", e8);
        }
    }

    void sendEventStream(Map.EventStream eventStream) {
        Map.EventStream eventStream2;
        if (this.streamingObserver != null && (eventStream2 = this.streamingEvent) != null && eventStream2.getInterface().getOperation().equals(MapIf.DL_E_STREAM_TALK)) {
            LogUtil.e(this.TAG, "cannot break external event, please close microphone!!");
            reportError(new RuntimeException("cannot break external event, please close microphone!!"));
            return;
        }
        String operation = eventStream.getInterface().getOperation();
        operation.hashCode();
        if (operation.equals(MapIf.AU_E_SIGN_IN) || operation.equals(MapIf.AU_E_MULTI_FACTOR_VERIFY)) {
            this.mapClient.attachHeader(true);
        } else {
            this.mapClient.attachHeader(false);
        }
        MapDirectiveForwarder mapDirectiveForwarder = new MapDirectiveForwarder(eventStream.getInterface(), eventStream.getOperationSyncId());
        boolean streaming = eventStream.getInterface().getStreaming();
        Map.EventStream eventStreamBuild = eventStream.toBuilder().addContexts(0, Map.EventStream.EventContext.newBuilder().setDevice(this.mapSettings.getDevice()).build()).build();
        k kVarEventStream = getStub().eventStream(mapDirectiveForwarder);
        setEventStreamObserver(eventStream.getOperationSyncId(), kVarEventStream);
        kVarEventStream.onNext(Map.MapEvent.newBuilder().setEvent(eventStreamBuild).build());
        if (!streaming) {
            kVarEventStream.onCompleted();
            return;
        }
        if (this.streamingObserver != null && this.streamingEvent != null) {
            LogUtil.e(this.TAG, "CUR AS IF:" + this.streamingEvent.getInterface().getOperation());
            sendStreamEnd();
        }
        setCurrentStream(eventStream, kVarEventStream);
    }

    void sendOnCompleted() {
        try {
            k kVar = this.streamingObserver;
            if (kVar != null) {
                kVar.onCompleted();
                LogUtil.d(this.TAG, "#@ Call requestGrpc onCompleted requestOnCompleted");
            }
            clearCurStream();
        } catch (Exception e8) {
            LogUtil.e(this.TAG, e8.getMessage());
        }
    }

    void sendPing() {
        if (this.mapSettings.getPingInterval() <= 0) {
            this.mapClient.stopPingProcess();
        }
        getStub().ping(Map.PingRequest.newBuilder().setDevice(this.mapSettings.getDevice()).setPingAt(getCurrentTimeStamp()).build(), new PongForwarder());
    }

    boolean sendStreamBytes(byte[] bArr) {
        if (this.streamingObserver != null) {
            if (this.audioRecorderAgent == null) {
                LogUtil.e(this.TAG, "Voice Recorder Agent is null...so, not send stream");
                return false;
            }
            try {
                this.streamingObserver.onNext(Map.MapEvent.newBuilder().setBytes(AbstractC5235o.copyFrom(bArr)).build());
                return true;
            } catch (Exception e8) {
                LogUtil.e(this.TAG, "send stream bytes", e8);
                clearCurStream();
            }
        }
        return false;
    }

    boolean sendStreamEnd() {
        k kVar = this.streamingObserver;
        if (kVar != null) {
            try {
                kVar.onNext(Map.MapEvent.newBuilder().setStreamEnd(Map.StreamEnd.newBuilder().setStreamId(this.streamingEvent.getStreamId()).setEndAt(getCurrentTimeStamp()).build()).build());
                this.streamingObserver.onCompleted();
                clearCurStream();
                return true;
            } catch (Exception e8) {
                e8.printStackTrace();
                clearCurStream();
            }
        }
        return false;
    }

    void setCurrentStream(Map.EventStream eventStream, k kVar) {
        this.streamingEvent = eventStream;
        this.streamingObserver = kVar;
    }

    void setMapSettings(String str) {
        MapSettings mapSettings = new MapSettings();
        try {
            l asJsonObject = n.parseString(str).getAsJsonObject();
            mapSettings.setServerIp(asJsonObject.get(SERVER_IP).getAsString());
            mapSettings.setServerPort(asJsonObject.get(SERVER_PORT).getAsInt());
            mapSettings.setUseTls(asJsonObject.get("useTls").getAsBoolean());
            mapSettings.setPingInterval(asJsonObject.get("pingInterval") == null ? 60 : asJsonObject.get("pingInterval").getAsInt());
            mapSettings.setAuthToken(asJsonObject.get("authToken").getAsString());
            mapSettings.setNotifyObjectPrefix(asJsonObject.get("notifyObjectPrefix").getAsString());
            mapSettings.setDevice(asJsonObject.getAsJsonObject(Constants.DEVICE).toString());
            this.mapSettings = mapSettings;
            initGrpcAgent();
        } catch (C5230m0 e8) {
            LogUtil.e(this.TAG, e8.getMessage());
            throw new RuntimeException(e8);
        }
    }

    void speakerPlay(byte[] bArr) {
    }

    void startTimerForMic() {
        this.mMicTimeout = getMicTimeout();
        stopTimerForMic();
        this.mTimerTaskForMic = new TimerTaskForMic();
        Timer timer = new Timer();
        this.mTimerMic = timer;
        timer.schedule(this.mTimerTaskForMic, this.mMicTimeout);
    }

    void stopTimerTask(TIMER_KIND timer_kind) {
        stopTimerForMic();
    }

    public CdkNative(Activity activity, WebView webView, String str, boolean z8) {
        this.TAG = CdkNative.class.getSimpleName();
        this.eventStreamObserverMap = new HashMap();
        this.mRequestPermission = new ArrayList();
        this.streamingEvent = null;
        this.streamingObserver = null;
        this.checkPermission = true;
        this.webView = webView;
        this.activity = activity;
        this.javaScriptReceiver = new JavaScriptReceiver(activity, this);
        this.initUrl = str;
        this.checkPermission = z8;
        initWebView();
        AudioManager audioManager = (AudioManager) activity.getSystemService("audio");
        this.audioManager = audioManager;
        audioManager.setMode(3);
        if (AudioConnectionHelper.isBluetoothHeadsetConnected(activity)) {
            this.audioManager.startBluetoothSco();
            this.audioManager.setBluetoothScoOn(true);
        } else if (AudioConnectionHelper.hasAdditionalSpeakers(this.audioManager)) {
            this.audioManager.setSpeakerphoneOn(false);
        } else {
            this.audioManager.setSpeakerphoneOn(true);
        }
        this.audioPlayAgent = new AudioPlayAgent(this);
        initListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadUrl(final String str, final boolean z8) {
        try {
            final String notifyObjectPrefix = getNotifyObjectPrefix();
            this.activity.runOnUiThread(new Runnable() { // from class: ai.maum.m2u.cdk.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5991a.lambda$loadUrl$4(notifyObjectPrefix, str, z8);
                }
            });
        } catch (Exception e8) {
            LogUtil.e(this.TAG, "[call script]::" + e8.getMessage());
        }
    }
}
