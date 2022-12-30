package com.proyecto.proyecto.service;

import com.proyecto.proyecto.model.CityEntity;
import com.proyecto.proyecto.repository.CityRepository;
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
public class CityService  implements  CityRepository{

    @Autowired
    private CityRepository cityRepository;


    @Override
    public void flush() {

    }

    @Override
    public <S extends CityEntity> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends CityEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<CityEntity> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public CityEntity getOne(Long aLong) {
        return null;
    }

    @Override
    public CityEntity getById(Long aLong) {
        return null;
    }

    @Override
    public CityEntity getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends CityEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends CityEntity> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends CityEntity> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends CityEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends CityEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends CityEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends CityEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends CityEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends CityEntity> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<CityEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<CityEntity> findAll() {
        return null;
    }

    @Override
    public List<CityEntity> findAllById(Iterable<Long> longs) {
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
    public void delete(CityEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends CityEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<CityEntity> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<CityEntity> findAll(Pageable pageable) {
        return null;
    }
}
