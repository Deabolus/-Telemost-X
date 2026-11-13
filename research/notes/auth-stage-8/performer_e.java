package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import com.yandex.passport.R;
import com.yandex.passport.api.k2;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.network.l4;
import com.yandex.passport.data.network.n8;
import com.yandex.passport.data.network.p7;
import com.yandex.passport.data.network.p8;
import com.yandex.passport.data.network.q4;
import com.yandex.passport.data.network.u7;
import com.yandex.passport.data.network.v7;
import com.yandex.passport.data.network.wa;
import com.yandex.passport.internal.methods.c4;
import com.yandex.passport.internal.methods.e5;
import com.yandex.passport.internal.methods.f4;
import com.yandex.passport.internal.methods.f5;
import com.yandex.passport.internal.methods.f6;
import com.yandex.passport.internal.methods.g5;
import com.yandex.passport.internal.methods.h4;
import com.yandex.passport.internal.methods.j4;
import com.yandex.passport.internal.methods.k3;
import com.yandex.passport.internal.methods.k4;
import com.yandex.passport.internal.methods.k5;
import com.yandex.passport.internal.methods.n3;
import com.yandex.passport.internal.methods.n4;
import com.yandex.passport.internal.methods.n5;
import com.yandex.passport.internal.methods.q5;
import com.yandex.passport.internal.methods.r3;
import com.yandex.passport.internal.methods.s5;
import com.yandex.passport.internal.methods.u5;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.w3;
import com.yandex.passport.internal.methods.x3;
import com.yandex.passport.internal.methods.x4;
import com.yandex.passport.internal.methods.y3;
import com.yandex.passport.internal.report.hg;
import com.yandex.passport.internal.report.w8;
import com.yandex.passport.internal.report.zf;
import com.yandex.passport.internal.usecase.b3;
import com.yandex.passport.internal.usecase.f3;
import com.yandex.passport.internal.usecase.v2;
import com.yandex.passport.internal.usecase.x2;
import defpackage.y8k;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final class e extends lao implements pib {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ e(Object r1, Object r2, ic6 r3, int r4) {
        this.e = r4;
        this.g = r1;
        this.h = r2;
        super(2, r3);
    }

    private final Object A(Object r10) {
        s1 r0 = (s1) this.g;
        f6 r1 = ((k5) this.h).b;
        xe6 r2 = xe6.a;
        int r3 = this.f;
        fcq r4 = fcq.a;
        if (r3 == 0) goto L9;
        if (r3 != 1) goto L8;
        nzn.U(r10);
        return r4;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        nzn.U(r10);
        String r11 = r0.a.getPackageName();
        com.yandex.passport.internal.config.q r5 = r0.c;
        com.yandex.passport.common.core.d r6 = com.yandex.passport.common.core.d.c;
        r5.getClass();
        SharedPreferences r7 = r5.a.a(r6);
        Set<String> r8 = qc9.a;
        if (r7 == null) goto L15;
        Set<String> r9 = r7.getStringSet("vpnManualMode", r8);
        if (r9 == null) goto L15;
        r8 = r9;
    L15:
        if (r8.contains(r11) == true) goto L25;
        if (((Boolean) r1.c).booleanValue() == false) goto L25;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L23;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, "SetVpnChallengeActivityDisabledPerformer", "Not allowed action", 8);
    L23:
        throw new com.yandex.passport.api.exception.c();
    L25:
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L27;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, "SetVpnChallengeActivityDisabledPerformer", "Set vpn blocker disabled, disabled = " + ((Boolean) r1.c).booleanValue(), 8);
    L27:
        com.yandex.passport.internal.usecase.vpn.e r12 = r0.b;
        boolean r13 = ((Boolean) r1.c).booleanValue();
        this.f = 1;
        Object r14 = lo7.Q(((com.yandex.passport.common.coroutine.b) r12.a).c, new tp0(r12, r13, null, 15), this);
        if (r14 == r2) goto L31;
        r14 = r4;
    L31:
        if (r14 != r2) goto L33;
        return r2;
    L33:
        return r4;
    }

    private final Object B(Object r8) {
        n5 r0 = (n5) this.g;
        xe6 r1 = xe6.a;
        int r2 = this.f;
        if (r2 == 0) goto L9;
        if (r2 != 1) goto L8;
        nzn.U(r8);
        return r8;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        nzn.U(r8);
        com.yandex.passport.common.core.k r9 = com.yandex.passport.data.network.core.s.I((k2) r0.b.c);
        x2 r3 = ((u1) this.h).a;
        v2 r4 = new v2(r9, (String) r0.c.c, (String) r0.d.c, "try_add_plus_device");
        this.f = 1;
        Object r10 = r3.a(this, r4);
        if (r10 != r1) goto L12;
        return r1;
    L12:
        return r10;
    }

    private final Object C(Object r10) {
        x1 r0 = (x1) this.h;
        q5 r1 = (q5) this.g;
        xe6 r2 = xe6.a;
        int r3 = this.f;
        if (r3 == 0) goto L8;
        if (r3 != 1) goto L7;
        nzn.U(r10);
    L11:
        Object r11 = ((mel) r10).a;
        if ((r11 instanceof jel) == true) goto L14;
        ((com.yandex.passport.common.url.b) r11).getClass();
        r11 = fcq.a;
    L14:
        Throwable r4 = mel.a(r11);
        if (r4 == null) goto L22;
    L19:
        th = move-exception;
        r11 = nzn.E(th);
        goto L22
    L18:
        throw io.sentry.hints.j.m(r0.b, r4, null, null, null, null, new com.yandex.passport.api.exception.o(String.valueOf(r4.getMessage())), 30);     // Catch: Throwable -> L19
    L22:
        return new mel(r11);
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        nzn.U(r10);
        com.yandex.passport.common.core.k r12 = com.yandex.passport.data.network.core.s.I((k2) r1.b.c);
        f3 r5 = r0.a;
        com.yandex.passport.common.url.a r6 = com.yandex.passport.common.url.b.Companion;
        Uri r7 = (Uri) r1.c.c;
        r6.getClass();
        b3 r8 = new b3(r12, com.yandex.passport.common.url.a.a(r7));
        this.f = 1;
        r10 = r5.a(this, r8);
        if (r10 != r2) goto L11;
        return r2;
    }

    private final Object D(Object r10) {
        f6 r0 = ((s5) this.h).b;
        y1 r1 = (y1) this.g;
        xe6 r2 = xe6.a;
        int r3 = this.f;
        if (r3 == 0) goto L8;
        if (r3 != 1) goto L7;
        nzn.U(r10);
    L27:
        return fcq.a;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        nzn.U(r10);
        com.yandex.passport.internal.properties.z r11 = r1.a;
        com.yandex.passport.internal.properties.i0 r4 = (com.yandex.passport.internal.properties.i0) r0.c;
        qrn r5 = r11.e;
        mqd.z(r4, "properties");
        com.yandex.passport.internal.network.p r6 = r4.a;
        if (r6 == null) goto L11;
        qrn r8 = r11.a;
        r8.getClass();
        r8.o(null, r6);
    L11:
        Map r7 = r4.b;
        if (r7 == null) goto L14;
        qrn r12 = r11.c;
        r12.getClass();
        r12.o(null, r7);
    L14:
        List r13 = r4.c;
        if (r13 != null) goto L17;
        r13 = ((com.yandex.passport.internal.properties.k0) r5.getValue()).a;
    L17:
        List r9 = r4.d;
        if (r9 != null) goto L20;
        r9 = ((com.yandex.passport.internal.properties.k0) r5.getValue()).b;
    L20:
        Map r14 = r4.e;
        if (r14 != null) goto L23;
        r14 = ((com.yandex.passport.internal.properties.k0) r5.getValue()).c;
    L23:
        com.yandex.passport.internal.properties.k0 r15 = new com.yandex.passport.internal.properties.k0(r13, r9, r14);
        r5.getClass();
        r5.o(null, r15);
        com.yandex.passport.internal.usecase.n1 r16 = r1.b;
        com.yandex.passport.internal.properties.i0 r17 = (com.yandex.passport.internal.properties.i0) r0.c;
        this.f = 1;
        if (r16.a(this, r17) != r2) goto L27;
        return r2;
    }

    private final Object E(Object r7) {
        xe6 r0 = xe6.a;
        int r1 = this.f;
        if (r1 == 0) goto L9;
        if (r1 == 1) goto L6;
        if (r1 == 2) goto L6;
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L6:
        nzn.U(r7);
        Object r8 = ((mel) r7).a;
    L35:
        u5 r2 = (u5) this.h;
        if ((r8 instanceof jel) == true) goto L42;
        r8 = r2.d((Bundle) r8);     // Catch: Throwable -> L39
        nzn.U(r8);     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        r8 = nzn.E(th);
    L42:
        return new mel(r8);
    L9:
        nzn.U(r7);
        com.yandex.passport.internal.methods.requester.j r9 = (com.yandex.passport.internal.methods.requester.j) this.g;
        u5 r3 = (u5) this.h;
        xeo r4 = com.yandex.passport.internal.methods.requester.j.g;
        if ((r3 instanceof n4) == false) goto L12;
    L13:
        Boolean r5 = r9.f;
        if (r5 == null) goto L16;
        boolean r10 = r5.booleanValue();
    L28:
        if (r10 == false) goto L32;
        com.yandex.passport.internal.methods.requester.j r11 = (com.yandex.passport.internal.methods.requester.j) this.g;
        u5 r6 = (u5) this.h;
        v5 r12 = r6.a;
        Bundle r13 = r6.a();
        this.f = 1;
        r8 = com.yandex.passport.internal.methods.requester.j.b(r11, r12, r13, this);
        if (r8 != r0) goto L35;
    L34:
        return r0;
    L32:
        com.yandex.passport.internal.methods.requester.j r14 = (com.yandex.passport.internal.methods.requester.j) this.g;
        u5 r15 = (u5) this.h;
        v5 r16 = r15.a;
        Bundle r17 = r15.a();
        this.f = 2;
        r8 = com.yandex.passport.internal.methods.requester.j.a(r14, r16, r17, this);
        if (r8 != r0) goto L35;
    L16:
        w3 r18 = new w3(com.yandex.passport.internal.methods.t.a);
        r89 r19 = r9.e(v5.x1, r18.a());
        if ((r19 instanceof r89) == false) goto L20;
        Bundle r20 = (Bundle) r19.a;
    L22:
        if (r20 == null) goto L27;
        Object r21 = r18.d(r20);
        Boolean r22 = Boolean.FALSE;
        if ((r21 instanceof jel) == false) goto L26;
        r21 = r22;
    L26:
        Boolean r23 = (Boolean) r21;
        r23.getClass();
        r9.f = r23;
        r10 = r23.booleanValue();
        goto L28
    L27:
        r10 = true;
        goto L28
    L20:
        if ((r19 instanceof s89) == false) goto L44;
        Throwable r24 = (Throwable) ((s89) r19).a;
        r20 = null;
        goto L22
    L44:
        throw new mnh();
    L12:
        if ((r3 instanceof n3) == false) goto L32;
        goto L13
    }

    private final Object F(Object r4) {
        xe6 r0 = xe6.a;
        int r1 = this.f;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        nzn.U(r4);
    L11:
        Object r5 = ((mel) r4).a;
        nzn.U(r5);
        return r5;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        nzn.U(r4);
        com.yandex.passport.data.network.core.b r6 = (com.yandex.passport.data.network.core.b) this.g;
        wa r2 = (wa) this.h;
        this.f = 1;
        r4 = r6.a(this, r2);
        if (r4 != r0) goto L11;
        return r0;
    }

    private final Object v(Object r8) {
        com.yandex.passport.common.core.k r0 = (com.yandex.passport.common.core.k) this.h;
        a1 r1 = (a1) this.g;
        xe6 r3 = xe6.a;
        int r4 = this.f;
        if (r4 == 0) goto L13;
        if (r4 == 1) goto L12;
        if (r4 != 2) goto L11;
        nzn.U(r8);     // Catch: Throwable -> L8
    L45:
        r8 = ((mel) r8).a;     // Catch: Throwable -> L8
        nzn.U(r8);     // Catch: Throwable -> L8
    L50:
        return new mel(r8);
    L11:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L12:
        nzn.U(r8);
    L52:
    L29:
        th = move-exception;
        r8 = nzn.E(th);
    L39:
        if ((r8 instanceof jel) == true) goto L50;
        if ((((com.yandex.passport.internal.usecase.l0) r8) instanceof com.yandex.passport.internal.usecase.k0) == false) goto L47;
        com.yandex.passport.internal.usecase.s1 r9 = r1.b;     // Catch: Throwable -> L8
        this.f = 2;     // Catch: Throwable -> L8
        r8 = r9.a(this, r0);     // Catch: Throwable -> L8
        if (r8 != r3) goto L45;
    L44:
        return r3;
    L47:
        throw new com.yandex.passport.api.exception.f();     // Catch: Throwable -> L8
    L17:
        if ((r8 instanceof com.yandex.passport.internal.usecase.l0) == true) goto L39;
        if ((r8 instanceof mel) == false) goto L32;
        Object r5 = ((mel) r8).a;     // Catch: Throwable -> L29
        nzn.U(r5);     // Catch: Throwable -> L29
        if ((r5 instanceof com.yandex.passport.internal.usecase.l0) == true) goto L24;
        r5 = null;
    L24:
        com.yandex.passport.internal.usecase.l0 r6 = (com.yandex.passport.internal.usecase.l0) r5;     // Catch: Throwable -> L29
        if (r6 == null) goto L28;
        r8 = r6;
        goto L39
    L28:
        throw new ClassCastException("Can't cast " + mel.b(((mel) r8).a) + " to " + kvk.a(com.yandex.passport.internal.usecase.l0.class));     // Catch: Throwable -> L29
    L32:
        if ((r8 instanceof Throwable) == true) goto L34;
        Field r2 = r8.getClass().getDeclaredField(Constants.KEY_EXCEPTION);     // Catch: Throwable -> L29
        r2.setAccessible(true);     // Catch: Throwable -> L29
        Object r10 = r2.get(r8);     // Catch: Throwable -> L29
        mqd.x(r10, "null cannot be cast to non-null type kotlin.Throwable");     // Catch: Throwable -> L29
        throw ((Throwable) r10);     // Catch: Throwable -> L29
    L34:
        throw ((Throwable) r8);     // Catch: Throwable -> L29
    L13:
        nzn.U(r8);
        com.yandex.passport.internal.usecase.n0 r11 = r1.a;
        this.f = 1;
        r8 = r11.a(this, r0);
        if (r8 != r3) goto L52;
    L8:
        th = move-exception;
        r8 = nzn.E(th);
        goto L50
    }

    private final Object w(Object r4) {
        xe6 r0 = xe6.a;
        int r1 = this.f;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        nzn.U(r4);
    L12:
        return new mel(zhp.L(fcq.a));
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        nzn.U(r4);
        com.yandex.passport.common.core.k r5 = com.yandex.passport.data.network.core.s.I((k2) ((x4) this.g).b.c);
        com.yandex.passport.internal.upgrader.e r2 = ((f1) this.h).a;
        this.f = 1;
        if (r2.a(this, r5) != r0) goto L12;
        return r0;
    }

    private final Object x(Object r12) {
        m1 r0 = (m1) this.h;
        fcq r1 = xe6.a;
        int r2 = this.f;
        fcq r3 = fcq.a;
        if (r2 == 0) goto L15;
        if (r2 != 1) goto L14;
        nzn.U(r12);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L29
    L23:
        return r3;
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        nzn.U(r12);
        com.yandex.passport.common.core.k r13 = com.yandex.passport.data.network.core.s.I((k2) ((f5) this.g).b.c);
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L18;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "RemoveAccountExplicitlyPerformer started", 8);
    L18:
        com.yandex.passport.common.core.g r4 = r0.b.b(false).e(r13);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L29
        if (r4 == null) goto L25;
        com.yandex.passport.internal.core.accounts.x r14 = r0.a;     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L29
        com.yandex.passport.internal.core.accounts.w r5 = new com.yandex.passport.internal.core.accounts.w(new com.yandex.passport.internal.core.accounts.u(r4), true, true, com.yandex.passport.internal.report.reporters.b1.b, true);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L29
        this.f = 1;     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L29
        r14.a(r5);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L29
        if (r3 != r1) goto L23;
        return r1;
    L25:
        throw new com.yandex.passport.api.exception.b(r13);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L29
    L9:
        e = move-exception;
        throw e;
    L11:
        e = move-exception;
        throw e;
    L7:
        e = move-exception;
        throw new com.yandex.passport.api.exception.e0(e);
    L30:
        throw new com.yandex.passport.api.exception.e0("timeout while waiting for account removal");
    }

    private final Object y(Object r12) {
        n1 r0 = (n1) this.h;
        fcq r1 = xe6.a;
        int r2 = this.f;
        fcq r3 = fcq.a;
        if (r2 == 0) goto L15;
        if (r2 != 1) goto L14;
        nzn.U(r12);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L41
    L35:
        return r3;
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        nzn.U(r12);
        com.yandex.passport.common.core.k r13 = com.yandex.passport.data.network.core.s.I((k2) ((e5) this.g).b.c);
        Context r4 = r0.a;
        String r5 = r4.getPackageName();
        int r7 = 0;
    L17:
        if (r7 >= 3) goto L22;
        String r8 = n1.e[r7];
        mqd.u(r5);
        if (w0o.G(r5, r8, false) == true) goto L20;
        r7 = r7 + 1;
        goto L17
    L20:
        boolean r6 = true;
    L23:
        if (r6 == true) goto L25;
        r6 = r4.getResources().getBoolean(R.bool.passport_accounts_remove_allowed);
    L25:
        com.yandex.passport.internal.analytics.p0 r9 = r0.b;
        r9.getClass();
        Map r10 = new mt0(0);
        r10.put("allowed", String.valueOf(r6));
        r9.a.b(com.yandex.passport.internal.analytics.p.g, r10);
        if (r6 == false) goto L45;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L30;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "RemoveAccountPerformer started", 8);
    L30:
        com.yandex.passport.common.core.g r11 = r0.d.b(false).e(r13);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L41
        if (r11 == null) goto L37;
        com.yandex.passport.internal.core.accounts.x r14 = r0.c;     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L41
        com.yandex.passport.internal.core.accounts.w r15 = new com.yandex.passport.internal.core.accounts.w(new com.yandex.passport.internal.core.accounts.u(r11), true, true, com.yandex.passport.internal.report.reporters.b1.a, false);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L41
        this.f = 1;     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L41
        r14.a(r15);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L41
        if (r3 != r1) goto L35;
        return r1;
    L37:
        throw new com.yandex.passport.api.exception.b(r13);     // Catch: Exception -> L7 com.yandex.passport.api.exception.b -> L9 CancellationException -> L11 InterruptedException -> L41
    L45:
        throw new com.yandex.passport.api.exception.e0("Unauthorized attempt to remove account.");
    L22:
        r6 = false;
    L9:
        e = move-exception;
        throw e;
    L11:
        e = move-exception;
        throw e;
    L7:
        e = move-exception;
        throw new com.yandex.passport.api.exception.e0(e);
    L42:
        throw new com.yandex.passport.api.exception.e0("timeout while waiting for account removal");
    }

    private final Object z(Object r13) {
        o1 r0 = (o1) this.h;
        g5 r1 = (g5) this.g;
        f6 r2 = r1.c;
        xe6 r3 = xe6.a;
        int r4 = this.f;
        if (r4 == 0) goto L8;
        if (r4 != 1) goto L7;
        nzn.U(r13);
        Object r14 = ((mel) r13).a;
    L11:
        Throwable r5 = mel.a(r14);
        if (r5 == null) goto L26;
    L20:
        th = move-exception;
        r14 = nzn.E(th);
        goto L26
    L15:
        if ((r5 instanceof com.yandex.passport.data.exceptions.c) == false) goto L23;
        if (((com.yandex.passport.data.exceptions.c) r5).a != BackendError.NUMBER_FOR_PICTURE_CHALLENGE_NEEDED) goto L23;
        throw new com.yandex.passport.api.exception.f(com.yandex.passport.api.exception.g.b);     // Catch: Throwable -> L20
    L23:
        throw io.sentry.hints.j.m(r0.b, r5, (String) r2.c, new com.yandex.passport.api.exception.t(r5), null, null, null, 56);     // Catch: Throwable -> L20
    L26:
        return new mel(r14);
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        nzn.U(r13);
        com.yandex.passport.common.core.k r7 = com.yandex.passport.data.network.core.s.I((k2) r1.b.c);
        com.yandex.passport.internal.helper.f r6 = r0.a;
        String r8 = (String) r2.c;
        String r9 = (String) r1.d.c;
        String r10 = (String) r1.e.c;
        this.f = 1;
        r14 = r6.b(r7, r8, r9, r10, this);
        if (r14 != r3) goto L11;
        return r3;
    }

    public final Object invoke(Object r2, Object r3) {
        ue6 r4 = (ue6) r2;
        ic6 r5 = (ic6) r3;
        switch(this.e) {
            case 0: goto L63;
            case 1: goto L61;
            case 2: goto L59;
            case 3: goto L57;
            case 4: goto L55;
            case 5: goto L53;
            case 6: goto L51;
            case 7: goto L49;
            case 8: goto L47;
            case 9: goto L45;
            case 10: goto L43;
            case 11: goto L41;
            case 12: goto L39;
            case 13: goto L37;
            case 14: goto L35;
            case 15: goto L33;
            case 16: goto L31;
            case 17: goto L29;
            case 18: goto L27;
            case 19: goto L25;
            case 20: goto L23;
            case 21: goto L21;
            case 22: goto L19;
            case 23: goto L17;
            case 24: goto L15;
            case 25: goto L13;
            case 26: goto L11;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L5;
        };
    L5:
        return q(r5, r4).t(fcq.a);
    L7:
        return q(r5, r4).t(fcq.a);
    L9:
        return q(r5, r4).t(fcq.a);
    L11:
        return q(r5, r4).t(fcq.a);
    L13:
        return q(r5, r4).t(fcq.a);
    L15:
        return q(r5, r4).t(fcq.a);
    L17:
        return q(r5, r4).t(fcq.a);
    L19:
        return q(r5, r4).t(fcq.a);
    L21:
        return q(r5, r4).t(fcq.a);
    L23:
        return q(r5, r4).t(fcq.a);
    L25:
        return q(r5, r4).t(fcq.a);
    L27:
        return q(r5, r4).t(fcq.a);
    L29:
        return q(r5, r4).t(fcq.a);
    L31:
        return q(r5, r4).t(fcq.a);
    L33:
        return q(r5, r4).t(fcq.a);
    L35:
        return q(r5, r4).t(fcq.a);
    L37:
        return q(r5, r4).t(fcq.a);
    L39:
        return q(r5, r4).t(fcq.a);
    L41:
        return q(r5, r4).t(fcq.a);
    L43:
        return q(r5, r4).t(fcq.a);
    L45:
        return q(r5, r4).t(fcq.a);
    L47:
        return q(r5, r4).t(fcq.a);
    L49:
        return q(r5, r4).t(fcq.a);
    L51:
        return q(r5, r4).t(fcq.a);
    L53:
        return q(r5, r4).t(fcq.a);
    L55:
        return q(r5, r4).t(fcq.a);
    L57:
        return q(r5, r4).t(fcq.a);
    L59:
        return q(r5, r4).t(fcq.a);
    L61:
        return q(r5, r4).t(fcq.a);
    L63:
        return q(r5, r4).t(fcq.a);
    }

    public final ic6 q(ic6 r4, Object r5) {
        switch(this.e) {
            case 0: goto L63;
            case 1: goto L61;
            case 2: goto L59;
            case 3: goto L57;
            case 4: goto L55;
            case 5: goto L53;
            case 6: goto L51;
            case 7: goto L49;
            case 8: goto L47;
            case 9: goto L45;
            case 10: goto L43;
            case 11: goto L41;
            case 12: goto L39;
            case 13: goto L37;
            case 14: goto L35;
            case 15: goto L33;
            case 16: goto L31;
            case 17: goto L29;
            case 18: goto L27;
            case 19: goto L25;
            case 20: goto L23;
            case 21: goto L21;
            case 22: goto L19;
            case 23: goto L17;
            case 24: goto L15;
            case 25: goto L13;
            case 26: goto L11;
            case 27: goto L9;
            case 28: goto L7;
            default: goto L5;
        };
    L5:
        return new e((Message) this.g, (Messenger) this.h, r4, 29);
    L7:
        return new e((com.yandex.passport.data.network.core.b) this.g, (wa) this.h, r4, 28);
    L9:
        return new e((com.yandex.passport.common.domain.a) this.g, this.h, r4, 27);
    L11:
        return new e((com.yandex.passport.internal.methods.requester.j) this.g, (u5) this.h, r4, 26);
    L13:
        return new e((y1) this.g, (s5) this.h, r4, 25);
    L15:
        return new e((q5) this.g, (x1) this.h, r4, 24);
    L17:
        return new e((n5) this.g, (u1) this.h, r4, 23);
    L19:
        return new e((s1) this.g, (k5) this.h, r4, 22);
    L21:
        return new e((g5) this.g, (o1) this.h, r4, 21);
    L23:
        return new e((e5) this.g, (n1) this.h, r4, 20);
    L25:
        return new e((f5) this.g, (m1) this.h, r4, 19);
    L27:
        return new e((x4) this.g, (f1) this.h, r4, 18);
    L29:
        return new e((a1) this.g, (com.yandex.passport.common.core.k) this.h, r4, 17);
    L31:
        return new e((z0) this.g, (com.yandex.passport.common.core.k) this.h, r4, 16);
    L33:
        return new e((k4) this.g, (o0) this.h, r4, 15);
    L35:
        return new e((j4) this.g, (n0) this.h, r4, 14);
    L37:
        return new e((l0) this.g, (h4) this.h, r4, 13);
    L39:
        return new e((f4) this.g, (j0) this.h, r4, 12);
    L41:
        return new e((g0) this.g, (c4) this.h, r4, 11);
    L43:
        return new e((d0) this.g, (y3) this.h, r4, 10);
    L45:
        return new e((x3) this.g, (c0) this.h, r4, 9);
    L47:
        return new e((w) this.g, (r3) this.h, r4, 8);
    L49:
        return new e((k3) this.g, (r) this.h, r4, 7);
    L51:
        return new e((com.yandex.passport.internal.methods.j0) this.g, (m) this.h, r4, 6);
    L53:
        return new e((l) this.g, (com.yandex.passport.internal.methods.i0) this.h, r4, 5);
    L55:
        return new e((j) this.g, (com.yandex.passport.internal.methods.h0) this.h, r4, 4);
    L57:
        return new e((com.yandex.passport.internal.methods.f0) this.g, (i) this.h, r4, 3);
    L59:
        return new e((h) this.g, (com.yandex.passport.internal.methods.e0) this.h, r4, 2);
    L61:
        return new e((g) this.g, (com.yandex.passport.internal.methods.d0) this.h, r4, 1);
    L63:
        return new e((com.yandex.passport.internal.methods.c0) this.g, (f) this.h, r4, 0);
    }

    public final Object t(Object r18) {
        int r0 = this.e;
        String r4 = "";
        Object r5 = this.h;
        Object r6 = this.g;
        switch(r0) {
            case 0: goto L384;
            case 1: goto L363;
            case 2: goto L342;
            case 3: goto L311;
            case 4: goto L286;
            case 5: goto L264;
            case 6: goto L250;
            case 7: goto L228;
            case 8: goto L214;
            case 9: goto L203;
            case 10: goto L189;
            case 11: goto L166;
            case 12: goto L149;
            case 13: goto L127;
            case 14: goto L116;
            case 15: goto L102;
            case 16: goto L83;
            case 17: goto L82;
            case 18: goto L80;
            case 19: goto L78;
            case 20: goto L76;
            case 21: goto L74;
            case 22: goto L72;
            case 23: goto L70;
            case 24: goto L68;
            case 25: goto L66;
            case 26: goto L64;
            case 27: goto L52;
            case 28: goto L51;
            default: goto L4;
        };
    L4:
        xe6 r1 = xe6.a;
        int r9 = this.f;
        fcq r10 = fcq.a;
        if (r9 == 0) goto L16;
        if (r9 == 1) goto L14;
        if (r9 != 2) goto L13;
        nzn.U(r18);     // Catch: RemoteException -> L10
        Object r2 = r18;
    L39:
        Message r3 = (Message) r2;     // Catch: RemoteException -> L10
    L40:
        ((Messenger) r5).send(r3);     // Catch: RemoteException -> L10
    L452:
        return r10;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        nzn.U(r18);     // Catch: RemoteException -> L10
        Object r7 = r18;
    L33:
        r3 = (Message) r7;     // Catch: RemoteException -> L10
        goto L40
    L16:
        nzn.U(r18);
        com.yandex.passport.internal.autologin.ui.e r8 = com.yandex.passport.internal.provider.communication.c.d;     // Catch: RemoteException -> L10
        if (r8 == null) goto L452;
        Object r11 = ((Message) r6).obj;     // Catch: RemoteException -> L10
        if ((r11 instanceof Bundle) == false) goto L23;
        Bundle r12 = (Bundle) r11;     // Catch: RemoteException -> L10
    L24:
        if (r12 == null) goto L452;
        r12.setClassLoader(com.yandex.passport.internal.util.o.class.getClassLoader());     // Catch: RemoteException -> L10
        Parcelable r13 = r12.getParcelable("IPCCommand");     // Catch: RemoteException -> L10
        if (r13 == null) goto L45;
        com.yandex.passport.internal.provider.communication.l r14 = (com.yandex.passport.internal.provider.communication.l) r13;     // Catch: RemoteException -> L10
        if ((r14 instanceof com.yandex.passport.internal.provider.communication.j) == false) goto L35;
        com.yandex.passport.internal.provider.communication.e r15 = (com.yandex.passport.internal.provider.communication.e) ((y8k) r8.c).get();     // Catch: RemoteException -> L10
        this.f = 1;     // Catch: RemoteException -> L10
        r15.getClass();     // Catch: RemoteException -> L10
        r7 = com.yandex.passport.internal.provider.communication.r.b(r15, (com.yandex.passport.internal.provider.communication.j) r14, this);     // Catch: RemoteException -> L10
        if (r7 != r1) goto L33;
        return r1;
    L35:
        if ((r14 instanceof com.yandex.passport.internal.provider.communication.k) == false) goto L43;
        com.yandex.passport.internal.provider.communication.i r16 = (com.yandex.passport.internal.provider.communication.i) ((y8k) r8.d).get();     // Catch: RemoteException -> L10
        this.f = 2;     // Catch: RemoteException -> L10
        r16.getClass();     // Catch: RemoteException -> L10
        r2 = com.yandex.passport.internal.provider.communication.r.b(r16, (com.yandex.passport.internal.provider.communication.k) r14, this);     // Catch: RemoteException -> L10
        if (r2 != r1) goto L39;
        return r1;
    L43:
        throw new mnh();     // Catch: RemoteException -> L10
    L45:
        throw new IllegalStateException("can't get required parcelable IPCCommand");     // Catch: RemoteException -> L10
    L23:
        r12 = null;
    L10:
        e = move-exception;
        com.yandex.passport.common.logger.d r17 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L452;
        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "", e);
        goto L452
    L52:
        xe6 r19 = xe6.a;
        int r20 = this.f;
        if (r20 == 0) goto L58;
        if (r20 != 1) goto L57;
        nzn.U(r18);
        Object r21 = r18;
    L61:
        Object r22 = ((mel) r21).a;
        nzn.U(r22);
        return r22;
    L57:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L58:
        nzn.U(r18);
        this.f = 1;
        r21 = ((com.yandex.passport.common.domain.a) r6).a(this, r5);
        if (r21 != r19) goto L61;
        return r19;
    L83:
        z0 r23 = (z0) r6;
        com.yandex.passport.common.core.k r24 = (com.yandex.passport.common.core.k) r5;
        xe6 r25 = xe6.a;
        int r26 = this.f;
        if (r26 == 0) goto L89;
        if (r26 != 1) goto L88;
        nzn.U(r18);
        Object r27 = r18;
    L97:
        return new mel(zhp.L(r27));
    L88:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L89:
        nzn.U(r18);
        com.yandex.passport.common.core.g r28 = r23.a.a().e(r24);
        if (r28 == null) goto L101;
        String r29 = r28.e.a;
        if (r29 == null) goto L98;
        com.yandex.passport.data.network.core.t r30 = r23.b;
        this.f = 1;
        r27 = ((com.yandex.passport.internal.network.n) r30).c(r29, this);
        if (r27 != r25) goto L97;
        return r25;
    L98:
        com.yandex.passport.api.exception.a r31 = new com.yandex.passport.api.exception.a("Account " + r24 + " does not have a master token right now, it is possible the account was signed out.");
        r24.a.getClass();
        throw r31;
    L101:
        throw new com.yandex.passport.api.exception.b(r24);
    L102:
        k4 r32 = (k4) r6;
        com.yandex.passport.internal.methods.b r33 = r32.b;
        Object r34 = xe6.a;
        int r35 = this.f;
        if (r35 == 0) goto L108;
        if (r35 != 1) goto L107;
        nzn.U(r18);
        Object r36 = r18;
    L111:
        r34 = ((mel) r36).a;
        if ((r34 instanceof jel) == true) goto L114;
        u7 r37 = (u7) r34;
        r34 = new com.yandex.passport.internal.link_auth.e((com.yandex.passport.api.impl.b) r33.c, r37.b, r37.c, r37.d, r37.e, r37.f, r37.g);
    L114:
        nzn.U(r34);
    L115:
        return r34;
    L107:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L108:
        nzn.U(r18);
        com.yandex.passport.common.core.d r38 = com.yandex.passport.data.network.core.s.t((com.yandex.passport.api.impl.b) r33.c);
        o0 r39 = (o0) r5;
        v7 r40 = r39.a;
        r39.d.getClass();
        p7 r41 = new p7(com.yandex.passport.internal.network.mappers.b.a(r38), (String) r32.c.c);
        this.f = 1;
        r36 = r40.a(this, r41);
        if (r36 != r34) goto L111;
    L116:
        xe6 r42 = xe6.a;
        int r43 = this.f;
        if (r43 == 0) goto L122;
        if (r43 != 1) goto L121;
        nzn.U(r18);
        return r18;
    L121:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L122:
        nzn.U(r18);
        com.yandex.passport.internal.push.g0 r44 = (com.yandex.passport.internal.push.g0) ((j4) r6).b.c;
        long r45 = r44.f;
        String r46 = r44.p;
        com.yandex.passport.internal.usecase.g1 r47 = ((n0) r5).a;
        com.yandex.passport.internal.usecase.f1 r48 = new com.yandex.passport.internal.usecase.f1(r45, r46, r44.g);
        this.f = 1;
        Object r49 = r47.a(this, r48);
        if (r49 != r42) goto L126;
        return r42;
    L126:
        return r49;
    L127:
        h4 r50 = (h4) r5;
        f6 r51 = r50.c;
        l0 r52 = (l0) r6;
        xe6 r53 = xe6.a;
        int r54 = this.f;
        if (r54 == 0) goto L133;
        if (r54 != 1) goto L132;
        nzn.U(r18);
        Object r55 = r18;
    L136:
        Object r56 = ((mel) r55).a;
        Throwable r57 = mel.a(r56);
        if (r57 == null) goto L148;
        io.sentry.hints.j r58 = r52.b;     // Catch: Throwable -> L145
        String r59 = ((com.yandex.passport.internal.entities.q) r51.c).a;     // Catch: Throwable -> L145
        String r60 = r57.getMessage();     // Catch: Throwable -> L145
        if (r60 == null) goto L144;
        r4 = r60;
    L144:
        throw io.sentry.hints.j.m(r58, r57, r59, null, null, null, new com.yandex.passport.api.exception.o(r4), 28);     // Catch: Throwable -> L145
    L145:
        th = move-exception;
        r56 = nzn.E(th);
    L148:
        return new mel(r56);
    L132:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L133:
        nzn.U(r18);
        com.yandex.passport.internal.usecase.g1 r61 = r52.a;
        com.yandex.passport.internal.usecase.f1 r62 = new com.yandex.passport.internal.usecase.f1(((k2) r50.b.c).b, ((com.yandex.passport.internal.entities.q) r51.c).a, null);
        this.f = 1;
        r55 = r61.a(this, r62);
        if (r55 != r53) goto L136;
        return r53;
    L149:
        xe6 r63 = xe6.a;
        int r64 = this.f;
        if (r64 == 0) goto L155;
        if (r64 != 1) goto L154;
        nzn.U(r18);
        Object r65 = r18;
    L158:
        Object r66 = ((mel) r65).a;
        if ((r66 instanceof jel) == true) goto L165;
        r66 = String.valueOf(((Number) r66).longValue());     // Catch: Throwable -> L162
    L162:
        th = move-exception;
        r66 = nzn.E(th);
    L165:
        return new mel(r66);
    L154:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L155:
        nzn.U(r18);
        com.yandex.passport.common.core.k r67 = com.yandex.passport.data.network.core.s.I((k2) ((f4) r6).b.c);
        com.yandex.passport.internal.usecase.a1 r68 = ((j0) r5).a;
        this.f = 1;
        r65 = r68.a(this, r67);
        if (r65 != r63) goto L158;
        return r63;
    L166:
        c4 r69 = (c4) r5;
        g0 r70 = (g0) r6;
        xe6 r71 = xe6.a;
        int r72 = this.f;
        if (r72 == 0) goto L172;
        if (r72 != 1) goto L171;
        nzn.U(r18);
        Object r73 = ((mel) r18).a;
    L176:
        Throwable r74 = mel.a(r73);
        if (r74 == null) goto L188;
        io.sentry.hints.j r75 = r70.b;     // Catch: Throwable -> L185
        String r76 = r74.getLocalizedMessage();     // Catch: Throwable -> L185
        if (r76 == null) goto L184;
        r4 = r76;
    L184:
        throw io.sentry.hints.j.m(r75, r74, null, new com.yandex.passport.api.exception.o(r4), null, null, null, 58);     // Catch: Throwable -> L185
    L185:
        th = move-exception;
        r73 = nzn.E(th);
    L188:
        return new mel(r73);
    L171:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L172:
        nzn.U(r18);
        com.yandex.passport.internal.helper.f r77 = r70.a;
        com.yandex.passport.common.core.d r78 = com.yandex.passport.data.network.core.s.t((com.yandex.passport.api.impl.b) r69.b.c);
        String r79 = (String) r69.c.c;
        boolean r80 = ((Boolean) r69.d.c).booleanValue();
        this.f = 1;
        Object r81 = r77.a(r78, r79, r80, this);
        if (r81 == r71) goto L459;
        r73 = r81;
        goto L176
    L459:
        return r71;
    L189:
        d0 r82 = (d0) r6;
        com.yandex.passport.internal.methods.b r83 = ((y3) r5).b;
        xe6 r84 = xe6.a;
        int r85 = this.f;
        if (r85 == 0) goto L195;
        if (r85 != 1) goto L194;
        nzn.U(r18);
        return r18;
    L194:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L195:
        nzn.U(r18);
        com.yandex.passport.internal.credentials.e r86 = r82.c.a(((com.yandex.passport.internal.entities.e) r83.c).a);
        String r110 = ((com.yandex.passport.internal.entities.e) r83.c).b();
        if (r110 == null) goto L202;
        q4 r87 = r82.a;
        com.yandex.passport.internal.network.mappers.b r88 = r82.d;
        com.yandex.passport.common.core.d r89 = com.yandex.passport.data.network.core.s.t(((com.yandex.passport.internal.entities.e) r83.c).a);
        r88.getClass();
        l4 r90 = new l4(com.yandex.passport.internal.network.mappers.b.a(r89), r110, ((com.yandex.passport.internal.entities.e) r83.c).a(), r86.c, r86.d);
        this.f = 1;
        Object r91 = r87.a(this, r90);
        if (r91 == r84) goto L200;
        return r91;
    L200:
        return r84;
    L202:
        throw new IllegalStateException("Required value was null.");
    L203:
        x3 r92 = (x3) r6;
        xe6 r93 = xe6.a;
        int r94 = this.f;
        if (r94 == 0) goto L209;
        if (r94 != 1) goto L208;
        nzn.U(r18);
        return r18;
    L208:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L209:
        nzn.U(r18);
        com.yandex.passport.common.core.k r95 = com.yandex.passport.data.network.core.s.I((k2) r92.b.c);
        com.yandex.passport.common.core.k r96 = com.yandex.passport.data.network.core.s.I((k2) r92.c.c);
        com.yandex.passport.internal.usecase.q0 r97 = ((c0) r5).a;
        com.yandex.passport.internal.usecase.o0 r98 = new com.yandex.passport.internal.usecase.o0(r95, r96, (com.yandex.passport.internal.credentials.d) r92.d.c);
        this.f = 1;
        Object r99 = r97.a(this, r98);
        if (r99 != r93) goto L213;
        return r93;
    L213:
        return r99;
    L214:
        ArrayList r100 = xe6.a;
        int r101 = this.f;
        if (r101 == 0) goto L220;
        if (r101 != 1) goto L219;
        nzn.U(r18);
        Object r102 = r18;
    L223:
        Iterable r103 = (Iterable) r102;
        r100 = new ArrayList(ac5.Y(r103, 10));
        Iterator r104 = r103.iterator();
    L225:
        if (r104.hasNext() == false) goto L227;
        r100.add(com.yandex.passport.data.network.core.s.D((com.yandex.passport.common.core.g) r104.next()));
    L227:
        return r100;
    L219:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L220:
        nzn.U(r18);
        w r105 = (w) r6;
        com.yandex.passport.internal.filter.l r106 = r105.b;
        ArrayList r107 = r105.a.a().g();
        com.yandex.passport.internal.entities.h r108 = (com.yandex.passport.internal.entities.h) ((r3) r5).b.c;
        this.f = 1;
        r102 = r106.c(r107, r108, this);
        if (r102 != r100) goto L223;
    L228:
        com.yandex.passport.internal.methods.b r109 = ((k3) r6).b;
        com.yandex.passport.internal.usecase.vpn.e r111 = ((r) r5).a;
        xe6 r112 = xe6.a;
        int r113 = this.f;
        if (r113 == 0) goto L236;
        if (r113 == 1) goto L235;
        if (r113 != 2) goto L234;
        nzn.U(r18);
    L249:
        return (com.yandex.passport.internal.entities.x) r111.l.a.getValue();
    L234:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L235:
        nzn.U(r18);
        Object r114 = r18;
    L464:
        return (com.yandex.passport.internal.entities.x) r114;
    L236:
        nzn.U(r18);
        if (com.yandex.passport.common.logger.a.a.isEnabled() == false) goto L240;
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "forceCheck: " + ((Boolean) r109.c).booleanValue(), 8);
    L240:
        if (((Boolean) r109.c).booleanValue() == false) goto L245;
        this.f = 1;
        r114 = r111.d("data_changed", this);
        if (r114 != r112) goto L464;
        return r112;
    L245:
        this.f = 2;
        if (r111.c(this) != r112) goto L249;
        return r112;
    L250:
        com.yandex.passport.internal.methods.j0 r115 = (com.yandex.passport.internal.methods.j0) r6;
        xe6 r116 = xe6.a;
        int r117 = this.f;
        if (r117 == 0) goto L256;
        if (r117 != 1) goto L255;
        nzn.U(r18);
        Object r118 = r18;
    L259:
        Object r119 = ((mel) r118).a;
        if ((r119 instanceof jel) == true) goto L263;
        r119 = ((com.yandex.passport.data.network.k0) r119).a;
    L263:
        return new mel(r119);
    L255:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L256:
        nzn.U(r18);
        com.yandex.passport.common.core.k r120 = com.yandex.passport.data.network.core.s.I((k2) r115.b.c);
        com.yandex.passport.internal.usecase.j r121 = ((m) r5).a;
        com.yandex.passport.internal.usecase.h r122 = new com.yandex.passport.internal.usecase.h(r120, (String) r115.c.c, (String) r115.d.c, (List) r115.e.c, "check_constraints");
        this.f = 1;
        r118 = r121.a(this, r122);
        if (r118 != r116) goto L259;
        return r116;
    L264:
        l r123 = (l) r6;
        xe6 r124 = xe6.a;
        int r125 = this.f;
        if (r125 == 0) goto L270;
        if (r125 != 1) goto L269;
        nzn.U(r18);
        Object r126 = ((mel) r18).a;
    L275:
        if ((r126 instanceof jel) == true) goto L277;
        r126 = com.yandex.passport.data.network.core.s.D((com.yandex.passport.common.core.g) r126);
    L277:
        Throwable r127 = mel.a(r126);
        if (r127 == null) goto L285;
    L282:
        th = move-exception;
        r126 = nzn.E(th);
        goto L285
    L281:
        throw io.sentry.hints.j.m(r123.b, r127, null, null, null, null, new com.yandex.passport.api.exception.e0(r127), 30);     // Catch: Throwable -> L282
    L285:
        return new mel(r126);
    L269:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L270:
        nzn.U(r18);
        com.yandex.passport.internal.account.d r128 = r123.a;
        com.yandex.passport.internal.entities.t r129 = (com.yandex.passport.internal.entities.t) ((com.yandex.passport.internal.methods.i0) r5).b.c;
        com.yandex.passport.internal.analytics.a r130 = com.yandex.passport.internal.analytics.a.n;
        this.f = 1;
        Object r131 = r128.a(r129, r130, this);
        if (r131 == r124) goto L468;
        r126 = r131;
        goto L275
    L468:
        return r124;
    L286:
        j r132 = (j) r6;
        xe6 r133 = xe6.a;
        int r134 = this.f;
        if (r134 == 0) goto L292;
        if (r134 != 1) goto L291;
        nzn.U(r18);
        Object r135 = r18;
    L295:
        Object r136 = ((mel) r135).a;
        if ((r136 instanceof jel) == true) goto L298;
        r136 = com.yandex.passport.data.network.core.s.D((com.yandex.passport.common.core.g) r136);
    L298:
        Throwable r137 = mel.a(r136);
        if (r137 == null) goto L310;
        io.sentry.hints.j r138 = r132.b;     // Catch: Throwable -> L307
        String r139 = r137.getMessage();     // Catch: Throwable -> L307
        if (r139 == null) goto L306;
        r4 = r139;
    L306:
        throw io.sentry.hints.j.m(r138, r137, null, new com.yandex.passport.api.exception.o(r4), null, new com.yandex.passport.api.exception.t(r137), null, 42);     // Catch: Throwable -> L307
    L307:
        th = move-exception;
        r136 = nzn.E(th);
    L310:
        return new mel(r136);
    L291:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L292:
        nzn.U(r18);
        com.yandex.passport.internal.usecase.authorize.l r140 = r132.a;
        com.yandex.passport.internal.usecase.authorize.j r141 = new com.yandex.passport.internal.usecase.authorize.j((com.yandex.passport.internal.entities.q) ((com.yandex.passport.internal.methods.h0) r5).b.c);
        this.f = 1;
        r135 = r140.a(this, r141);
        if (r135 != r133) goto L295;
        return r133;
    L311:
        i r142 = (i) r5;
        com.yandex.passport.internal.methods.f0 r143 = (com.yandex.passport.internal.methods.f0) r6;
        xe6 r144 = xe6.a;
        int r145 = this.f;
        if (r145 == 0) goto L317;
        if (r145 != 1) goto L316;
        nzn.U(r18);
        Object r146 = r18;
    L320:
        Object r147 = ((mel) r146).a;
        if ((r147 instanceof jel) == true) goto L323;
        r147 = com.yandex.passport.data.network.core.s.D((com.yandex.passport.common.core.g) r147);
    L323:
        Throwable r148 = mel.a(r147);
        if (r148 == null) goto L341;
    L334:
        th = move-exception;
        r147 = nzn.E(th);
        goto L341
    L327:
        if ("authorization_pending".equals(r148.getMessage()) == true) goto L336;
        String r149 = r148.getMessage();     // Catch: Throwable -> L334
        if (r149 == null) goto L332;
        r4 = r149;
    L332:
        com.yandex.passport.api.exception.n r150 = new com.yandex.passport.api.exception.o(r4);     // Catch: Throwable -> L334
    L338:
        throw io.sentry.hints.j.m(r142.b, r148, null, null, new com.yandex.passport.api.exception.o("invalid_token"), new com.yandex.passport.api.exception.t(r148), r150, 6);     // Catch: Throwable -> L334
    L336:
        r150 = new com.yandex.passport.api.exception.d();     // Catch: Throwable -> L334
    L341:
        return new mel(r147);
    L316:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L317:
        nzn.U(r18);
        com.yandex.passport.common.core.d r151 = com.yandex.passport.data.network.core.s.t((com.yandex.passport.api.impl.b) r143.b.c);
        com.yandex.passport.internal.usecase.authorize.i r152 = r142.a;
        com.yandex.passport.internal.usecase.authorize.g r153 = new com.yandex.passport.internal.usecase.authorize.g(r151, (String) r143.c.c);
        this.f = 1;
        r146 = r152.a(this, r153);
        if (r146 != r144) goto L320;
        return r144;
    L342:
        h r154 = (h) r6;
        xe6 r155 = xe6.a;
        int r156 = this.f;
        if (r156 == 0) goto L348;
        if (r156 != 1) goto L347;
        nzn.U(r18);
        Object r157 = r18;
    L351:
        Object r158 = ((mel) r157).a;
        if ((r158 instanceof jel) == true) goto L354;
        r158 = com.yandex.passport.data.network.core.s.D((com.yandex.passport.common.core.g) r158);
    L354:
        Throwable r159 = mel.a(r158);
        if (r159 == null) goto L362;
    L359:
        th = move-exception;
        r158 = nzn.E(th);
        goto L362
    L358:
        throw io.sentry.hints.j.m(r154.b, r159, null, null, new com.yandex.passport.api.exception.i(), new com.yandex.passport.api.exception.t(r159), null, 38);     // Catch: Throwable -> L359
    L362:
        return new mel(r158);
    L347:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L348:
        nzn.U(r18);
        com.yandex.passport.internal.usecase.authorize.c r160 = r154.a;
        com.yandex.passport.internal.usecase.authorize.a r161 = new com.yandex.passport.internal.usecase.authorize.a((com.yandex.passport.internal.entities.e) ((com.yandex.passport.internal.methods.e0) r5).b.c, com.yandex.passport.internal.analytics.a.h, null, 0);
        this.f = 1;
        r157 = r160.a(this, r161);
        if (r157 != r155) goto L351;
        return r155;
    L363:
        g r162 = (g) r6;
        xe6 r163 = xe6.a;
        int r164 = this.f;
        if (r164 == 0) goto L369;
        if (r164 != 1) goto L368;
        nzn.U(r18);
        Object r165 = r18;
    L372:
        Object r166 = ((mel) r165).a;
        if ((r166 instanceof jel) == true) goto L375;
        r166 = com.yandex.passport.data.network.core.s.D((com.yandex.passport.common.core.g) r166);
    L375:
        Throwable r167 = mel.a(r166);
        if (r167 == null) goto L383;
    L380:
        th = move-exception;
        r166 = nzn.E(th);
        goto L383
    L379:
        throw io.sentry.hints.j.m(r162.b, r167, null, null, new com.yandex.passport.api.exception.h(), new com.yandex.passport.api.exception.t(r167), null, 38);     // Catch: Throwable -> L380
    L383:
        return new mel(r166);
    L368:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L369:
        nzn.U(r18);
        com.yandex.passport.internal.usecase.authorize.f r168 = r162.a;
        com.yandex.passport.internal.methods.d0 r169 = (com.yandex.passport.internal.methods.d0) r5;
        com.yandex.passport.internal.usecase.authorize.d r170 = new com.yandex.passport.internal.usecase.authorize.d((com.yandex.passport.internal.entities.c) r169.b.c, null, (com.yandex.passport.internal.credentials.d) r169.c.c, com.yandex.passport.internal.analytics.a.m);
        this.f = 1;
        r165 = r168.a(this, r170);
        if (r165 != r163) goto L372;
        return r163;
    L384:
        f r171 = (f) r5;
        com.yandex.passport.internal.methods.c0 r172 = (com.yandex.passport.internal.methods.c0) r6;
        f6 r173 = r172.c;
        f6 r174 = r172.d;
        xe6 r175 = xe6.a;
        int r176 = this.f;
        if (r176 == 0) goto L397;
        if (r176 != 1) goto L396;
        nzn.U(r18);     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        Object r177 = r18;
    L403:
        Object r178 = ((mel) r177).a;     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        if ((r178 instanceof jel) == false) goto L432;
    L409:
        nzn.U(r178);     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        com.yandex.passport.internal.account.f r179 = (com.yandex.passport.internal.account.f) r178;     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
    L415:
        Throwable r180 = mel.a(r179);
        if (r180 == null) goto L427;
        com.yandex.passport.internal.report.reporters.h0 r181 = r171.c;     // Catch: Throwable -> L424
        String r182 = (String) r173.c;     // Catch: Throwable -> L424
        r181.getClass();     // Catch: Throwable -> L424
        mqd.z(r182, "trackId");     // Catch: Throwable -> L424
        r181.g(w8.d, new zf[]{new hg(r180), new hg(r182, 22)});     // Catch: Throwable -> L424
        io.sentry.hints.j r183 = r171.b;     // Catch: Throwable -> L424
        String r184 = r180.getMessage();     // Catch: Throwable -> L424
        if (r184 == null) goto L423;
        r4 = r184;
    L423:
        throw io.sentry.hints.j.m(r183, r180, null, new com.yandex.passport.api.exception.o(r4), null, new com.yandex.passport.api.exception.t(r180), null, 42);     // Catch: Throwable -> L424
    L424:
        th = move-exception;
        r179 = nzn.E(th);
    L427:
        return new mel(r179);
    L432:
        r178 = com.yandex.passport.data.network.core.s.D((com.yandex.passport.common.core.g) r178);     // Catch: Throwable -> L407
    L407:
        th = move-exception;
        r178 = nzn.E(th);     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        goto L409
    L396:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L397:
        nzn.U(r18);
        com.yandex.passport.common.core.d r185 = com.yandex.passport.data.network.core.s.t((com.yandex.passport.api.impl.b) r172.b.c);
        if (mqd.s((p8) r174.c, n8.a) == false) goto L410;
        com.yandex.passport.internal.usecase.authorize.r r186 = r171.a;     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        com.yandex.passport.internal.usecase.authorize.p r187 = new com.yandex.passport.internal.usecase.authorize.p(r185, (String) r173.c);     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        this.f = 1;     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        r177 = r186.a(this, r187);     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        if (r177 != r175) goto L403;
        return r175;
    L410:
        String r188 = ((p8) r174.c).toString();     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        mqd.z(r188, "cause");     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
        throw new com.yandex.passport.api.exception.j0(r188);     // Catch: Throwable -> L389 CancellationException -> L391 gpp -> L393
    L391:
        e = move-exception;
        throw e;
    L393:
        e = move-exception;
        r179 = nzn.E(e);
    L389:
        th = move-exception;
        r179 = nzn.E(th);
        goto L415
    L51:
        return F(r18);
    L64:
        return E(r18);
    L66:
        return D(r18);
    L68:
        return C(r18);
    L70:
        return B(r18);
    L72:
        return A(r18);
    L74:
        return z(r18);
    L76:
        return y(r18);
    L78:
        return x(r18);
    L80:
        return w(r18);
    L82:
        return v(r18);
    }
}
