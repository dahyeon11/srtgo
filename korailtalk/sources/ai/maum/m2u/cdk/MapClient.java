package ai.maum.m2u.cdk;

import ai.maum.m2u.cdk.utils.LogUtil;
import io.grpc.AbstractC5720d0;
import io.grpc.AbstractC5723f;
import io.grpc.AbstractC5792m;
import io.grpc.C5728h0;
import io.grpc.stub.h;
import io.grpc.stub.k;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import maum.m2u.map.MaumToYouProxyServiceGrpc;

/* loaded from: classes.dex */
public class MapClient {
    private static final String TAG = "MapClient";
    private final CdkNative cdkNative;
    private AbstractC5720d0 channel;
    private Timer mTimer;
    public TimerTaskForPing mTimerTaskForPing;
    private AbstractC5723f mapChannel;
    private k mapEventStreamObserver;
    private MaumToYouProxyServiceGrpc.MaumToYouProxyServiceStub mapStub;
    private final HashMap<String, String> mMetadataMap = new HashMap<>();
    private long currentPingIntervalMilli = 0;
    private final IGrpcMetadataGetter metadataGetter = new IGrpcMetadataGetter() { // from class: ai.maum.m2u.cdk.MapClient.1
        AnonymousClass1() {
        }

        @Override // ai.maum.m2u.cdk.IGrpcMetadataGetter
        public void onMetaData(C5728h0 c5728h0) {
            MapClient.this.getCurrentMetaData(c5728h0);
        }
    };

    /* renamed from: ai.maum.m2u.cdk.MapClient$1 */
    class AnonymousClass1 implements IGrpcMetadataGetter {
        AnonymousClass1() {
        }

        @Override // ai.maum.m2u.cdk.IGrpcMetadataGetter
        public void onMetaData(C5728h0 c5728h0) {
            MapClient.this.getCurrentMetaData(c5728h0);
        }
    }

    public static class MetadataKeys {
        public static final String M2U_AUTH_SIGN_IN = "m2u-auth-sign-in";
        public static final String M2U_AUTH_TOKEN = "m2u-auth-token";
    }

