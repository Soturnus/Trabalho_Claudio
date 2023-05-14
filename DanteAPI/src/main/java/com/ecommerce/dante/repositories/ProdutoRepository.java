package com.ecommerce.dante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.dante.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
	

}
