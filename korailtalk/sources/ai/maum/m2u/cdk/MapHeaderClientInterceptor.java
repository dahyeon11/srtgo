package ai.maum.m2u.cdk;

import io.grpc.AbstractC5723f;
import io.grpc.AbstractC5786j;
import io.grpc.C5721e;
import io.grpc.C5728h0;
import io.grpc.C5730i0;
import io.grpc.E;
import io.grpc.F;
import io.grpc.InterfaceC5788k;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class MapHeaderClientInterceptor implements InterfaceC5788k {
    private static final String TAG = "MapHeaderClientInterceptor";
    private static final Logger logger = Logger.getLogger(MapHeaderClientInterceptor.class.getName());
    private static C5728h0.i sessionKey = C5728h0.i.of("session", C5728h0.ASCII_STRING_MARSHALLER);
    IGrpcMetadataGetter mg_;

    @Override // io.grpc.InterfaceC5788k
    public <ReqT, RespT> AbstractC5786j interceptCall(C5730i0 c5730i0, C5721e c5721e, AbstractC5723f abstractC5723f) {
        return new E.a(abstractC5723f.newCall(c5730i0, c5721e)) { // from class: ai.maum.m2u.cdk.MapHeaderClientInterceptor.1
            @Override // io.grpc.E, io.grpc.AbstractC5786j
            public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
                IGrpcMetadataGetter iGrpcMetadataGetter = MapHeaderClientInterceptor.this.mg_;
                if (iGrpcMetadataGetter != null) {
                    iGrpcMetadataGetter.onMetaData(c5728h0);
                }
                super.start(new F.a(aVar) { // from class: ai.maum.m2u.cdk.MapHeaderClientInterceptor.1.1
                    @Override // io.grpc.F.a, io.grpc.F, io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
                    public void onHeaders(C5728h0 c5728h02) {
                        super.onHeaders(c5728h02);
                    }
                }, c5728h0);
            }
        };
    }

    public void setMetadataGetter(IGrpcMetadataGetter iGrpcMetadataGetter) {
        this.mg_ = iGrpcMetadataGetter;
    }
}
