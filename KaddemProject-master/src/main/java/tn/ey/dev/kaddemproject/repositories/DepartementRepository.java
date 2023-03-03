package tn.ey.dev.kaddemproject.repositories;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import tn.ey.dev.kaddemproject.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Integer> {
    @java.lang.Override
    default java.util.List<T> findAll() {

    }

    @java.lang.Override
    default java.util.List<T> findAll(Sort sort) {
        return null;
    }

    @java.lang.Override
    default Page<Departement> findAll(Pageable pageable) {
        return null;
    }

    @java.lang.Override
    default java.util.List<T> findAllById(java.lang.Iterable<ID> ids) {
        return null;
    }

    @java.lang.Override
    default long count() {
        return 0;
    }

    @java.lang.Override
    default void deleteById(Integer integer) {

    }

    @java.lang.Override
    default void delete(Departement entity) {

    }

    @java.lang.Override
    default void deleteAllById(java.lang.Iterable<? extends ID> ids) {

    }

    @java.lang.Override
    default void deleteAll(java.lang.Iterable<? extends T> entities) {

    }

    @java.lang.Override
    default void deleteAll() {

    }

    @java.lang.Override
    default <S extends Departement> S save(S entity) {
        return null;
    }

    @java.lang.Override
    default <S extends Departement> java.util.List<S> saveAll(java.lang.Iterable<S> entities) {
        return null;
    }

    @java.lang.Override
    default java.util.Optional<T> findById(Integer integer) {
        return java.util.Optional.empty();
    }

    @java.lang.Override
    default boolean existsById(Integer integer) {
        return false;
    }

    @java.lang.Override
    default void flush() {

    }

    @java.lang.Override
    default <S extends Departement> S saveAndFlush(S entity) {
        return null;
    }

    @java.lang.Override
    default <S extends Departement> java.util.List<S> saveAllAndFlush(java.lang.Iterable<S> entities) {
        return null;
    }

    @java.lang.Override
    default void deleteAllInBatch(java.lang.Iterable<T> entities) {

    }

    @java.lang.Override
    default void deleteAllByIdInBatch(java.lang.Iterable<ID> ids) {

    }

    @java.lang.Override
    default void deleteAllInBatch() {

    }

    @java.lang.Override
    default Departement getOne(Integer integer) {
        return null;
    }

    @java.lang.Override
    default Departement getById(Integer integer) {
        return null;
    }

    @java.lang.Override
    default Departement getReferenceById(Integer integer) {
        return null;
    }

    @java.lang.Override
    default <S extends Departement> java.util.Optional<S> findOne(Example<S> example) {
        return java.util.Optional.empty();
    }

    @java.lang.Override
    default <S extends Departement> java.util.List<S> findAll(Example<S> example) {
        return null;
    }

    @java.lang.Override
    default <S extends Departement> java.util.List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @java.lang.Override
    default <S extends Departement> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @java.lang.Override
    default <S extends Departement> long count(Example<S> example) {
        return 0;
    }

    @java.lang.Override
    default <S extends Departement> boolean exists(Example<S> example) {
        return false;
    }

    @java.lang.Override
    default <S extends Departement, R> R findBy(Example<S> example, java.util.function.Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