    public class TimerTaskForPing extends TimerTask {
        public TimerTaskForPing() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MapClient.this.cdkNative.sendPing();
        }
    }

    public MapClient(CdkNative cdkNative) {
        this.cdkNative = cdkNative;
        if (open()) {
            startPingProcess();
        }
    }

    private long getCurrentPingIntervalMilli() {
        return this.currentPingIntervalMilli;
    }

    private void resetClientInterceptor() {
        String str = TAG;
        LogUtil.d(str, "#@ START resetClientInterceptor");
        MapHeaderClientInterceptor mapHeaderClientInterceptor = new MapHeaderClientInterceptor();
        mapHeaderClientInterceptor.setMetadataGetter(this.metadataGetter);
        this.mapChannel = AbstractC5792m.intercept(this.mapChannel, mapHeaderClientInterceptor);
        LogUtil.d(str, "#@ mMetadataMap.clear()");
        this.mMetadataMap.clear();
        this.mapStub = MaumToYouProxyServiceGrpc.newStub(this.mapChannel);
    }

    private void setCurrentPingIntervalMilli(long j8) {
        this.currentPingIntervalMilli = j8;
    }

    public void attachHeader(boolean z8) {
        String str = TAG;
        LogUtil.d(str, "#@ attachHeader auth :" + z8);
        String authToken = this.cdkNative.getMapSettings().getAuthToken();
        LogUtil.d(str, "#@ attachHeader authToken :" + authToken);
        if (!z8) {
            boolean zContainsKey = this.mMetadataMap.containsKey(MetadataKeys.M2U_AUTH_TOKEN);
            LogUtil.d(str, "#@ Another Process isExist :" + zContainsKey);
            if (zContainsKey) {
                String str2 = this.mMetadataMap.get(MetadataKeys.M2U_AUTH_TOKEN);
                LogUtil.d(str, "#@ Another Process : currentAuthToken = " + str2);
                if (!authToken.equalsIgnoreCase(str2)) {
                    LogUtil.d(str, "#@ Another Process resetClientInterceptor");
                    resetClientInterceptor();
                    C5728h0 c5728h0 = new C5728h0();
                    c5728h0.put(C5728h0.i.of(MetadataKeys.M2U_AUTH_TOKEN, C5728h0.ASCII_STRING_MARSHALLER), authToken);
                    this.mapStub = (MaumToYouProxyServiceGrpc.MaumToYouProxyServiceStub) this.mapStub.withInterceptors(h.newAttachHeadersInterceptor(c5728h0));
                    LogUtil.d(str, "#@ 1.Another Process authTokenMetadataKey");
                }
            } else {
                C5728h0 c5728h02 = new C5728h0();
                c5728h02.put(C5728h0.i.of(MetadataKeys.M2U_AUTH_TOKEN, C5728h0.ASCII_STRING_MARSHALLER), authToken);
                this.mapStub = (MaumToYouProxyServiceGrpc.MaumToYouProxyServiceStub) this.mapStub.withInterceptors(h.newAttachHeadersInterceptor(c5728h02));
                LogUtil.d(str, "#@ 2.Another Process authTokenMetadataKey");
            }
            LogUtil.d(str, "#@ Another Process");
            return;
        }
        boolean zContainsKey2 = this.mMetadataMap.containsKey(MetadataKeys.M2U_AUTH_TOKEN);
        LogUtil.d(str, "#@ SignIn Process isExistAuthToken :" + zContainsKey2);
        if (zContainsKey2) {
            LogUtil.d(str, "#@ SignIn Process resetClientInterceptor1");
            resetClientInterceptor();
            C5728h0 c5728h03 = new C5728h0();
            c5728h03.put(C5728h0.i.of(MetadataKeys.M2U_AUTH_SIGN_IN, C5728h0.ASCII_STRING_MARSHALLER), "");
            this.mapStub = (MaumToYouProxyServiceGrpc.MaumToYouProxyServiceStub) this.mapStub.withInterceptors(h.newAttachHeadersInterceptor(c5728h03));
            LogUtil.d(str, "#@ 1.SignIn Process authSignInMetadataKey");
        } else {
            boolean zContainsKey3 = this.mMetadataMap.containsKey(MetadataKeys.M2U_AUTH_SIGN_IN);
            LogUtil.d(str, "#@ SignIn Process isExist :" + zContainsKey3);
            if (zContainsKey3) {
                LogUtil.d(str, "#@ SignIn Process resetClientInterceptor2");
                resetClientInterceptor();
            }
            C5728h0 c5728h04 = new C5728h0();
            c5728h04.put(C5728h0.i.of(MetadataKeys.M2U_AUTH_SIGN_IN, C5728h0.ASCII_STRING_MARSHALLER), "");
            this.mapStub = (MaumToYouProxyServiceGrpc.MaumToYouProxyServiceStub) this.mapStub.withInterceptors(h.newAttachHeadersInterceptor(c5728h04));
            LogUtil.d(str, "#@ 2.SignIn Process authSignInMetadataKey");
        }
        LogUtil.i(str, "#@ SignIn Process");
    }

    public void close() {
        LogUtil.d(TAG, "======== MAP(GrpcAgent) close called ========");
        try {
            shutdown();
        } catch (InterruptedException e8) {
            e8.printStackTrace();
        }
    }

    public void getCurrentMetaData(C5728h0 c5728h0) {
        this.mMetadataMap.clear();
        for (String str : c5728h0.keys()) {
            String str2 = (String) c5728h0.get(C5728h0.i.of(str, C5728h0.ASCII_STRING_MARSHALLER));
            this.mMetadataMap.put(str, str2);
            LogUtil.d(TAG, "#@ MetaData : key = " + str + ", value = " + str2);
        }
    }

    public MaumToYouProxyServiceGrpc.MaumToYouProxyServiceStub getStub() {
        return this.mapStub;
    }

    public boolean open() {
        if (this.mapChannel != null && this.mapStub != null) {
            return true;
        }
        MapHeaderClientInterceptor mapHeaderClientInterceptor = new MapHeaderClientInterceptor();
        mapHeaderClientInterceptor.setMetadataGetter(this.metadataGetter);
        String serverIp = this.cdkNative.getMapSettings().getServerIp();
        int serverPort = this.cdkNative.getMapSettings().getServerPort();
        try {
            LogUtil.d(TAG, "grpc open : " + serverIp + " / " + serverPort);
            if (this.cdkNative.getMapSettings().isUseTls()) {
                this.channel = I6.f.forAddress(serverIp, serverPort).sslSocketFactory(null).build();
            } else {
                this.channel = I6.f.forAddress(serverIp, serverPort).usePlaintext().build();
            }
            AbstractC5723f abstractC5723fIntercept = AbstractC5792m.intercept(this.channel, mapHeaderClientInterceptor);
            this.mapChannel = abstractC5723fIntercept;
            this.mapStub = MaumToYouProxyServiceGrpc.newStub(abstractC5723fIntercept);
            return true;
        } catch (NullPointerException e8) {
            e8.printStackTrace();
            this.cdkNative.reportError(e8);
            return false;
        }
    }

    public void shutdown() {
        if (this.mapChannel != null) {
            this.channel.shutdown().awaitTermination(1L, TimeUnit.SECONDS);
            this.channel = null;
            this.mapChannel = null;
        }
        k kVar = this.mapEventStreamObserver;
        if (kVar != null) {
            kVar.onCompleted();
            LogUtil.d(TAG, "#@ Call requestGrpc onCompleted shutdown");
            this.mapEventStreamObserver = null;
        }
        stopPingProcess();
    }

    public void startPingProcess() {
        int pingInterval = this.cdkNative.getMapSettings().getPingInterval();
        if (pingInterval > 0) {
            long j8 = pingInterval * 1000;
            if (j8 == getCurrentPingIntervalMilli() && this.mTimerTaskForPing != null) {
                return;
            }
            setCurrentPingIntervalMilli(j8);
            stopPingProcess();
            this.mTimerTaskForPing = new TimerTaskForPing();
            Timer timer = new Timer();
            this.mTimer = timer;
            timer.schedule(this.mTimerTaskForPing, j8, j8);
        } else {
            stopPingProcess();
        }
        LogUtil.i(TAG, "startPingProcess...");
    }

    public void stopPingProcess() {
        Timer timer = this.mTimer;
        if (timer != null) {
            timer.cancel();
            this.mTimer = null;
        }
        TimerTaskForPing timerTaskForPing = this.mTimerTaskForPing;
        if (timerTaskForPing != null) {
            timerTaskForPing.cancel();
            this.mTimerTaskForPing = null;
        }
        LogUtil.i(TAG, "stopPingProcess...");
    }
}
