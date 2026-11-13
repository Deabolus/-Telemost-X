package com.yandex.passport.internal.methods.requester;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import com.yandex.passport.api.exception.e0;
import com.yandex.passport.data.network.s5;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.analytics.w;
import com.yandex.passport.internal.methods.u5;
import com.yandex.passport.internal.methods.v5;
import defpackage.x44;
import defpackage.y62;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final class j {
    public static final xeo g = null;
    public final Context a;
    public final io.sentry.internal.debugmeta.c b;
    public final IReporterYandex c;
    public final com.yandex.passport.internal.autologin.ui.a d;
    public final xeo e;
    public volatile Boolean f;

    static {
        g = lo7.B(new s5(22));
    }

    public j(Context r1, io.sentry.internal.debugmeta.c r2, IReporterYandex r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
        this.d = new com.yandex.passport.internal.autologin.ui.a(r3);
        this.e = lo7.B(new com.yandex.passport.common.ui.progress.h(this, 8));
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00c4 -> B:30:0x00c7). Please report as a decompilation issue!!! */
    public static final Object a(j r23, v5 r24, Bundle r25, kc6 r26) {
        if ((r26 instanceof g) == false) goto L7;
        g r2 = (g) r26;
        int r3 = r2.n;
        if ((r3 & Integer.MIN_VALUE) == 0) goto L7;
        r2.n = r3 - Integer.MIN_VALUE;
    L8:
        Object r1 = r2.l;
        xe6 r4 = xe6.a;
        int r5 = r2.n;
        if (r5 == 0) goto L14;
        if (r5 != 1) goto L13;
        int r6 = r2.k;
        int r7 = r2.j;
        int r8 = r2.i;
        int r9 = r2.h;
        int[] r10 = r2.g;
        zuk r11 = r2.f;
        Bundle r12 = r2.e;
        v5 r13 = r2.d;
        nzn.U(r1);
        g r14 = r2;
        Bundle r15 = r12;
        int r16 = r6;
        int r17 = r8;
        v5 r18 = r13;
        int r19 = r7;
        int r20 = 1;
    L30:
        r19 = r19 + r20;
        int r21 = r16;
        int r110 = r17;
    L15:
        if (r19 >= r21) goto L34;
        int r111 = r10[r19];
        r17 = r110 + 1;
        r89 r112 = r23.e(r18, r15);
        if ((r112 instanceof r89) == false) goto L22;
        Bundle r22 = (Bundle) r112.a;
        if (r22 == null) goto L25;
        return r22;
    L25:
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L27;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, fde.q("call retry: counter=", r110, r111, " timeout="), 8);
    L27:
        r16 = r21;
        long r27 = 0;
        long r28 = TimeUnit.MILLISECONDS.toMillis(com.yandex.passport.common.time.a.b(r27, r27, r27, r111));
        r14.d = r18;
        r14.e = r15;
        r14.f = r11;
        r14.g = r10;
        r14.h = r9;
        r14.i = r17;
        r14.j = r19;
        r14.k = r16;
        r20 = 1;
        r14.n = 1;
        if (x44.o(r28, r14) != r4) goto L30;
        return r4;
    L22:
        if ((r112 instanceof s89) == false) goto L32;
        r11.a = (Throwable) ((s89) r112).a;
        goto L25
    L32:
        throw new mnh();
    L34:
        return r23.c(r18, (Throwable) r11.a, f.a);
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        r21 = 5;
        r11 = fde.k(r1);
        r10 = k.a;
        r19 = 0;
        r9 = 0;
        r110 = 0;
        r18 = r24;
        r14 = r2;
        r15 = r25;
    L7:
        r2 = new g(r23, r26);
        goto L8
    }

    public static final Object b(j r4, v5 r5, Bundle r6, kc6 r7) {
        if ((r7 instanceof h) == false) goto L7;
        h r0 = (h) r7;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        r5 = r0.d;
        nzn.U(r8);
        Object r9 = ((mel) r8).a;
    L18:
        if ((r9 instanceof jel) == true) goto L21;
        return r9;
    L21:
        return r4.c(r5, mel.a(r9), f.b);
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        nzn.U(r8);
        c r10 = (c) r4.e.getValue();
        r0.d = r5;
        r0.g = 1;
        r9 = r10.a(r5, r6, r0);
        if (r9 != r2) goto L18;
        return r2;
    L7:
        r0 = new h(r4, r7);
        goto L8
    }

    public final jel c(v5 r5, Throwable r6, f r7) {
        com.yandex.passport.internal.autologin.ui.a r0 = this.d;
        r0.getClass();
        IReporterYandex r1 = r0.a;
        mqd.z(r5, "method");
        mqd.z(r7, "source");
        LinkedHashMap r2 = new LinkedHashMap();
        r2.put("method_name", r5.name());
        r2.put("ipc_source", r7.name());
        if (r6 == null) goto L5;
        r2.put(Constants.KEY_EXCEPTION, r6.getMessage());
    L5:
        r1.reportEvent(p.f.b, r2);
        if (r6 == null) goto L13;
        r1.reportError(w.a.b, r6);
        com.yandex.passport.common.logger.d r8 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L10;
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Method " + r5 + " have failed with throwable", r6);
    L10:
        String r9 = "Method " + r5 + " have failed with throwable";
        mqd.z(r9, Constants.KEY_MESSAGE);
        return nzn.E(new e0(r9, r6));
    L13:
        return nzn.E(new e0("[" + r7 + "] Passport provider unexpectedly returned null for " + r5));
    }

    public final Object d(u5 r7, kc6 r8) {
        if ((r8 instanceof i) == false) goto L7;
        i r0 = (i) r8;
        int r1 = r0.f;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.f = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.d;
        xe6 r2 = xe6.a;
        int r3 = r0.f;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        nzn.U(r9);
    L18:
        return ((mel) r9).a;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        nzn.U(r9);
        le6 r10 = (le6) g.getValue();
        ic6 r5 = null;
        com.yandex.passport.internal.methods.performer.e r4 = new com.yandex.passport.internal.methods.performer.e(this, r7, r5, 26);
        r0.f = 1;
        r9 = lo7.Q(r10, r4, r0);
        if (r9 != r2) goto L18;
        return r2;
    L7:
        r0 = new i(this, r8);
        goto L8
    }

    public final t89 e(v5 r11, Bundle r12) {
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L5;
        long r2 = SystemClock.elapsedRealtime();
    L6:
        Throwable r5 = null;
        io.sentry.internal.debugmeta.c r6 = this.b;     // Catch: Throwable -> L23
        String r7 = r11.name();     // Catch: Throwable -> L23
        mqd.z(r7, "method");     // Catch: Throwable -> L23
        ContentProviderClient r8 = ((ContentResolver) r6.b).acquireUnstableContentProviderClient((Uri) r6.c);     // Catch: Throwable -> L23
        if (r8 != null) goto L48;
        Bundle r13 = null;
    L17:
        y62.r(r8, null);     // Catch: Throwable -> L23
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L36;
        long r9 = SystemClock.elapsedRealtime() - r2;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L36;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, fde.n(r9, "call: time="), 8);
    L36:
        if (r5 == null) goto L39;
        return new s89(r5);
    L39:
        return new r89(r13);
    L48:
        r13 = r8.call(r7, null, r12);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;     // Catch: Throwable -> L13
    L13:
        th = move-exception;
        y62.r(r8, th);     // Catch: Throwable -> L23
        throw th;     // Catch: Throwable -> L23
    L23:
        th = move-exception;
        com.yandex.passport.common.logger.d r10 = com.yandex.passport.common.logger.a.a;     // Catch: Throwable -> L28
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L31;
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "call " + r11 + " failed", th);     // Catch: Throwable -> L28
    L31:
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L35;
        long r14 = SystemClock.elapsedRealtime() - r2;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L35;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, fde.n(r14, "call: time="), 8);
    L35:
        r5 = th;
        r13 = null;
    L28:
        th = move-exception;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L45;
        long r15 = SystemClock.elapsedRealtime() - r2;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L45;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, fde.n(r15, "call: time="), 8);
    L45:
        throw th;
    L5:
        r2 = 0;
        goto L6
    }
}
