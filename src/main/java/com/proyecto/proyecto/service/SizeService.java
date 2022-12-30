package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.SizeEntity;
import com.proyecto.proyecto.repository.SizeRepository;
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
public class SizeService implements SizeRepository{

    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends SizeEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends SizeEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<SizeEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SizeEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public SizeEntity getById(Long aLong) {
        return null;
    }

    @Override
    public SizeEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends SizeEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SizeEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SizeEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SizeEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SizeEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SizeEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends SizeEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends SizeEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends SizeEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<SizeEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<SizeEntity> findAll() {
        return null;
    }

    @Override
    public List<SizeEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(SizeEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends SizeEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<SizeEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<SizeEntity> findAll(Pageable pageable) {
        return null;
    }
}
