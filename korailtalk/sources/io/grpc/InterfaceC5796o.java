package io.grpc;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: io.grpc.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5796o extends r, InterfaceC5807y {

    /* renamed from: io.grpc.o$a */
    public static final class a implements InterfaceC5796o {
        @Override // io.grpc.InterfaceC5796o, io.grpc.r
        public OutputStream compress(OutputStream outputStream) {
            return new GZIPOutputStream(outputStream);
        }

        @Override // io.grpc.InterfaceC5796o, io.grpc.InterfaceC5807y
        public InputStream decompress(InputStream inputStream) {
            return new GZIPInputStream(inputStream);
        }

        @Override // io.grpc.InterfaceC5796o, io.grpc.r, io.grpc.InterfaceC5807y
        public String getMessageEncoding() {
            return "gzip";
        }
    }

    /* renamed from: io.grpc.o$b */
    public static final class b implements InterfaceC5796o {
        public static final InterfaceC5796o NONE = new b();

        private b() {
        }

        @Override // io.grpc.InterfaceC5796o, io.grpc.r
        public OutputStream compress(OutputStream outputStream) {
            return outputStream;
        }

        @Override // io.grpc.InterfaceC5796o, io.grpc.InterfaceC5807y
        public InputStream decompress(InputStream inputStream) {
            return inputStream;
        }

        @Override // io.grpc.InterfaceC5796o, io.grpc.r, io.grpc.InterfaceC5807y
        public String getMessageEncoding() {
            return "identity";
        }
    }

    @Override // io.grpc.r
    /* synthetic */ OutputStream compress(OutputStream outputStream);

    @Override // io.grpc.InterfaceC5807y
    /* synthetic */ InputStream decompress(InputStream inputStream);

    @Override // io.grpc.r, io.grpc.InterfaceC5807y
    /* synthetic */ String getMessageEncoding();
}
