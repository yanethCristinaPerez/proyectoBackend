package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.GenderEntity;
import com.proyecto.proyecto.repository.GenderRepository;
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
public class GenderService implements GenderRepository{

    @Autowired
    private GenderRepository genderRepository;

    @Override
    public void flush() {

    }

    @Override
    public <S extends GenderEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends GenderEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<GenderEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public GenderEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public GenderEntity getById(Long aLong) {
        return null;
    }

    @Override
    public GenderEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends GenderEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends GenderEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends GenderEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends GenderEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends GenderEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends GenderEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends GenderEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends GenderEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends GenderEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<GenderEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<GenderEntity> findAll() {
        return null;
    }

    @Override
    public List<GenderEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(GenderEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends GenderEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<GenderEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<GenderEntity> findAll(Pageable pageable) {
        return null;
    }
}
