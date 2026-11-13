package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCaptureSession;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.t;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainter$State$Loading;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongArray;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes.dex */
public final class t8n implements pjh, k3g, tno, cb1, v1i, gjb, xn3, hs0, kd8, uw3, tpr, gfg, w0b {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t8n(Object r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    public static fg7 s(h1s r1) {
        new xwc();
        r1.getClass();
        new HashMap();
        throw null;
    }

    public y9a A() {
        y9a r0 = ((ks6) this.b).a.d;
        rld.q(r0);
        return r0;
    }

    public ocg B() {
        ocg r0 = ((ks6) this.b).a.j;
        rld.q(r0);
        return r0;
    }

    public /* bridge */ /* synthetic */ Object C() {
        return "files.messenger.alpha.yandex.net";
    }

    public void D(ae3 r1, Throwable r2) {
        ((rg5) this.b).completeExceptionally(r2);
    }

    public Map E() {
        AtomicLongArray r0 = (AtomicLongArray) this.b;
        return xgf.k0(new ypi[]{new ypi("debounce", Long.valueOf(r0.get(1) - r0.get(0))), new ypi("request_built", Long.valueOf(r0.get(2) - r0.get(0))), new ypi("response_got", Long.valueOf(r0.get(3) - r0.get(0))), new ypi("response_converted", Long.valueOf(r0.get(4) - r0.get(0))), new ypi("response_handled", Long.valueOf(r0.get(5) - r0.get(0))), new ypi("set_in_adapter", Long.valueOf(r0.get(6) - r0.get(0))), new ypi("result_drawn", Long.valueOf(r0.get(7) - r0.get(0)))});
    }

    public m5k F() {
        return (m5k) ((ks6) this.b).N.get();
    }

    public SharedPreferences G() {
        return (SharedPreferences) ((ks6) this.b).P.get();
    }

    public tdn H() {
        return (tdn) ((ks6) this.b).p.get();
    }

    public Object I() {
        ((ihg) this.b).getClass();
        return "files.messenger.yandex.net";
    }

    public jpo J() {
        return (jpo) ((ks6) this.b).C.get();
    }

    public /* bridge */ /* synthetic */ Object K() {
        return "files.messenger.yandex.net";
    }

    public /* bridge */ /* synthetic */ Object L() {
        return "files.messenger.test.yandex.net";
    }

    @Override // defpackage.tpr
    public void M(Bundle r2, wda r3) {
        t r4 = ((vda) this.b).getActivity();
        if (r4 == null) goto L10;
        Intent r0 = new Intent();
        if (r2 != null) goto L8;
        r2 = new Bundle();
    L8:
        r0.putExtras(r2);
        r4.setResult(-1, r0);
        r4.finish();
        return;
    }

    public Object N(int r5, lib r6, kc6 r7) {
        if ((r7 instanceof s8n) == false) goto L7;
        s8n r0 = (s8n) r7;
        int r1 = r0.g;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.g = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.e;
        xe6 r2 = xe6.a;
        int r3 = r0.g;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L17;
        t8n r9 = r0.d;
        nzn.U(r8);     // Catch: p8n -> L14
    L27:
        return fcq.a;
    L14:
        e = e;
    L25:
        if (e.a == r9) goto L27;
        throw e;
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L18:
        nzn.U(r8);
        ja5 r10 = new ja5(this, r5, r6, null);     // Catch: p8n -> L22
        r0.d = this;     // Catch: p8n -> L22
        r0.g = 1;     // Catch: p8n -> L22
        if (f34.u(r10, r0) != r2) goto L27;
        return r2;
    L22:
        e = e;
        r9 = this;
    L7:
        r0 = new s8n(this, r7);
        goto L8
    }

    public void O(int r4) {
        ((AtomicLongArray) this.b).set(r4, SystemClock.elapsedRealtime());
    }

    public /* bridge */ /* synthetic */ Object V() {
        return "files.messenger.alpha.yandex.net";
    }

    @Override // defpackage.tno
    public void a(Drawable r1) {
    }

    public Object b() {
        ((dd1) this.b).g.d(new bk0(16));
        return fcq.a;
    }

    public Flow c() {
        return hu0.a0(new k3(this, null, 16));
    }

    public Object d() {
        ((dd1) this.b).g.d(new bk0(15));
        return fcq.a;
    }

    @Override // defpackage.k3g
    public void e(j2g r1, boolean r2) {
        ((vn0) this.b).q(r1);
    }

    public void f(ae3 r2, pcl r3) {
        rg5 r4 = (rg5) this.b;
        if (r3.a.i() == false) goto L6;
        r4.complete(r3.b);
        return;
    L6:
        r4.completeExceptionally(new cxc(r3));
    }

    public Object g() {
        ((dd1) this.b).g.d(new bk0(14));
        return fcq.a;
    }

    @Override // defpackage.tno
    public void h(Drawable r3) {
        AsyncImagePainter r0 = (AsyncImagePainter) this.b;
        if (r3 == null) goto L5;
        xpi r4 = r0.j(r3);
    L6:
        r0.l(new AsyncImagePainter$State$Loading(r4));
        return;
    L5:
        r4 = null;
        goto L6
    }

    public Object i() {
        ((dd1) this.b).g.d(new bk0(13));
        return fcq.a;
    }

    @Override // defpackage.tno
    public void j(Drawable r1) {
    }

    @Override // defpackage.kd8
    public jd8 k(htf r2) {
        r2.b.getClass();
        r2.b.getClass();
        return jd8.a;
    }

    public Flow l(Object r6) {
        int r4 = 3;
        int r3 = 17;
        return new ij2(new a1g(new oo1(2, 14, null)), hu0.b1(ras.U((ewq) this.b), new f51(3, 12, null)), new xi(r4, r3, null), 8);
    }

    public Object m() {
        ((dd1) this.b).g.d(new bk0(12));
        return fcq.a;
    }

    @Override // defpackage.hs0
    public Object n(c3m r7, Float r8, Float r9, lib r10, ien r11) {
        Object r12 = nen.a(r7, r8.floatValue(), yoe.b(0.0f, r9.floatValue(), 28), (qa7) this.b, r10, r11);
        if (r12 != xe6.a) goto L6;
        return r12;
    L6:
        return (dj0) r12;
    }

    @Override // defpackage.gjb
    public void onFailure(Throwable r5) {
        switch(this.a) {
            case 11: goto L6;
            default: goto L4;
        };
    L4:
        ((fo3) this.b).c(r5);
        return;
    L6:
        Object r1 = ((mx3) this.b).a;
        monitor-enter(r1);
        ((mx3) this.b).d.q();     // Catch: Throwable -> L18
        int r2 = qq3.E(((mx3) this.b).i);     // Catch: Throwable -> L18
        if (r2 == 3) goto L16;
        if (r2 == 5) goto L16;
        if (r2 == 6) goto L16;
    L20:
        monitor-exit(r1);     // Catch: Throwable -> L18
        return;
    L16:
        if ((r5 instanceof CancellationException) == true) goto L20;
        iym.e0("CaptureSession", "Opening session with fail ".concat(wq1.A(((mx3) this.b).i)), r5);     // Catch: Throwable -> L18
        ((mx3) this.b).d();     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        throw th;
    }

    @Override // defpackage.gjb
    public void onSuccess(Object r2) {
        switch(this.a) {
            case 11: goto L10;
            default: goto L4;
        };
    L4:
        fo3 r0 = (fo3) this.b;
        r0.b(r2);     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        r0.c(th);
        return;
    L10:
        Void r3 = (Void) r2;
    }

    public boolean p(String r18) {
        mqd.z(r18, "baseUrl");
        pz6 r3 = ((gz6) this.b).b();
        mqd.y(r3, "createDataSource(...)");
        Map r10 = Collections.EMPTY_MAP;
        Uri r0 = Uri.parse(r18);
        mqd.y(r0, "parse(this)");
        Uri r5 = r0.buildUpon().clearQuery().path("ping").build();
        bsm.u(r5, "The uri must be set.");
        vz6 r4 = new vz6(r5, 0, 1, null, r10, 0, -1, null, 2);
        vhc r1 = qfp.a;
        Objects.toString(r4.a);
        boolean r2 = false;
        r1.getClass();
        vhc.y(new Object[0]);
    L8:
        th = move-exception;
        Boolean r6 = nzn.E(th);
    L10:
        Boolean r7 = Boolean.FALSE;
        if ((r6 instanceof jel) == false) goto L13;
        r6 = r7;
    L13:
        r3.close();
        return r6.booleanValue();
    L4:
        if (r3.d(r4) < 0) goto L6;
        r2 = true;
    L6:
        r6 = Boolean.valueOf(r2);     // Catch: Throwable -> L8
        goto L10
    }

    public Object q() {
        ((ihg) this.b).getClass();
        return "files.messenger.test.yandex.net";
    }

    @Override // defpackage.k3g
    public boolean r(j2g r3) {
        Window.Callback r0 = ((vn0) this.b).l.getCallback();
        if (r0 == null) goto L7;
        r0.onMenuOpened(108, r3);
        return true;
    L7:
        return true;
    }

    public x20 t() {
        return (x20) ((ks6) this.b).g.get();
    }

    public k0j u() {
        return ((ks6) this.b).a.m;
    }

    public Context v() {
        Context r0 = ((ks6) this.b).a.a;
        rld.q(r0);
        return r0;
    }

    public e4k w() {
        return (e4k) ((ks6) this.b).r.get();
    }

    public ne6 x() {
        return (ne6) ((ks6) this.b).k.get();
    }

    public we6 y() {
        return (we6) ((ks6) this.b).l.get();
    }

    @Override // defpackage.v1i
    public rzr z(View r3, rzr r4) {
        xa2 r5 = (xa2) this.b;
        wa2 r0 = r5.o;
        if (r0 == null) goto L5;
        r5.g.Y0.remove(r0);
    L5:
        wa2 r1 = new wa2(r5.j, r4);
        r5.o = r1;
        r1.e(r5.getWindow());
        r5.g.x(r5.o);
        return r4;
    }

    public t8n(ihg r2) {
        this.a = 26;
        mqd.z(r2, "hostProvider");
        this.b = r2;
    }

    public t8n(gz6 r2) {
        this.a = 8;
        mqd.z(r2, "dataSourceFactory");
        this.b = r2;
    }

    public t8n(Context r2) {
        this.a = 2;
        Object r3 = r2.getApplicationContext().getSystemService("connectivity");
        mqd.x(r3, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.b = (ConnectivityManager) r3;
    }

    public t8n(ewq r2) {
        this.a = 28;
        mqd.z(r2, "userScopeBridge");
        this.b = r2;
    }

    public t8n(int r2) {
        this.a = r2;
        switch(r2) {
            case 20: goto L8;
            case 29: goto L6;
            default: goto L5;
        };
    L6:
        this.b = new AtomicLongArray(8);
        O(0);
        return;
    L8:
        this.b = new Object();
        return;
    }

    public t8n(boolean r2) {
        this.a = 0;
        this.b = new ikh(this, r2);
    }

    public t8n(CameraCaptureSession r3, Handler r4) {
        this.a = 10;
        if (Build.VERSION.SDK_INT < 28) goto L5;
        this.b = new ns3(r3, null);
        return;
    L5:
        this.b = new xjs(r3, new os3(r4));
    }

    public t8n(kv8 r3, xd r4) {
        this.a = 23;
        this.b = new rm8(1, (enh) r3.a.a, r4);
    }
}
