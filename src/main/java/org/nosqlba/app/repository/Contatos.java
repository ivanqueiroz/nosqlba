package org.nosqlba.app.repository;

import org.nosqlba.app.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Contatos extends JpaRepository<Contato, Long> {

}
