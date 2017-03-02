package com.wolf.shoot.service.net.session.builder;

import com.wolf.shoot.service.net.session.ISession;
import com.wolf.shoot.service.net.session.NettyTcpSession;
import io.netty.channel.Channel;
import org.springframework.stereotype.Service;

/**
 * Created by jwp on 2017/2/9.
 * 创造tcpsession
 */
@Service
public class NettyTcpSessionBuilder implements ISessionBuilder {

    @Override
    public ISession buildSession(Channel channel) {
        return new NettyTcpSession(channel) ;
    }
}
