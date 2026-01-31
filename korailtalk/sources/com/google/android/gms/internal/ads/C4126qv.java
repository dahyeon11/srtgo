package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.qv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4126qv extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f22038a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C4353sv f22039b;

    C4126qv(C4353sv c4353sv) {
        this.f22039b = c4353sv;
    }

    private final Socket a(Socket socket) throws SocketException {
        C4353sv c4353sv = this.f22039b;
        if (c4353sv.f22747s > 0) {
            socket.setReceiveBufferSize(c4353sv.f22747s);
        }
        this.f22039b.f22748t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i8) throws IOException {
        Socket socketCreateSocket = this.f22038a.createSocket(str, i8);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f22038a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f22038a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i8, InetAddress inetAddress, int i9) throws IOException {
        Socket socketCreateSocket = this.f22038a.createSocket(str, i8, inetAddress, i9);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i8) throws IOException {
        Socket socketCreateSocket = this.f22038a.createSocket(inetAddress, i8);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i8, InetAddress inetAddress2, int i9) throws IOException {
        Socket socketCreateSocket = this.f22038a.createSocket(inetAddress, i8, inetAddress2, i9);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i8, boolean z8) throws IOException {
        Socket socketCreateSocket = this.f22038a.createSocket(socket, str, i8, z8);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
