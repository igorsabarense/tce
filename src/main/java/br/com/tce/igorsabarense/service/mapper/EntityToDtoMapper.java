package br.com.tce.igorsabarense.service.mapper;

import java.util.List;
import java.util.Set;

/**
 *
 * @param <D> - DTO type parameter
 * @param <E> - Entity type parameter
 */

public interface EntityToDtoMapper<D, E> {
    D toDto(E entity);

    List<D> toDto(List<E> entityList);

    Set<D> toDto(Set<E> entitySet);

}
