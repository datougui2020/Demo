package io.ocnet.blockchain.net;

import android.net.VpnService;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class VPNSocket extends Socket {

    public VPNSocket(VpnService vpnService, boolean byPassVPN) {
        super();
        if (vpnService != null) {
            vpnService.protect(this);
        }
    }

    protected VPNSocket(String host, int port, VpnService vpnService, boolean byPassVPN) throws UnknownHostException, IOException {
        super(host, port);
        if (vpnService != null) {
            vpnService.protect(this);
        }
    }
}
