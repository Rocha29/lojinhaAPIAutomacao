package dataFactory;

import pojo.ComponetePojo;
import pojo.ProdutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public  static ProdutoPojo criarProdutoCommunValorIgualA(double valor){

        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Play Station 5");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponetePojo> componentes = new ArrayList<>();

        ComponetePojo componetente = new ComponetePojo();
        componetente.setComponenteNome("Controle");
        componetente.setComponenteQuantidade(1);

        componentes.add(componetente);

        produto.setComponentes(componentes);

        return produto;


    }
}
