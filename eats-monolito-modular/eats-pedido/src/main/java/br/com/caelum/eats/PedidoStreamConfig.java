package br.com.caelum.eats;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

@EnableBinding({PedidoStreamConfig.PagamentoConfirmadoSink.class,
                PedidoStreamConfig.PedidoPagoSource.class})
@Configuration
public class PedidoStreamConfig {

    public interface PagamentoConfirmadoSink {

        String PAGAMENTOS_CONFIRMADOS_TOPIC = "pagamentosConfirmados";

        @Input
        SubscribableChannel pagamentosConfirmados();
    }

    public interface PedidoPagoSource {
        @Output
        MessageChannel pedidosPagos();
    }

}
