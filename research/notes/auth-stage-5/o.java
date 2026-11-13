package com.yandex.passport.internal.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.yandex.passport.R;
import com.yandex.passport.api.exception.e0;
import com.yandex.passport.api.j2;
import com.yandex.passport.api.k2;
import com.yandex.passport.internal.methods.i3;
import com.yandex.passport.internal.methods.j5;
import com.yandex.passport.internal.methods.k5;
import com.yandex.passport.internal.methods.n3;
import com.yandex.passport.internal.methods.n4;
import com.yandex.passport.internal.methods.r3;
import com.yandex.passport.internal.methods.u3;
import com.yandex.passport.internal.provider.InternalProvider;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final class o implements com.yandex.passport.api.r, a {
    public final Context a;
    public final IReporterYandex b;
    public final String c;
    public final boolean d;
    public final com.yandex.passport.internal.methods.requester.j e;
    public final xeo f;
    public final xeo g;
    public final xeo h;
    public final xeo i;

    public o(Context r7, IReporterYandex r8) {
        this.a = r7;
        this.b = r8;
        String r0 = r7.getResources().getString(R.string.passport_process_name);
        mqd.y(r0, "getString(...)");
        this.c = r0;
        this.d = p0o.b0(r0);
        ContentResolver r1 = r7.getContentResolver();
        mqd.y(r1, "getContentResolver(...)");
        Uri r2 = com.yandex.passport.internal.util.k.a(r7.getPackageName());
        mqd.y(r2, "getProviderAuthorityUri(...)");
        this.e = new com.yandex.passport.internal.methods.requester.j(r7, new io.sentry.internal.debugmeta.c(r1, r2, false, 16), r8);
        final int r9 = 0;
        this.f = lo7.B(new b(this, r9));
        final int r10 = 1;
        this.g = lo7.B(new b(this, r10));
        final int r11 = 2;
        this.h = lo7.B(new b(this, r11));
        final int r12 = 3;
        lo7.B(new b(this, r12));
        final int r13 = 4;
        this.i = lo7.B(new b(this, r13));
    }

    @Override // com.yandex.passport.api.r
    public final Object a(j2 r5, kc6 r6) {
        if ((r6 instanceof j) == false) goto L7;
        j r0 = (j) r6;
        int r1 = r0.f;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.f = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.d;
        Object r2 = xe6.a;
        int r3 = r0.f;
        if (r3 == 0) goto L15;
        if (r3 != 1) goto L14;
        nzn.U(r7);
        return ((mel) r7).a;
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        nzn.U(r7);
        r0.f = 1;
        Object r8 = j(r5, r0);
        if (r8 != r2) goto L18;
        return r2;
    L18:
        return r8;
    L7:
        r0 = new j(this, r6);
        goto L8
    }

    @Override // com.yandex.passport.api.r
    public final Object b(String r11, ic6 r12) {
        if ((r12 instanceof e) == false) goto L7;
        e r0 = (e) r12;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r13 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r14 = r0.d;
        nzn.U(r13);     // Catch: RuntimeException -> L14
    L31:
        Object r15 = ((mel) r13).a;     // Catch: RuntimeException -> L14
        Throwable r4 = mel.a(r15);     // Catch: RuntimeException -> L14
        if (r4 != null) goto L34;
    L36:
        return r15;
    L34:
        if ((r4 instanceof RuntimeException) == false) goto L36;
        r14.k((RuntimeException) r4);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r16 = e;
    L40:
        r14.k(r16);
        throw r16;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r13);
        n();
    L22:
        e = move-exception;
        r16 = e;
    L24:
        r14 = this;
        goto L40
    L20:
        if (p0o.b0(r11) == false) goto L25;
        l(0, "dropToken");     // Catch: RuntimeException -> L22
    L25:
        com.yandex.passport.internal.methods.requester.j r5 = this.e;     // Catch: RuntimeException -> L22
        tk7 r17 = n08.a;     // Catch: RuntimeException -> L22
        b0o r6 = new b0o(r5, new i3(new com.yandex.passport.internal.entities.b(r11, "")), new i5e[0], null, 22);     // Catch: RuntimeException -> L22
        r0.d = this;     // Catch: RuntimeException -> L22
        r0.g = 1;     // Catch: RuntimeException -> L22
        r13 = lo7.Q(r17, r6, r0);     // Catch: RuntimeException -> L22
        if (r13 != r2) goto L30;
        return r2;
    L30:
        r14 = this;
    L38:
        e = move-exception;
        r16 = e;
    L7:
        r0 = new e(this, (kc6) r12);
        goto L8
    }

    @Override // com.yandex.passport.api.r
    public final Object c(com.yandex.passport.internal.entities.h r11, ic6 r12) {
        if ((r12 instanceof h) == false) goto L7;
        h r0 = (h) r12;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r13 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r14 = r0.d;
        nzn.U(r13);     // Catch: RuntimeException -> L14
    L23:
        Object r15 = ((mel) r13).a;     // Catch: RuntimeException -> L14
        Throwable r4 = mel.a(r15);     // Catch: RuntimeException -> L14
        if (r4 != null) goto L26;
    L28:
        return r15;
    L26:
        if ((r4 instanceof RuntimeException) == false) goto L28;
        r14.k((RuntimeException) r4);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r16 = e;
    L31:
        r14.k(r16);
        throw r16;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r13);
        n();
        tk7 r17 = n08.a;     // Catch: RuntimeException -> L29
        b0o r5 = new b0o(this.e, new r3(com.yandex.passport.data.network.core.s.a(r11)), new i5e[0], null, 22);     // Catch: RuntimeException -> L29
        r0.d = this;     // Catch: RuntimeException -> L29
        r0.g = 1;     // Catch: RuntimeException -> L29
        r13 = lo7.Q(r17, r5, r0);     // Catch: RuntimeException -> L29
        if (r13 != r2) goto L22;
        return r2;
    L22:
        r14 = this;
    L29:
        e = move-exception;
        r16 = e;
        r14 = this;
    L7:
        r0 = new h(this, (kc6) r12);
        goto L8
    }

    @Override // com.yandex.passport.api.r
    public final Object d(j2 r11, kc6 r12) {
        if ((r12 instanceof g) == false) goto L7;
        g r0 = (g) r12;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r13 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r14 = r0.d;
        nzn.U(r13);     // Catch: RuntimeException -> L14
    L27:
        Object r15 = ((mel) r13).a;     // Catch: RuntimeException -> L14
        Throwable r4 = mel.a(r15);     // Catch: RuntimeException -> L14
        if (r4 != null) goto L30;
    L32:
        return r15;
    L30:
        if ((r4 instanceof RuntimeException) == false) goto L32;
        r14.k((RuntimeException) r4);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r16 = e;
    L41:
        r14.k(r16);
        throw r16;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r13);
        n();
        com.yandex.passport.internal.methods.requester.j r5 = this.e;     // Catch: RuntimeException -> L33
        mqd.z(r11, "passportUid");     // Catch: RuntimeException -> L39
        com.yandex.passport.api.impl.b r6 = com.yandex.passport.api.impl.b.c(r11.q());     // Catch: RuntimeException -> L39
        mqd.y(r6, "from(...)");     // Catch: RuntimeException -> L39
        n3 r7 = new n3(new k2(r6, r11.getValue()));     // Catch: RuntimeException -> L33
        i5e[] r8 = {kvk.a(com.yandex.passport.api.exception.b.class)};     // Catch: RuntimeException -> L36
        tk7 r17 = n08.a;     // Catch: RuntimeException -> L33
        b0o r9 = new b0o(r5, r7, r8, null, 22);     // Catch: RuntimeException -> L33
        r0.d = this;     // Catch: RuntimeException -> L33
        r0.g = 1;     // Catch: RuntimeException -> L33
        r13 = lo7.Q(r17, r9, r0);     // Catch: RuntimeException -> L33
        if (r13 != r2) goto L26;
        return r2;
    L26:
        r14 = this;
    L36:
        e = move-exception;
        RuntimeException r18 = e;
    L38:
        r16 = r18;
    L35:
        r14 = this;
    L39:
        e = move-exception;
        r18 = e;
    L33:
        e = move-exception;
        r16 = e;
    L7:
        r0 = new g(this, r12);
        goto L8
    }

    @Override // com.yandex.passport.api.r
    public final Object e(lib r11, ic6 r12) {
        if ((r12 instanceof i) == false) goto L7;
        i r0 = (i) r12;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r13 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r14 = r0.d;
        nzn.U(r13);     // Catch: RuntimeException -> L14
    L36:
        Object r15 = ((mel) r13).a;     // Catch: RuntimeException -> L14
        Throwable r4 = mel.a(r15);     // Catch: RuntimeException -> L14
        if (r4 != null) goto L39;
    L41:
        return r15;
    L39:
        if ((r4 instanceof RuntimeException) == false) goto L41;
        r14.k((RuntimeException) r4);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r16 = e;
    L58:
        r14.k(r16);
        throw r16;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r13);
        n();
        com.yandex.passport.internal.methods.requester.j r5 = this.e;     // Catch: RuntimeException -> L42
        com.yandex.passport.internal.properties.e r17 = new com.yandex.passport.internal.properties.e();     // Catch: RuntimeException -> L56
        LinkedHashMap r6 = new LinkedHashMap();     // Catch: RuntimeException -> L56
        r11.invoke(r17);     // Catch: RuntimeException -> L42
        k2 r7 = r17.a;     // Catch: RuntimeException -> L54
        if (r7 == null) goto L52;
        k2 r8 = io.sentry.config.a.J(r7);     // Catch: RuntimeException -> L54
        String r9 = r17.b;     // Catch: RuntimeException -> L54
        if (r9 == null) goto L50;
        String r18 = r17.c;     // Catch: RuntimeException -> L54
        if (r18 != null) goto L29;
        mqd.Y("tld");     // Catch: RuntimeException -> L54
        throw null;     // Catch: RuntimeException -> L54
    L29:
        u3 r10 = new u3(new com.yandex.passport.internal.properties.f(r8, r9, r18, r6));     // Catch: RuntimeException -> L42
        i5e[] r19 = {kvk.a(com.yandex.passport.api.exception.b.class), kvk.a(com.yandex.passport.api.exception.a.class), kvk.a(com.yandex.passport.api.exception.t.class)};     // Catch: RuntimeException -> L46
        tk7 r110 = n08.a;     // Catch: RuntimeException -> L42
        b0o r20 = new b0o(r5, r10, r19, null, 22);     // Catch: RuntimeException -> L42
        r0.d = this;     // Catch: RuntimeException -> L42
        r0.g = 1;     // Catch: RuntimeException -> L42
        r13 = lo7.Q(r110, r20, r0);     // Catch: RuntimeException -> L42
        if (r13 != r2) goto L35;
        return r2;
    L35:
        r14 = this;
    L46:
        e = move-exception;
        RuntimeException r111 = e;
    L45:
        r16 = r111;
    L44:
        r14 = this;
        goto L58
    L50:
        mqd.Y("returnUrl");     // Catch: RuntimeException -> L54
        throw null;     // Catch: RuntimeException -> L54
    L52:
        mqd.Y("uid");     // Catch: RuntimeException -> L54
        throw null;     // Catch: RuntimeException -> L54
    L54:
        e = move-exception;
        r111 = e;
    L56:
        e = move-exception;
        r111 = e;
    L42:
        e = move-exception;
        r16 = e;
    L7:
        r0 = new i(this, (kc6) r12);
        goto L8
    }

    @Override // com.yandex.passport.api.r
    public final com.yandex.passport.api.t f() {
        return (p) this.f.getValue();
    }

    @Override // com.yandex.passport.api.r
    public final Object g(k2 r5, kc6 r6) {
        if ((r6 instanceof f) == false) goto L7;
        f r0 = (f) r6;
        int r1 = r0.f;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.f = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.d;
        xe6 r2 = xe6.a;
        int r3 = r0.f;
        if (r3 == 0) goto L15;
        if (r3 != 1) goto L14;
        nzn.U(r7);
        return ((mel) r7).a;
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        nzn.U(r7);
        s r8 = (s) this.i.getValue();
        r0.f = 1;
        Object r9 = r8.h(r5, r0);
        if (r9 != r2) goto L18;
        return r2;
    L18:
        return r9;
    L7:
        r0 = new f(this, r6);
        goto L8
    }

    public final Object h(j2 r11, Uri r12, ic6 r13) {
        if ((r13 instanceof c) == false) goto L7;
        c r0 = (c) r13;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r14 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r15 = r0.d;
        nzn.U(r14);     // Catch: RuntimeException -> L14
    L26:
        Object r16 = ((mel) r14).a;     // Catch: RuntimeException -> L14
        Throwable r17 = mel.a(r16);     // Catch: RuntimeException -> L14
        if (r17 != null) goto L29;
    L31:
        return r16;
    L29:
        if ((r17 instanceof RuntimeException) == false) goto L31;
        r15.k((RuntimeException) r17);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r18 = e;
    L38:
        r15.k(r18);
        throw r18;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r14);
        n();
        com.yandex.passport.internal.methods.requester.j r5 = this.e;     // Catch: RuntimeException -> L32
        com.yandex.passport.internal.methods.z r6 = new com.yandex.passport.internal.methods.z(io.sentry.config.a.J(r11), r12);     // Catch: RuntimeException -> L32
        i5e[] r7 = {kvk.a(com.yandex.passport.api.exception.t.class), kvk.a(com.yandex.passport.api.exception.o.class), kvk.a(com.yandex.passport.api.exception.b.class), kvk.a(com.yandex.passport.api.exception.a.class), kvk.a(com.yandex.passport.api.exception.x.class)};     // Catch: RuntimeException -> L36
        tk7 r19 = n08.a;     // Catch: RuntimeException -> L32
        b0o r4 = new b0o(r5, r6, r7, null, 22);     // Catch: RuntimeException -> L32
        r0.d = this;     // Catch: RuntimeException -> L32
        r0.g = 1;     // Catch: RuntimeException -> L32
        r14 = lo7.Q(r19, r4, r0);     // Catch: RuntimeException -> L32
        if (r14 != r2) goto L25;
        return r2;
    L25:
        r15 = this;
    L36:
        e = move-exception;
        r18 = e;
    L34:
        r15 = this;
    L32:
        e = move-exception;
        r18 = e;
    L7:
        r0 = new c(this, (kc6) r13);
        goto L8
    }

    public final Object i(ic6 r11) {
        if ((r11 instanceof d) == false) goto L7;
        d r0 = (d) r11;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r12 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r4 = r0.d;
        nzn.U(r12);     // Catch: RuntimeException -> L14
    L23:
        Object r13 = ((mel) r12).a;     // Catch: RuntimeException -> L14
        Throwable r5 = mel.a(r13);     // Catch: RuntimeException -> L14
        if (r5 != null) goto L26;
    L28:
        return r13;
    L26:
        if ((r5 instanceof RuntimeException) == false) goto L28;
        r4.k((RuntimeException) r5);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r14 = e;
    L31:
        r4.k(r14);
        throw r14;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r12);
        n();
        com.yandex.passport.internal.methods.requester.j r6 = this.e;     // Catch: RuntimeException -> L29
        k5 r7 = new k5(true);     // Catch: RuntimeException -> L29
        i5e[] r8 = {kvk.a(com.yandex.passport.api.exception.c.class), kvk.a(e0.class)};     // Catch: RuntimeException -> L29
        tk7 r15 = n08.a;     // Catch: RuntimeException -> L29
        b0o r9 = new b0o(r6, r7, r8, null, 22);     // Catch: RuntimeException -> L29
        r0.d = this;     // Catch: RuntimeException -> L29
        r0.g = 1;     // Catch: RuntimeException -> L29
        r12 = lo7.Q(r15, r9, r0);     // Catch: RuntimeException -> L29
        if (r12 != r2) goto L22;
        return r2;
    L22:
        r4 = this;
    L29:
        e = move-exception;
        r14 = e;
        r4 = this;
    L7:
        r0 = new d(this, (kc6) r11);
        goto L8
    }

    public final Object j(j2 r14, kc6 r15) {
        if ((r15 instanceof k) == false) goto L7;
        k r0 = (k) r15;
        int r1 = r0.h;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.h = r1 - Integer.MIN_VALUE;
    L8:
        Object r16 = r0.f;
        xe6 r2 = xe6.a;
        int r3 = r0.h;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r17 = r0.e;
        j2 r4 = r0.d;
        nzn.U(r16);     // Catch: RuntimeException -> L14
    L26:
        Object r18 = ((mel) r16).a;     // Catch: RuntimeException -> L14
        if ((r18 instanceof jel) == false) goto L52;
    L36:
        Throwable r5 = mel.a(r18);     // Catch: RuntimeException -> L14
        if (r5 != null) goto L39;
    L41:
        return r18;
    L39:
        if ((r5 instanceof RuntimeException) == false) goto L41;
        r17.k((RuntimeException) r5);     // Catch: RuntimeException -> L14
        goto L41
    L52:
        com.yandex.passport.internal.entities.b r19 = (com.yandex.passport.internal.entities.b) r18;     // Catch: Throwable -> L33
        if (p0o.b0(r19.a) == true) goto L31;
        String r110 = r19.a;     // Catch: Throwable -> L33
        mqd.z(r110, Constants.KEY_VALUE);     // Catch: Throwable -> L33
        r18 = new com.yandex.passport.api.u(r110);     // Catch: Throwable -> L33
        goto L36
    L31:
        l(r4.getValue(), "getToken");     // Catch: Throwable -> L33
        throw new com.yandex.passport.api.exception.a();     // Catch: Throwable -> L33
    L33:
        th = move-exception;
        r18 = nzn.E(th);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r111 = e;
    L48:
        r17.k(r111);
        throw r111;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r16);
        n();
        com.yandex.passport.internal.methods.requester.j r6 = this.e;     // Catch: RuntimeException -> L42
        n4 r7 = new n4(io.sentry.config.a.J(r14), null);     // Catch: RuntimeException -> L42
        i5e[] r11 = {kvk.a(com.yandex.passport.api.exception.b.class), kvk.a(com.yandex.passport.api.exception.a.class), kvk.a(com.yandex.passport.api.exception.j.class), kvk.a(com.yandex.passport.api.exception.c.class), kvk.a(com.yandex.passport.api.exception.t.class), kvk.a(e0.class)};     // Catch: RuntimeException -> L46
        tk7 r112 = n08.a;     // Catch: RuntimeException -> L42
        b0o r8 = new b0o(r6, r7, r11, null, 22);     // Catch: RuntimeException -> L42
        r0.d = r14;     // Catch: RuntimeException -> L42
        r0.e = this;     // Catch: RuntimeException -> L42
        r0.h = 1;     // Catch: RuntimeException -> L42
        r16 = lo7.Q(r112, r8, r0);     // Catch: RuntimeException -> L42
        if (r16 != r2) goto L25;
        return r2;
    L25:
        r4 = r14;
        r17 = this;
    L46:
        e = move-exception;
        r111 = e;
    L44:
        r17 = this;
    L42:
        e = move-exception;
        r111 = e;
    L7:
        r0 = new k(this, r15);
        goto L8
    }

    public final void k(RuntimeException r3) {
        String r0 = com.yandex.passport.internal.analytics.w.a.b;
        this.b.reportError(r0, r3);
    }

    public final void l(long r3, String r5) {
        HashMap r0 = new HashMap();
        r0.put("method_name", r5);
        r0.put("uid", String.valueOf(r3));
        r0.put("am_version", "7.61.0");
        String r4 = com.yandex.passport.internal.analytics.n.i.b;
        this.b.reportEvent(r4, r0);
    }

    public final Object m(j2 r11, kc6 r12) {
        if ((r12 instanceof l) == false) goto L7;
        l r0 = (l) r12;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r13 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        o r14 = r0.d;
        nzn.U(r13);     // Catch: RuntimeException -> L14
    L32:
        Object r15 = ((mel) r13).a;     // Catch: RuntimeException -> L14
        Throwable r4 = mel.a(r15);     // Catch: RuntimeException -> L14
        if (r4 != null) goto L35;
    L37:
        return r15;
    L35:
        if ((r4 instanceof RuntimeException) == false) goto L37;
        r14.k((RuntimeException) r4);     // Catch: RuntimeException -> L14
    L14:
        e = move-exception;
        RuntimeException r16 = e;
    L40:
        r14.k(r16);
        throw r16;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r13);
        n();
        com.yandex.passport.internal.methods.requester.j r5 = this.e;     // Catch: RuntimeException -> L22
        if (r11 == null) goto L25;
        k2 r17 = io.sentry.config.a.J(r11);     // Catch: RuntimeException -> L22
    L26:
        j5 r6 = new j5(r17);     // Catch: RuntimeException -> L22
        i5e[] r7 = {kvk.a(com.yandex.passport.api.exception.b.class)};     // Catch: RuntimeException -> L38
        tk7 r18 = n08.a;     // Catch: RuntimeException -> L22
        b0o r8 = new b0o(r5, r6, r7, null, 22);     // Catch: RuntimeException -> L22
        r0.d = this;     // Catch: RuntimeException -> L22
        r0.g = 1;     // Catch: RuntimeException -> L22
        r13 = lo7.Q(r18, r8, r0);     // Catch: RuntimeException -> L22
        if (r13 != r2) goto L31;
        return r2;
    L31:
        r14 = this;
    L38:
        e = move-exception;
        r16 = e;
    L24:
        r14 = this;
        goto L40
    L25:
        r17 = null;
    L22:
        e = move-exception;
        r16 = e;
    L7:
        r0 = new l(this, r12);
        goto L8
    }

    public final void n() {
        boolean r0 = InternalProvider.d;
        if (InternalProvider.d == true) goto L5;
        return;
    L5:
        if (this.d == true) goto L9;
        Map<String, Object> r1 = xgf.k0(new ypi[]{new ypi("passport_process_name", wqh.k(new StringBuilder("'"), this.c, '\'')), new ypi("am_version", "7.61.0"), new ypi("error", Log.getStackTraceString(new RuntimeException("This method must not be called from ':passport' process")))});
        this.b.reportEvent(com.yandex.passport.internal.analytics.n.p.b, r1);
        return;
    }

    public final Object o(j2 r5, kc6 r6) {
        if ((r6 instanceof m) == false) goto L7;
        m r0 = (m) r6;
        int r1 = r0.f;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.f = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.d;
        Object r2 = xe6.a;
        int r3 = r0.f;
        if (r3 == 0) goto L15;
        if (r3 != 1) goto L14;
        nzn.U(r7);
        return ((mel) r7).a;
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        nzn.U(r7);
        r0.f = 1;
        Object r8 = m(r5, r0);
        if (r8 != r2) goto L18;
        return r2;
    L18:
        return r8;
    L7:
        r0 = new m(this, r6);
        goto L8
    }
}
