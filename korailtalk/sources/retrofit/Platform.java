package retrofit;

import android.os.Process;
import com.google.gson.Gson;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import retrofit.RestAdapter;
import retrofit.Utils;
import retrofit.android.AndroidLog;
import retrofit.android.MainThreadExecutor;
import retrofit.appengine.UrlFetchClient;
import retrofit.client.Client;
import retrofit.client.OkClient;
import retrofit.converter.Converter;
import retrofit.converter.GsonConverter;

/* loaded from: classes3.dex */
abstract class Platform {
    private static final Platform PLATFORM = findPlatform();
    static final boolean HAS_RX_JAVA = hasRxJavaOnClasspath();

    private static class Android extends Platform {

        /* renamed from: retrofit.Platform$Android$1 */
        class AnonymousClass1 implements Client.Provider {
            final /* synthetic */ Client val$client;

            AnonymousClass1(Client client) {
                client = client;
            }

            @Override // retrofit.client.Client.Provider
            public Client get() {
                return client;
            }
        }

        /* renamed from: retrofit.Platform$Android$2 */
        class AnonymousClass2 implements ThreadFactory {

            /* renamed from: retrofit.Platform$Android$2$1 */
            class AnonymousClass1 implements Runnable {
                final /* synthetic */ Runnable val$r;

                AnonymousClass1(Runnable runnable) {
                    runnable = runnable;
                }

                @Override // java.lang.Runnable
                public void run() throws SecurityException, IllegalArgumentException {
                    Process.setThreadPriority(10);
                    runnable.run();
                }
            }

            AnonymousClass2() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(new Runnable() { // from class: retrofit.Platform.Android.2.1
                    final /* synthetic */ Runnable val$r;

                    AnonymousClass1(Runnable runnable2) {
                        runnable = runnable2;
                    }

                    @Override // java.lang.Runnable
                    public void run() throws SecurityException, IllegalArgumentException {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "Retrofit-Idle");
            }
        }

        private Android() {
        }

        @Override // retrofit.Platform
        Executor defaultCallbackExecutor() {
            return new MainThreadExecutor();
        }

        @Override // retrofit.Platform
        Client.Provider defaultClient() {
            return new Client.Provider() { // from class: retrofit.Platform.Android.1
                final /* synthetic */ Client val$client;

                AnonymousClass1(Client client) {
                    client = client;
                }

                @Override // retrofit.client.Client.Provider
                public Client get() {
                    return client;
                }
            };
        }

        @Override // retrofit.Platform
        Converter defaultConverter() {
            return new GsonConverter(new Gson());
        }

        @Override // retrofit.Platform
        Executor defaultHttpExecutor() {
            return Executors.newCachedThreadPool(new ThreadFactory() { // from class: retrofit.Platform.Android.2

                /* renamed from: retrofit.Platform$Android$2$1 */
                class AnonymousClass1 implements Runnable {
                    final /* synthetic */ Runnable val$r;

                    AnonymousClass1(Runnable runnable2) {
                        runnable = runnable2;
                    }

                    @Override // java.lang.Runnable
                    public void run() throws SecurityException, IllegalArgumentException {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }

                AnonymousClass2() {
                }

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable2) {
                    return new Thread(new Runnable() { // from class: retrofit.Platform.Android.2.1
                        final /* synthetic */ Runnable val$r;

                        AnonymousClass1(Runnable runnable22) {
                            runnable = runnable22;
                        }

                        @Override // java.lang.Runnable
                        public void run() throws SecurityException, IllegalArgumentException {
                            Process.setThreadPriority(10);
                            runnable.run();
                        }
                    }, "Retrofit-Idle");
                }
            });
        }

        @Override // retrofit.Platform
        RestAdapter.Log defaultLog() {
            return new AndroidLog("Retrofit");
        }

