package io.remedymatch.artikel.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ArtikelJpaRepository extends JpaRepository<ArtikelEntity, UUID>
{

}