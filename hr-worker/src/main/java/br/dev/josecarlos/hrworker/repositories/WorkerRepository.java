package br.dev.josecarlos.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.josecarlos.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
