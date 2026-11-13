package com.yandex.passport.internal.util;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public abstract class k {
    public static final com.yandex.passport.common.coroutine.d a = null;

    static {
        a = new com.yandex.passport.common.coroutine.d(18);
    }

    public static Uri a(String r3) {
        StringBuilder r0 = new StringBuilder("content://");
        r0.append("com.yandex.passport.internal.provider." + r3);
        return Uri.parse(r0.toString());
    }

    public static final String b(String r4) {
        if (r4 != null) goto L5;
        return null;
    L5:
        StringBuilder r0 = new StringBuilder();
        int r2 = 0;
        String r1 = r4.substring(0, r4.length() / 2);
        mqd.y(r1, "substring(...)");
        r0.append(r1);
        int r5 = r4.length() - r0.length();
    L6:
        if (r2 >= r5) goto L9;
        r0.append('*');
        r2 = r2 + 1;
        goto L6
    L9:
        return r0.toString();
    }

    public static void c(View r4) {
        int r1 = 0;
        if ((r4 instanceof TextInputLayout) == false) goto L7;
        ((TextInputLayout) r4).setHintEnabled(false);
        return;
    L7:
        if ((r4 instanceof ViewGroup) == false) goto L11;
        ViewGroup r5 = (ViewGroup) r4;
        int r0 = r5.getChildCount();
    L9:
        if (r1 >= r0) goto L13;
        View r2 = r5.getChildAt(r1);
        mqd.y(r2, "getChildAt(...)");
        c(r2);
        r1 = r1 + 1;
        goto L9
    L13:
        return;
    }
}
