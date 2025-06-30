package org.copperstone.whatismyipspringboot.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.copperstone.whatismyipspringboot.client.ClientInfo;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Scope("request")
@RequestMapping("api/client")
@RestController
public class ClientInfoController {
    private final HttpServletRequest m_httpServletRequest;
    private final LocalDateTime m_localDateTime;

    public ClientInfoController(HttpServletRequest httpServletRequest, LocalDateTime localDateTime) {
        m_httpServletRequest = httpServletRequest;
        m_localDateTime = localDateTime;
    }

    //@RequestMapping(name = "info", method = RequestMethod.GET)
    @GetMapping("info")
    public ClientInfo getClientInfo()
    {
        return new ClientInfo(m_httpServletRequest.getRemotePort(), m_httpServletRequest.getLocalPort(), m_httpServletRequest.getLocalAddr(), m_httpServletRequest.getRemoteAddr(), m_localDateTime);
    }
}
