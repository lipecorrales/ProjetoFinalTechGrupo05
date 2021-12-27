package com.projetogrupo05.projetogrupo05.repository;

import com.projetogrupo05.projetogrupo05.model.AccountBancaria;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepo extends CrudRepository<AccountBancaria, Long> {
    
}
