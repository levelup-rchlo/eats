package br.com.caelum.notafiscal;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

import br.com.caelum.notafiscal.pedido.PedidoDto;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
class ProcessadorDePagamentos {

	private final GeradorDeNotaFiscal notaFiscal;

	@StreamListener(StreamConfig.PedidoPagoSink.PEDIDO_PAGOS_TOPIC)
	void processaPagamento(PedidoDto pedidoDto) {
		String nota = notaFiscal.geraNotaPara(pedidoDto);
		System.out.println(nota); // TODO: enviar XML para SEFAZ
	}
}
