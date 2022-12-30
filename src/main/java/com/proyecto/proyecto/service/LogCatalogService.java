package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.LogCatalogEntity;
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
public class LogCatalogService implements LogCatalogRepository{

    @Autowired
    private LogCatalogRepository logCatalogRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends LogCatalogEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends LogCatalogEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<LogCatalogEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public LogCatalogEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public LogCatalogEntity getById(Long aLong) {
        return null;
    }

    @Override
    public LogCatalogEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends LogCatalogEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends LogCatalogEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends LogCatalogEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends LogCatalogEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LogCatalogEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends LogCatalogEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends LogCatalogEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends LogCatalogEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends LogCatalogEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<LogCatalogEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<LogCatalogEntity> findAll() {
        return null;
    }

    @Override
    public List<LogCatalogEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(LogCatalogEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends LogCatalogEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<LogCatalogEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<LogCatalogEntity> findAll(Pageable pageable) {
        return null;
    }
}
