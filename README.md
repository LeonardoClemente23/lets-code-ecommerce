# lets-code-ecommerce

Crie uma aplicação que simule um e-commerce simples. A aplicação deverá manter pelo menos quatro categorias de produtos diferentes, mas nem todas as categorias obrigatoriamente precisam ter produtos cadastrados. Quando um cliente faz um pedido de compra, o(s) item(s) são carregados em um carrinho virtual. Pode-se pedir mais de um item para cada produto.

O cliente tem as opções de pagamento: BOLETO, CARTÃO PARCELADO, CARTÃO A VISTA E PAYPAL. Parcelamentos são permitidos apenas na opção cartão parcelado, e no máximo em 3 vezes.

Na classe principal da aplicação, simule a entrada de pelo menos dois produtos, em modalidades de compra diferentes, e mostre os itens adquiridos na saída de tela.

Utilizar todos os recursos apresentados até agora, principalmente as Collections (List, Map, Linked, etc), Interfaces e Generics, além de pelo menos um princípio SOLID.

# Checklist

- Quatro categorias de produtos diferentes: OK (Calcado, Eletronico, Perfumaria, Vestuario)
- Compra carrega itens no carrinho virtual: OK
- Pode-se comprar mais de um item de cada produto: OK
- Opções de pagamento (BOLETO, CARTÃO PARCELADO, CARTÃO À VISTA e PAYPAL):
- Parcelamento para a opção cartão parcelado (máximo de 3 vezes):
- Simulação da compra de 2 produtos em modalidades de pagamento diferentes:

# Conteúdo

- Collections (List, Map, Linked, etc): OK (Loja - LinkedHashMap compras | HashMap produtos\* )
- Interfaces: OK (produto.Categoria)
- Generics: OK (carrinho.CarrinhoRepository)
- Princípios SOLID: Checking (Checar se um dos princípios solid está sendo aplicado)
- Exceptions: OK (Unchecked - Loja.adicionarProdutoLoja() | )
- Encapsulamento: Checking (Checar em todas as classes se o encapsulamento não foi ferido de alguma forma)
- Herança: OK (Produto -> Vestuario, Calcado, Eletronico, Perfumaria)
- Polimorfismo: OK (Loja.adicionarProdutoLoja(Produto produto))
- ENUM: OK (Produto -> CategoriaProduto | FormaPagamento -> FormaPagamento)
- SwitchCase: OK (Loja.adicionarProdutoLoja())
