package br.com.caelum.eats.pedido;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
class PagamentoConfirmadoEvent {

    private Long pagamentoId;
    private Long pedidoId;
    private LocalDateTime dataHora;

}
