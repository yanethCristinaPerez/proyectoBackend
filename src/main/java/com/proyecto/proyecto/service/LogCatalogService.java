package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.LogCatalog;
import com.proyecto.proyecto.repository.LogCatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class LogCatalogService implements LogCatalogRepository {

    @Autowired
    private LogCatalogRepository logCatalogRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends LogCatalog> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends LogCatalog> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<LogCatalog> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public LogCatalog getOne(Long aLong) {
        return null;
    }

    @Override
    public LogCatalog getById(Long aLong) {
        return null;
    }

    @Override
    public LogCatalog getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends LogCatalog> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends LogCatalog> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends LogCatalog> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends LogCatalog> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LogCatalog> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends LogCatalog> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends LogCatalog, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends LogCatalog> S save(S entity) {
        return null;
    }

    @Override
    public <S extends LogCatalog> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<LogCatalog> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<LogCatalog> findAll() {
        return null;
    }

    @Override
    public List<LogCatalog> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(LogCatalog entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends LogCatalog> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<LogCatalog> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<LogCatalog> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<String> mostrarLog() {
        return logCatalogRepository.mostrarLog();
    }
}
