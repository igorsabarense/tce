package br.com.tce.igorsabarense.service.mapper;

/**
 *
 * @param <D> - DTO type parameter
 * @param <E> - Entity type parameter
 */

public interface EntityMapper<D, E> extends EntityToDtoMapper<D, E>,  DtoToEntityMapper<D, E> {
}
