package br.com.caelum.notafiscal;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding(StreamConfig.PedidoPagoSink.class)
@Configuration
class StreamConfig {

    interface PedidoPagoSink {
        String PEDIDO_PAGOS_TOPIC = "pedidosPagos";
        @Input
        SubscribableChannel pedidosPagos();
    }

}
