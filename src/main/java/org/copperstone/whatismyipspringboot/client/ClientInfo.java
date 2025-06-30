package org.copperstone.whatismyipspringboot.client;

import java.time.LocalDateTime;

public class ClientInfo {
    private final int m_ephemeralPort;
    private final int m_localPort;
    private final String m_localIp;
    private final String m_remoteIp;
    private final LocalDateTime m_requestTime;

    public ClientInfo(int ephemeralPort, int localPort, String localIp, String remoteIp, LocalDateTime requestTime) {
        m_ephemeralPort = ephemeralPort;
        m_localPort = localPort;
        m_localIp = localIp;
        m_remoteIp = remoteIp;
        m_requestTime = requestTime;
    }

    public int getEphemeralPort() {
        return m_ephemeralPort;
    }

    public int getLocalPort() {
        return m_localPort;
    }

    public String getLocalIp() {
        return m_localIp;
    }

    public String getRemoteIp() {
        return m_remoteIp;
    }

    public LocalDateTime getRequestTime() {
        return m_requestTime;
    }
}