        /* synthetic */ Android(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static class AppEngine extends Base {

        /* renamed from: retrofit.Platform$AppEngine$1 */
        class AnonymousClass1 implements Client.Provider {
            final /* synthetic */ UrlFetchClient val$client;

            AnonymousClass1(UrlFetchClient urlFetchClient) {
                urlFetchClient = urlFetchClient;
            }

            @Override // retrofit.client.Client.Provider
            public Client get() {
                return urlFetchClient;
            }
        }

        private AppEngine() {
            super();
        }

        @Override // retrofit.Platform.Base, retrofit.Platform
        Client.Provider defaultClient() {
            return new Client.Provider() { // from class: retrofit.Platform.AppEngine.1
                final /* synthetic */ UrlFetchClient val$client;

                AnonymousClass1(UrlFetchClient urlFetchClient) {
                    urlFetchClient = urlFetchClient;
                }

                @Override // retrofit.client.Client.Provider
                public Client get() {
                    return urlFetchClient;
                }
            };
        }

        /* synthetic */ AppEngine(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static class Base extends Platform {

        /* renamed from: retrofit.Platform$Base$1 */
        class AnonymousClass1 implements Client.Provider {
            final /* synthetic */ Client val$client;

            AnonymousClass1(Client client) {
                client = client;
            }

            @Override // retrofit.client.Client.Provider
            public Client get() {
                return client;
            }
        }

        /* renamed from: retrofit.Platform$Base$2 */
        class AnonymousClass2 implements ThreadFactory {

            /* renamed from: retrofit.Platform$Base$2$1 */
            class AnonymousClass1 implements Runnable {
                final /* synthetic */ Runnable val$r;

                AnonymousClass1(Runnable runnable) {
                    runnable = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Thread.currentThread().setPriority(1);
                    runnable.run();
                }
            }

            AnonymousClass2() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(new Runnable() { // from class: retrofit.Platform.Base.2.1
                    final /* synthetic */ Runnable val$r;

                    AnonymousClass1(Runnable runnable2) {
                        runnable = runnable2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Thread.currentThread().setPriority(1);
                        runnable.run();
                    }
                }, "Retrofit-Idle");
            }
        }

        /* renamed from: retrofit.Platform$Base$3 */
        class AnonymousClass3 implements RestAdapter.Log {
            AnonymousClass3() {
            }

            @Override // retrofit.RestAdapter.Log
            public void log(String str) {
                System.out.println(str);
            }
        }

        private Base() {
        }

        @Override // retrofit.Platform
        Executor defaultCallbackExecutor() {
            return new Utils.SynchronousExecutor();
        }

        @Override // retrofit.Platform
        Client.Provider defaultClient() {
            return new Client.Provider() { // from class: retrofit.Platform.Base.1
                final /* synthetic */ Client val$client;

                AnonymousClass1(Client client) {
                    client = client;
                }

                @Override // retrofit.client.Client.Provider
                public Client get() {
                    return client;
                }
            };
        }

        @Override // retrofit.Platform
        Converter defaultConverter() {
            return new GsonConverter(new Gson());
        }

        @Override // retrofit.Platform
        Executor defaultHttpExecutor() {
            return Executors.newCachedThreadPool(new ThreadFactory() { // from class: retrofit.Platform.Base.2

                /* renamed from: retrofit.Platform$Base$2$1 */
                class AnonymousClass1 implements Runnable {
                    final /* synthetic */ Runnable val$r;

                    AnonymousClass1(Runnable runnable2) {
                        runnable = runnable2;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        Thread.currentThread().setPriority(1);
                        runnable.run();
                    }
                }

                AnonymousClass2() {
                }

                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable2) {
                    return new Thread(new Runnable() { // from class: retrofit.Platform.Base.2.1
                        final /* synthetic */ Runnable val$r;

                        AnonymousClass1(Runnable runnable22) {
                            runnable = runnable22;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            Thread.currentThread().setPriority(1);
                            runnable.run();
                        }
                    }, "Retrofit-Idle");
                }
            });
        }

        @Override // retrofit.Platform
        RestAdapter.Log defaultLog() {
            return new RestAdapter.Log() { // from class: retrofit.Platform.Base.3
                AnonymousClass3() {
                }

                @Override // retrofit.RestAdapter.Log
                public void log(String str) {
                    System.out.println(str);
                }
            };
        }

        /* synthetic */ Base(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    private static class OkClientInstantiator {
        private OkClientInstantiator() {
        }

        static Client instantiate() {
            return new OkClient();
        }
    }

    Platform() {
    }

    private static Platform findPlatform() throws ClassNotFoundException {
        try {
            Class.forName("android.os.Build");
            return new Android();
        } catch (ClassNotFoundException unused) {
            return System.getProperty("com.google.appengine.runtime.version") != null ? new AppEngine() : new Base();
        }
    }

    static Platform get() {
        return PLATFORM;
    }

    public static boolean hasOkHttpOnClasspath() throws ClassNotFoundException {
        boolean z8;
        boolean z9 = true;
        try {
            Class.forName("com.squareup.okhttp.OkUrlFactory");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        try {
            Class.forName("com.squareup.okhttp.OkHttpClient");
        } catch (ClassNotFoundException unused2) {
            z9 = false;
        }
        if (z9 == z8) {
            return z9;
        }
        throw new RuntimeException("Retrofit detected an unsupported OkHttp on the classpath.\nTo use OkHttp with this version of Retrofit, you'll need:\n1. com.squareup.okhttp:okhttp:1.6.0 (or newer)\n2. com.squareup.okhttp:okhttp-urlconnection:1.6.0 (or newer)\nNote that OkHttp 2.0.0+ is supported!");
    }

    private static boolean hasRxJavaOnClasspath() throws ClassNotFoundException {
        try {
            Class.forName("rx.Observable");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    abstract Executor defaultCallbackExecutor();

    abstract Client.Provider defaultClient();

    abstract Converter defaultConverter();

    abstract Executor defaultHttpExecutor();

    abstract RestAdapter.Log defaultLog();
}
