package defpackage;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class b1j implements Runnable, cw3 {
    public static final Object i = new Object();
    public final Handler a;
    public final k0j b;
    public final oxk c;
    public final x20 d;
    public final a1j e;
    public final Executor f;
    public boolean g;
    public boolean h;

    public b1j(k0j k0jVar, oxk oxkVar, x20 x20Var, a1j a1jVar) {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.a = new Handler();
        this.b = k0jVar;
        this.c = oxkVar;
        this.d = x20Var;
        this.e = a1jVar;
        this.f = executor;
        b();
    }

    public final void a(String str) {
        Handler handler = this.a;
        atl.s(handler.getLooper(), Looper.myLooper(), null);
        atl.t(null, this.g);
        this.d.d("passport_request_failed", "method", this.e.name(), "message", str);
        this.g = false;
        if (this.h) {
            return;
        }
        handler.postAtTime(this, i, TimeUnit.SECONDS.toMillis(2L) + SystemClock.uptimeMillis());
    }

    public final void b() {
        Handler handler = this.a;
        atl.s(handler.getLooper(), Looper.myLooper(), null);
        if (this.g) {
            return;
        }
        this.g = true;
        handler.removeCallbacksAndMessages(i);
        this.f.execute(new z0j(this, 0));
    }

    @Override // defpackage.cw3
    public final void cancel() {
        Handler handler = this.a;
        atl.s(handler.getLooper(), Looper.myLooper(), null);
        this.h = true;
        handler.removeCallbacksAndMessages(i);
    }

    @Override // java.lang.Runnable
    public final void run() {
        atl.s(this.a.getLooper(), Looper.myLooper(), null);
        if (this.h) {
            return;
        }
        b();
    }
}
