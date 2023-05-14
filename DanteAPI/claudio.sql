INSERT INTO public.tb_produto(id, descricao, imagem, nome, valor, tamanho, categoria)
	VALUES (1, 'Camisa Charizard', 'https://d3ugyf2ht6aenh.cloudfront.net/stores/342/362/products/63-412a2717e5b342163816063238726698-1024-1024.webp', 'Camisa Pokemon', 39.90, 2, 1),
(2, 'tenis nike', 'https://m.media-amazon.com/images/I/7106Zffrd3L._AC_SL1500_.jpg', 'tenis nike', 10.5, null, 7),
(3, 'shorts adida', 'https://d3ugyf2ht6aenh.cloudfront.net/stores/342/362/products/63-412a2717e5b342163816063238726698-1024-1024.webp', 'Camisa Pokemon', 40, 3, 5),
(4, 'blusa', 'https://m.media-amazon.com/images/I/516z6fDnwKL._AC_SX385_.jpg', 'Blusa Academia', 19.90, 3, 4),
(5, 'calça', 'https://images.tcdn.com.br/img/img_prod/762869/calca_jeans_feminina_skinny_premium_diane_2925_1_acacadf9f0cb57d993907d4a2215d6bc.jpg', 'Calça Jeans', 60.00, 3, 2),
(6, 'camisa miami heat', 'https://cdn.awsli.com.br/600x450/161/161023/produto/60886271/e4d6050899.jpg', 'Camisa Heat', 149.99, 4, 1),
(7, 'oculos redondo', 'https://m.media-amazon.com/images/I/51UQiKLFN7L._AC_SL1204_.jpg', 'Oculos Redondo', 190.50, null, 9),
(8, 'oculos quadrado', 'https://cdnv2.moovin.com.br/yoface/imagens/produtos/det/armacao-para-oculos-de-grau-quadrado-yoface-yo8-53mm-unissex--6f1e4e8c0f3a831172fe5b05c80a5378.jpg', 'Oculos quadrado', 200.0, null, 9),
(9, 'camisa blastoise', 'https://d3ugyf2ht6aenh.cloudfront.net/stores/758/333/products/camisa-pokemon-go-de-agua-blastoise-11-78b10efb8578e3c6cd16582797528952-640-0.webp', 'Blastoise', 49.90, 5,1),
(10, 'camisa', 'https://img.elo7.com.br/product/original/30CD3A6/camiseta-infantil-the-legend-of-zelda.jpg', 'Zelda' , 39.90, 1, 1);

SELECT * FROM tb_produto;

SELECT * FROM public.tb_produto where categoria = 9; 
SELECT * FROM public.tb_produto where nome ilike '%camisa heat%';
SELECT * FROM public.tb_produto where nome ilike '%camisa%';
SELECT * FROM public.tb_produto where valor > 100;
SELECT * FROM public.tb_produto where valor < 100;

UPDATE public.tb_produto SET nome = 'Short Adidas' where id = 3;
UPDATE public.tb_produto SET nome = 'Camisa Blastoise' where id = 9;
UPDATE public.tb_produto SET nome = 'Camisa Zelda' where id = 10;

DELETE FROM public.tb_produto where id=1;