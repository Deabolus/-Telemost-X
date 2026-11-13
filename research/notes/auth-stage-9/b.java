package com.yandex.passport.internal.entities;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.rtm.internal.Constants;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = null;
    public final String a;
    public final String b;

    static {
        CREATOR = new com.yandex.passport.internal.account.g(7);
    }

    public b(String r2, String r3) {
        mqd.z(r2, Constants.KEY_VALUE);
        mqd.z(r3, "decryptedClientId");
        this.a = r2;
        this.b = r3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof b) == true) goto L8;
        return false;
    L8:
        b r6 = (b) r5;
        if (mqd.s(this.a, r6.a) == true) goto L12;
        return false;
    L12:
        if (mqd.s(this.b, r6.b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        int r0 = this.a.hashCode() * 31;
        return this.b.hashCode() + r0;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("ClientToken(value='");
        r0.append(com.yandex.passport.internal.util.k.b(this.a));
        r0.append("', decryptedClientId='");
        return okn.o(r0, this.b, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        mqd.z(r1, "dest");
        r1.writeString(this.a);
        r1.writeString(this.b);
    }
}
