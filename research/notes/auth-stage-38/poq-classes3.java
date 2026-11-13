package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.view.GestureDetector;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.yandex.messaging.internal.entities.BusinessItem;
import com.yandex.messaging.internal.net.ai.AiTextEditData;
import com.yandex.messaging.internal.net.ai.StartAiTextEditParams;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final class poq implements gfg, upa, xpf, rja, uy6, uoq, fb6, j61, h4o, te9, lca, ehc {
    public static final Object c = null;
    public final /* synthetic */ int a;
    public Object b;

    static {
        c = new Object();
    }

    public /* synthetic */ poq(Object r1, int r2) {
        this.a = r2;
        this.b = r1;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x015c -> B:103:0x015d). Please report as a decompilation issue!!! */
    public static final Object m(poq r11, mx r12, kc6 r13) {
        fx r0 = (fx) r11.b;
        if ((r13 instanceof lx) == false) goto L7;
        lx r1 = (lx) r13;
        int r2 = r1.h;
        if ((r2 & Integer.MIN_VALUE) == 0) goto L7;
        r1.h = r2 - Integer.MIN_VALUE;
    L8:
        Object r14 = r1.f;
        xe6 r15 = xe6.a;
        int r3 = r1.h;
        String r6 = null;
        if (r3 == 0) goto L18;
        if (r3 == 1) goto L17;
        if (r3 == 2) goto L16;
        if (r3 != 3) goto L15;
        String r16 = r1.d;
        nzn.U(r14);
    L103:
        lel r17 = (lel) r14;
    L23:
        if ((r17 instanceof iel) == false) goto L37;
        int r18 = ((nl0) ((iel) r17).a).a;
        if (r18 > 0) goto L28;
        hx r19 = hx.h;
    L35:
        return new rx(r19);
    L28:
        if (r18 != 403) goto L31;
        r19 = hx.a;
        goto L35
    L31:
        if (r18 != 429) goto L33;
        r19 = hx.f;
        goto L35
    L33:
        r19 = hx.b;
        goto L35
    L37:
        if ((r17 instanceof kel) == false) goto L116;
        AiTextEditData r110 = (AiTextEditData) ((kel) r17).a;
        int r4 = r110.getStatusCode();
        if (r4 == 0) goto L104;
        if (r4 == 1) goto L77;
        if (r4 != 2) goto L43;
        Integer r111 = r110.getErrorCode();
        if (r111 != null) goto L48;
    L50:
        if (r111 != null) goto L53;
    L54:
        if (r111 != null) goto L57;
    L58:
        if (r111 != null) goto L61;
    L63:
        if (r111 != null) goto L66;
    L68:
        if (r111 != null) goto L71;
    L73:
        hx r112 = hx.b;
    L76:
        return new rx(r112);
    L71:
        if (r111.intValue() != 7) goto L73;
        r112 = hx.f;
        goto L76
    L66:
        if (r111.intValue() != 4) goto L68;
        r112 = hx.d;
        goto L76
    L61:
        if (r111.intValue() != 9) goto L63;
    L74:
        r112 = hx.e;
        goto L76
    L57:
        if (r111.intValue() == 8) goto L74;
    L53:
        if (r111.intValue() == 3) goto L74;
    L48:
        if (r111.intValue() != 1) goto L50;
        r112 = hx.c;
        goto L76
    L43:
        return new rx(hx.b);
    L77:
        String r5 = r110.getSessionId();
        if (r5 != null) goto L80;
    L86:
        if (r16 == null) goto L88;
        Long r113 = r110.getPollIntervalMs();
        if (r113 == null) goto L94;
        long r7 = r113.longValue();
        if (r7 >= 100) goto L95;
        r7 = 100;
    L95:
        r1.d = r16;
        r1.e = r16;
        r1.h = 2;
        if (x44.o(r7, r1) == r15) goto L101;
        String r8 = r16;
    L99:
        r1.d = r8;
        r1.e = null;
        r1.h = 3;
        r14 = lo7.Q(r0.b, new k3(r0, r16, null, 11), r1);
        if (r14 == r15) goto L101;
        r16 = r8;
    L101:
        return r15;
    L94:
        r7 = 500;
        goto L95
    L88:
        return new rx(hx.b);
    L80:
        if (r5.length() > 0) goto L83;
        r5 = null;
    L83:
        if (r5 == null) goto L86;
        r16 = r5;
        goto L86
    L104:
        String r114 = r110.getText();
        if (r114 == null) goto L114;
        if (r114.length() <= 0) goto L109;
        r6 = r114;
    L109:
        if (r6 == null) goto L114;
        return new sx(r6);
    L114:
        return new rx(hx.b);
    L116:
        throw new mnh();
    L15:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L16:
        r16 = r1.e;
        r8 = r1.d;
        nzn.U(r14);
        goto L99
    L17:
        nzn.U(r14);
    L21:
        r17 = (lel) r14;
        r16 = null;
        goto L23
    L18:
        nzn.U(r14);
        StartAiTextEditParams r115 = new StartAiTextEditParams(r12.a, r12.b.a, "ru");
        r1.h = 1;
        r14 = lo7.Q(r0.b, new k3(r0, r115, null, 12), r1);
        if (r14 != r15) goto L21;
    L7:
        r1 = new lx(r11, r13);
        goto L8
    }

    public /* bridge */ /* synthetic */ Object C() {
        return "api.messenger.alpha.yandex.net";
    }

    public Object I() {
        ((ihg) this.b).getClass();
        return "api.messenger.yandex.net";
    }

    public /* bridge */ /* synthetic */ Object K() {
        return "api.messenger.yandex.net";
    }

    public /* bridge */ /* synthetic */ Object L() {
        return "api.messenger.test.yandex.net";
    }

    public /* bridge */ /* synthetic */ Object V() {
        return "api.messenger.alpha.yandex.net";
    }

    public void a() {
    }

    public void b(ppa r2) {
        ((gw3) this.b).f(r2.a);
    }

    public void c(npa r1) {
    }

    public Object d(ic6 r3) {
        switch(this.a) {
            case 7: goto L10;
            default: goto L4;
        };
    L4:
        Drawable r4 = (Drawable) this.b;
        if ((r4 instanceof BitmapDrawable) == false) goto L8;
        Bitmap r5 = ((BitmapDrawable) r4).getBitmap();
        mqd.y(r5, "getBitmap(...)");
        return new cja(r5);
    L8:
        return new dja(new h3d(r4));
    L10:
        return new cja((Bitmap) this.b);
    }

    public String e(Object r1) {
        return ((fgc) r1).b;
    }

    public Object f() {
        ByteBuffer r0 = (ByteBuffer) this.b;
        r0.position(0);
        return r0;
    }

    @Override // defpackage.uoq
    public void g(BusinessItem r2) {
        mqd.z(r2, "item");
        ((k94) this.b).t.i0(r2);
    }

    public int getHeight() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    public int getPaddingEnd() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    public int getPaddingStart() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedPadding();
    }

    public int getWidth() {
        return ((ExtendedFloatingActionButton) this.b).getCollapsedSize();
    }

    public void h() {
        v8a r0 = ((nj7) this.b).W0;
        if (r0 == null) goto L6;
        r0.a();
        return;
    }

    @Override // defpackage.uoq
    public void i(BusinessItem r2) {
        mqd.z(r2, "item");
    }

    public Iterator j() {
        return ((Iterable) this.b).iterator();
    }

    public boolean k(db6 r2) {
        mqd.z(r2, "contentType");
        return r2.N((db6) this.b);
    }

    public void l() {
        v8a r0 = ((nj7) this.b).W0;
        if (r0 == null) goto L6;
        r0.a();
        return;
    }

    public void n(LayoutNode r2) {
        if (r2.J() == true) goto L5;
        ggd.b("DepthSortedSet.add called on an unattached node");
    L5:
        ((ohn) this.b).add(r2);
    }

    public Object o(mx r6, kc6 r7) {
        if ((r7 instanceof kx) == false) goto L7;
        kx r0 = (kx) r7;
        int r1 = r0.f;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.f = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.d;
        xe6 r2 = xe6.a;
        int r3 = r0.f;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        nzn.U(r8);
    L25:
        tx r9 = (tx) r8;
        if (r9 == null) goto L28;
        return r9;
    L28:
        return new rx(hx.b);
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        nzn.U(r8);
        if (r6.a.length() != 0) goto L19;
        return new rx(hx.e);
    L19:
        if (r6.a.length() > 10000) goto L21;
        k3 r10 = new k3(this, r6, null, 13);
        r0.f = 1;
        r8 = j2n.p(120000, r10, r0);
        if (r8 != r2) goto L25;
        return r2;
    L21:
        return new rx(hx.g);
    L7:
        r0 = new kx(this, r7);
        goto L8
    }

    public void p() {
        m49 r0 = (m49) this.b;
        r0.e1.cancel();
        r0.k1 = null;
    }

    public Object q() {
        ((ihg) this.b).getClass();
        return "api.messenger.test.yandex.net";
    }

    public Object r(String r5) {
        String[] r0 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList r1 = new ArrayList();
        int r2 = 0;
    L4:
        if (r2 >= 3) goto L9;
        Provider r3 = Security.getProvider(r0[r2]);
        if (r3 == null) goto L8;
        r1.add(r3);
    L8:
        r2 = r2 + 1;
        goto L4
    L9:
        Iterator r4 = r1.iterator();
        Exception r6 = null;
    L11:
        if (r4.hasNext() == false) goto L19;
        Provider r7 = (Provider) r4.next();
        return ((kf9) this.b).e(r5, r7);
    L15:
        e = move-exception;
        if (r6 != null) goto L11;
        r6 = e;
        goto L11
    L19:
        throw new GeneralSecurityException("No good Provider found.", r6);
    }

    public gb1 s() {
        Activity r0 = (Activity) this.b;
        mqd.z(r0, "<this>");
        if (xkc.e0(r0, 2130969805).data == 0) goto L7;
        return gb1.a;
    L7:
        return gb1.b;
    }

    public boolean t(LayoutNode r2) {
        if (r2.J() == true) goto L6;
        ggd.b("DepthSortedSet.remove called on an unattached node");
    L6:
        return ((ohn) this.b).remove(r2);
    }

    public String toString() {
        switch(this.a) {
            case 20: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return ((ohn) this.b).toString();
    }

    public ViewGroup.LayoutParams v() {
        ExtendedFloatingActionButton r1 = (ExtendedFloatingActionButton) this.b;
        return new ViewGroup.LayoutParams(r1.getCollapsedSize(), r1.getCollapsedSize());
    }

    public void x() {
        m49 r0 = (m49) this.b;
        r0.e1.cancel();
        r0.k1 = null;
    }

    public poq(ihg r2) {
        this.a = 3;
        mqd.z(r2, "hostProvider");
        this.b = r2;
    }

    public poq(Activity r2) {
        this.a = 5;
        mqd.z(r2, "activity");
        this.b = r2;
    }

    public poq(fx r2) {
        this.a = 2;
        mqd.z(r2, "dataSource");
        this.b = r2;
    }

    public poq(Context r2, GestureDetector.SimpleOnGestureListener r3, Handler r4) {
        this.a = 28;
        this.b = new GestureDetector(r2, r3, r4);
    }

    public poq(fi5 r4) {
        this.a = 1;
        Context r0 = (Context) r4.a;
        String r1 = (String) r4.b;
        String r2 = (String) r4.c;
        if (r1 == null) goto L11;
        Context r3 = r0.getApplicationContext();
        if (r2 != null) goto L7;
        PreferenceManager.getDefaultSharedPreferences(r3).edit();
    L8:
        this.b = (d6c) r4.g;
        return;
    L7:
        r3.getSharedPreferences(r2, 0).edit();
        goto L8
    L11:
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    public poq(int r2) {
        this.a = r2;
        switch(r2) {
            case 17: goto L14;
            case 18: goto L12;
            case 19: goto L10;
            case 20: goto L8;
            case 27: goto L6;
            default: goto L5;
        };
    L6:
        this.b = null;
        return;
    L8:
        this.b = new ohn(f3r.b);
        return;
    L10:
        this.b = o8f.T(Looper.getMainLooper());
        return;
    L12:
        Set r3 = bud.a;
        mqd.z(r3, "needInterceptPaths");
        this.b = r3;
        return;
    L14:
        this.b = hu0.Y(rrn.a(Boolean.TRUE));
        return;
    }
}
