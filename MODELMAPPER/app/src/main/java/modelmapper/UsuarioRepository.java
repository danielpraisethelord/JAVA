package modelmapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 * UsuarioRepository es un repositorio JPA que proporciona métodos CRUD para la entidad UsuarioEntity.
 */
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
