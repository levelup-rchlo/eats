package br.com.caelum.notafiscal.pedido;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PedidoDto {

	private Long id;
	private EntregaDto entrega;
	private List<ItemDoPedidoDto> itens = new ArrayList<>();
	
}
